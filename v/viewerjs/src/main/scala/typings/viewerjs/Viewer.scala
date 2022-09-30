package typings.viewerjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.CustomEvent
import typings.std.FullscreenOptions
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Viewer extends StObject {
  
  def destroy(): Viewer = js.native
  
  def exit(): Viewer = js.native
  
  def full(): Viewer = js.native
  
  def hide(): Viewer = js.native
  def hide(immediate: Boolean): Viewer = js.native
  
  def move(offsetX: Double): Viewer = js.native
  def move(offsetX: Double, offsetY: Double): Viewer = js.native
  
  def moveTo(x: Double): Viewer = js.native
  def moveTo(x: Double, y: Double): Viewer = js.native
  
  def next(): Viewer = js.native
  def next(loop: Boolean): Viewer = js.native
  
  def play(): Viewer = js.native
  def play(fullscreen: Boolean): Viewer = js.native
  def play(fullscreen: FullscreenOptions): Viewer = js.native
  
  def prev(): Viewer = js.native
  def prev(loop: Boolean): Viewer = js.native
  
  def reset(): Viewer = js.native
  
  def rotate(degree: Double): Viewer = js.native
  
  def rotateTo(degree: Double): Viewer = js.native
  
  def scale(scaleX: Double): Viewer = js.native
  def scale(scaleX: Double, scaleY: Double): Viewer = js.native
  
  def scaleX(scaleX: Double): Viewer = js.native
  
  def scaleY(scaleY: Double): Viewer = js.native
  
  def show(): Viewer = js.native
  def show(immediate: Boolean): Viewer = js.native
  
  def stop(): Viewer = js.native
  
  def toggle(): Viewer = js.native
  
  def tooltip(): Viewer = js.native
  
  def update(): Viewer = js.native
  
  def view(): Viewer = js.native
  def view(index: Double): Viewer = js.native
  
  def zoom(ratio: Double): Viewer = js.native
  def zoom(ratio: Double, hasTooltip: Boolean): Viewer = js.native
  
  def zoomTo(ratio: Double): Viewer = js.native
  def zoomTo(ratio: Double, hasTooltip: Boolean): Viewer = js.native
}
object Viewer {
  
