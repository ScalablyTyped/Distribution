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

object Topology {
  @scala.inline
  def apply[T /* <: Objects[Properties] */](
    arcs: js.Array[Arc],
    objects: T,
    `type`: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.Topology,
    bbox: geojsonLib.geojsonMod.BBox = null,
    transform: Transform = null
  ): Topology[T] = {
    val __obj = js.Dynamic.literal(arcs = arcs, objects = objects.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[Topology[T]]
  }
}

