package typings.yandexMaps.global.ymaps

import typings.std.HTMLElement
import typings.yandexMaps.anon.AngularBBox
import typings.yandexMaps.anon.AutoFitToViewport
import typings.yandexMaps.anon.Direction
import typings.yandexMaps.mod.IPanorama
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panorama {
  
  @JSGlobal("ymaps.panorama")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ymaps.panorama.Base")
  @js.native
  open class Base ()
    extends typings.yandexMaps.mod.panorama.Base
  object Base {
    
    @JSGlobal("ymaps.panorama.Base")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def createPanorama(params: AngularBBox): IPanorama = ^.asInstanceOf[js.Dynamic].applyDynamic("createPanorama")(params.asInstanceOf[js.Any]).asInstanceOf[IPanorama]
    
    /* static member */
    inline def getMarkerPositionFromDirection(panorama: IPanorama, direction: js.Array[Double], distance: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMarkerPositionFromDirection")(panorama.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  }
  
  @JSGlobal("ymaps.panorama.Manager")
  @js.native
  open class Manager ()
    extends typings.yandexMaps.mod.panorama.Manager
  
  @JSGlobal("ymaps.panorama.Player")
  @js.native
  open class Player protected ()
    extends typings.yandexMaps.mod.panorama.Player {
    def this(element: String, panorama: IPanorama) = this()
    def this(element: HTMLElement, panorama: IPanorama) = this()
    def this(element: String, panorama: IPanorama, options: AutoFitToViewport) = this()
    def this(element: HTMLElement, panorama: IPanorama, options: AutoFitToViewport) = this()
  }
  
  inline def createPlayer(element: String, point: js.Array[Double]): js.Promise[typings.yandexMaps.mod.panorama.Player] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlayer")(element.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.yandexMaps.mod.panorama.Player]]
  inline def createPlayer(element: String, point: js.Array[Double], options: Direction): js.Promise[typings.yandexMaps.mod.panorama.Player] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlayer")(element.asInstanceOf[js.Any], point.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.yandexMaps.mod.panorama.Player]]
  inline def createPlayer(element: HTMLElement, point: js.Array[Double]): js.Promise[typings.yandexMaps.mod.panorama.Player] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlayer")(element.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.yandexMaps.mod.panorama.Player]]
  inline def createPlayer(element: HTMLElement, point: js.Array[Double], options: Direction): js.Promise[typings.yandexMaps.mod.panorama.Player] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlayer")(element.asInstanceOf[js.Any], point.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.yandexMaps.mod.panorama.Player]]
  
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  
  inline def locate(point: js.Array[Double]): js.Promise[js.Array[IPanorama]] = ^.asInstanceOf[js.Dynamic].applyDynamic("locate")(point.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[IPanorama]]]
  inline def locate(point: js.Array[Double], options: typings.yandexMaps.anon.Layer): js.Promise[js.Array[IPanorama]] = (^.asInstanceOf[js.Dynamic].applyDynamic("locate")(point.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[IPanorama]]]
}