  @js.native
  trait MoveEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_MoveEvent: MoveEventData = js.native
  }
  
  trait MoveEventData extends StObject {
    
    var oldX: Double
    
    var oldY: Double
    
    var originalEvent: PointerEvent | TouchEvent | MouseEvent | Null
    
    var x: Double
    
    var y: Double
  }
  object MoveEventData {
    
    inline def apply(oldX: Double, oldY: Double, x: Double, y: Double): MoveEventData = {
      val __obj = js.Dynamic.literal(oldX = oldX.asInstanceOf[js.Any], oldY = oldY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], originalEvent = null)
      __obj.asInstanceOf[MoveEventData]
    }
    
    extension [Self <: MoveEventData](x: Self) {
      
      inline def setOldX(value: Double): Self = StObject.set(x, "oldX", value.asInstanceOf[js.Any])
      
      inline def setOldY(value: Double): Self = StObject.set(x, "oldY", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: PointerEvent | TouchEvent | MouseEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventNull: Self = StObject.set(x, "originalEvent", null)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MovedEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_MovedEvent: MoveEventData = js.native
  }
  
  trait Options extends StObject {
    
    var backdrop: js.UndefOr[Boolean | String] = js.undefined
    
    var button: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var container: js.UndefOr[String | HTMLElement] = js.undefined
    
    var filter: js.UndefOr[js.Function] = js.undefined
    
    var focus: js.UndefOr[Boolean] = js.undefined
    
    var fullscreen: js.UndefOr[Boolean | FullscreenOptions] = js.undefined
    
    var hidden: js.UndefOr[js.Function1[/* event */ CustomEvent[Any], Unit]] = js.undefined
    
    var hide: js.UndefOr[js.Function1[/* event */ CustomEvent[Any], Unit]] = js.undefined
    
    var inheritedAttributes: js.UndefOr[js.Array[String]] = js.undefined
    
    var initialViewIndex: js.UndefOr[Double] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var maxZoomRatio: js.UndefOr[Double] = js.undefined
    
    var minHeight: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var minZoomRatio: js.UndefOr[Double] = js.undefined
    
    var movable: js.UndefOr[Boolean] = js.undefined
    
    var move: js.UndefOr[js.Function1[/* event */ MoveEvent, Unit]] = js.undefined
    
    var moved: js.UndefOr[js.Function1[/* event */ MovedEvent, Unit]] = js.undefined
    
    var navbar: js.UndefOr[Boolean | Visibility] = js.undefined
    
    var play: js.UndefOr[js.Function1[/* event */ CustomEvent[Any], Unit]] = js.undefined
    
    var ready: js.UndefOr[js.Function1[/* event */ CustomEvent[Any], Unit]] = js.undefined
    
    var rotatable: js.UndefOr[Boolean] = js.undefined
    
    var rotate: js.UndefOr[js.Function1[/* event */ RotateEvent, Unit]] = js.undefined
    
    var rotated: js.UndefOr[js.Function1[/* event */ RotatedEvent, Unit]] = js.undefined
    
    var scalable: js.UndefOr[Boolean] = js.undefined
    
    var scale: js.UndefOr[js.Function1[/* event */ ScaleEvent, Unit]] = js.undefined
    
    var scaled: js.UndefOr[js.Function1[/* event */ ScaledEvent, Unit]] = js.undefined
    
    var show: js.UndefOr[js.Function1[/* event */ CustomEvent[Any], Unit]] = js.undefined
    
    var shown: js.UndefOr[js.Function1[/* event */ CustomEvent[Any], Unit]] = js.undefined
    
    var slideOnTouch: js.UndefOr[Boolean] = js.undefined
    
    var stop: js.UndefOr[js.Function1[/* event */ CustomEvent[Any], Unit]] = js.undefined
    
    var title: js.UndefOr[Boolean | Visibility | js.Function | (js.Tuple2[Visibility, js.Function])] = js.undefined
    
    var toggleOnDblclick: js.UndefOr[Boolean] = js.undefined
    
    var toolbar: js.UndefOr[Boolean | Visibility | ToolbarOptions] = js.undefined
    
    var tooltip: js.UndefOr[Boolean] = js.undefined
    
    var transition: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[String | js.Function] = js.undefined
    
    var view: js.UndefOr[js.Function1[/* event */ CustomEvent[Any], Unit]] = js.undefined
    
    var viewed: js.UndefOr[js.Function1[/* event */ CustomEvent[Any], Unit]] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
    
    var zIndexInline: js.UndefOr[Double] = js.undefined
    
    var zoom: js.UndefOr[js.Function1[/* event */ ZoomEvent, Unit]] = js.undefined
    
    var zoomOnTouch: js.UndefOr[Boolean] = js.undefined
    
    var zoomOnWheel: js.UndefOr[Boolean] = js.undefined
    
    var zoomRatio: js.UndefOr[Double] = js.undefined
    
    var zoomable: js.UndefOr[Boolean] = js.undefined
    
    var zoomed: js.UndefOr[js.Function1[/* event */ ZoomedEvent, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBackdrop(value: Boolean | String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      inline def setButton(value: Boolean): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setFilter(value: js.Function): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setFullscreen(value: Boolean | FullscreenOptions): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      inline def setHidden(value: /* event */ CustomEvent[Any] => Unit): Self = StObject.set(x, "hidden", js.Any.fromFunction1(value))
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHide(value: /* event */ CustomEvent[Any] => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setInheritedAttributes(value: js.Array[String]): Self = StObject.set(x, "inheritedAttributes", value.asInstanceOf[js.Any])
      
      inline def setInheritedAttributesUndefined: Self = StObject.set(x, "inheritedAttributes", js.undefined)
      
      inline def setInheritedAttributesVarargs(value: String*): Self = StObject.set(x, "inheritedAttributes", js.Array(value*))
      
      inline def setInitialViewIndex(value: Double): Self = StObject.set(x, "initialViewIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialViewIndexUndefined: Self = StObject.set(x, "initialViewIndex", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMaxZoomRatio(value: Double): Self = StObject.set(x, "maxZoomRatio", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomRatioUndefined: Self = StObject.set(x, "maxZoomRatio", js.undefined)
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMinZoomRatio(value: Double): Self = StObject.set(x, "minZoomRatio", value.asInstanceOf[js.Any])
      
      inline def setMinZoomRatioUndefined: Self = StObject.set(x, "minZoomRatio", js.undefined)
      
      inline def setMovable(value: Boolean): Self = StObject.set(x, "movable", value.asInstanceOf[js.Any])
      
      inline def setMovableUndefined: Self = StObject.set(x, "movable", js.undefined)
      
      inline def setMove(value: /* event */ MoveEvent => Unit): Self = StObject.set(x, "move", js.Any.fromFunction1(value))
      
      inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
      
      inline def setMoved(value: /* event */ MovedEvent => Unit): Self = StObject.set(x, "moved", js.Any.fromFunction1(value))
      
      inline def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
      
      inline def setNavbar(value: Boolean | Visibility): Self = StObject.set(x, "navbar", value.asInstanceOf[js.Any])
      
      inline def setNavbarUndefined: Self = StObject.set(x, "navbar", js.undefined)
      
      inline def setPlay(value: /* event */ CustomEvent[Any] => Unit): Self = StObject.set(x, "play", js.Any.fromFunction1(value))
      
      inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      inline def setReady(value: /* event */ CustomEvent[Any] => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      inline def setRotatable(value: Boolean): Self = StObject.set(x, "rotatable", value.asInstanceOf[js.Any])
      
      inline def setRotatableUndefined: Self = StObject.set(x, "rotatable", js.undefined)
      
      inline def setRotate(value: /* event */ RotateEvent => Unit): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setRotated(value: /* event */ RotatedEvent => Unit): Self = StObject.set(x, "rotated", js.Any.fromFunction1(value))
      
      inline def setRotatedUndefined: Self = StObject.set(x, "rotated", js.undefined)
      
      inline def setScalable(value: Boolean): Self = StObject.set(x, "scalable", value.asInstanceOf[js.Any])
      
      inline def setScalableUndefined: Self = StObject.set(x, "scalable", js.undefined)
      
      inline def setScale(value: /* event */ ScaleEvent => Unit): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScaled(value: /* event */ ScaledEvent => Unit): Self = StObject.set(x, "scaled", js.Any.fromFunction1(value))
      
      inline def setScaledUndefined: Self = StObject.set(x, "scaled", js.undefined)
      
      inline def setShow(value: /* event */ CustomEvent[Any] => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setShown(value: /* event */ CustomEvent[Any] => Unit): Self = StObject.set(x, "shown", js.Any.fromFunction1(value))
      
      inline def setShownUndefined: Self = StObject.set(x, "shown", js.undefined)
      
      inline def setSlideOnTouch(value: Boolean): Self = StObject.set(x, "slideOnTouch", value.asInstanceOf[js.Any])
      
      inline def setSlideOnTouchUndefined: Self = StObject.set(x, "slideOnTouch", js.undefined)
      
      inline def setStop(value: /* event */ CustomEvent[Any] => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      
      inline def setTitle(value: Boolean | Visibility | js.Function | (js.Tuple2[Visibility, js.Function])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToggleOnDblclick(value: Boolean): Self = StObject.set(x, "toggleOnDblclick", value.asInstanceOf[js.Any])
      
      inline def setToggleOnDblclickUndefined: Self = StObject.set(x, "toggleOnDblclick", js.undefined)
      
      inline def setToolbar(value: Boolean | Visibility | ToolbarOptions): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      
      inline def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setUrl(value: String | js.Function): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setView(value: /* event */ CustomEvent[Any] => Unit): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      inline def setViewed(value: /* event */ CustomEvent[Any] => Unit): Self = StObject.set(x, "viewed", js.Any.fromFunction1(value))
      
      inline def setViewedUndefined: Self = StObject.set(x, "viewed", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexInline(value: Double): Self = StObject.set(x, "zIndexInline", value.asInstanceOf[js.Any])
      
      inline def setZIndexInlineUndefined: Self = StObject.set(x, "zIndexInline", js.undefined)
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      inline def setZoom(value: /* event */ ZoomEvent => Unit): Self = StObject.set(x, "zoom", js.Any.fromFunction1(value))
      
      inline def setZoomOnTouch(value: Boolean): Self = StObject.set(x, "zoomOnTouch", value.asInstanceOf[js.Any])
      
      inline def setZoomOnTouchUndefined: Self = StObject.set(x, "zoomOnTouch", js.undefined)
      
      inline def setZoomOnWheel(value: Boolean): Self = StObject.set(x, "zoomOnWheel", value.asInstanceOf[js.Any])
      
      inline def setZoomOnWheelUndefined: Self = StObject.set(x, "zoomOnWheel", js.undefined)
      
      inline def setZoomRatio(value: Double): Self = StObject.set(x, "zoomRatio", value.asInstanceOf[js.Any])
      
      inline def setZoomRatioUndefined: Self = StObject.set(x, "zoomRatio", js.undefined)
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
      
      inline def setZoomable(value: Boolean): Self = StObject.set(x, "zoomable", value.asInstanceOf[js.Any])
      
      inline def setZoomableUndefined: Self = StObject.set(x, "zoomable", js.undefined)
      
      inline def setZoomed(value: /* event */ ZoomedEvent => Unit): Self = StObject.set(x, "zoomed", js.Any.fromFunction1(value))
      
      inline def setZoomedUndefined: Self = StObject.set(x, "zoomed", js.undefined)
    }
  }
  
  @js.native
  trait RotateEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_RotateEvent: RotateEventData = js.native
  }
  
  trait RotateEventData extends StObject {
    
    var degree: Double
    
    var oldDegree: Double
  }
  object RotateEventData {
    
    inline def apply(degree: Double, oldDegree: Double): RotateEventData = {
      val __obj = js.Dynamic.literal(degree = degree.asInstanceOf[js.Any], oldDegree = oldDegree.asInstanceOf[js.Any])
      __obj.asInstanceOf[RotateEventData]
    }
    
    extension [Self <: RotateEventData](x: Self) {
      
      inline def setDegree(value: Double): Self = StObject.set(x, "degree", value.asInstanceOf[js.Any])
      
      inline def setOldDegree(value: Double): Self = StObject.set(x, "oldDegree", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RotatedEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_RotatedEvent: RotateEventData = js.native
  }
  
  @js.native
  trait ScaleEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_ScaleEvent: ScaleEventData = js.native
  }
  
  trait ScaleEventData extends StObject {
    
    var oldScaleX: Double
    
    var oldScaleY: Double
    
    var scaleX: Double
    
    var scaleY: Double
  }
  object ScaleEventData {
    
    inline def apply(oldScaleX: Double, oldScaleY: Double, scaleX: Double, scaleY: Double): ScaleEventData = {
      val __obj = js.Dynamic.literal(oldScaleX = oldScaleX.asInstanceOf[js.Any], oldScaleY = oldScaleY.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleEventData]
    }
    
    extension [Self <: ScaleEventData](x: Self) {
      
      inline def setOldScaleX(value: Double): Self = StObject.set(x, "oldScaleX", value.asInstanceOf[js.Any])
      
      inline def setOldScaleY(value: Double): Self = StObject.set(x, "oldScaleY", value.asInstanceOf[js.Any])
      
      inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScaledEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_ScaledEvent: ScaleEventData = js.native
  }
  
  trait ToolbarButtonOptions
    extends StObject
       with _ToolbarOption {
    
    var click: js.UndefOr[js.Function] = js.undefined
    
    var show: js.UndefOr[Boolean | Visibility] = js.undefined
    
    var size: js.UndefOr[ToolbarButtonSize] = js.undefined
  }
  object ToolbarButtonOptions {
    
    inline def apply(): ToolbarButtonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarButtonOptions]
    }
    
    extension [Self <: ToolbarButtonOptions](x: Self) {
      
      inline def setClick(value: js.Function): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setShow(value: Boolean | Visibility): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSize(value: ToolbarButtonSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.viewerjs.viewerjsStrings.small
    - typings.viewerjs.viewerjsStrings.medium
    - typings.viewerjs.viewerjsStrings.large
  */
  trait ToolbarButtonSize
    extends StObject
       with _ToolbarOption
  object ToolbarButtonSize {
    
    inline def large: typings.viewerjs.viewerjsStrings.large = "large".asInstanceOf[typings.viewerjs.viewerjsStrings.large]
    
    inline def medium: typings.viewerjs.viewerjsStrings.medium = "medium".asInstanceOf[typings.viewerjs.viewerjsStrings.medium]
    
    inline def small: typings.viewerjs.viewerjsStrings.small = "small".asInstanceOf[typings.viewerjs.viewerjsStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.viewerjs.Viewer.Visibility
    - typings.viewerjs.Viewer.ToolbarButtonSize
    - js.Function
    - typings.viewerjs.Viewer.ToolbarButtonOptions
    - scala.Unit
  */
  type ToolbarOption = js.UndefOr[_ToolbarOption | Boolean | js.Function]
  
  trait ToolbarOptions
    extends StObject
       with /* x */ StringDictionary[ToolbarOption] {
    
    var flipHorizontal: js.UndefOr[ToolbarOption] = js.undefined
    
    var flipVertical: js.UndefOr[ToolbarOption] = js.undefined
    
    var next: js.UndefOr[ToolbarOption] = js.undefined
    
    var oneToOne: js.UndefOr[ToolbarOption] = js.undefined
    
    var play: js.UndefOr[ToolbarOption] = js.undefined
    
    var prev: js.UndefOr[ToolbarOption] = js.undefined
    
    var reset: js.UndefOr[ToolbarOption] = js.undefined
    
    var rotateLeft: js.UndefOr[ToolbarOption] = js.undefined
    
    var rotateRight: js.UndefOr[ToolbarOption] = js.undefined
    
    var zoomIn: js.UndefOr[ToolbarOption] = js.undefined
    
    var zoomOut: js.UndefOr[ToolbarOption] = js.undefined
  }
  object ToolbarOptions {
    
    inline def apply(): ToolbarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarOptions]
    }
    
    extension [Self <: ToolbarOptions](x: Self) {
      
      inline def setFlipHorizontal(value: ToolbarOption): Self = StObject.set(x, "flipHorizontal", value.asInstanceOf[js.Any])
      
      inline def setFlipHorizontalUndefined: Self = StObject.set(x, "flipHorizontal", js.undefined)
      
      inline def setFlipVertical(value: ToolbarOption): Self = StObject.set(x, "flipVertical", value.asInstanceOf[js.Any])
      
      inline def setFlipVerticalUndefined: Self = StObject.set(x, "flipVertical", js.undefined)
      
      inline def setNext(value: ToolbarOption): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setOneToOne(value: ToolbarOption): Self = StObject.set(x, "oneToOne", value.asInstanceOf[js.Any])
      
      inline def setOneToOneUndefined: Self = StObject.set(x, "oneToOne", js.undefined)
      
      inline def setPlay(value: ToolbarOption): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      inline def setPrev(value: ToolbarOption): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      inline def setReset(value: ToolbarOption): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setRotateLeft(value: ToolbarOption): Self = StObject.set(x, "rotateLeft", value.asInstanceOf[js.Any])
      
      inline def setRotateLeftUndefined: Self = StObject.set(x, "rotateLeft", js.undefined)
      
      inline def setRotateRight(value: ToolbarOption): Self = StObject.set(x, "rotateRight", value.asInstanceOf[js.Any])
      
      inline def setRotateRightUndefined: Self = StObject.set(x, "rotateRight", js.undefined)
      
      inline def setZoomIn(value: ToolbarOption): Self = StObject.set(x, "zoomIn", value.asInstanceOf[js.Any])
      
      inline def setZoomInUndefined: Self = StObject.set(x, "zoomIn", js.undefined)
      
      inline def setZoomOut(value: ToolbarOption): Self = StObject.set(x, "zoomOut", value.asInstanceOf[js.Any])
      
      inline def setZoomOutUndefined: Self = StObject.set(x, "zoomOut", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.viewerjs.viewerjsInts.`0`
    - typings.viewerjs.viewerjsInts.`1`
    - typings.viewerjs.viewerjsInts.`2`
    - typings.viewerjs.viewerjsInts.`3`
    - typings.viewerjs.viewerjsInts.`4`
  */
  trait Visibility
    extends StObject
       with _ToolbarOption
  object Visibility {
    
    inline def `0`: typings.viewerjs.viewerjsInts.`0` = 0.asInstanceOf[typings.viewerjs.viewerjsInts.`0`]
    
    inline def `1`: typings.viewerjs.viewerjsInts.`1` = 1.asInstanceOf[typings.viewerjs.viewerjsInts.`1`]
    
    inline def `2`: typings.viewerjs.viewerjsInts.`2` = 2.asInstanceOf[typings.viewerjs.viewerjsInts.`2`]
    
    inline def `3`: typings.viewerjs.viewerjsInts.`3` = 3.asInstanceOf[typings.viewerjs.viewerjsInts.`3`]
    
    inline def `4`: typings.viewerjs.viewerjsInts.`4` = 4.asInstanceOf[typings.viewerjs.viewerjsInts.`4`]
  }
  
  @js.native
  trait ZoomEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_ZoomEvent: ZoomEventData = js.native
  }
  
  trait ZoomEventData extends StObject {
    
    var oldRatio: Double
    
    var originalEvent: WheelEvent | PointerEvent | TouchEvent | MouseEvent | Null
    
    var ratio: Double
  }
  object ZoomEventData {
    
    inline def apply(oldRatio: Double, ratio: Double): ZoomEventData = {
      val __obj = js.Dynamic.literal(oldRatio = oldRatio.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], originalEvent = null)
      __obj.asInstanceOf[ZoomEventData]
    }
    
    extension [Self <: ZoomEventData](x: Self) {
      
      inline def setOldRatio(value: Double): Self = StObject.set(x, "oldRatio", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: WheelEvent | PointerEvent | TouchEvent | MouseEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventNull: Self = StObject.set(x, "originalEvent", null)
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ZoomedEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_ZoomedEvent: ZoomEventData = js.native
  }
  
  trait _ToolbarOption extends StObject
}
