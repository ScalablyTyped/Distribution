package typings.yandexMaps.mod

import typings.std.HTMLElement
import typings.yandexMaps.anon.Center
import typings.yandexMaps.anon.Inscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("yandex-maps", "util.Storage")
  @js.native
  open class Storage () extends StObject {
    
    def add(key: String, `object`: js.Object): this.type = js.native
    
    def get(key: String): js.Object | String = js.native
    def get(key: js.Object): js.Object | String = js.native
    
    def remove(key: String): js.Object = js.native
  }
  
  object bounds {
    
    @JSImport("yandex-maps", "util.bounds")
    @js.native
    val ^ : js.Any = js.native
    
    inline def areIntersecting(bounds1: js.Array[js.Array[Double]], bounds2: js.Array[js.Array[Double]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areIntersecting")(bounds1.asInstanceOf[js.Any], bounds2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def areIntersecting(bounds1: js.Array[js.Array[Double]], bounds2: js.Array[js.Array[Double]], projection: IProjection): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areIntersecting")(bounds1.asInstanceOf[js.Any], bounds2.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def containsBounds(outer: js.Array[js.Array[Double]], inner: js.Array[js.Array[Double]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsBounds")(outer.asInstanceOf[js.Any], inner.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def containsBounds(outer: js.Array[js.Array[Double]], inner: js.Array[js.Array[Double]], projection: IProjection): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsBounds")(outer.asInstanceOf[js.Any], inner.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def containsPoint(bounds: js.Array[js.Array[Double]], point: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsPoint")(bounds.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def containsPoint(bounds: js.Array[js.Array[Double]], point: js.Array[Double], projection: IProjection): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsPoint")(bounds.asInstanceOf[js.Any], point.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fromBounds(sourceBounds: js.Array[js.Array[js.Array[Double]]]): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBounds")(sourceBounds.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]
    inline def fromBounds(sourceBounds: js.Array[js.Array[js.Array[Double]]], projection: IProjection): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBounds")(sourceBounds.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
    
    inline def fromGlobalPixelBounds(pixelBounds: js.Array[js.Array[Double]], zoom: Double): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromGlobalPixelBounds")(pixelBounds.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
    inline def fromGlobalPixelBounds(pixelBounds: js.Array[js.Array[Double]], zoom: Double, projection: IProjection): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromGlobalPixelBounds")(pixelBounds.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
    
    inline def fromPoints(points: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]
    inline def fromPoints(points: js.Array[js.Array[Double]], projection: IProjection): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(points.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
    
    inline def getCenter(bounds: js.Array[js.Array[Double]]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCenter")(bounds.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    inline def getCenter(bounds: js.Array[js.Array[Double]], projection: IProjection): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCenter")(bounds.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def getCenterAndZoom(bounds: js.Array[js.Array[Double]], containerSize: js.Array[Double]): Center = (^.asInstanceOf[js.Dynamic].applyDynamic("getCenterAndZoom")(bounds.asInstanceOf[js.Any], containerSize.asInstanceOf[js.Any])).asInstanceOf[Center]
    inline def getCenterAndZoom(
      bounds: js.Array[js.Array[Double]],
      containerSize: js.Array[Double],
      projection: Unit,
      params: Inscribe
    ): Center = (^.asInstanceOf[js.Dynamic].applyDynamic("getCenterAndZoom")(bounds.asInstanceOf[js.Any], containerSize.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Center]
    inline def getCenterAndZoom(bounds: js.Array[js.Array[Double]], containerSize: js.Array[Double], projection: IProjection): Center = (^.asInstanceOf[js.Dynamic].applyDynamic("getCenterAndZoom")(bounds.asInstanceOf[js.Any], containerSize.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Center]
    inline def getCenterAndZoom(
      bounds: js.Array[js.Array[Double]],
      containerSize: js.Array[Double],
      projection: IProjection,
      params: Inscribe
    ): Center = (^.asInstanceOf[js.Dynamic].applyDynamic("getCenterAndZoom")(bounds.asInstanceOf[js.Any], containerSize.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Center]
    
    inline def getIntersections(bounds1: js.Array[js.Array[Double]], bounds2: js.Array[js.Array[Double]]): js.Array[js.Array[js.Array[Double]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntersections")(bounds1.asInstanceOf[js.Any], bounds2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.Array[Double]]]]
    inline def getIntersections(bounds1: js.Array[js.Array[Double]], bounds2: js.Array[js.Array[Double]], projection: IProjection): js.Array[js.Array[js.Array[Double]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntersections")(bounds1.asInstanceOf[js.Any], bounds2.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.Array[Double]]]]
    
    inline def getSize(bounds: js.Array[js.Array[Double]]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(bounds.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    inline def getSize(bounds: js.Array[js.Array[Double]], projection: IProjection): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(bounds.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def toGlobalPixelBounds(geoBounds: js.Array[js.Array[Double]], zoom: Double): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toGlobalPixelBounds")(geoBounds.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
    inline def toGlobalPixelBounds(geoBounds: js.Array[js.Array[Double]], zoom: Double, projection: IProjection): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toGlobalPixelBounds")(geoBounds.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  }
  
  object cursor {
    
    @JSImport("yandex-maps", "util.cursor.Accessor")
    @js.native
    open class Accessor protected () extends StObject {
      def this(key: String) = this()
      
      def getKey(): String = js.native
      
      def remove(): Unit = js.native
      
      def setKey(): Unit = js.native
    }
    
    @JSImport("yandex-maps", "util.cursor.Manager")
    @js.native
    open class Manager protected () extends StObject {
      def this(element: HTMLElement) = this()
      
      def push(key: String): Accessor = js.native
    }
  }
}
