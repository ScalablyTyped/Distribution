package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.Anon_CoordRendering
import typings.yandexDashMaps.yandexDashMapsMod.geometryNs.LineString
import typings.yandexDashMaps.yandexDashMapsStrings.evenOdd
import typings.yandexDashMaps.yandexDashMapsStrings.nonZero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "geometry")
@js.native
object geometryNs extends js.Object {
  @js.native
  class LineString () extends ILineStringGeometry {
    def this(coordinates: js.Array[js.Array[Double]]) = this()
    def this(coordinates: js.Array[js.Array[Double]], options: Anon_CoordRendering) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    def add(types: String, callback: js.Function1[/* event */ js.Object | IEvent, Unit]): this.type = js.native
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
    /* CompleteClass */
    override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    def getParent(): js.Object | Null = js.native
    /* CompleteClass */
    override def getType(): String = js.native
    def group(): IEventGroup = js.native
    def isFrozen(): Boolean = js.native
    def remove(types: String, callback: js.Function1[/* event */ js.Object | IEvent, Unit]): this.type = js.native
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
      context: js.Object
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[IEvent | js.Object, Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    def setParent(): this.type = js.native
    def setParent(parent: IEventManager): this.type = js.native
    def unfreeze(): IFreezable = js.native
  }
  
  @js.native
  class Point () extends IPointGeometry {
    def this(coordinates: js.Array[Double]) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    /* CompleteClass */
    override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  @js.native
  class Polygon () extends IPolygonGeometry {
    def this(coordinates: js.Array[js.Array[js.Array[Double]]]) = this()
    def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: evenOdd) = this()
    def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: nonZero) = this()
    def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: evenOdd, options: js.Object) = this()
    def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: nonZero, options: js.Object) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    def add(types: String, callback: js.Function1[/* event */ js.Object | IEvent, Unit]): this.type = js.native
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
    /* CompleteClass */
    override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    def getParent(): js.Object | Null = js.native
    /* CompleteClass */
    override def getType(): String = js.native
    def group(): IEventGroup = js.native
    def isFrozen(): Boolean = js.native
    def setParent(): this.type = js.native
    def setParent(parent: js.Object): this.type = js.native
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
    def fromEncodedCoordinates(encodedCoordinates: String): typings.yandexDashMaps.yandexDashMapsMod.geometryNs.Polygon = js.native
     //tslint:disable-line function-name
    def toEncodedCoordinates(geometry: typings.yandexDashMaps.yandexDashMapsMod.geometryNs.Polygon): String = js.native
  }
  
  @JSName("base")
  @js.native
  object baseNs extends js.Object {
    @js.native
    class LineString () extends IBaseLineStringGeometry {
      /* CompleteClass */
      override var events: IEventManager = js.native
      def add(types: String, callback: js.Function1[/* event */ js.Object | IEvent, Unit]): this.type = js.native
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
      def isFrozen(): Boolean = js.native
      /* CompleteClass */
      override def remove(index: Double): js.Array[Double] = js.native
      def remove(types: String, callback: js.Function1[/* event */ js.Object | IEvent, Unit]): this.type = js.native
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
        context: js.Object
      ): this.type = js.native
      def remove(
        types: js.Array[js.Array[String] | String],
        callback: js.Function1[IEvent | js.Object, Unit],
        context: js.Object,
        priority: Double
      ): this.type = js.native
      /* CompleteClass */
      override def set(index: Double, coordinates: js.Array[Double]): ILineStringGeometryAccess = js.native
      /* CompleteClass */
      override def setCoordinates(coordinates: js.Array[Double]): ILineStringGeometryAccess = js.native
      def setParent(): this.type = js.native
      def setParent(parent: IEventManager): this.type = js.native
      /* CompleteClass */
      override def splice(index: Double, length: Double): js.Array[js.Array[Double]] = js.native
      def unfreeze(): IFreezable = js.native
    }
    
    @js.native
    class Point () extends IBasePointGeometry {
      /* CompleteClass */
      override var events: IEventManager = js.native
      /* CompleteClass */
      override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
      /* CompleteClass */
      override def getType(): String = js.native
    }
    
    @js.native
    class Polygon () extends IBasePointGeometry {
      def this(coordinates: js.Array[js.Array[js.Array[Double]]]) = this()
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: evenOdd) = this()
      def this(coordinates: js.Array[js.Array[js.Array[Double]]], fillRule: nonZero) = this()
      /* CompleteClass */
      override var events: IEventManager = js.native
       //tslint:disable-line function-name
      def contains(position: js.Array[Double]): Boolean = js.native
      def freeze(): IFreezable = js.native
      def get(index: Double): js.Array[js.Array[Double]] = js.native
      /* CompleteClass */
      override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
      def getChildGeometry(index: Double): ILinearRingGeometryAccess = js.native
      def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
      def getFillRule(): String = js.native
      def getLength(): Double = js.native
      /* CompleteClass */
      override def getType(): String = js.native
      def insert(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess = js.native
      def isFrozen(): Boolean = js.native
      def remove(index: Double): ILinearRingGeometryAccess = js.native
      def set(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess = js.native
      def setFillRule(fillRule: String): IPolygonGeometryAccess = js.native
      def splice(index: Double, number: Double): js.Array[ILinearRingGeometryAccess] = js.native
      def unfreeze(): IFreezable = js.native
    }
    
    /* static members */
    @js.native
    object LineString extends js.Object {
      def fromEncodedCoordinates(encodedCoordinates: String): typings.yandexDashMaps.yandexDashMapsMod.geometryNs.LineString = js.native
       //tslint:disable-line function-name
      def toEncodedCoordinates(geometry: typings.yandexDashMaps.yandexDashMapsMod.geometryNs.LineString): String = js.native
    }
    
    /* static members */
    @js.native
    object Polygon extends js.Object {
      def fromEncodedCoordinates(encodedCoordinates: String): typings.yandexDashMaps.yandexDashMapsMod.geometryNs.baseNs.Polygon = js.native
       //tslint:disable-line function-name
      def toEncodedCoordinates(geometry: typings.yandexDashMaps.yandexDashMapsMod.geometryNs.baseNs.Polygon): String = js.native
    }
    
  }
  
}

