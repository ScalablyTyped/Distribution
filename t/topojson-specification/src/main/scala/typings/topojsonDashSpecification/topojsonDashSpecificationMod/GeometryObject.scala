package typings.topojsonDashSpecification.topojsonDashSpecificationMod

import typings.geojson.geojsonMod.BBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.topojsonDashSpecification.topojsonDashSpecificationMod.Point[P]
  - typings.topojsonDashSpecification.topojsonDashSpecificationMod.MultiPoint[P]
  - typings.topojsonDashSpecification.topojsonDashSpecificationMod.LineString[P]
  - typings.topojsonDashSpecification.topojsonDashSpecificationMod.MultiLineString[P]
  - typings.topojsonDashSpecification.topojsonDashSpecificationMod.Polygon[P]
  - typings.topojsonDashSpecification.topojsonDashSpecificationMod.MultiPolygon[P]
  - typings.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryCollection[P]
  - typings.topojsonDashSpecification.topojsonDashSpecificationMod.NullObject
*/
trait GeometryObject[P /* <: Properties */] extends js.Object

object GeometryObject {
  @scala.inline
  def GeometryCollection[P /* <: Properties */](
    geometries: js.Array[GeometryObject[P]],
    `type`: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.GeometryCollection,
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
  def NullObject[P /* <: Properties */](`type`: Null, bbox: BBox = null, id: Double | String = null, properties: js.Object = null): GeometryObject[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  @scala.inline
  def MultiPoint[P /* <: Properties */](
    coordinates: js.Array[Positions],
    `type`: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.MultiPoint,
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
  def LineString[P /* <: Properties */](
    arcs: ArcIndexes,
    `type`: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.LineString,
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
  def Point[P /* <: Properties */](
    coordinates: Positions,
    `type`: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.Point,
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
  def Polygon[P /* <: Properties */](
    arcs: js.Array[ArcIndexes],
    `type`: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.Polygon,
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
  def MultiLineString[P /* <: Properties */](
    arcs: js.Array[ArcIndexes],
    `type`: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.MultiLineString,
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
  def MultiPolygon[P /* <: Properties */](
    arcs: js.Array[js.Array[ArcIndexes]],
    `type`: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.MultiPolygon,
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

