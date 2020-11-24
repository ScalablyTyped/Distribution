package typings.viewerjs.Viewer

import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackdrop(value: Boolean | String): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdrop: Self = this.set("backdrop", js.undefined)
    
    @scala.inline
    def setButton(value: Boolean): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContainer(value: String | HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setFilter(value: js.Function): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    
    @scala.inline
    def setHidden(value: /* event */ CustomEvent[_] => Unit): Self = this.set("hidden", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHide(value: /* event */ CustomEvent[_] => Unit): Self = this.set("hide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setInheritedAttributesVarargs(value: String*): Self = this.set("inheritedAttributes", js.Array(value :_*))
    
    @scala.inline
    def setInheritedAttributes(value: js.Array[String]): Self = this.set("inheritedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInheritedAttributes: Self = this.set("inheritedAttributes", js.undefined)
    
    @scala.inline
    def setInitialViewIndex(value: Double): Self = this.set("initialViewIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialViewIndex: Self = this.set("initialViewIndex", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setMaxZoomRatio(value: Double): Self = this.set("maxZoomRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoomRatio: Self = this.set("maxZoomRatio", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setMinZoomRatio(value: Double): Self = this.set("minZoomRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoomRatio: Self = this.set("minZoomRatio", js.undefined)
    
    @scala.inline
    def setMovable(value: Boolean): Self = this.set("movable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovable: Self = this.set("movable", js.undefined)
    
    @scala.inline
    def setNavbar(value: Boolean | Visibility): Self = this.set("navbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavbar: Self = this.set("navbar", js.undefined)
    
    @scala.inline
    def setPlay(value: /* event */ CustomEvent[_] => Unit): Self = this.set("play", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
    
    @scala.inline
    def setReady(value: /* event */ CustomEvent[_] => Unit): Self = this.set("ready", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    
    @scala.inline
    def setRotatable(value: Boolean): Self = this.set("rotatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotatable: Self = this.set("rotatable", js.undefined)
    
    @scala.inline
    def setScalable(value: Boolean): Self = this.set("scalable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalable: Self = this.set("scalable", js.undefined)
    
    @scala.inline
    def setShow(value: /* event */ CustomEvent[_] => Unit): Self = this.set("show", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setShown(value: /* event */ CustomEvent[_] => Unit): Self = this.set("shown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShown: Self = this.set("shown", js.undefined)
    
    @scala.inline
    def setSlideOnTouch(value: Boolean): Self = this.set("slideOnTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideOnTouch: Self = this.set("slideOnTouch", js.undefined)
    
    @scala.inline
    def setStop(value: /* event */ CustomEvent[_] => Unit): Self = this.set("stop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    
    @scala.inline
    def setTitle(value: Boolean | Visibility | js.Function | (js.Tuple2[Visibility, js.Function])): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setToggleOnDblclick(value: Boolean): Self = this.set("toggleOnDblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleOnDblclick: Self = this.set("toggleOnDblclick", js.undefined)
    
    @scala.inline
    def setToolbar(value: Boolean | Visibility | ToolbarOptions): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setTooltip(value: Boolean): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTransition(value: Boolean): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setUrl(value: String | js.Function): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setView(value: /* event */ CustomEvent[_] => Unit): Self = this.set("view", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setViewed(value: /* event */ CustomEvent[_] => Unit): Self = this.set("viewed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteViewed: Self = this.set("viewed", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
    
    @scala.inline
    def setZIndexInline(value: Double): Self = this.set("zIndexInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndexInline: Self = this.set("zIndexInline", js.undefined)
    
    @scala.inline
    def setZoom(value: /* event */ ZoomEvent => Unit): Self = this.set("zoom", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    
    @scala.inline
    def setZoomOnTouch(value: Boolean): Self = this.set("zoomOnTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomOnTouch: Self = this.set("zoomOnTouch", js.undefined)
    
    @scala.inline
    def setZoomOnWheel(value: Boolean): Self = this.set("zoomOnWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomOnWheel: Self = this.set("zoomOnWheel", js.undefined)
    
    @scala.inline
    def setZoomRatio(value: Double): Self = this.set("zoomRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomRatio: Self = this.set("zoomRatio", js.undefined)
    
    @scala.inline
    def setZoomable(value: Boolean): Self = this.set("zoomable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomable: Self = this.set("zoomable", js.undefined)
    
    @scala.inline
    def setZoomed(value: /* event */ ZoomedEvent => Unit): Self = this.set("zoomed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteZoomed: Self = this.set("zoomed", js.undefined)
  }
}
