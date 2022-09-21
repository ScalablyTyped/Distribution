package typings.terraformerSpatial

import typings.geojson.mod.BBox
import typings.geojson.mod.Feature
import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJSON
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.geojson.mod.GeometryCollection
import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.geojson.mod.MultiPoint
import typings.geojson.mod.MultiPolygon
import typings.geojson.mod.Point
import typings.geojson.mod.Polygon
import typings.geojson.mod.Position
import typings.terraformerSpatial.anon.H
import typings.terraformerSpatial.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@terraformer/spatial", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object GeographicCRS {
    
    @JSImport("@terraformer/spatial", "GeographicCRS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@terraformer/spatial", "GeographicCRS.properties")
    @js.native
    def properties: Href = js.native
    inline def properties_=(x: Href): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("properties")(x.asInstanceOf[js.Any])
    
    @JSImport("@terraformer/spatial", "GeographicCRS.type")
    @js.native
    val `type`: String = js.native
  }
  
  object MercatorCRS {
    
    @JSImport("@terraformer/spatial", "MercatorCRS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@terraformer/spatial", "MercatorCRS.properties")
    @js.native
    def properties: Href = js.native
    inline def properties_=(x: Href): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("properties")(x.asInstanceOf[js.Any])
    
    @JSImport("@terraformer/spatial", "MercatorCRS.type")
    @js.native
    val `type`: String = js.native
  }
  
  inline def calculateBounds(geojson: GeoJSON): BBox = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateBounds")(geojson.asInstanceOf[js.Any]).asInstanceOf[BBox]
  
  inline def calculateEnvelope(geojson: GeoJSON): H = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateEnvelope")(geojson.asInstanceOf[js.Any]).asInstanceOf[H]
  
  inline def contains(geojson: GeoJSON, comparisonGeojson: GeoJSON): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(geojson.asInstanceOf[js.Any], comparisonGeojson.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def convexHull(geojson: GeoJSON): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("convexHull")(geojson.asInstanceOf[js.Any]).asInstanceOf[Polygon]
  
  inline def intersects(geojson: GeoJSON, comparisonGeojson: GeoJSON): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(geojson.asInstanceOf[js.Any], comparisonGeojson.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isConvex(geojson: GeoJSON): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConvex")(geojson.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def polygonContainsPoint(polygon: js.Array[js.Array[Position]], point: Position): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonContainsPoint")(polygon.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def positionToGeographic(position: Position): Position = ^.asInstanceOf[js.Dynamic].applyDynamic("positionToGeographic")(position.asInstanceOf[js.Any]).asInstanceOf[Position]
  
  inline def positionToMercator(position: Position): Position = ^.asInstanceOf[js.Dynamic].applyDynamic("positionToMercator")(position.asInstanceOf[js.Any]).asInstanceOf[Position]
  
  inline def toCircle(center: Position, radius: Double): Feature[Polygon, GeoJsonProperties] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCircle")(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Feature[Polygon, GeoJsonProperties]]
  inline def toCircle(center: Position, radius: Double, interpolate: Double): Feature[Polygon, GeoJsonProperties] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCircle")(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], interpolate.asInstanceOf[js.Any])).asInstanceOf[Feature[Polygon, GeoJsonProperties]]
  
  inline def toGeographic(geojson: Feature[Geometry, GeoJsonProperties]): Feature[Geometry, GeoJsonProperties] = ^.asInstanceOf[js.Dynamic].applyDynamic("toGeographic")(geojson.asInstanceOf[js.Any]).asInstanceOf[Feature[Geometry, GeoJsonProperties]]
  inline def toGeographic(geojson: FeatureCollection[Geometry, GeoJsonProperties]): FeatureCollection[Geometry, GeoJsonProperties] = ^.asInstanceOf[js.Dynamic].applyDynamic("toGeographic")(geojson.asInstanceOf[js.Any]).asInstanceOf[FeatureCollection[Geometry, GeoJsonProperties]]
  inline def toGeographic(geojson: LineString): LineString = ^.asInstanceOf[js.Dynamic].applyDynamic("toGeographic")(geojson.asInstanceOf[js.Any]).asInstanceOf[LineString]
  inline def toGeographic(geojson: MultiLineString): MultiLineString = ^.asInstanceOf[js.Dynamic].applyDynamic("toGeographic")(geojson.asInstanceOf[js.Any]).asInstanceOf[MultiLineString]
  inline def toGeographic(geojson: MultiPoint): MultiPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("toGeographic")(geojson.asInstanceOf[js.Any]).asInstanceOf[MultiPoint]
  inline def toGeographic(geojson: MultiPolygon): MultiPolygon = ^.asInstanceOf[js.Dynamic].applyDynamic("toGeographic")(geojson.asInstanceOf[js.Any]).asInstanceOf[MultiPolygon]
  inline def toGeographic(geojson: Point): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("toGeographic")(geojson.asInstanceOf[js.Any]).asInstanceOf[Point]
  inline def toGeographic(geojson: Polygon): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("toGeographic")(geojson.asInstanceOf[js.Any]).asInstanceOf[Polygon]
  inline def toGeographic[T /* <: GeometryCollection[Any] */](geojson: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("toGeographic")(geojson.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def toMercator(geojson: Feature[Geometry, GeoJsonProperties]): Feature[Geometry, GeoJsonProperties] = ^.asInstanceOf[js.Dynamic].applyDynamic("toMercator")(geojson.asInstanceOf[js.Any]).asInstanceOf[Feature[Geometry, GeoJsonProperties]]
  inline def toMercator(geojson: FeatureCollection[Geometry, GeoJsonProperties]): FeatureCollection[Geometry, GeoJsonProperties] = ^.asInstanceOf[js.Dynamic].applyDynamic("toMercator")(geojson.asInstanceOf[js.Any]).asInstanceOf[FeatureCollection[Geometry, GeoJsonProperties]]
  inline def toMercator(geojson: LineString): LineString = ^.asInstanceOf[js.Dynamic].applyDynamic("toMercator")(geojson.asInstanceOf[js.Any]).asInstanceOf[LineString]
  inline def toMercator(geojson: MultiLineString): MultiLineString = ^.asInstanceOf[js.Dynamic].applyDynamic("toMercator")(geojson.asInstanceOf[js.Any]).asInstanceOf[MultiLineString]
  inline def toMercator(geojson: MultiPoint): MultiPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("toMercator")(geojson.asInstanceOf[js.Any]).asInstanceOf[MultiPoint]
  inline def toMercator(geojson: MultiPolygon): MultiPolygon = ^.asInstanceOf[js.Dynamic].applyDynamic("toMercator")(geojson.asInstanceOf[js.Any]).asInstanceOf[MultiPolygon]
  inline def toMercator(geojson: Point): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("toMercator")(geojson.asInstanceOf[js.Any]).asInstanceOf[Point]
  inline def toMercator(geojson: Polygon): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("toMercator")(geojson.asInstanceOf[js.Any]).asInstanceOf[Polygon]
  inline def toMercator[T /* <: GeometryCollection[Any] */](geojson: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("toMercator")(geojson.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def within(geojson: GeoJSON, comparisonGeojson: GeoJSON): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("within")(geojson.asInstanceOf[js.Any], comparisonGeojson.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
