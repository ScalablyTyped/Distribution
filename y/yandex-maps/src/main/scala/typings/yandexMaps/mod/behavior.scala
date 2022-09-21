package typings.yandexMaps.mod

import typings.yandexMaps.mod.router.Route
import typings.yandexMaps.mod.util.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object behavior {
  
  @JSImport("yandex-maps", "behavior.DblClickZoom")
  @js.native
  open class DblClickZoom ()
    extends StObject
       with IBehavior {
    def this(options: IDblClickZoomOptions) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  @JSImport("yandex-maps", "behavior.Drag")
  @js.native
  open class Drag ()
    extends StObject
       with IBehavior {
    def this(options: IDragOptions) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  @JSImport("yandex-maps", "behavior.LeftMouseButtonMagnifier")
  @js.native
  open class LeftMouseButtonMagnifier ()
    extends StObject
       with IBehavior {
    def this(options: ILeftMouseButtonMagnifierOptions) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  @JSImport("yandex-maps", "behavior.MultiTouch")
  @js.native
  open class MultiTouch ()
    extends StObject
       with IBehavior {
    def this(options: IMultiTouchOptions) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  @JSImport("yandex-maps", "behavior.RightMouseButtonMagnifier")
  @js.native
  open class RightMouseButtonMagnifier ()
    extends StObject
       with IBehavior {
    def this(options: IRightMouseButtonMagnifierOptions) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  @JSImport("yandex-maps", "behavior.RouteEditor")
  @js.native
  open class RouteEditor ()
    extends StObject
       with IBehavior {
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def getRoute(): Route = js.native
    
    def getState(): String = js.native
    
    def setParent(parent: IControlParent): this.type = js.native
    
    def setState(): Unit = js.native
    def setState(state: String): Unit = js.native
  }
  
  @JSImport("yandex-maps", "behavior.Ruler")
  @js.native
  open class Ruler ()
    extends StObject
       with IBehavior {
    def this(options: IRulerOptions) = this()
    
    def close(): Boolean = js.native
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def getState(): String = js.native
    
    def setParent(parent: IControlParent): this.type = js.native
    
    def setState(): Unit = js.native
    def setState(state: String): Unit = js.native
  }
  
  @JSImport("yandex-maps", "behavior.ScrollZoom")
  @js.native
  open class ScrollZoom ()
    extends StObject
       with IBehavior {
    def this(options: IScrollZoomOptions) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  @JSImport("yandex-maps", "behavior.storage")
  @js.native
  val storage: Storage = js.native
  
  trait IDblClickZoomOptions
    extends StObject
       with IMapMarginOptions {
    
    var centering: js.UndefOr[Boolean] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
  }
  object IDblClickZoomOptions {
    
    inline def apply(): IDblClickZoomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDblClickZoomOptions]
    }
    
    extension [Self <: IDblClickZoomOptions](x: Self) {
      
      inline def setCentering(value: Boolean): Self = StObject.set(x, "centering", value.asInstanceOf[js.Any])
      
      inline def setCenteringUndefined: Self = StObject.set(x, "centering", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    }
  }
  
  trait IDragOptions extends StObject {
    
    var actionCursor: js.UndefOr[String] = js.undefined
    
    var cursor: js.UndefOr[String] = js.undefined
    
    var inertia: js.UndefOr[Boolean] = js.undefined
    
    var inertiaDuration: js.UndefOr[Double] = js.undefined
    
    var tremor: js.UndefOr[Double] = js.undefined
  }
  object IDragOptions {
    
    inline def apply(): IDragOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDragOptions]
    }
    
    extension [Self <: IDragOptions](x: Self) {
      
      inline def setActionCursor(value: String): Self = StObject.set(x, "actionCursor", value.asInstanceOf[js.Any])
      
      inline def setActionCursorUndefined: Self = StObject.set(x, "actionCursor", js.undefined)
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setInertia(value: Boolean): Self = StObject.set(x, "inertia", value.asInstanceOf[js.Any])
      
      inline def setInertiaDuration(value: Double): Self = StObject.set(x, "inertiaDuration", value.asInstanceOf[js.Any])
      
      inline def setInertiaDurationUndefined: Self = StObject.set(x, "inertiaDuration", js.undefined)
      
      inline def setInertiaUndefined: Self = StObject.set(x, "inertia", js.undefined)
      
      inline def setTremor(value: Double): Self = StObject.set(x, "tremor", value.asInstanceOf[js.Any])
      
      inline def setTremorUndefined: Self = StObject.set(x, "tremor", js.undefined)
    }
  }
  
  trait ILeftMouseButtonMagnifierOptions extends StObject {
    
    var actionCursor: js.UndefOr[String] = js.undefined
    
    var cursor: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
  }
  object ILeftMouseButtonMagnifierOptions {
    
    inline def apply(): ILeftMouseButtonMagnifierOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILeftMouseButtonMagnifierOptions]
    }
    
    extension [Self <: ILeftMouseButtonMagnifierOptions](x: Self) {
      
      inline def setActionCursor(value: String): Self = StObject.set(x, "actionCursor", value.asInstanceOf[js.Any])
      
      inline def setActionCursorUndefined: Self = StObject.set(x, "actionCursor", js.undefined)
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    }
  }
  
  trait IMultiTouchOptions extends StObject {
    
    var tremor: js.UndefOr[Double] = js.undefined
  }
  object IMultiTouchOptions {
    
    inline def apply(): IMultiTouchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMultiTouchOptions]
    }
    
    extension [Self <: IMultiTouchOptions](x: Self) {
      
      inline def setTremor(value: Double): Self = StObject.set(x, "tremor", value.asInstanceOf[js.Any])
      
      inline def setTremorUndefined: Self = StObject.set(x, "tremor", js.undefined)
    }
  }
  
  trait IRightMouseButtonMagnifierOptions extends StObject {
    
    var actionCursor: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
  }
  object IRightMouseButtonMagnifierOptions {
    
    inline def apply(): IRightMouseButtonMagnifierOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRightMouseButtonMagnifierOptions]
    }
    
    extension [Self <: IRightMouseButtonMagnifierOptions](x: Self) {
      
      inline def setActionCursor(value: String): Self = StObject.set(x, "actionCursor", value.asInstanceOf[js.Any])
      
      inline def setActionCursorUndefined: Self = StObject.set(x, "actionCursor", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    }
  }
  
  trait IRulerOptions extends StObject {
    
    var balloonAutoPan: js.UndefOr[Boolean] = js.undefined
  }
  object IRulerOptions {
    
    inline def apply(): IRulerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRulerOptions]
    }
    
    extension [Self <: IRulerOptions](x: Self) {
      
      inline def setBalloonAutoPan(value: Boolean): Self = StObject.set(x, "balloonAutoPan", value.asInstanceOf[js.Any])
      
      inline def setBalloonAutoPanUndefined: Self = StObject.set(x, "balloonAutoPan", js.undefined)
    }
  }
  
  trait IScrollZoomOptions extends StObject {
    
    var maximumDelta: js.UndefOr[Double] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
  }
  object IScrollZoomOptions {
    
    inline def apply(): IScrollZoomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScrollZoomOptions]
    }
    
    extension [Self <: IScrollZoomOptions](x: Self) {
      
      inline def setMaximumDelta(value: Double): Self = StObject.set(x, "maximumDelta", value.asInstanceOf[js.Any])
      
      inline def setMaximumDeltaUndefined: Self = StObject.set(x, "maximumDelta", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
}
