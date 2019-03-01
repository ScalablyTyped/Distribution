package typings
package topojsonDashSpecificationLib.topojsonDashSpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullObject
  extends GeometryObjectA[js.Object]
     with GeometryObject[js.Any] {
  @JSName("type")
  var type_NullObject: scala.Null
}

object NullObject {
  @scala.inline
  def apply(
    `type`: scala.Null,
    bbox: geojsonLib.geojsonMod.BBox = null,
    id: scala.Double | java.lang.String = null,
    properties: js.Object = null
  ): NullObject = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[NullObject]
  }
}

