package typings.topojsonDashSpecification.topojsonDashSpecificationMod

import typings.geojson.geojsonMod.BBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullObject
  extends GeometryObjectA[js.Object]
     with GeometryObject[js.Any] {
  @JSName("type")
  var type_NullObject: Null
}

object NullObject {
  @scala.inline
  def apply(`type`: Null, bbox: BBox = null, id: Double | String = null, properties: js.Object = null): NullObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullObject]
  }
}

