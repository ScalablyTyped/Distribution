package typings.woosmapMap

import typings.woosmapMap.woosmap.map.GeometryType
import typings.woosmapMap.woosmap.map.GestureHandlingMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object woosmapMapStrings {
  
  @js.native
  sealed trait Feature extends StObject
  inline def Feature: Feature = "Feature".asInstanceOf[Feature]
  
  @js.native
  sealed trait FeatureCollection extends StObject
  inline def FeatureCollection: FeatureCollection = "FeatureCollection".asInstanceOf[FeatureCollection]
  
  @js.native
  sealed trait GeometryCollection
    extends StObject
       with GeometryType
  inline def GeometryCollection: GeometryCollection = "GeometryCollection".asInstanceOf[GeometryCollection]
  
  @js.native
  sealed trait LineString
    extends StObject
       with GeometryType
  inline def LineString: LineString = "LineString".asInstanceOf[LineString]
  
  @js.native
  sealed trait LinearRing
    extends StObject
       with GeometryType
  inline def LinearRing: LinearRing = "LinearRing".asInstanceOf[LinearRing]
  
  @js.native
  sealed trait MultiLineString
    extends StObject
       with GeometryType
  inline def MultiLineString: MultiLineString = "MultiLineString".asInstanceOf[MultiLineString]
  
  @js.native
  sealed trait MultiPoint
    extends StObject
       with GeometryType
  inline def MultiPoint: MultiPoint = "MultiPoint".asInstanceOf[MultiPoint]
  
  @js.native
  sealed trait MultiPolygon
    extends StObject
       with GeometryType
  inline def MultiPolygon: MultiPolygon = "MultiPolygon".asInstanceOf[MultiPolygon]
  
  @js.native
  sealed trait Point
    extends StObject
       with GeometryType
  inline def Point: Point = "Point".asInstanceOf[Point]
  
  @js.native
  sealed trait Polygon
    extends StObject
       with GeometryType
  inline def Polygon: Polygon = "Polygon".asInstanceOf[Polygon]
  
  @js.native
  sealed trait auto
    extends StObject
       with GestureHandlingMode
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait cooperative
    extends StObject
       with GestureHandlingMode
  inline def cooperative: cooperative = "cooperative".asInstanceOf[cooperative]
  
  @js.native
  sealed trait greedy
    extends StObject
       with GestureHandlingMode
  inline def greedy: greedy = "greedy".asInstanceOf[greedy]
  
  @js.native
  sealed trait none
    extends StObject
       with GestureHandlingMode
  inline def none: none = "none".asInstanceOf[none]
}
