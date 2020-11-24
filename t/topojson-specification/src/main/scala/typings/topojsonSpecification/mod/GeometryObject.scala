package typings.topojsonSpecification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.topojsonSpecification.mod.Point[P]
  - typings.topojsonSpecification.mod.MultiPoint[P]
  - typings.topojsonSpecification.mod.LineString[P]
  - typings.topojsonSpecification.mod.MultiLineString[P]
  - typings.topojsonSpecification.mod.Polygon[P]
  - typings.topojsonSpecification.mod.MultiPolygon[P]
  - typings.topojsonSpecification.mod.GeometryCollection[P]
  - typings.topojsonSpecification.mod.NullObject
*/
trait GeometryObject[P /* <: Properties */] extends js.Object
object GeometryObject {
  
  @scala.inline
  def MultiPoint[P /* <: Properties */](
    coordinates: js.Array[Positions],
    `type`: typings.topojsonSpecification.topojsonSpecificationStrings.MultiPoint
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  
  @scala.inline
  def NullObject[P /* <: Properties */](`type`: Null): GeometryObject[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  
  @scala.inline
  def GeometryCollection[P /* <: Properties */](
    geometries: js.Array[GeometryObject[P]],
    `type`: typings.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  
  @scala.inline
  def Polygon[P /* <: Properties */](
    arcs: js.Array[ArcIndexes],
    `type`: typings.topojsonSpecification.topojsonSpecificationStrings.Polygon
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  
  @scala.inline
  def MultiLineString[P /* <: Properties */](
    arcs: js.Array[ArcIndexes],
    `type`: typings.topojsonSpecification.topojsonSpecificationStrings.MultiLineString
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  
  @scala.inline
  def LineString[P /* <: Properties */](arcs: ArcIndexes, `type`: typings.topojsonSpecification.topojsonSpecificationStrings.LineString): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  
  @scala.inline
  def Point[P /* <: Properties */](coordinates: Positions, `type`: typings.topojsonSpecification.topojsonSpecificationStrings.Point): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  
  @scala.inline
  def MultiPolygon[P /* <: Properties */](
    arcs: js.Array[js.Array[ArcIndexes]],
    `type`: typings.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
}
