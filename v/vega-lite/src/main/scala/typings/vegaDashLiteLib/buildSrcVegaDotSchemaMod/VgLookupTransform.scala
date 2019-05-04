package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgLookupTransform extends VgTransform {
  var as: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var default: js.UndefOr[java.lang.String] = js.undefined
  var fields: js.Array[java.lang.String]
  var from: java.lang.String
  var key: java.lang.String
  var `type`: vegaDashLiteLib.vegaDashLiteLibStrings.lookup
  var values: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object VgLookupTransform {
  @scala.inline
  def apply(
    fields: js.Array[java.lang.String],
    from: java.lang.String,
    key: java.lang.String,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.lookup,
    as: js.Array[java.lang.String] = null,
    default: java.lang.String = null,
    values: js.Array[java.lang.String] = null
  ): VgLookupTransform = {
    val __obj = js.Dynamic.literal(fields = fields, from = from, key = key)
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as)
    if (default != null) __obj.updateDynamic("default")(default)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[VgLookupTransform]
  }
}

