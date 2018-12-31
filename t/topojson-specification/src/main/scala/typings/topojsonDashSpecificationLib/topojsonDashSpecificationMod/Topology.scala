package typings
package topojsonDashSpecificationLib.topojsonDashSpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Topology[T /* <: Objects[Properties] */] extends TopoJSON {
  var arcs: js.Array[Arc]
  var objects: T
  var transform: js.UndefOr[Transform] = js.undefined
  @JSName("type")
  var type_Topology: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.Topology
}

