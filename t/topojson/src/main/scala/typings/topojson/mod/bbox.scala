package typings.topojson.mod

import typings.geojson.mod.BBox
import typings.topojsonSpecification.mod.Objects
import typings.topojsonSpecification.mod.Properties
import typings.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "bbox")
@js.native
object bbox extends js.Object {
  def apply(topology: Topology[Objects[Properties]]): BBox = js.native
}

