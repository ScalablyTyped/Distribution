package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.vegaDashLiteStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgLookupTransform extends VgTransform {
  var as: js.UndefOr[js.Array[String]] = js.undefined
  var default: js.UndefOr[String] = js.undefined
  var fields: js.Array[String]
  var from: String
  var key: String
  var `type`: lookup
  var values: js.UndefOr[js.Array[String]] = js.undefined
}

object VgLookupTransform {
  @scala.inline
  def apply(
    fields: js.Array[String],
    from: String,
    key: String,
    `type`: lookup,
    as: js.Array[String] = null,
    default: String = null,
    values: js.Array[String] = null
  ): VgLookupTransform = {
    val __obj = js.Dynamic.literal(fields = fields, from = from, key = key)
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as)
    if (default != null) __obj.updateDynamic("default")(default)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[VgLookupTransform]
  }
}

