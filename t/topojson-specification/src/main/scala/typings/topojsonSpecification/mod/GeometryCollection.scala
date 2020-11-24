package typings.topojsonSpecification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeometryCollection[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  
  var geometries: js.Array[GeometryObject[P]] = js.native
  
  @JSName("type")
  var type_GeometryCollection: typings.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection = js.native
}
object GeometryCollection {
  
  @scala.inline
  def apply[P /* <: Properties */](
    geometries: js.Array[GeometryObject[P]],
    `type`: typings.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection
  ): GeometryCollection[P] = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryCollection[P]]
  }
  
  @scala.inline
  implicit class GeometryCollectionOps[Self <: GeometryCollection[_], P /* <: Properties */] (val x: Self with GeometryCollection[P]) extends AnyVal {
    
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
    def setGeometriesVarargs(value: GeometryObject[P]*): Self = this.set("geometries", js.Array(value :_*))
    
    @scala.inline
    def setGeometries(value: js.Array[GeometryObject[P]]): Self = this.set("geometries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
