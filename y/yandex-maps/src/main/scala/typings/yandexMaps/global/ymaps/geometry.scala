package typings.yandexMaps.global.ymaps

import typings.yandexMaps.anon.CoordRendering
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometry {
  
  @JSGlobal("ymaps.geometry.LineString")
  @js.native
  open class LineString ()
    extends typings.yandexMaps.mod.geometry.LineString {
    def this(coordinates: js.Array[js.Array[Double]]) = this()
    def this(coordinates: js.Array[js.Array[Double]], options: CoordRendering) = this()
    def this(coordinates: Unit, options: CoordRendering) = this()
  }
  object LineString {
    
    @JSGlobal("ymaps.geometry.LineString")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromEncodedCoordinates(encodedCoordinates: String): typings.yandexMaps.mod.geometry.LineString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEncodedCoordinates")(encodedCoordinates.asInstanceOf[js.Any]).asInstanceOf[typings.yandexMaps.mod.geometry.LineString]
    
    /* static member */
    inline def toEncodedCoordinates(geometry: typings.yandexMaps.mod.geometry.LineString): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toEncodedCoordinates")(geometry.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSGlobal("ymaps.geometry.Point")
  @js.native
  open class Point ()
    extends typings.yandexMaps.mod.geometry.Point {
    def this(coordinates: js.Array[Double]) = this()
  }
  
  @JSGlobal("ymaps.geometry.Polygon")
  @js.native
  open class Polygon ()
    extends typings.yandexMaps.mod.geometry.Polygon {
    def this(coordinates: js.Array[js.Array[js.Array[Double]]]) = this()
    def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: "evenOdd" | "nonZero") = this()
    def this(coordinates: Unit, fillRule: "evenOdd" | "nonZero") = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Double]]],
      fillRule: "evenOdd" | "nonZero",
      options: js.Object
    ) = this()
    def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: Unit, options: js.Object) = this()
    def this(coordinates: Unit, fillRule: "evenOdd" | "nonZero", options: js.Object) = this()
    def this(coordinates: Unit, fillRule: Unit, options: js.Object) = this()
  }
  object Polygon {
    
    @JSGlobal("ymaps.geometry.Polygon")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromEncodedCoordinates(encodedCoordinates: String): typings.yandexMaps.mod.geometry.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEncodedCoordinates")(encodedCoordinates.asInstanceOf[js.Any]).asInstanceOf[typings.yandexMaps.mod.geometry.Polygon]
    
    /* static member */
    inline def toEncodedCoordinates(geometry: typings.yandexMaps.mod.geometry.Polygon): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toEncodedCoordinates")(geometry.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object base {
    
    @JSGlobal("ymaps.geometry.base.LineString")
    @js.native
    open class LineString ()
      extends typings.yandexMaps.mod.geometry.base.LineString
    object LineString {
      
      @JSGlobal("ymaps.geometry.base.LineString")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def fromEncodedCoordinates(encodedCoordinates: String): typings.yandexMaps.mod.geometry.LineString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEncodedCoordinates")(encodedCoordinates.asInstanceOf[js.Any]).asInstanceOf[typings.yandexMaps.mod.geometry.LineString]
      
      /* static member */
      inline def toEncodedCoordinates(geometry: typings.yandexMaps.mod.geometry.LineString): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toEncodedCoordinates")(geometry.asInstanceOf[js.Any]).asInstanceOf[String]
    }
    
    @JSGlobal("ymaps.geometry.base.Point")
    @js.native
    open class Point ()
      extends typings.yandexMaps.mod.geometry.base.Point
    
    @JSGlobal("ymaps.geometry.base.Polygon")
    @js.native
    open class Polygon ()
      extends typings.yandexMaps.mod.geometry.base.Polygon {
      def this(coordinates: js.Array[js.Array[js.Array[Double]]]) = this()
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: "evenOdd" | "nonZero") = this()
      def this(coordinates: Unit, fillRule: "evenOdd" | "nonZero") = this()
    }
    object Polygon {
      
      @JSGlobal("ymaps.geometry.base.Polygon")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def fromEncodedCoordinates(encodedCoordinates: String): typings.yandexMaps.mod.geometry.base.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEncodedCoordinates")(encodedCoordinates.asInstanceOf[js.Any]).asInstanceOf[typings.yandexMaps.mod.geometry.base.Polygon]
      
      /* static member */
      inline def toEncodedCoordinates(geometry: typings.yandexMaps.mod.geometry.base.Polygon): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toEncodedCoordinates")(geometry.asInstanceOf[js.Any]).asInstanceOf[String]
    }
  }
  
  object pixel {
    
    @JSGlobal("ymaps.geometry.pixel.Circle")
    @js.native
    open class Circle protected ()
      extends typings.yandexMaps.mod.geometry.pixel.Circle {
      def this(coordinates: js.Array[Double], radius: Double) = this()
      def this(coordinates: Null, radius: Double) = this()
      def this(coordinates: js.Array[Double], radius: Double, metaData: js.Object) = this()
      def this(coordinates: Null, radius: Double, metaData: js.Object) = this()
    }
    
    @JSGlobal("ymaps.geometry.pixel.LineString")
    @js.native
    open class LineString protected ()
      extends typings.yandexMaps.mod.geometry.pixel.LineString {
      def this(coordinates: js.Array[js.Array[Double]]) = this()
      def this(coordinates: js.Array[js.Array[Double]], metaData: js.Object) = this()
    }
    
    @JSGlobal("ymaps.geometry.pixel.MultiLineString")
    @js.native
    open class MultiLineString protected ()
      extends typings.yandexMaps.mod.geometry.pixel.MultiLineString {
      def this(coordinates: js.Array[js.Array[js.Array[Double]]]) = this()
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], metaData: js.Object) = this()
    }
    
    @JSGlobal("ymaps.geometry.pixel.MultiPolygon")
    @js.native
    open class MultiPolygon protected ()
      extends typings.yandexMaps.mod.geometry.pixel.MultiPolygon {
      def this(coordinates: js.Array[js.Array[js.Array[js.Array[Double]]]], fillRule: "evenOdd" | "nonZero") = this()
      def this(
        coordinates: js.Array[js.Array[js.Array[js.Array[Double]]]],
        fillRule: "evenOdd" | "nonZero",
        metaData: js.Object
      ) = this()
    }
    
    @JSGlobal("ymaps.geometry.pixel.Point")
    @js.native
    open class Point ()
      extends typings.yandexMaps.mod.geometry.pixel.Point {
      def this(position: js.Array[Double]) = this()
      def this(position: js.Array[Double], metaData: js.Object) = this()
      def this(position: Null, metaData: js.Object) = this()
    }
    
    @JSGlobal("ymaps.geometry.pixel.Polygon")
    @js.native
    open class Polygon protected ()
      extends typings.yandexMaps.mod.geometry.pixel.Polygon {
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: "evenOdd" | "nonZero") = this()
      def this(
        coordinates: js.Array[js.Array[js.Array[Double]]],
        fillRule: "evenOdd" | "nonZero",
        metaData: js.Object
      ) = this()
    }
    
    @JSGlobal("ymaps.geometry.pixel.Rectangle")
    @js.native
    open class Rectangle ()
      extends typings.yandexMaps.mod.geometry.pixel.Rectangle {
      def this(coordinates: js.Array[js.Array[Double]]) = this()
      def this(coordinates: js.Array[js.Array[Double]], metaData: js.Object) = this()
      def this(coordinates: Null, metaData: js.Object) = this()
    }
  }
}
