package typings.yandexMaps.mod

import typings.yandexMaps.mod.router.Route
import typings.yandexMaps.mod.util.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//option.presetStorage
//[number, number]
//[[number, number], [number, number]]
object behavior {
  
  @JSImport("yandex-maps", "behavior.DblClickZoom")
  @js.native
  class DblClickZoom ()
    extends StObject
       with IBehavior {
    def this(options: IDblClickZoomOptions) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  @JSImport("yandex-maps", "behavior.Drag")
  @js.native
  class Drag ()
    extends StObject
       with IBehavior {
    def this(options: IDragOptions) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  @JSImport("yandex-maps", "behavior.LeftMouseButtonMagnifier")
  @js.native
  class LeftMouseButtonMagnifier ()
    extends StObject
       with IBehavior {
    def this(options: ILeftMouseButtonMagnifierOptions) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  @JSImport("yandex-maps", "behavior.MultiTouch")
  @js.native
  class MultiTouch ()
    extends StObject
       with IBehavior {
    def this(options: IMultiTouchOptions) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  @JSImport("yandex-maps", "behavior.RightMouseButtonMagnifier")
  @js.native
  class RightMouseButtonMagnifier ()
    extends StObject
       with IBehavior {
    def this(options: IRightMouseButtonMagnifierOptions) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  @JSImport("yandex-maps", "behavior.RouteEditor")
  @js.native
  class RouteEditor ()
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
  class Ruler ()
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
  class ScrollZoom ()
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
    
    @scala.inline
    def apply(): IDblClickZoomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDblClickZoomOptions]
    }
    
    @scala.inline
    implicit class IDblClickZoomOptionsMutableBuilder[Self <: IDblClickZoomOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCentering(value: Boolean): Self = StObject.set(x, "centering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteringUndefined: Self = StObject.set(x, "centering", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
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
    
    @scala.inline
    def apply(): IDragOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDragOptions]
    }
    
    @scala.inline
    implicit class IDragOptionsMutableBuilder[Self <: IDragOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionCursor(value: String): Self = StObject.set(x, "actionCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionCursorUndefined: Self = StObject.set(x, "actionCursor", js.undefined)
      
      @scala.inline
      def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setInertia(value: Boolean): Self = StObject.set(x, "inertia", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInertiaDuration(value: Double): Self = StObject.set(x, "inertiaDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInertiaDurationUndefined: Self = StObject.set(x, "inertiaDuration", js.undefined)
      
      @scala.inline
      def setInertiaUndefined: Self = StObject.set(x, "inertia", js.undefined)
      
      @scala.inline
      def setTremor(value: Double): Self = StObject.set(x, "tremor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTremorUndefined: Self = StObject.set(x, "tremor", js.undefined)
    }
  }
  
  trait ILeftMouseButtonMagnifierOptions extends StObject {
    
    var actionCursor: js.UndefOr[String] = js.undefined
    
    var cursor: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
  }
  object ILeftMouseButtonMagnifierOptions {
    
    @scala.inline
    def apply(): ILeftMouseButtonMagnifierOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILeftMouseButtonMagnifierOptions]
    }
    
    @scala.inline
    implicit class ILeftMouseButtonMagnifierOptionsMutableBuilder[Self <: ILeftMouseButtonMagnifierOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionCursor(value: String): Self = StObject.set(x, "actionCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionCursorUndefined: Self = StObject.set(x, "actionCursor", js.undefined)
      
      @scala.inline
      def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    }
  }
  
  trait IMultiTouchOptions extends StObject {
    
    var tremor: js.UndefOr[Double] = js.undefined
  }
  object IMultiTouchOptions {
    
    @scala.inline
    def apply(): IMultiTouchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMultiTouchOptions]
    }
    
    @scala.inline
    implicit class IMultiTouchOptionsMutableBuilder[Self <: IMultiTouchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTremor(value: Double): Self = StObject.set(x, "tremor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTremorUndefined: Self = StObject.set(x, "tremor", js.undefined)
    }
  }
  
  trait IRightMouseButtonMagnifierOptions extends StObject {
    
    var actionCursor: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
  }
  object IRightMouseButtonMagnifierOptions {
    
    @scala.inline
    def apply(): IRightMouseButtonMagnifierOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRightMouseButtonMagnifierOptions]
    }
    
    @scala.inline
    implicit class IRightMouseButtonMagnifierOptionsMutableBuilder[Self <: IRightMouseButtonMagnifierOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionCursor(value: String): Self = StObject.set(x, "actionCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionCursorUndefined: Self = StObject.set(x, "actionCursor", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    }
  }
  
  trait IRulerOptions extends StObject {
    
    var balloonAutoPan: js.UndefOr[Boolean] = js.undefined
  }
  object IRulerOptions {
    
    @scala.inline
    def apply(): IRulerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRulerOptions]
    }
    
    @scala.inline
    implicit class IRulerOptionsMutableBuilder[Self <: IRulerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBalloonAutoPan(value: Boolean): Self = StObject.set(x, "balloonAutoPan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalloonAutoPanUndefined: Self = StObject.set(x, "balloonAutoPan", js.undefined)
    }
  }
  
  trait IScrollZoomOptions extends StObject {
    
    var maximumDelta: js.UndefOr[Double] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
  }
  object IScrollZoomOptions {
    
    @scala.inline
    def apply(): IScrollZoomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScrollZoomOptions]
    }
    
    @scala.inline
    implicit class IScrollZoomOptionsMutableBuilder[Self <: IScrollZoomOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaximumDelta(value: Double): Self = StObject.set(x, "maximumDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumDeltaUndefined: Self = StObject.set(x, "maximumDelta", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
}
