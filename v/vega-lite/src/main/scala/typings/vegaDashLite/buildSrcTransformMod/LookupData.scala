package typings.vegaDashLite.buildSrcTransformMod

import typings.vegaDashLite.buildSrcDataMod.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupData extends js.Object {
  /**
    * Secondary data source to lookup in.
    */
  var data: Data
  /**
    * Fields in foreign data to lookup.
    * If not specified, the entire object is queried.
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Key in data to lookup.
    */
  var key: String
}

object LookupData {
  @scala.inline
  def apply(data: Data, key: String, fields: js.Array[String] = null): LookupData = {
    val __obj = js.Dynamic.literal(data = data, key = key)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[LookupData]
  }
}

