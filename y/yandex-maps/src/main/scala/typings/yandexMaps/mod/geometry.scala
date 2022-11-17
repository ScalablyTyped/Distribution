package typings.yandexMaps.mod

import typings.yandexMaps.anon.CoordRendering
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometry {
  
  @JSImport("yandex-maps", "geometry.LineString")
  @js.native
  open class LineString ()
    extends StObject
       with ILineStringGeometry {
    def this(coordinates: js.Array[js.Array[Double]]) = this()
    def this(coordinates: js.Array[js.Array[Double]], options: CoordRendering) = this()
    def this(coordinates: Unit, options: CoordRendering) = this()
    
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
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
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: Unit,
      priority: Double
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit]
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
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: Unit,
      priority: Double
    ): this.type = js.native
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def fire(`type`: String, eventObject: js.Object): this.type = js.native
    def fire(`type`: String, eventObject: IEvent[js.Object, js.Object]): this.type = js.native
    
    /* CompleteClass */
    override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    
    def getParent(): js.Object | Null = js.native
    
    /* CompleteClass */
    override def getType(): String = js.native
    
    def group(): IEventGroup = js.native
    
    def remove(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
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
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: Unit,
      priority: Double
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit]
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
    def remove(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: Unit,
      priority: Double
    ): this.type = js.native
    
    def setParent(): this.type = js.native
    def setParent(parent: IEventManager[js.Object]): this.type = js.native
  }
  object LineString {
    
    @JSImport("yandex-maps", "geometry.LineString")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromEncodedCoordinates(encodedCoordinates: String): LineString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEncodedCoordinates")(encodedCoordinates.asInstanceOf[js.Any]).asInstanceOf[LineString]
    
    /* static member */
    inline def toEncodedCoordinates(geometry: LineString): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toEncodedCoordinates")(geometry.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("yandex-maps", "geometry.Point")
  @js.native
  open class Point ()
    extends StObject
       with IPointGeometry {
    def this(coordinates: js.Array[Double]) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    /* CompleteClass */
    override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  @JSImport("yandex-maps", "geometry.Polygon")
  @js.native
  open class Polygon ()
    extends StObject
       with IPolygonGeometry {
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
    
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
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
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: Unit,
      priority: Double
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit]
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
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: Unit,
      priority: Double
    ): this.type = js.native
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def fire(`type`: String, eventObject: js.Object): this.type = js.native
    def fire(`type`: String, eventObject: IEvent[js.Object, js.Object]): this.type = js.native
    
    /* CompleteClass */
    override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    
    def getParent(): js.Object | Null = js.native
    
    /* CompleteClass */
    override def getType(): String = js.native
    
    def group(): IEventGroup = js.native
    
    @JSName("setFillRule")
    @scala.annotation.targetName("setFillRule_evenOdd_nonZero")
    def setFillRule(fillRule: "evenOdd" | "nonZero"): IPolygonGeometryAccess = js.native
    
    def setParent(): this.type = js.native
    def setParent(parent: js.Object): this.type = js.native
  }
  object Polygon {
    
    @JSImport("yandex-maps", "geometry.Polygon")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromEncodedCoordinates(encodedCoordinates: String): typings.yandexMaps.mod.geometry.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEncodedCoordinates")(encodedCoordinates.asInstanceOf[js.Any]).asInstanceOf[typings.yandexMaps.mod.geometry.Polygon]
    
    /* static member */
    inline def toEncodedCoordinates(geometry: typings.yandexMaps.mod.geometry.Polygon): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toEncodedCoordinates")(geometry.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object base {
    
    @JSImport("yandex-maps", "geometry.base.LineString")
    @js.native
    open class LineString ()
      extends StObject
         with IBaseLineStringGeometry {
      
      def add(
        types: String,
        callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
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
        types: String,
        callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
        context: Unit,
        priority: Double
      ): this.type = js.native
      def add(
        types: js.Array[js.Array[String] | String],
        callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit]
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
      def add(
        types: js.Array[js.Array[String] | String],
        callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
        context: Unit,
        priority: Double
      ): this.type = js.native
      
      /* CompleteClass */
      var events: IEventManager[js.Object] = js.native
      
      def fire(`type`: String, eventObject: js.Object): this.type = js.native
      def fire(`type`: String, eventObject: IEvent[js.Object, js.Object]): this.type = js.native
      
      /* CompleteClass */
      override def freeze(): IFreezable = js.native
      
      /* CompleteClass */
      override def get(index: Double): js.Array[Double] = js.native
      
      /* CompleteClass */
      override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
      
      /* CompleteClass */
      override def getChildGeometry(index: Double): IPointGeometryAccess = js.native
      
      /* CompleteClass */
      override def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
      
      /* CompleteClass */
      override def getCoordinates(): js.Array[js.Array[Double]] = js.native
      
      /* CompleteClass */
      override def getLength(): Double = js.native
      
      def getParent(): js.Object | Null = js.native
      
      /* CompleteClass */
      override def getType(): String = js.native
      
      def group(): IEventGroup = js.native
      
      /* CompleteClass */
      override def insert(index: Double, coordinates: js.Array[js.Array[Double]]): ILineStringGeometryAccess = js.native
      
      /* CompleteClass */
      override def isFrozen(): Boolean = js.native
      
      /* CompleteClass */
      override def remove(index: Double): js.Array[Double] = js.native
      def remove(
        types: String,
        callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
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
        types: String,
        callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
        context: Unit,
        priority: Double
      ): this.type = js.native
      def remove(
        types: js.Array[js.Array[String] | String],
        callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit]
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
      def remove(
        types: js.Array[js.Array[String] | String],
        callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
        context: Unit,
        priority: Double
      ): this.type = js.native
      
      /* CompleteClass */
      override def set(index: Double, coordinates: js.Array[Double]): ILineStringGeometryAccess = js.native
      
      /* CompleteClass */
      override def setCoordinates(coordinates: js.Array[js.Array[Double]]): ILineStringGeometryAccess = js.native
      
      def setParent(): this.type = js.native
      def setParent(parent: IEventManager[js.Object]): this.type = js.native
      
      /* CompleteClass */
      override def splice(index: Double, length: Double): js.Array[js.Array[Double]] = js.native
      
      /* CompleteClass */
      override def unfreeze(): IFreezable = js.native
    }
    object LineString {
      
      @JSImport("yandex-maps", "geometry.base.LineString")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def fromEncodedCoordinates(encodedCoordinates: String): typings.yandexMaps.mod.geometry.LineString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEncodedCoordinates")(encodedCoordinates.asInstanceOf[js.Any]).asInstanceOf[typings.yandexMaps.mod.geometry.LineString]
      
      /* static member */
      inline def toEncodedCoordinates(geometry: typings.yandexMaps.mod.geometry.LineString): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toEncodedCoordinates")(geometry.asInstanceOf[js.Any]).asInstanceOf[String]
    }
    
    @JSImport("yandex-maps", "geometry.base.Point")
    @js.native
    open class Point ()
      extends StObject
         with IBasePointGeometry {
      
      /* CompleteClass */
      var events: IEventManager[js.Object] = js.native
      
      /* CompleteClass */
      override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
      
      /* CompleteClass */
      override def getType(): String = js.native
    }
    
    @JSImport("yandex-maps", "geometry.base.Polygon")
    @js.native
    open class Polygon ()
      extends StObject
         with IBasePointGeometry {
      def this(coordinates: js.Array[js.Array[js.Array[Double]]]) = this()
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: "evenOdd" | "nonZero") = this()
      def this(coordinates: Unit, fillRule: "evenOdd" | "nonZero") = this()
      
      def contains(position: js.Array[Double]): Boolean = js.native
      
      /* CompleteClass */
      var events: IEventManager[js.Object] = js.native
      
      def freeze(): IFreezable = js.native
      
      def get(index: Double): js.Array[js.Array[Double]] = js.native
      
      /* CompleteClass */
      override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
      
      def getChildGeometry(index: Double): ILinearRingGeometryAccess = js.native
      
      def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
      
      def getFillRule(): "evenOdd" | "nonZero" = js.native
      
      def getLength(): Double = js.native
      
      /* CompleteClass */
      override def getType(): String = js.native
      
      def insert(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess = js.native
      
      def isFrozen(): Boolean = js.native
      
      def remove(index: Double): ILinearRingGeometryAccess = js.native
      
      def set(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess = js.native
      
      @JSName("setFillRule")
      @scala.annotation.targetName("setFillRule_evenOdd_nonZero")
      def setFillRule(fillRule: "evenOdd" | "nonZero"): IPolygonGeometryAccess = js.native
      
      def splice(index: Double, number: Double): js.Array[ILinearRingGeometryAccess] = js.native
      
      def unfreeze(): IFreezable = js.native
    }
    object Polygon {
      
      @JSImport("yandex-maps", "geometry.base.Polygon")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def fromEncodedCoordinates(encodedCoordinates: String): typings.yandexMaps.mod.geometry.base.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEncodedCoordinates")(encodedCoordinates.asInstanceOf[js.Any]).asInstanceOf[typings.yandexMaps.mod.geometry.base.Polygon]
      
      /* static member */
      inline def toEncodedCoordinates(geometry: typings.yandexMaps.mod.geometry.base.Polygon): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toEncodedCoordinates")(geometry.asInstanceOf[js.Any]).asInstanceOf[String]
    }
  }
  
  object pixel {
    
    @JSImport("yandex-maps", "geometry.pixel.Circle")
    @js.native
    open class Circle protected ()
      extends StObject
         with IPixelCircleGeometry {
      def this(coordinates: js.Array[Double], radius: Double) = this()
      def this(coordinates: Null, radius: Double) = this()
      def this(coordinates: js.Array[Double], radius: Double, metaData: js.Object) = this()
      def this(coordinates: Null, radius: Double, metaData: js.Object) = this()
      
      /* CompleteClass */
      override def equals(geometry: IPixelGeometry): Boolean = js.native
      
      /* CompleteClass */
      var events: IEventManager[js.Object] = js.native
      
      /* CompleteClass */
      override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
      
      /* CompleteClass */
      override def getCoordinates(): js.Array[Double] = js.native
      
      /* CompleteClass */
      override def getMetaData(): js.Object = js.native
      
      /* CompleteClass */
      override def getRadius(): Double = js.native
      
      /* CompleteClass */
      override def getType(): String = js.native
      
      /* CompleteClass */
      override def scale(factor: Double): IPixelGeometry = js.native
      
      /* CompleteClass */
      override def shift(offset: js.Array[Double]): IPixelGeometry = js.native
    }
    
    @JSImport("yandex-maps", "geometry.pixel.LineString")
    @js.native
    open class LineString protected ()
      extends StObject
         with IPixelLineStringGeometry {
      def this(coordinates: js.Array[js.Array[Double]]) = this()
      def this(coordinates: js.Array[js.Array[Double]], metaData: js.Object) = this()
      
      /* CompleteClass */
      override def equals(geometry: IPixelGeometry): Boolean = js.native
      
      /* CompleteClass */
      var events: IEventManager[js.Object] = js.native
      
      /* CompleteClass */
      override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
      
      /* CompleteClass */
      override def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
      
      /* CompleteClass */
      override def getCoordinates(): js.Array[js.Array[Double]] = js.native
      
      /* CompleteClass */
      override def getLength(): Double = js.native
      
      /* CompleteClass */
      override def getMetaData(): js.Object = js.native
      
      /* CompleteClass */
      override def getType(): String = js.native
      
      /* CompleteClass */
      override def scale(factor: Double): IPixelGeometry = js.native
      
      /* CompleteClass */
      override def shift(offset: js.Array[Double]): IPixelGeometry = js.native
    }
    
    @JSImport("yandex-maps", "geometry.pixel.MultiLineString")
    @js.native
    open class MultiLineString protected ()
      extends StObject
         with IPixelMultiLineGeometry {
      def this(coordinates: js.Array[js.Array[js.Array[Double]]]) = this()
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], metaData: js.Object) = this()
      
      /* CompleteClass */
      override def equals(geometry: IPixelGeometry): Boolean = js.native
      
      /* CompleteClass */
      var events: IEventManager[js.Object] = js.native
      
      /* CompleteClass */
      override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
      
      /* CompleteClass */
      override def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
      
      /* CompleteClass */
      override def getCoordinates(): js.Array[js.Array[js.Array[Double]]] = js.native
      
      /* CompleteClass */
      override def getLength(): Double = js.native
      
      /* CompleteClass */
      override def getMetaData(): js.Object = js.native
      
      /* CompleteClass */
      override def getType(): String = js.native
      
      /* CompleteClass */
      override def scale(factor: Double): IPixelGeometry = js.native
      
      /* CompleteClass */
      override def shift(offset: js.Array[Double]): IPixelGeometry = js.native
    }
    
    @JSImport("yandex-maps", "geometry.pixel.MultiPolygon")
    @js.native
    open class MultiPolygon protected ()
      extends StObject
         with IPixelMultiPolygonGeometry {
      def this(coordinates: js.Array[js.Array[js.Array[js.Array[Double]]]], fillRule: "evenOdd" | "nonZero") = this()
      def this(
        coordinates: js.Array[js.Array[js.Array[js.Array[Double]]]],
        fillRule: "evenOdd" | "nonZero",
        metaData: js.Object
      ) = this()
      
      /* CompleteClass */
      override def contains(position: js.Array[Double]): Boolean = js.native
      
      /* CompleteClass */
      override def equals(geometry: IPixelGeometry): Boolean = js.native
      
      /* CompleteClass */
      var events: IEventManager[js.Object] = js.native
      
      /* CompleteClass */
      override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
      
      /* CompleteClass */
      override def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
      
      /* CompleteClass */
      override def getCoordinates(): js.Array[js.Array[js.Array[js.Array[Double]]]] = js.native
      
      /* CompleteClass */
      override def getFillRule(): "evenOdd" | "nonZero" = js.native
      
      /* CompleteClass */
      override def getLength(): Double = js.native
      
      /* CompleteClass */
      override def getMetaData(): js.Object = js.native
      
      /* CompleteClass */
      override def getType(): String = js.native
      
      /* CompleteClass */
      override def scale(factor: Double): IPixelGeometry = js.native
      
      /* CompleteClass */
      override def shift(offset: js.Array[Double]): IPixelGeometry = js.native
    }
    
    @JSImport("yandex-maps", "geometry.pixel.Point")
    @js.native
    open class Point ()
      extends StObject
         with IPixelPointGeometry {
      def this(position: js.Array[Double]) = this()
      def this(position: js.Array[Double], metaData: js.Object) = this()
      def this(position: Null, metaData: js.Object) = this()
      
      /* CompleteClass */
      override def equals(geometry: IPixelGeometry): Boolean = js.native
      
      /* CompleteClass */
      var events: IEventManager[js.Object] = js.native
      
      /* CompleteClass */
      override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
      
      /* CompleteClass */
      override def getCoordinates(): js.Array[Double] = js.native
      
      /* CompleteClass */
      override def getMetaData(): js.Object = js.native
      
      /* CompleteClass */
      override def getType(): String = js.native
      
      /* CompleteClass */
      override def scale(factor: Double): IPixelGeometry = js.native
      
      /* CompleteClass */
      override def shift(offset: js.Array[Double]): IPixelGeometry = js.native
    }
    
    @JSImport("yandex-maps", "geometry.pixel.Polygon")
    @js.native
    open class Polygon protected ()
      extends StObject
         with IPixelPolygonGeometry {
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: "evenOdd" | "nonZero") = this()
      def this(
        coordinates: js.Array[js.Array[js.Array[Double]]],
        fillRule: "evenOdd" | "nonZero",
        metaData: js.Object
      ) = this()
      
      /* CompleteClass */
      override def contains(position: js.Array[Double]): Boolean = js.native
      
      /* CompleteClass */
      override def equals(geometry: IPixelGeometry): Boolean = js.native
      
      /* CompleteClass */
      var events: IEventManager[js.Object] = js.native
      
      /* CompleteClass */
      override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
      
      /* CompleteClass */
      override def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
      
      /* CompleteClass */
      override def getCoordinates(): js.Array[js.Array[js.Array[Double]]] = js.native
      
      /* CompleteClass */
      override def getFillRule(): "evenOdd" | "nonZero" = js.native
      
      /* CompleteClass */
      override def getLength(): Double = js.native
      
      /* CompleteClass */
      override def getMetaData(): js.Object = js.native
      
      /* CompleteClass */
      override def getType(): String = js.native
      
      /* CompleteClass */
      override def scale(factor: Double): IPixelGeometry = js.native
      
      /* CompleteClass */
      override def shift(offset: js.Array[Double]): IPixelGeometry = js.native
    }
    
    @JSImport("yandex-maps", "geometry.pixel.Rectangle")
    @js.native
    open class Rectangle ()
      extends StObject
         with IPixelRectangleGeometry {
      def this(coordinates: js.Array[js.Array[Double]]) = this()
      def this(coordinates: js.Array[js.Array[Double]], metaData: js.Object) = this()
      def this(coordinates: Null, metaData: js.Object) = this()
      
      /* CompleteClass */
      override def equals(geometry: IPixelGeometry): Boolean = js.native
      
      /* CompleteClass */
      var events: IEventManager[js.Object] = js.native
      
      /* CompleteClass */
      override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
      
      /* CompleteClass */
      override def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
      
      /* CompleteClass */
      override def getCoordinates(): js.Array[js.Array[Double]] = js.native
      
      /* CompleteClass */
      override def getMetaData(): js.Object = js.native
      
      /* CompleteClass */
      override def getType(): String = js.native
      
      /* CompleteClass */
      override def scale(factor: Double): IPixelGeometry = js.native
      
      /* CompleteClass */
      override def shift(offset: js.Array[Double]): IPixelGeometry = js.native
    }
  }
}
