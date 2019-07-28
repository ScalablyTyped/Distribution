package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.vegaDashLiteStrings.geopoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgGeoPointTransform extends VgTransform {
  var as: js.UndefOr[js.Array[String]] = js.undefined
  var fields: js.Array[VgFieldRef]
  var projection: String
  var `type`: geopoint
}

object VgGeoPointTransform {
  @scala.inline
  def apply(fields: js.Array[VgFieldRef], projection: String, `type`: geopoint, as: js.Array[String] = null): VgGeoPointTransform = {
    val __obj = js.Dynamic.literal(fields = fields, projection = projection)
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as)
    __obj.asInstanceOf[VgGeoPointTransform]
  }
}

