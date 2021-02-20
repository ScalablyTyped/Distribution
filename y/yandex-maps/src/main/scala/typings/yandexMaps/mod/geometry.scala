package typings.yandexMaps.mod

import typings.yandexMaps.anon.CoordRendering
import typings.yandexMaps.yandexMapsStrings.evenOdd
import typings.yandexMaps.yandexMapsStrings.nonZero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometry {
  
  @JSImport("yandex-maps", "geometry.LineString")
  @js.native
  class LineString () extends ILineStringGeometry {
    def this(coordinates: js.Array[js.Array[Double]]) = this()
    def this(coordinates: js.UndefOr[scala.Nothing], options: CoordRendering) = this()
    def this(coordinates: js.Array[js.Array[Double]], options: CoordRendering) = this()
    
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
    ): this.type = js.native
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: js.Object
    ): this.type = js.native
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit]
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: js.Object
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    
    def fire(`type`: String, eventobject: js.Object): this.type = js.native
    def fire(`type`: String, eventobject: IEvent[js.Object, js.Object]): this.type = js.native
    
    def getParent(): js.Object | Null = js.native
    
    def group(): IEventGroup = js.native
    
    def remove(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
    ): this.type = js.native
    def remove(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def remove(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: js.Object
    ): this.type = js.native
    def remove(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit]
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: js.Object
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    
    def setParent(): this.type = js.native
    def setParent(parent: IEventManager[js.Object]): this.type = js.native
  }
  object LineString {
    
    /* static member */
    @JSImport("yandex-maps", "geometry.LineString.fromEncodedCoordinates")
    @js.native
    def fromEncodedCoordinates(encodedCoordinates: String): LineString = js.native
    
    /* static member */
    @JSImport("yandex-maps", "geometry.LineString.toEncodedCoordinates")
    @js.native
    def toEncodedCoordinates(geometry: LineString): String = js.native
  }
  
  @JSImport("yandex-maps", "geometry.Point")
  @js.native
  class Point () extends IPointGeometry {
    def this(coordinates: js.Array[Double]) = this()
  }
  
  @JSImport("yandex-maps", "geometry.Polygon")
  @js.native
  class Polygon () extends IPolygonGeometry {
    def this(coordinates: js.Array[js.Array[js.Array[Double]]]) = this()
    def this(coordinates: js.UndefOr[scala.Nothing], fillRule: evenOdd) = this()
    def this(coordinates: js.UndefOr[scala.Nothing], fillRule: nonZero) = this()
    def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: evenOdd) = this()
    def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: nonZero) = this()
    def this(coordinates: js.UndefOr[scala.Nothing], fillRule: js.UndefOr[scala.Nothing], options: js.Object) = this()
    def this(coordinates: js.UndefOr[scala.Nothing], fillRule: evenOdd, options: js.Object) = this()
    def this(coordinates: js.UndefOr[scala.Nothing], fillRule: nonZero, options: js.Object) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Double]]],
      fillRule: js.UndefOr[scala.Nothing],
      options: js.Object
    ) = this()
    def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: evenOdd, options: js.Object) = this()
    def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: nonZero, options: js.Object) = this()
    
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
    ): this.type = js.native
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: js.Object
    ): this.type = js.native
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit]
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: js.Object
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    
    def fire(`type`: String, eventobject: js.Object): this.type = js.native
    def fire(`type`: String, eventobject: IEvent[js.Object, js.Object]): this.type = js.native
    
    def getParent(): js.Object | Null = js.native
    
    def group(): IEventGroup = js.native
    
    @JSName("setFillRule")
    def setFillRule_evenOdd(fillRule: evenOdd): IPolygonGeometryAccess = js.native
    @JSName("setFillRule")
    def setFillRule_nonZero(fillRule: nonZero): IPolygonGeometryAccess = js.native
    
    def setParent(): this.type = js.native
    def setParent(parent: js.Object): this.type = js.native
  }
  object Polygon {
    
    /* static member */
    @JSImport("yandex-maps", "geometry.Polygon.fromEncodedCoordinates")
    @js.native
    def fromEncodedCoordinates(encodedCoordinates: String): typings.yandexMaps.mod.geometry.Polygon = js.native
    
    /* static member */
    @JSImport("yandex-maps", "geometry.Polygon.toEncodedCoordinates")
    @js.native
    def toEncodedCoordinates(geometry: typings.yandexMaps.mod.geometry.Polygon): String = js.native
  }
  
  object base {
    
    @JSImport("yandex-maps", "geometry.base.LineString")
    @js.native
    class LineString () extends IBaseLineStringGeometry {
      
      def add(
        types: String,
        callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
      ): this.type = js.native
      def add(
        types: String,
        callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
        context: js.UndefOr[scala.Nothing],
        priority: Double
      ): this.type = js.native
      def add(
        types: String,
        callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
        context: js.Object
      ): this.type = js.native
      def add(
        types: String,
        callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
        context: js.Object,
        priority: Double
      ): this.type = js.native
      def add(
        types: js.Array[js.Array[String] | String],
        callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit]
      ): this.type = js.native
      def add(
        types: js.Array[js.Array[String] | String],
        callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
        context: js.UndefOr[scala.Nothing],
        priority: Double
      ): this.type = js.native
      def add(
        types: js.Array[js.Array[String] | String],
        callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
        context: js.Object
      ): this.type = js.native
      def add(
        types: js.Array[js.Array[String] | String],
        callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
        context: js.Object,
        priority: Double
      ): this.type = js.native
      
      def fire(`type`: String, eventobject: js.Object): this.type = js.native
      def fire(`type`: String, eventobject: IEvent[js.Object, js.Object]): this.type = js.native
      
      def getParent(): js.Object | Null = js.native
      
      def group(): IEventGroup = js.native
      
      def remove(
        types: String,
        callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
      ): this.type = js.native
      def remove(
        types: String,
        callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
        context: js.UndefOr[scala.Nothing],
        priority: Double
      ): this.type = js.native
      def remove(
        types: String,
        callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
        context: js.Object
      ): this.type = js.native
      def remove(
        types: String,
        callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
        context: js.Object,
        priority: Double
      ): this.type = js.native
      def remove(
        types: js.Array[js.Array[String] | String],
        callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit]
      ): this.type = js.native
      def remove(
        types: js.Array[js.Array[String] | String],
        callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
        context: js.UndefOr[scala.Nothing],
        priority: Double
      ): this.type = js.native
      def remove(
        types: js.Array[js.Array[String] | String],
        callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
        context: js.Object
      ): this.type = js.native
      def remove(
        types: js.Array[js.Array[String] | String],
        callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
        context: js.Object,
        priority: Double
      ): this.type = js.native
      
      def setParent(): this.type = js.native
      def setParent(parent: IEventManager[js.Object]): this.type = js.native
    }
    object LineString {
      
      /* static member */
      @JSImport("yandex-maps", "geometry.base.LineString.fromEncodedCoordinates")
      @js.native
      def fromEncodedCoordinates(encodedCoordinates: String): typings.yandexMaps.mod.geometry.LineString = js.native
      
      /* static member */
      @JSImport("yandex-maps", "geometry.base.LineString.toEncodedCoordinates")
      @js.native
      def toEncodedCoordinates(geometry: typings.yandexMaps.mod.geometry.LineString): String = js.native
    }
    
    @JSImport("yandex-maps", "geometry.base.Point")
    @js.native
    class Point () extends IBasePointGeometry
    
    @JSImport("yandex-maps", "geometry.base.Polygon")
    @js.native
    class Polygon () extends IBasePointGeometry {
      def this(coordinates: js.Array[js.Array[js.Array[Double]]]) = this()
      def this(coordinates: js.UndefOr[scala.Nothing], fillRule: evenOdd) = this()
      def this(coordinates: js.UndefOr[scala.Nothing], fillRule: nonZero) = this()
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: evenOdd) = this()
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: nonZero) = this()
      
      def contains(position: js.Array[Double]): Boolean = js.native
      
      def freeze(): IFreezable = js.native
      
      def get(index: Double): js.Array[js.Array[Double]] = js.native
      
      def getChildGeometry(index: Double): ILinearRingGeometryAccess = js.native
      
      def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
      
      def getFillRule(): evenOdd | nonZero = js.native
      
      def getLength(): Double = js.native
      
      def insert(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess = js.native
      
      def isFrozen(): Boolean = js.native
      
      def remove(index: Double): ILinearRingGeometryAccess = js.native
      
      def set(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess = js.native
      
      @JSName("setFillRule")
      def setFillRule_evenOdd(fillRule: evenOdd): IPolygonGeometryAccess = js.native
      @JSName("setFillRule")
      def setFillRule_nonZero(fillRule: nonZero): IPolygonGeometryAccess = js.native
      
      def splice(index: Double, number: Double): js.Array[ILinearRingGeometryAccess] = js.native
      
      def unfreeze(): IFreezable = js.native
    }
    object Polygon {
      
      /* static member */
      @JSImport("yandex-maps", "geometry.base.Polygon.fromEncodedCoordinates")
      @js.native
      def fromEncodedCoordinates(encodedCoordinates: String): typings.yandexMaps.mod.geometry.base.Polygon = js.native
      
      /* static member */
      @JSImport("yandex-maps", "geometry.base.Polygon.toEncodedCoordinates")
      @js.native
      def toEncodedCoordinates(geometry: typings.yandexMaps.mod.geometry.base.Polygon): String = js.native
    }
  }
  
  object pixel {
    
    @JSImport("yandex-maps", "geometry.pixel.Circle")
    @js.native
    class Circle protected () extends IPixelCircleGeometry {
      def this(coordinates: js.Array[Double], radius: Double) = this()
      def this(coordinates: Null, radius: Double) = this()
      def this(coordinates: js.Array[Double], radius: Double, metaData: js.Object) = this()
      def this(coordinates: Null, radius: Double, metaData: js.Object) = this()
    }
    
    @JSImport("yandex-maps", "geometry.pixel.LineString")
    @js.native
    class LineString protected () extends IPixelLineStringGeometry {
      def this(coordinates: js.Array[js.Array[Double]]) = this()
      def this(coordinates: js.Array[js.Array[Double]], metaData: js.Object) = this()
    }
    
    @JSImport("yandex-maps", "geometry.pixel.MultiLineString")
    @js.native
    class MultiLineString protected () extends IPixelMultiLineGeometry {
      def this(coordinates: js.Array[js.Array[js.Array[Double]]]) = this()
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], metaData: js.Object) = this()
    }
    
    @JSImport("yandex-maps", "geometry.pixel.MultiPolygon")
    @js.native
    class MultiPolygon protected () extends IPixelMultiPolygonGeometry {
      def this(coordinates: js.Array[js.Array[js.Array[js.Array[Double]]]], fillRule: evenOdd) = this()
      def this(coordinates: js.Array[js.Array[js.Array[js.Array[Double]]]], fillRule: nonZero) = this()
      def this(
        coordinates: js.Array[js.Array[js.Array[js.Array[Double]]]],
        fillRule: evenOdd,
        metaData: js.Object
      ) = this()
      def this(
        coordinates: js.Array[js.Array[js.Array[js.Array[Double]]]],
        fillRule: nonZero,
        metaData: js.Object
      ) = this()
    }
    
    @JSImport("yandex-maps", "geometry.pixel.Point")
    @js.native
    class Point () extends IPixelPointGeometry {
      def this(position: js.Array[Double]) = this()
      def this(position: js.Array[Double], metaData: js.Object) = this()
      def this(position: Null, metaData: js.Object) = this()
    }
    
    @JSImport("yandex-maps", "geometry.pixel.Polygon")
    @js.native
    class Polygon protected () extends IPixelPolygonGeometry {
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: evenOdd) = this()
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: nonZero) = this()
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: evenOdd, metaData: js.Object) = this()
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: nonZero, metaData: js.Object) = this()
    }
    
    @JSImport("yandex-maps", "geometry.pixel.Rectangle")
    @js.native
    class Rectangle () extends IPixelRectangleGeometry {
      def this(coordinates: js.Array[js.Array[Double]]) = this()
      def this(coordinates: js.Array[js.Array[Double]], metaData: js.Object) = this()
      def this(coordinates: Null, metaData: js.Object) = this()
    }
  }
}
