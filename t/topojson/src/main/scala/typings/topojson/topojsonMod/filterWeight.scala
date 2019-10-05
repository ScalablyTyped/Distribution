package typings.topojson.topojsonMod

import typings.topojsonDashSimplify.topojsonDashSimplifyMod.Filter
import typings.topojsonDashSimplify.topojsonDashSimplifyMod.RingWeighter
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Properties
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "filterWeight")
@js.native
object filterWeight extends js.Object {
  def apply(topology: Topology[Objects[Properties]]): Filter = js.native
  def apply(topology: Topology[Objects[Properties]], minWeight: Double): Filter = js.native
  def apply(topology: Topology[Objects[Properties]], minWeight: Double, weight: RingWeighter): Filter = js.native
}

