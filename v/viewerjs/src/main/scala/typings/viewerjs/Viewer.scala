package typings.viewerjs

import typings.std.CustomEvent
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  sealed trait ToolbarButtonSize extends StObject
  @JSGlobal("Viewer.ToolbarButtonSize")
  @js.native
  object ToolbarButtonSize extends StObject {
    
    @js.native
    sealed trait Large extends ToolbarButtonSize
    
    @js.native
    sealed trait Medium extends ToolbarButtonSize
    
    @js.native
    sealed trait Small extends ToolbarButtonSize
  }
  
  @js.native
  sealed trait Visibility extends StObject
  @JSGlobal("Viewer.Visibility")
  @js.native
  object Visibility extends StObject {
    
    @js.native
    sealed trait Hidden extends Visibility
    
    @js.native
    sealed trait Visible extends Visibility
    
    @js.native
    sealed trait VisibleOnExtraLargeOrWiderScreen extends Visibility
    
    @js.native
    sealed trait VisibleOnLargeOrWiderScreen extends Visibility
    
    @js.native
    sealed trait VisibleOnMediumOrWiderScreen extends Visibility
  }
  
  @js.native
  trait Options extends StObject {
    
    var backdrop: js.UndefOr[Boolean | String] = js.native
    
    var button: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var container: js.UndefOr[String | HTMLElement] = js.native
    
    var filter: js.UndefOr[js.Function] = js.native
    
    var fullscreen: js.UndefOr[Boolean] = js.native
    
    var hidden: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.native
    
    var hide: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.native
    
    var inheritedAttributes: js.UndefOr[js.Array[String]] = js.native
    
    var initialViewIndex: js.UndefOr[Double] = js.native
    
    var `inline`: js.UndefOr[Boolean] = js.native
    
    var interval: js.UndefOr[Double] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var loop: js.UndefOr[Boolean] = js.native
    
    var maxZoomRatio: js.UndefOr[Double] = js.native
    
    var minHeight: js.UndefOr[Double] = js.native
    
    var minWidth: js.UndefOr[Double] = js.native
    
    var minZoomRatio: js.UndefOr[Double] = js.native
    
    var movable: js.UndefOr[Boolean] = js.native
    
    var navbar: js.UndefOr[Boolean | Visibility] = js.native
    
    var play: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.native
    
    var ready: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.native
    
    var rotatable: js.UndefOr[Boolean] = js.native
    
    var scalable: js.UndefOr[Boolean] = js.native
    
    var show: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.native
    
    var shown: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.native
    
    var slideOnTouch: js.UndefOr[Boolean] = js.native
    
    var stop: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.native
    
    var title: js.UndefOr[Boolean | Visibility | js.Function | (js.Tuple2[Visibility, js.Function])] = js.native
    
    var toggleOnDblclick: js.UndefOr[Boolean] = js.native
    
    var toolbar: js.UndefOr[Boolean | Visibility | ToolbarOptions] = js.native
    
    var tooltip: js.UndefOr[Boolean] = js.native
    
    var transition: js.UndefOr[Boolean] = js.native
    
    var url: js.UndefOr[String | js.Function] = js.native
    
    var view: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.native
    
    var viewed: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
    
    var zIndexInline: js.UndefOr[Double] = js.native
    
    var zoom: js.UndefOr[js.Function1[/* event */ ZoomEvent, Unit]] = js.native
    
    var zoomOnTouch: js.UndefOr[Boolean] = js.native
    
    var zoomOnWheel: js.UndefOr[Boolean] = js.native
    
    var zoomRatio: js.UndefOr[Double] = js.native
    
    var zoomable: js.UndefOr[Boolean] = js.native
    
    var zoomed: js.UndefOr[js.Function1[/* event */ ZoomedEvent, Unit]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackdrop(value: Boolean | String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      @scala.inline
      def setButton(value: Boolean): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setFilter(value: js.Function): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      @scala.inline
      def setHidden(value: /* event */ CustomEvent[_] => Unit): Self = StObject.set(x, "hidden", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setHide(value: /* event */ CustomEvent[_] => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setInheritedAttributes(value: js.Array[String]): Self = StObject.set(x, "inheritedAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritedAttributesUndefined: Self = StObject.set(x, "inheritedAttributes", js.undefined)
      
      @scala.inline
      def setInheritedAttributesVarargs(value: String*): Self = StObject.set(x, "inheritedAttributes", js.Array(value :_*))
      
      @scala.inline
      def setInitialViewIndex(value: Double): Self = StObject.set(x, "initialViewIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialViewIndexUndefined: Self = StObject.set(x, "initialViewIndex", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setMaxZoomRatio(value: Double): Self = StObject.set(x, "maxZoomRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomRatioUndefined: Self = StObject.set(x, "maxZoomRatio", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setMinZoomRatio(value: Double): Self = StObject.set(x, "minZoomRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinZoomRatioUndefined: Self = StObject.set(x, "minZoomRatio", js.undefined)
      
      @scala.inline
      def setMovable(value: Boolean): Self = StObject.set(x, "movable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovableUndefined: Self = StObject.set(x, "movable", js.undefined)
      
      @scala.inline
      def setNavbar(value: Boolean | Visibility): Self = StObject.set(x, "navbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavbarUndefined: Self = StObject.set(x, "navbar", js.undefined)
      
      @scala.inline
      def setPlay(value: /* event */ CustomEvent[_] => Unit): Self = StObject.set(x, "play", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      @scala.inline
      def setReady(value: /* event */ CustomEvent[_] => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      @scala.inline
      def setRotatable(value: Boolean): Self = StObject.set(x, "rotatable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotatableUndefined: Self = StObject.set(x, "rotatable", js.undefined)
      
      @scala.inline
      def setScalable(value: Boolean): Self = StObject.set(x, "scalable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalableUndefined: Self = StObject.set(x, "scalable", js.undefined)
      
      @scala.inline
      def setShow(value: /* event */ CustomEvent[_] => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setShown(value: /* event */ CustomEvent[_] => Unit): Self = StObject.set(x, "shown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShownUndefined: Self = StObject.set(x, "shown", js.undefined)
      
      @scala.inline
      def setSlideOnTouch(value: Boolean): Self = StObject.set(x, "slideOnTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideOnTouchUndefined: Self = StObject.set(x, "slideOnTouch", js.undefined)
      
      @scala.inline
      def setStop(value: /* event */ CustomEvent[_] => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      
      @scala.inline
      def setTitle(value: Boolean | Visibility | js.Function | (js.Tuple2[Visibility, js.Function])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setToggleOnDblclick(value: Boolean): Self = StObject.set(x, "toggleOnDblclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleOnDblclickUndefined: Self = StObject.set(x, "toggleOnDblclick", js.undefined)
      
      @scala.inline
      def setToolbar(value: Boolean | Visibility | ToolbarOptions): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      
      @scala.inline
      def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      @scala.inline
      def setUrl(value: String | js.Function): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setView(value: /* event */ CustomEvent[_] => Unit): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      @scala.inline
      def setViewed(value: /* event */ CustomEvent[_] => Unit): Self = StObject.set(x, "viewed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setViewedUndefined: Self = StObject.set(x, "viewed", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexInline(value: Double): Self = StObject.set(x, "zIndexInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexInlineUndefined: Self = StObject.set(x, "zIndexInline", js.undefined)
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      @scala.inline
      def setZoom(value: /* event */ ZoomEvent => Unit): Self = StObject.set(x, "zoom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomOnTouch(value: Boolean): Self = StObject.set(x, "zoomOnTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomOnTouchUndefined: Self = StObject.set(x, "zoomOnTouch", js.undefined)
      
      @scala.inline
      def setZoomOnWheel(value: Boolean): Self = StObject.set(x, "zoomOnWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomOnWheelUndefined: Self = StObject.set(x, "zoomOnWheel", js.undefined)
      
      @scala.inline
      def setZoomRatio(value: Double): Self = StObject.set(x, "zoomRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomRatioUndefined: Self = StObject.set(x, "zoomRatio", js.undefined)
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
      
      @scala.inline
      def setZoomable(value: Boolean): Self = StObject.set(x, "zoomable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomableUndefined: Self = StObject.set(x, "zoomable", js.undefined)
      
      @scala.inline
      def setZoomed(value: /* event */ ZoomedEvent => Unit): Self = StObject.set(x, "zoomed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomedUndefined: Self = StObject.set(x, "zoomed", js.undefined)
    }
  }
  
  @js.native
  trait ToolbarButtonOptions extends StObject {
    
    var click: js.UndefOr[js.Function] = js.native
    
    var show: js.UndefOr[Boolean | Visibility] = js.native
    
    var size: js.UndefOr[ToolbarButtonSize] = js.native
  }
  object ToolbarButtonOptions {
    
    @scala.inline
    def apply(): ToolbarButtonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarButtonOptions]
    }
    
    @scala.inline
    implicit class ToolbarButtonOptionsMutableBuilder[Self <: ToolbarButtonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick(value: js.Function): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean | Visibility): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setSize(value: ToolbarButtonSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait ToolbarOptions extends StObject {
    
    var flipHorizontal: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
    
    var flipVertical: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
    
    var next: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
    
    var oneToOne: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
    
    var play: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
    
    var prev: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
    
    var reset: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
    
    var rotateLeft: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
    
    var rotateRight: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
    
    var zoomIn: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
    
    var zoomOut: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  }
  object ToolbarOptions {
    
    @scala.inline
    def apply(): ToolbarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarOptions]
    }
    
    @scala.inline
    implicit class ToolbarOptionsMutableBuilder[Self <: ToolbarOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlipHorizontal(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = StObject.set(x, "flipHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipHorizontalUndefined: Self = StObject.set(x, "flipHorizontal", js.undefined)
      
      @scala.inline
      def setFlipVertical(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = StObject.set(x, "flipVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipVerticalUndefined: Self = StObject.set(x, "flipVertical", js.undefined)
      
      @scala.inline
      def setNext(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setOneToOne(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = StObject.set(x, "oneToOne", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneToOneUndefined: Self = StObject.set(x, "oneToOne", js.undefined)
      
      @scala.inline
      def setPlay(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      @scala.inline
      def setPrev(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      @scala.inline
      def setReset(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      @scala.inline
      def setRotateLeft(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = StObject.set(x, "rotateLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateLeftUndefined: Self = StObject.set(x, "rotateLeft", js.undefined)
      
      @scala.inline
      def setRotateRight(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = StObject.set(x, "rotateRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateRightUndefined: Self = StObject.set(x, "rotateRight", js.undefined)
      
      @scala.inline
      def setZoomIn(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = StObject.set(x, "zoomIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomInUndefined: Self = StObject.set(x, "zoomIn", js.undefined)
      
      @scala.inline
      def setZoomOut(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = StObject.set(x, "zoomOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomOutUndefined: Self = StObject.set(x, "zoomOut", js.undefined)
    }
  }
  
  @js.native
  trait ZoomEvent
    extends CustomEvent[js.Any] {
    
    @JSName("detail")
    var detail_ZoomEvent: ZoomEventData = js.native
  }
  
  @js.native
  trait ZoomEventData extends StObject {
    
    var oldRatio: Double = js.native
    
    var originalEvent: WheelEvent | PointerEvent | TouchEvent | MouseEvent = js.native
    
    var ratio: Double = js.native
  }
  object ZoomEventData {
    
    @scala.inline
    def apply(
      oldRatio: Double,
      originalEvent: WheelEvent | PointerEvent | TouchEvent | MouseEvent,
      ratio: Double
    ): ZoomEventData = {
      val __obj = js.Dynamic.literal(oldRatio = oldRatio.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomEventData]
    }
    
    @scala.inline
    implicit class ZoomEventDataMutableBuilder[Self <: ZoomEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOldRatio(value: Double): Self = StObject.set(x, "oldRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEvent(value: WheelEvent | PointerEvent | TouchEvent | MouseEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ZoomedEvent
    extends CustomEvent[js.Any] {
    
    @JSName("detail")
    var detail_ZoomedEvent: ZoomEventData = js.native
  }
}
