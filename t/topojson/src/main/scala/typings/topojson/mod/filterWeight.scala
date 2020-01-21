package typings.topojson.mod

import typings.topojsonSimplify.mod.Filter_
import typings.topojsonSimplify.mod.RingWeighter
import typings.topojsonSpecification.mod.Objects
import typings.topojsonSpecification.mod.Properties
import typings.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "filterWeight")
@js.native
object filterWeight extends js.Object {
  def apply(topology: Topology[Objects[Properties]]): Filter_ = js.native
  def apply(topology: Topology[Objects[Properties]], minWeight: Double): Filter_ = js.native
  def apply(topology: Topology[Objects[Properties]], minWeight: Double, weight: RingWeighter): Filter_ = js.native
}

