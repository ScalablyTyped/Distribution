package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgGeoPointTransform extends VgTransform {
  var as: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var fields: js.Array[VgFieldRef]
  var projection: java.lang.String
  var `type`: vegaDashLiteLib.vegaDashLiteLibStrings.geopoint
}

object VgGeoPointTransform {
  @scala.inline
  def apply(
    fields: js.Array[VgFieldRef],
    projection: java.lang.String,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.geopoint,
    as: js.Array[java.lang.String] = null
  ): VgGeoPointTransform = {
    val __obj = js.Dynamic.literal(fields = fields, projection = projection)
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as)
    __obj.asInstanceOf[VgGeoPointTransform]
  }
}

