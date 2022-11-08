package typings.yandexMaps.global.ymaps

import typings.std.HTMLElement
import typings.yandexMaps.anon.Center
import typings.yandexMaps.anon.Inscribe
import typings.yandexMaps.mod.IProjection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSGlobal("ymaps.util.Storage")
  @js.native
  open class Storage ()
    extends typings.yandexMaps.mod.util.Storage
  
  object bounds {
    
    @JSGlobal("ymaps.util.bounds")
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
    
    @JSGlobal("ymaps.util.cursor.Accessor")
    @js.native
    open class Accessor protected ()
      extends typings.yandexMaps.mod.util.cursor.Accessor {
      def this(key: String) = this()
    }
    
    @JSGlobal("ymaps.util.cursor.Manager")
    @js.native
    open class Manager protected ()
      extends typings.yandexMaps.mod.util.cursor.Manager {
      def this(element: HTMLElement) = this()
    }
  }
}
