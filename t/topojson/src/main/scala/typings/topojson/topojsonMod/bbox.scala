package typings.topojson.topojsonMod

import typings.geojson.geojsonMod.BBox
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Properties
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "bbox")
@js.native
object bbox extends js.Object {
  def apply(topology: Topology[Objects[Properties]]): BBox = js.native
}

