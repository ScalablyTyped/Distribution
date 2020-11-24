package typings.topojsonSpecification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiPolygon[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  
  var arcs: js.Array[js.Array[ArcIndexes]] = js.native
  
  @JSName("type")
  var type_MultiPolygon: typings.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon = js.native
}
object MultiPolygon {
  
  @scala.inline
  def apply[P /* <: Properties */](
    arcs: js.Array[js.Array[ArcIndexes]],
    `type`: typings.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon
  ): MultiPolygon[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPolygon[P]]
  }
  
  @scala.inline
  implicit class MultiPolygonOps[Self <: MultiPolygon[_], P /* <: Properties */] (val x: Self with MultiPolygon[P]) extends AnyVal {
    
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
    def setArcsVarargs(value: js.Array[ArcIndexes]*): Self = this.set("arcs", js.Array(value :_*))
    
    @scala.inline
    def setArcs(value: js.Array[js.Array[ArcIndexes]]): Self = this.set("arcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
