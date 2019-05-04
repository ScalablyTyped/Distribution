package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgGeoShapeTransform extends js.Object {
  var as: js.UndefOr[java.lang.String] = js.undefined
  var field: js.UndefOr[VgFieldRef] = js.undefined
  var projection: java.lang.String
  var `type`: vegaDashLiteLib.vegaDashLiteLibStrings.geoshape
}

object VgGeoShapeTransform {
  @scala.inline
  def apply(
    projection: java.lang.String,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.geoshape,
    as: java.lang.String = null,
    field: VgFieldRef = null
  ): VgGeoShapeTransform = {
    val __obj = js.Dynamic.literal(projection = projection)
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as)
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgGeoShapeTransform]
  }
}

