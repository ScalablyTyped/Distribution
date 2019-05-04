package typings
package vegaDashLiteLib.buildSrcTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupData extends js.Object {
  /**
    * Secondary data source to lookup in.
    */
  var data: vegaDashLiteLib.buildSrcDataMod.Data
  /**
    * Fields in foreign data to lookup.
    * If not specified, the entire object is queried.
    */
  var fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Key in data to lookup.
    */
  var key: java.lang.String
}

object LookupData {
  @scala.inline
  def apply(
    data: vegaDashLiteLib.buildSrcDataMod.Data,
    key: java.lang.String,
    fields: js.Array[java.lang.String] = null
  ): LookupData = {
    val __obj = js.Dynamic.literal(data = data, key = key)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[LookupData]
  }
}

