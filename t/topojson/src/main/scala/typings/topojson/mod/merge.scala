package typings.topojson.mod

import typings.topojsonSpecification.mod.MultiPolygon
import typings.topojsonSpecification.mod.Objects
import typings.topojsonSpecification.mod.Polygon
import typings.topojsonSpecification.mod.Properties
import typings.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "merge")
@js.native
object merge extends js.Object {
  def apply(
    topology: Topology[Objects[Properties]],
    objects: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  ): typings.geojson.mod.MultiPolygon = js.native
}

