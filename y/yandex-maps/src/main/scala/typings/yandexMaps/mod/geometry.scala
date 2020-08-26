package typings.yandexMaps.mod

import typings.yandexMaps.anon.CoordRendering
import typings.yandexMaps.yandexMapsStrings.evenOdd
import typings.yandexMaps.yandexMapsStrings.nonZero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "geometry")
@js.native
object geometry extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.yandexMaps.mod.IFreezable because var conflicts: events. Inlined freeze, isFrozen, unfreeze
  - typings.yandexMaps.mod.ILineStringGeometryAccess because var conflicts: events. Inlined get, getChildGeometry, getClosest, getCoordinates, getLength, insert, remove, set, setCoordinates, splice */ @js.native
  class LineString () extends IGeometry {
    def this(coordinates: js.Array[js.Array[Double]]) = this()
    def this(coordinates: js.UndefOr[scala.Nothing], options: CoordRendering) = this()
    def this(coordinates: js.Array[js.Array[Double]], options: CoordRendering) = this()
    def add(types: String, callback: js.Function1[/* event */ js.Object | IEvent, Unit]): this.type = js.native
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | IEvent, Unit],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def add(types: String, callback: js.Function1[/* event */ js.Object | IEvent, Unit], context: js.Object): this.type = js.native
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | IEvent, Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    def add(types: js.Array[js.Array[String] | String], callback: js.Function1[IEvent | js.Object, Unit]): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[IEvent | js.Object, Unit],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[IEvent | js.Object, Unit],
      context: js.Object
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[IEvent | js.Object, Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    def fire(`type`: String, eventobject: js.Object): this.type = js.native
    def fire(`type`: String, eventobject: IEvent): this.type = js.native
    def freeze(): IFreezable = js.native
    def get(index: Double): js.Array[Double] = js.native
    def getChildGeometry(index: Double): IPointGeometryAccess = js.native
    def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
    def getCoordinates(): js.Array[js.Array[Double]] = js.native
    def getLength(): Double = js.native
    def getParent(): js.Object | Null = js.native
    def group(): IEventGroup = js.native
    def insert(index: Double, coordinates: js.Array[js.Array[Double]]): ILineStringGeometryAccess = js.native
    def isFrozen(): Boolean = js.native
    def remove(index: Double): js.Array[Double] = js.native
    def remove(types: String, callback: js.Function1[/* event */ js.Object | IEvent, Unit]): this.type = js.native
    def remove(
      types: String,
      callback: js.Function1[/* event */ js.Object | IEvent, Unit],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def remove(types: String, callback: js.Function1[/* event */ js.Object | IEvent, Unit], context: js.Object): this.type = js.native
    def remove(
      types: String,
      callback: js.Function1[/* event */ js.Object | IEvent, Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    def remove(types: js.Array[js.Array[String] | String], callback: js.Function1[IEvent | js.Object, Unit]): this.type = js.native
    def remove(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[IEvent | js.Object, Unit],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[IEvent | js.Object, Unit],
      context: js.Object
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[IEvent | js.Object, Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    def set(index: Double, coordinates: js.Array[Double]): ILineStringGeometryAccess = js.native
    def setCoordinates(coordinates: js.Array[Double]): ILineStringGeometryAccess = js.native
    def setParent(): this.type = js.native
    def setParent(parent: IEventManager): this.type = js.native
    def splice(index: Double, length: Double): js.Array[js.Array[Double]] = js.native
    def unfreeze(): IFreezable = js.native
  }
  
  @js.native
  class Point ()
    extends IGeometry
       with IPointGeometryAccess {
    def this(coordinates: js.Array[Double]) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.yandexMaps.mod.IFreezable because var conflicts: events. Inlined freeze, isFrozen, unfreeze
  - typings.yandexMaps.mod.IPolygonGeometryAccess because var conflicts: events. Inlined contains, get, getChildGeometry, getClosest, getCoordinates, getFillRule, getLength, insert, remove, set, setCoordinates, setFillRule, splice */ @js.native
  class Polygon () extends IGeometry {
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
    def add(types: String, callback: js.Function1[/* event */ js.Object | IEvent, Unit]): this.type = js.native
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | IEvent, Unit],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def add(types: String, callback: js.Function1[/* event */ js.Object | IEvent, Unit], context: js.Object): this.type = js.native
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | IEvent, Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
     //tslint:disable-line function-name
    def add(types: js.Array[js.Array[String] | String], callback: js.Function1[IEvent | js.Object, Unit]): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[IEvent | js.Object, Unit],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[IEvent | js.Object, Unit],
      context: js.Object
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[IEvent | js.Object, Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    def contains(position: js.Array[Double]): Boolean = js.native
    def fire(`type`: String, eventobject: js.Object): this.type = js.native
    def fire(`type`: String, eventobject: IEvent): this.type = js.native
    def freeze(): IFreezable = js.native
    def get(index: Double): js.Array[js.Array[Double]] = js.native
    def getChildGeometry(index: Double): ILinearRingGeometryAccess = js.native
    def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
    def getCoordinates(): js.Array[js.Array[js.Array[Double]]] = js.native
    def getFillRule(): String = js.native
    @JSName("getFillRule")
    def getFillRule_Union(): evenOdd | nonZero = js.native
    def getLength(): Double = js.native
    def getParent(): js.Object | Null = js.native
    def group(): IEventGroup = js.native
    def insert(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess = js.native
    def isFrozen(): Boolean = js.native
    def remove(index: Double): ILinearRingGeometryAccess = js.native
    def set(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess = js.native
    def setCoordinates(coordinates: js.Array[js.Array[js.Array[Double]]]): IPolygonGeometryAccess = js.native
    def setFillRule(fillRule: String): IPolygonGeometryAccess = js.native
    @JSName("setFillRule")
    def setFillRule_evenOdd(fillRule: evenOdd): IPolygonGeometryAccess = js.native
    @JSName("setFillRule")
    def setFillRule_nonZero(fillRule: nonZero): IPolygonGeometryAccess = js.native
    def setParent(): this.type = js.native
    def setParent(parent: js.Object): this.type = js.native
    def splice(index: Double, number: Double): js.Array[ILinearRingGeometryAccess] = js.native
    def unfreeze(): IFreezable = js.native
  }
  
  /* static members */
  @js.native
  object LineString extends js.Object {
    def fromEncodedCoordinates(encodedCoordinates: String): LineString = js.native
     //tslint:disable-line function-name
    def toEncodedCoordinates(geometry: LineString): String = js.native
  }
  
  /* static members */
  @js.native
  object Polygon extends js.Object {
    def fromEncodedCoordinates(encodedCoordinates: String): typings.yandexMaps.mod.geometry.Polygon = js.native
     //tslint:disable-line function-name
    def toEncodedCoordinates(geometry: typings.yandexMaps.mod.geometry.Polygon): String = js.native
  }
  
  @js.native
  object base extends js.Object {
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.yandexMaps.mod.IFreezable because var conflicts: events. Inlined freeze, isFrozen, unfreeze
    - typings.yandexMaps.mod.ILineStringGeometryAccess because var conflicts: events. Inlined get, getChildGeometry, getClosest, getCoordinates, getLength, insert, remove, set, setCoordinates, splice */ @js.native
    class LineString () extends IBaseGeometry {
      def add(types: String, callback: js.Function1[/* event */ js.Object | IEvent, Unit]): this.type = js.native
      def add(
        types: String,
        callback: js.Function1[/* event */ js.Object | IEvent, Unit],
        context: js.UndefOr[scala.Nothing],
        priority: Double
      ): this.type = js.native
      def add(types: String, callback: js.Function1[/* event */ js.Object | IEvent, Unit], context: js.Object): this.type = js.native
      def add(
        types: String,
        callback: js.Function1[/* event */ js.Object | IEvent, Unit],
        context: js.Object,
        priority: Double
      ): this.type = js.native
      def add(types: js.Array[js.Array[String] | String], callback: js.Function1[IEvent | js.Object, Unit]): this.type = js.native
      def add(
        types: js.Array[js.Array[String] | String],
        callback: js.Function1[IEvent | js.Object, Unit],
        context: js.UndefOr[scala.Nothing],
        priority: Double
      ): this.type = js.native
      def add(
        types: js.Array[js.Array[String] | String],
        callback: js.Function1[IEvent | js.Object, Unit],
        context: js.Object
      ): this.type = js.native
      def add(
        types: js.Array[js.Array[String] | String],
        callback: js.Function1[IEvent | js.Object, Unit],
        context: js.Object,
        priority: Double
      ): this.type = js.native
      def fire(`type`: String, eventobject: js.Object): this.type = js.native
      def fire(`type`: String, eventobject: IEvent): this.type = js.native
      def freeze(): IFreezable = js.native
      def get(index: Double): js.Array[Double] = js.native
      def getChildGeometry(index: Double): IPointGeometryAccess = js.native
      def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
      def getCoordinates(): js.Array[js.Array[Double]] = js.native
      def getLength(): Double = js.native
      def getParent(): js.Object | Null = js.native
      def group(): IEventGroup = js.native
      def insert(index: Double, coordinates: js.Array[js.Array[Double]]): ILineStringGeometryAccess = js.native
      def isFrozen(): Boolean = js.native
      def remove(index: Double): js.Array[Double] = js.native
      def remove(types: String, callback: js.Function1[/* event */ js.Object | IEvent, Unit]): this.type = js.native
      def remove(
        types: String,
        callback: js.Function1[/* event */ js.Object | IEvent, Unit],
        context: js.UndefOr[scala.Nothing],
        priority: Double
      ): this.type = js.native
      def remove(types: String, callback: js.Function1[/* event */ js.Object | IEvent, Unit], context: js.Object): this.type = js.native
      def remove(
        types: String,
        callback: js.Function1[/* event */ js.Object | IEvent, Unit],
        context: js.Object,
        priority: Double
      ): this.type = js.native
      def remove(types: js.Array[js.Array[String] | String], callback: js.Function1[IEvent | js.Object, Unit]): this.type = js.native
      def remove(
        types: js.Array[js.Array[String] | String],
        callback: js.Function1[IEvent | js.Object, Unit],
        context: js.UndefOr[scala.Nothing],
        priority: Double
      ): this.type = js.native
      def remove(
        types: js.Array[js.Array[String] | String],
        callback: js.Function1[IEvent | js.Object, Unit],
        context: js.Object
      ): this.type = js.native
      def remove(
        types: js.Array[js.Array[String] | String],
        callback: js.Function1[IEvent | js.Object, Unit],
        context: js.Object,
        priority: Double
      ): this.type = js.native
      def set(index: Double, coordinates: js.Array[Double]): ILineStringGeometryAccess = js.native
      def setCoordinates(coordinates: js.Array[Double]): ILineStringGeometryAccess = js.native
      def setParent(): this.type = js.native
      def setParent(parent: IEventManager): this.type = js.native
      def splice(index: Double, length: Double): js.Array[js.Array[Double]] = js.native
      def unfreeze(): IFreezable = js.native
    }
    
    @js.native
    class Point ()
      extends IBaseGeometry
         with IPointGeometryAccess
    
    @js.native
    class Polygon ()
      extends IBaseGeometry
         with IPointGeometryAccess {
      def this(coordinates: js.Array[js.Array[js.Array[Double]]]) = this()
      def this(coordinates: js.UndefOr[scala.Nothing], fillRule: evenOdd) = this()
      def this(coordinates: js.UndefOr[scala.Nothing], fillRule: nonZero) = this()
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: evenOdd) = this()
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: nonZero) = this()
       //tslint:disable-line function-name
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
    
    /* static members */
    @js.native
    object LineString extends js.Object {
      def fromEncodedCoordinates(encodedCoordinates: String): typings.yandexMaps.mod.geometry.LineString = js.native
       //tslint:disable-line function-name
      def toEncodedCoordinates(geometry: typings.yandexMaps.mod.geometry.LineString): String = js.native
    }
    
    /* static members */
    @js.native
    object Polygon extends js.Object {
      def fromEncodedCoordinates(encodedCoordinates: String): typings.yandexMaps.mod.geometry.base.Polygon = js.native
       //tslint:disable-line function-name
      def toEncodedCoordinates(geometry: typings.yandexMaps.mod.geometry.base.Polygon): String = js.native
    }
    
  }
  
  @js.native
  object pixel extends js.Object {
    @js.native
    class Circle protected () extends IPixelCircleGeometry {
      def this(coordinates: js.Array[Double], radius: Double) = this()
      def this(coordinates: Null, radius: Double) = this()
      def this(coordinates: js.Array[Double], radius: Double, metaData: js.Object) = this()
      def this(coordinates: Null, radius: Double, metaData: js.Object) = this()
    }
    
    @js.native
    class LineString protected () extends IPixelLineStringGeometry {
      def this(coordinates: js.Array[js.Array[Double]]) = this()
      def this(coordinates: js.Array[js.Array[Double]], metaData: js.Object) = this()
    }
    
    @js.native
    class MultiLineString protected () extends IPixelMultiLineGeometry {
      def this(coordinates: js.Array[js.Array[js.Array[Double]]]) = this()
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], metaData: js.Object) = this()
    }
    
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
    
    @js.native
    class Point () extends IPixelPointGeometry {
      def this(position: js.Array[Double]) = this()
      def this(position: js.Array[Double], metaData: js.Object) = this()
      def this(position: Null, metaData: js.Object) = this()
    }
    
    @js.native
    class Polygon protected () extends IPixelPolygonGeometry {
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: evenOdd) = this()
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: nonZero) = this()
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: evenOdd, metaData: js.Object) = this()
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: nonZero, metaData: js.Object) = this()
    }
    
    @js.native
    class Rectangle () extends IPixelRectangleGeometry {
      def this(coordinates: js.Array[js.Array[Double]]) = this()
      def this(coordinates: js.Array[js.Array[Double]], metaData: js.Object) = this()
      def this(coordinates: Null, metaData: js.Object) = this()
    }
    
  }
  
}

