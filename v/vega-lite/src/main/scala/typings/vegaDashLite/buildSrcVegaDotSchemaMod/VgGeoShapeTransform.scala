package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.vegaDashLiteStrings.geoshape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgGeoShapeTransform extends js.Object {
  var as: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[VgFieldRef] = js.undefined
  var projection: String
  var `type`: geoshape
}

object VgGeoShapeTransform {
  @scala.inline
  def apply(projection: String, `type`: geoshape, as: String = null, field: VgFieldRef = null): VgGeoShapeTransform = {
    val __obj = js.Dynamic.literal(projection = projection)
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as)
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgGeoShapeTransform]
  }
}

