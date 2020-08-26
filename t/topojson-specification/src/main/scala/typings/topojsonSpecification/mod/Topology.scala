package typings.topojsonSpecification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Topology[T /* <: Objects[Properties] */] extends TopoJSON {
  var arcs: js.Array[Arc] = js.native
  var objects: T = js.native
  var transform: js.UndefOr[Transform] = js.native
  @JSName("type")
  var type_Topology: typings.topojsonSpecification.topojsonSpecificationStrings.Topology = js.native
}

object Topology {
  @scala.inline
  def apply[/* <: typings.topojsonSpecification.mod.Objects[typings.topojsonSpecification.mod.Properties] */ T](
    arcs: js.Array[Arc],
    objects: T,
    `type`: typings.topojsonSpecification.topojsonSpecificationStrings.Topology
  ): Topology[T] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topology[T]]
  }
  @scala.inline
  implicit class TopologyOps[Self <: Topology[_], /* <: typings.topojsonSpecification.mod.Objects[typings.topojsonSpecification.mod.Properties] */ T] (val x: Self with Topology[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArcsVarargs(value: Arc*): Self = this.set("arcs", js.Array(value :_*))
    @scala.inline
    def setArcs(value: js.Array[Arc]): Self = this.set("arcs", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjects(value: T): Self = this.set("objects", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.topojsonSpecification.topojsonSpecificationStrings.Topology): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransform(value: Transform): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
  
}

