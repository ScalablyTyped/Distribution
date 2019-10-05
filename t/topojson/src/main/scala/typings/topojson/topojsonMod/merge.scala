package typings.topojson.topojsonMod

import typings.topojsonDashSpecification.topojsonDashSpecificationMod.MultiPolygon
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Polygon
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Properties
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "merge")
@js.native
object merge extends js.Object {
  def apply(
    topology: Topology[Objects[Properties]],
    objects: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  ): typings.geojson.geojsonMod.MultiPolygon = js.native
}

