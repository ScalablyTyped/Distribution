package typings.svgPanZoom.SvgPanZoom

import typings.std.HTMLElement
import typings.std.SVGElement
import typings.std.SVGMatrix
import typings.svgPanZoom.svgPanZoomStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var beforePan: js.UndefOr[
    js.Function2[/* oldPan */ Point, /* newPan */ Point, Unit | Boolean | PointModifier]
  ] = js.native
  
   // (default 'auto')
  var beforeZoom: js.UndefOr[js.Function2[/* oldScale */ Double, /* newScale */ Double, Unit | Boolean]] = js.native
  
   // (default true)
  var center: js.UndefOr[Boolean] = js.native
  
   // enable or disable viewport fit in SVG (default true)
  var contain: js.UndefOr[Boolean] = js.native
  
  /**
    * insert icons to give user an option in addition to mouse events to control pan/zoom (default disabled)
    * @type {boolean}
    */
  var controlIconsEnabled: js.UndefOr[Boolean] = js.native
  
  var customEventsHandler: js.UndefOr[CustomEventHandler] = js.native
  
  /**
    * enable or disable zooming by double clicking (default enabled)
    * @type {boolean}
    */
  var dblClickZoomEnabled: js.UndefOr[Boolean] = js.native
  
   // (default null)
  var eventsListenerElement: js.UndefOr[SVGElement] = js.native
  
   // Maximum Zoom level  (Default 10)
  var fit: js.UndefOr[Boolean] = js.native
  
   // Minimum Zoom level (Default 0.5)
  var maxZoom: js.UndefOr[Double] = js.native
  
   // Zoom sensitivity (Default 0.2)
  var minZoom: js.UndefOr[Double] = js.native
  
  /**
    * enable or disable zooming by scrolling (default enabled)
    * @type {boolean}
    */
  var mouseWheelZoomEnabled: js.UndefOr[Boolean] = js.native
  
  var onPan: js.UndefOr[js.Function1[/* newPan */ Point, Unit]] = js.native
  
  var onUpdatedCTM: js.UndefOr[js.Function1[/* newCTM */ SVGMatrix, Unit]] = js.native
  
  var onZoom: js.UndefOr[js.Function1[/* newScale */ Double, Unit]] = js.native
  
  /**
    * enable or disable panning (default enabled)
    * @type {boolean}
    */
  var panEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * prevent mouse events to bubble up (default enabled)
    * @type {boolean}
    */
  var preventMouseEventsDefault: js.UndefOr[Boolean] = js.native
  
   // enable or disable viewport centering in SVG (default true)
  var refreshRate: js.UndefOr[Double | auto] = js.native
  
  /**
    * can be querySelector string or SVGElement (default enabled)
    * @type {string|HTMLElement|SVGElement}
    */
  var viewportSelector: js.UndefOr[String | HTMLElement | SVGElement] = js.native
  
  /**
    * enable or disable zooming (default enabled)
    * @type {boolean}
    */
  var zoomEnabled: js.UndefOr[Boolean] = js.native
  
  var zoomScaleSensitivity: js.UndefOr[Double] = js.native
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
    def setBeforePan(value: (/* oldPan */ Point, /* newPan */ Point) => Unit | Boolean | PointModifier): Self = this.set("beforePan", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforePan: Self = this.set("beforePan", js.undefined)
    
    @scala.inline
    def setBeforeZoom(value: (/* oldScale */ Double, /* newScale */ Double) => Unit | Boolean): Self = this.set("beforeZoom", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeZoom: Self = this.set("beforeZoom", js.undefined)
    
    @scala.inline
    def setCenter(value: Boolean): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setContain(value: Boolean): Self = this.set("contain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContain: Self = this.set("contain", js.undefined)
    
    @scala.inline
    def setControlIconsEnabled(value: Boolean): Self = this.set("controlIconsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlIconsEnabled: Self = this.set("controlIconsEnabled", js.undefined)
    
    @scala.inline
    def setCustomEventsHandler(value: CustomEventHandler): Self = this.set("customEventsHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomEventsHandler: Self = this.set("customEventsHandler", js.undefined)
    
    @scala.inline
    def setDblClickZoomEnabled(value: Boolean): Self = this.set("dblClickZoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDblClickZoomEnabled: Self = this.set("dblClickZoomEnabled", js.undefined)
    
    @scala.inline
    def setEventsListenerElement(value: SVGElement): Self = this.set("eventsListenerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventsListenerElement: Self = this.set("eventsListenerElement", js.undefined)
    
    @scala.inline
    def setFit(value: Boolean): Self = this.set("fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    
    @scala.inline
    def setMouseWheelZoomEnabled(value: Boolean): Self = this.set("mouseWheelZoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseWheelZoomEnabled: Self = this.set("mouseWheelZoomEnabled", js.undefined)
    
    @scala.inline
    def setOnPan(value: /* newPan */ Point => Unit): Self = this.set("onPan", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPan: Self = this.set("onPan", js.undefined)
    
    @scala.inline
    def setOnUpdatedCTM(value: /* newCTM */ SVGMatrix => Unit): Self = this.set("onUpdatedCTM", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUpdatedCTM: Self = this.set("onUpdatedCTM", js.undefined)
    
    @scala.inline
    def setOnZoom(value: /* newScale */ Double => Unit): Self = this.set("onZoom", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnZoom: Self = this.set("onZoom", js.undefined)
    
    @scala.inline
    def setPanEnabled(value: Boolean): Self = this.set("panEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanEnabled: Self = this.set("panEnabled", js.undefined)
    
    @scala.inline
    def setPreventMouseEventsDefault(value: Boolean): Self = this.set("preventMouseEventsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventMouseEventsDefault: Self = this.set("preventMouseEventsDefault", js.undefined)
    
    @scala.inline
    def setRefreshRate(value: Double | auto): Self = this.set("refreshRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshRate: Self = this.set("refreshRate", js.undefined)
    
    @scala.inline
    def setViewportSelector(value: String | HTMLElement | SVGElement): Self = this.set("viewportSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewportSelector: Self = this.set("viewportSelector", js.undefined)
    
    @scala.inline
    def setZoomEnabled(value: Boolean): Self = this.set("zoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomEnabled: Self = this.set("zoomEnabled", js.undefined)
    
    @scala.inline
    def setZoomScaleSensitivity(value: Double): Self = this.set("zoomScaleSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomScaleSensitivity: Self = this.set("zoomScaleSensitivity", js.undefined)
  }
}
