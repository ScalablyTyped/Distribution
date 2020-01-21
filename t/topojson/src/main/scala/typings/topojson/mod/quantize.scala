package typings.topojson.mod

import typings.topojsonSpecification.mod.Objects
import typings.topojsonSpecification.mod.Topology
import typings.topojsonSpecification.mod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "quantize")
@js.native
object quantize extends js.Object {
  def apply[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Double): Topology[T] = js.native
  def apply[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Transform): Topology[T] = js.native
}

