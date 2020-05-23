package typings.topojsonSpecification.mod

import typings.geojson.mod.BBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def MultiPoint[P](
    coordinates: js.Array[Positions],
    `type`: typings.topojsonSpecification.topojsonSpecificationStrings.MultiPoint,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  @scala.inline
  def NullObject[P](`type`: Null, bbox: BBox = null, id: Double | String = null, properties: js.Object = null): GeometryObject[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  @scala.inline
  def GeometryCollection[P](
    geometries: js.Array[GeometryObject[P]],
    `type`: typings.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  @scala.inline
  def Polygon[P](
    arcs: js.Array[ArcIndexes],
    `type`: typings.topojsonSpecification.topojsonSpecificationStrings.Polygon,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  @scala.inline
  def MultiLineString[P](
    arcs: js.Array[ArcIndexes],
    `type`: typings.topojsonSpecification.topojsonSpecificationStrings.MultiLineString,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  @scala.inline
  def LineString[P](
    arcs: ArcIndexes,
    `type`: typings.topojsonSpecification.topojsonSpecificationStrings.LineString,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  @scala.inline
  def Point[P](
    coordinates: Positions,
    `type`: typings.topojsonSpecification.topojsonSpecificationStrings.Point,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  @scala.inline
  def MultiPolygon[P](
    arcs: js.Array[js.Array[ArcIndexes]],
    `type`: typings.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
}

