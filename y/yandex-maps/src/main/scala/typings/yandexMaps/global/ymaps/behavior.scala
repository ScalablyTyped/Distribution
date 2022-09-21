package typings.yandexMaps.global.ymaps

import typings.yandexMaps.mod.behavior.IDblClickZoomOptions
import typings.yandexMaps.mod.behavior.IDragOptions
import typings.yandexMaps.mod.behavior.ILeftMouseButtonMagnifierOptions
import typings.yandexMaps.mod.behavior.IMultiTouchOptions
import typings.yandexMaps.mod.behavior.IRightMouseButtonMagnifierOptions
import typings.yandexMaps.mod.behavior.IRulerOptions
import typings.yandexMaps.mod.behavior.IScrollZoomOptions
import typings.yandexMaps.mod.util.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object behavior {
  
  @JSGlobal("ymaps.behavior.DblClickZoom")
  @js.native
  open class DblClickZoom ()
    extends typings.yandexMaps.mod.behavior.DblClickZoom {
    def this(options: IDblClickZoomOptions) = this()
  }
  
  @JSGlobal("ymaps.behavior.Drag")
  @js.native
  open class Drag ()
    extends typings.yandexMaps.mod.behavior.Drag {
    def this(options: IDragOptions) = this()
  }
  
  @JSGlobal("ymaps.behavior.LeftMouseButtonMagnifier")
  @js.native
  open class LeftMouseButtonMagnifier ()
    extends typings.yandexMaps.mod.behavior.LeftMouseButtonMagnifier {
    def this(options: ILeftMouseButtonMagnifierOptions) = this()
  }
  
  @JSGlobal("ymaps.behavior.MultiTouch")
  @js.native
  open class MultiTouch ()
    extends typings.yandexMaps.mod.behavior.MultiTouch {
    def this(options: IMultiTouchOptions) = this()
  }
  
  @JSGlobal("ymaps.behavior.RightMouseButtonMagnifier")
  @js.native
  open class RightMouseButtonMagnifier ()
    extends typings.yandexMaps.mod.behavior.RightMouseButtonMagnifier {
    def this(options: IRightMouseButtonMagnifierOptions) = this()
  }
  
  @JSGlobal("ymaps.behavior.RouteEditor")
  @js.native
  open class RouteEditor ()
    extends typings.yandexMaps.mod.behavior.RouteEditor
  
  @JSGlobal("ymaps.behavior.Ruler")
  @js.native
  open class Ruler ()
    extends typings.yandexMaps.mod.behavior.Ruler {
    def this(options: IRulerOptions) = this()
  }
  
  @JSGlobal("ymaps.behavior.ScrollZoom")
  @js.native
  open class ScrollZoom ()
    extends typings.yandexMaps.mod.behavior.ScrollZoom {
    def this(options: IScrollZoomOptions) = this()
  }
  
  @JSGlobal("ymaps.behavior.storage")
  @js.native
  val storage: Storage = js.native
}
