package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "geometry")
@js.native
object geometryNs extends js.Object {
  @js.native
  class LineString ()
    extends yandexDashMapsLib.yandexDashMapsMod.ILineStringGeometry {
    def this(coordinates: js.Array[js.Array[scala.Double]]) = this()
    def this(coordinates: js.Array[js.Array[scala.Double]], options: yandexDashMapsLib.Anon_CoordRendering) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    /* CompleteClass */
    override def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
    /* CompleteClass */
    override def getType(): java.lang.String = js.native
    def remove(
      types: java.lang.String,
      callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.yandexDashMapsMod.IEvent, scala.Unit]
    ): this.type = js.native
    def remove(
      types: java.lang.String,
      callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.yandexDashMapsMod.IEvent, scala.Unit],
      context: js.Object
    ): this.type = js.native
    def remove(
      types: java.lang.String,
      callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.yandexDashMapsMod.IEvent, scala.Unit],
      context: js.Object,
      priority: scala.Double
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[java.lang.String] | java.lang.String],
      callback: js.Function1[yandexDashMapsLib.yandexDashMapsMod.IEvent | js.Object, scala.Unit]
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[java.lang.String] | java.lang.String],
      callback: js.Function1[yandexDashMapsLib.yandexDashMapsMod.IEvent | js.Object, scala.Unit],
      context: js.Object
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[java.lang.String] | java.lang.String],
      callback: js.Function1[yandexDashMapsLib.yandexDashMapsMod.IEvent | js.Object, scala.Unit],
      context: js.Object,
      priority: scala.Double
    ): this.type = js.native
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IEventManager): this.type = js.native
  }
  
  @js.native
  class Point ()
    extends yandexDashMapsLib.yandexDashMapsMod.IPointGeometry {
    def this(coordinates: js.Array[scala.Double]) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    /* CompleteClass */
    override def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
    /* CompleteClass */
    override def getType(): java.lang.String = js.native
  }
  
  @js.native
  class Polygon ()
    extends yandexDashMapsLib.yandexDashMapsMod.IPolygonGeometry {
    def this(coordinates: js.Array[js.Array[js.Array[scala.Double]]]) = this()
    def this(coordinates: js.Array[js.Array[js.Array[scala.Double]]], fillRule: yandexDashMapsLib.yandexDashMapsLibStrings.evenOdd) = this()
    def this(coordinates: js.Array[js.Array[js.Array[scala.Double]]], fillRule: yandexDashMapsLib.yandexDashMapsLibStrings.nonZero) = this()
    def this(coordinates: js.Array[js.Array[js.Array[scala.Double]]], fillRule: yandexDashMapsLib.yandexDashMapsLibStrings.evenOdd, options: js.Object) = this()
    def this(coordinates: js.Array[js.Array[js.Array[scala.Double]]], fillRule: yandexDashMapsLib.yandexDashMapsLibStrings.nonZero, options: js.Object) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    /* CompleteClass */
    override def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
    /* CompleteClass */
    override def getType(): java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object LineString extends js.Object {
    def fromEncodedCoordinates(encodedCoordinates: java.lang.String): yandexDashMapsLib.yandexDashMapsMod.geometryNs.LineString = js.native
     //tslint:disable-line function-name
    def toEncodedCoordinates(geometry: yandexDashMapsLib.yandexDashMapsMod.geometryNs.LineString): java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object Polygon extends js.Object {
    def fromEncodedCoordinates(encodedCoordinates: java.lang.String): yandexDashMapsLib.yandexDashMapsMod.geometryNs.Polygon = js.native
     //tslint:disable-line function-name
    def toEncodedCoordinates(geometry: yandexDashMapsLib.yandexDashMapsMod.geometryNs.Polygon): java.lang.String = js.native
  }
  
  @JSName("base")
  @js.native
  object baseNs extends js.Object {
    @js.native
    class LineString ()
      extends yandexDashMapsLib.yandexDashMapsMod.IBaseLineStringGeometry {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      /* CompleteClass */
      override def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
      /* CompleteClass */
      override def getType(): java.lang.String = js.native
      def remove(
        types: java.lang.String,
        callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.yandexDashMapsMod.IEvent, scala.Unit]
      ): this.type = js.native
      def remove(
        types: java.lang.String,
        callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.yandexDashMapsMod.IEvent, scala.Unit],
        context: js.Object
      ): this.type = js.native
      def remove(
        types: java.lang.String,
        callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.yandexDashMapsMod.IEvent, scala.Unit],
        context: js.Object,
        priority: scala.Double
      ): this.type = js.native
      def remove(
        types: js.Array[js.Array[java.lang.String] | java.lang.String],
        callback: js.Function1[yandexDashMapsLib.yandexDashMapsMod.IEvent | js.Object, scala.Unit]
      ): this.type = js.native
      def remove(
        types: js.Array[js.Array[java.lang.String] | java.lang.String],
        callback: js.Function1[yandexDashMapsLib.yandexDashMapsMod.IEvent | js.Object, scala.Unit],
        context: js.Object
      ): this.type = js.native
      def remove(
        types: js.Array[js.Array[java.lang.String] | java.lang.String],
        callback: js.Function1[yandexDashMapsLib.yandexDashMapsMod.IEvent | js.Object, scala.Unit],
        context: js.Object,
        priority: scala.Double
      ): this.type = js.native
      def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IEventManager): this.type = js.native
    }
    
    @js.native
    class Point ()
      extends yandexDashMapsLib.yandexDashMapsMod.IBasePointGeometry {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      /* CompleteClass */
      override def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
      /* CompleteClass */
      override def getType(): java.lang.String = js.native
    }
    
    @js.native
    class Polygon ()
      extends yandexDashMapsLib.yandexDashMapsMod.IBasePointGeometry {
      def this(coordinates: js.Array[js.Array[js.Array[scala.Double]]]) = this()
      def this(coordinates: js.Array[js.Array[js.Array[scala.Double]]], fillRule: yandexDashMapsLib.yandexDashMapsLibStrings.evenOdd) = this()
      def this(coordinates: js.Array[js.Array[js.Array[scala.Double]]], fillRule: yandexDashMapsLib.yandexDashMapsLibStrings.nonZero) = this()
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
       //tslint:disable-line function-name
      def contains(position: js.Array[scala.Double]): scala.Boolean = js.native
      def freeze(): yandexDashMapsLib.yandexDashMapsMod.IFreezable = js.native
      def get(index: scala.Double): js.Array[js.Array[scala.Double]] = js.native
      /* CompleteClass */
      override def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
      def getChildGeometry(index: scala.Double): yandexDashMapsLib.yandexDashMapsMod.ILinearRingGeometryAccess = js.native
      def getClosest(anchorPosition: js.Array[scala.Double]): js.Object = js.native
      def getFillRule(): java.lang.String = js.native
      def getLength(): scala.Double = js.native
      /* CompleteClass */
      override def getType(): java.lang.String = js.native
      def insert(index: scala.Double, path: js.Array[js.Array[scala.Double]]): yandexDashMapsLib.yandexDashMapsMod.IPolygonGeometryAccess = js.native
      def isFrozen(): scala.Boolean = js.native
      def remove(index: scala.Double): yandexDashMapsLib.yandexDashMapsMod.ILinearRingGeometryAccess = js.native
      def set(index: scala.Double, path: js.Array[js.Array[scala.Double]]): yandexDashMapsLib.yandexDashMapsMod.IPolygonGeometryAccess = js.native
      def setFillRule(fillRule: java.lang.String): yandexDashMapsLib.yandexDashMapsMod.IPolygonGeometryAccess = js.native
      def splice(index: scala.Double, number: scala.Double): js.Array[yandexDashMapsLib.yandexDashMapsMod.ILinearRingGeometryAccess] = js.native
      def unfreeze(): yandexDashMapsLib.yandexDashMapsMod.IFreezable = js.native
    }
    
    /* static members */
    @js.native
    object LineString extends js.Object {
      def fromEncodedCoordinates(encodedCoordinates: java.lang.String): yandexDashMapsLib.yandexDashMapsMod.geometryNs.LineString = js.native
       //tslint:disable-line function-name
      def toEncodedCoordinates(geometry: yandexDashMapsLib.yandexDashMapsMod.geometryNs.LineString): java.lang.String = js.native
    }
    
    /* static members */
    @js.native
    object Polygon extends js.Object {
      def fromEncodedCoordinates(encodedCoordinates: java.lang.String): yandexDashMapsLib.yandexDashMapsMod.geometryNs.baseNs.Polygon = js.native
       //tslint:disable-line function-name
      def toEncodedCoordinates(geometry: yandexDashMapsLib.yandexDashMapsMod.geometryNs.baseNs.Polygon): java.lang.String = js.native
    }
    
  }
  
}

