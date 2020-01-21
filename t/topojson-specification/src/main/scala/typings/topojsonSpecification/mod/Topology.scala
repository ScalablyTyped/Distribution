package typings.topojsonSpecification.mod

import typings.geojson.mod.BBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Topology[T /* <: Objects[Properties] */] extends TopoJSON {
  var arcs: js.Array[Arc]
  var objects: T
  var transform: js.UndefOr[Transform] = js.undefined
  @JSName("type")
  var type_Topology: typings.topojsonSpecification.topojsonSpecificationStrings.Topology
}

object Topology {
  @scala.inline
  def apply[T /* <: Objects[Properties] */](
    arcs: js.Array[Arc],
    objects: T,
    `type`: typings.topojsonSpecification.topojsonSpecificationStrings.Topology,
    bbox: BBox = null,
    transform: Transform = null
  ): Topology[T] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topology[T]]
  }
}

