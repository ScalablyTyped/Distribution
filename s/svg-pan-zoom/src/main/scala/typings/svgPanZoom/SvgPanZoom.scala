package typings.svgPanZoom

import typings.std.HTMLElement
import typings.std.SVGElement
import typings.std.SVGMatrix
import typings.std.SVGSVGElement
import typings.svgPanZoom.anon.Height
import typings.svgPanZoom.svgPanZoomStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SvgPanZoom {
  
  trait CustomEventHandler extends StObject {
    
    var destroy: js.Function
    
    var haltEventListeners: js.Array[String]
    
    def init(options: CustomEventOptions): Unit
  }
  object CustomEventHandler {
    
    inline def apply(destroy: js.Function, haltEventListeners: js.Array[String], init: CustomEventOptions => Unit): CustomEventHandler = {
      val __obj = js.Dynamic.literal(destroy = destroy.asInstanceOf[js.Any], haltEventListeners = haltEventListeners.asInstanceOf[js.Any], init = js.Any.fromFunction1(init))
      __obj.asInstanceOf[CustomEventHandler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomEventHandler] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: js.Function): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      inline def setHaltEventListeners(value: js.Array[String]): Self = StObject.set(x, "haltEventListeners", value.asInstanceOf[js.Any])
      
      inline def setHaltEventListenersVarargs(value: String*): Self = StObject.set(x, "haltEventListeners", js.Array(value*))
      
      inline def setInit(value: CustomEventOptions => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    }
  }
  
  trait CustomEventOptions extends StObject {
    
    /**
      * Creates a new SvgPanZoom instance with given element selector.
      *
      * @param  {string|HTMLElement|SVGElement} svg selector of the tag on which it is to be applied.
      * @param  {Object} options        provides customization options at the initialization of the object.
      * @return {Instance}              Current instance
      */
    def instance(svg: String): Instance
    def instance(svg: String, options: Options): Instance
    def instance(svg: HTMLElement): Instance
    def instance(svg: HTMLElement, options: Options): Instance
    def instance(svg: SVGElement): Instance
    def instance(svg: SVGElement, options: Options): Instance
    @JSName("instance")
    var instance_Original: Instance
    
    var svgElement: SVGSVGElement
  }
  object CustomEventOptions {
    
    inline def apply(instance: Instance, svgElement: SVGSVGElement): CustomEventOptions = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], svgElement = svgElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomEventOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomEventOptions] (val x: Self) extends AnyVal {
      
      inline def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setSvgElement(value: SVGSVGElement): Self = StObject.set(x, "svgElement", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instance extends StObject {
    
    /**
      * Creates a new SvgPanZoom instance with given element selector.
      *
      * @param  {string|HTMLElement|SVGElement} svg selector of the tag on which it is to be applied.
      * @param  {Object} options        provides customization options at the initialization of the object.
      * @return {Instance}              Current instance
      */
    def apply(svg: String): Instance = js.native
    def apply(svg: String, options: Options): Instance = js.native
    def apply(svg: HTMLElement): Instance = js.native
    def apply(svg: HTMLElement, options: Options): Instance = js.native
    def apply(svg: SVGElement): Instance = js.native
    def apply(svg: SVGElement, options: Options): Instance = js.native
    
    /**
      * Adjust viewport pan (only) so it will be centered in SVG
      * Does not zoom/fit image
      *
      * @return {Instance}    Current instance
      */
    def center(): Instance = js.native
    
    /**
      * Adjust viewport size (only) so it will contain in SVG
      * Does not center image
      *
      * @return {Instance}    Current instance
      */
    def contain(): Instance = js.native
    
    def destroy(): Unit = js.native
    
    def disableControlIcons(): Instance = js.native
    
    def disableDblClickZoom(): Instance = js.native
    
    def disableMouseWheelZoom(): Instance = js.native
    
    /**
      * Disables panning on svg element
      * @return {Instance} Current instance
      */
    def disablePan(): Instance = js.native
    
    def disableZoom(): Instance = js.native
    
    def enableControlIcons(): Instance = js.native
    
    def enableDblClickZoom(): Instance = js.native
    
    def enableMouseWheelZoom(): Instance = js.native
    
    /**
      * Enables Panning on svg element
      * @return {Instance} Current instance
      */
    def enablePan(): Instance = js.native
    
    def enableZoom(): Instance = js.native
    
    /**
      * Adjust viewport size (only) so it will fit in SVG
      * Does not center image
      *
      * @return {Instance}    Current instance
      */
    def fit(): Instance = js.native
    
    /**
      * Get pan vector
      *
      * @return {Object} {x: 0, y: 0}
      * @return {Instance}    Current instance
      */
    def getPan(): Point = js.native
    
    /**
      * Get all calculate svg dimensions
      *
      * @return {Object} {width: 0, height: 0, realZoom: 0, viewBox: { width: 0, height: 0 }}
      */
    def getSizes(): Sizes = js.native
    
    /**
      * Get zoom scale/level
      *
      * @return {float} zoom scale
      */
    def getZoom(): Double = js.native
    
    def isControlIconsEnabled(): Boolean = js.native
    
    def isDblClickZoomEnabled(): Boolean = js.native
    
    def isMouseWheelZoomEnabled(): Boolean = js.native
    
    /**
      * Checks if Panning is enabled or not
      * @return {Boolean} true or false based on panning settings
      */
    def isPanEnabled(): Boolean = js.native
    
    def isZoomEnabled(): Boolean = js.native
    
    /**
      * Pan to a rendered position
      *
      * @param  {Object} point {x: 0, y: 0}
      * @return {Instance}    Current instance
      */
    def pan(point: Point): Instance = js.native
    
    /**
      * Relatively pan the graph by a specified rendered position vector
      *
      * @param  {Object} point {x: 0, y: 0}
      * @return {Instance}    Current instance
      */
    def panBy(point: Point): Instance = js.native
    
    def reset(): Instance = js.native
    
    def resetPan(): Instance = js.native
    
    def resetZoom(): Instance = js.native
    
    /**
      * Recalculates cached svg dimensions and controls position
      *
      * @return {Instance}    Current instance
      */
    def resize(): Instance = js.native
    
    def setBeforePan(fn: js.Function2[/* oldPoint */ Point, /* newPoint */ Point, Unit | Boolean | PointModifier]): Instance = js.native
    
    def setBeforeZoom(fn: js.Function2[/* oldScale */ Double, /* newScale */ Double, Unit | Boolean]): Instance = js.native
    
    def setMaxZoom(zoom: Double): Instance = js.native
    
    def setMinZoom(zoom: Double): Instance = js.native
    
    def setOnPan(fn: js.Function1[/* point */ Point, Unit]): Instance = js.native
    
    def setOnUpdatedCTM(fn: js.Function1[/* newCTM */ SVGMatrix, Unit]): Instance = js.native
    
    def setOnZoom(fn: js.Function1[/* scale */ Double, Unit]): Instance = js.native
    
    def setZoomScaleSensitivity(scale: Double): Instance = js.native
    
    /**
      * Update content cached BorderBox
      * Use when viewport contents change
      *
      * @return {Instance}    Current instance
      */
    def updateBBox(): Instance = js.native
    
    def zoom(scale: Double): Unit = js.native
    
    def zoomAtPoint(scale: Double, point: Point): Instance = js.native
    
    def zoomAtPointBy(scale: Double, point: Point): Instance = js.native
    
    def zoomBy(scale: Double): Instance = js.native
    
    def zoomIn(): Instance = js.native
    
    def zoomOut(): Instance = js.native
  }
  
  trait Options extends StObject {
    
    var beforePan: js.UndefOr[
        js.Function2[/* oldPan */ Point, /* newPan */ Point, Unit | Boolean | PointModifier]
      ] = js.undefined
    
    // (default 'auto')
    var beforeZoom: js.UndefOr[js.Function2[/* oldScale */ Double, /* newScale */ Double, Unit | Boolean]] = js.undefined
    
    // (default true)
    var center: js.UndefOr[Boolean] = js.undefined
    
    // enable or disable viewport fit in SVG (default true)
    var contain: js.UndefOr[Boolean] = js.undefined
    
    /**
      * insert icons to give user an option in addition to mouse events to control pan/zoom (default disabled)
      * @type {boolean}
      */
    var controlIconsEnabled: js.UndefOr[Boolean] = js.undefined
    
    var customEventsHandler: js.UndefOr[CustomEventHandler] = js.undefined
    
    /**
      * enable or disable zooming by double clicking (default enabled)
      * @type {boolean}
      */
    var dblClickZoomEnabled: js.UndefOr[Boolean] = js.undefined
    
    // (default null)
    var eventsListenerElement: js.UndefOr[SVGElement] = js.undefined
    
    // Maximum Zoom level  (Default 10)
    var fit: js.UndefOr[Boolean] = js.undefined
    
    // Minimum Zoom level (Default 0.5)
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    // Zoom sensitivity (Default 0.2)
    var minZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * enable or disable zooming by scrolling (default enabled)
      * @type {boolean}
      */
    var mouseWheelZoomEnabled: js.UndefOr[Boolean] = js.undefined
    
    var onPan: js.UndefOr[js.Function1[/* newPan */ Point, Unit]] = js.undefined
    
    var onUpdatedCTM: js.UndefOr[js.Function1[/* newCTM */ SVGMatrix, Unit]] = js.undefined
    
    var onZoom: js.UndefOr[js.Function1[/* newScale */ Double, Unit]] = js.undefined
    
    /**
      * enable or disable panning (default enabled)
      * @type {boolean}
      */
    var panEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * prevent mouse events to bubble up (default enabled)
      * @type {boolean}
      */
    var preventMouseEventsDefault: js.UndefOr[Boolean] = js.undefined
    
    // enable or disable viewport centering in SVG (default true)
    var refreshRate: js.UndefOr[Double | auto] = js.undefined
    
    /**
      * can be querySelector string or SVGElement (default enabled)
      * @type {string|HTMLElement|SVGElement}
      */
    var viewportSelector: js.UndefOr[String | HTMLElement | SVGElement] = js.undefined
    
    /**
      * enable or disable zooming (default enabled)
      * @type {boolean}
      */
    var zoomEnabled: js.UndefOr[Boolean] = js.undefined
    
    var zoomScaleSensitivity: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBeforePan(value: (/* oldPan */ Point, /* newPan */ Point) => Unit | Boolean | PointModifier): Self = StObject.set(x, "beforePan", js.Any.fromFunction2(value))
      
      inline def setBeforePanUndefined: Self = StObject.set(x, "beforePan", js.undefined)
      
      inline def setBeforeZoom(value: (/* oldScale */ Double, /* newScale */ Double) => Unit | Boolean): Self = StObject.set(x, "beforeZoom", js.Any.fromFunction2(value))
      
      inline def setBeforeZoomUndefined: Self = StObject.set(x, "beforeZoom", js.undefined)
      
      inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setContain(value: Boolean): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
      
      inline def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
      
      inline def setControlIconsEnabled(value: Boolean): Self = StObject.set(x, "controlIconsEnabled", value.asInstanceOf[js.Any])
      
      inline def setControlIconsEnabledUndefined: Self = StObject.set(x, "controlIconsEnabled", js.undefined)
      
      inline def setCustomEventsHandler(value: CustomEventHandler): Self = StObject.set(x, "customEventsHandler", value.asInstanceOf[js.Any])
      
      inline def setCustomEventsHandlerUndefined: Self = StObject.set(x, "customEventsHandler", js.undefined)
      
      inline def setDblClickZoomEnabled(value: Boolean): Self = StObject.set(x, "dblClickZoomEnabled", value.asInstanceOf[js.Any])
      
      inline def setDblClickZoomEnabledUndefined: Self = StObject.set(x, "dblClickZoomEnabled", js.undefined)
      
      inline def setEventsListenerElement(value: SVGElement): Self = StObject.set(x, "eventsListenerElement", value.asInstanceOf[js.Any])
      
      inline def setEventsListenerElementUndefined: Self = StObject.set(x, "eventsListenerElement", js.undefined)
      
      inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setMouseWheelZoomEnabled(value: Boolean): Self = StObject.set(x, "mouseWheelZoomEnabled", value.asInstanceOf[js.Any])
      
      inline def setMouseWheelZoomEnabledUndefined: Self = StObject.set(x, "mouseWheelZoomEnabled", js.undefined)
      
      inline def setOnPan(value: /* newPan */ Point => Unit): Self = StObject.set(x, "onPan", js.Any.fromFunction1(value))
      
      inline def setOnPanUndefined: Self = StObject.set(x, "onPan", js.undefined)
      
      inline def setOnUpdatedCTM(value: /* newCTM */ SVGMatrix => Unit): Self = StObject.set(x, "onUpdatedCTM", js.Any.fromFunction1(value))
      
      inline def setOnUpdatedCTMUndefined: Self = StObject.set(x, "onUpdatedCTM", js.undefined)
      
      inline def setOnZoom(value: /* newScale */ Double => Unit): Self = StObject.set(x, "onZoom", js.Any.fromFunction1(value))
      
      inline def setOnZoomUndefined: Self = StObject.set(x, "onZoom", js.undefined)
      
      inline def setPanEnabled(value: Boolean): Self = StObject.set(x, "panEnabled", value.asInstanceOf[js.Any])
      
      inline def setPanEnabledUndefined: Self = StObject.set(x, "panEnabled", js.undefined)
      
      inline def setPreventMouseEventsDefault(value: Boolean): Self = StObject.set(x, "preventMouseEventsDefault", value.asInstanceOf[js.Any])
      
      inline def setPreventMouseEventsDefaultUndefined: Self = StObject.set(x, "preventMouseEventsDefault", js.undefined)
      
      inline def setRefreshRate(value: Double | auto): Self = StObject.set(x, "refreshRate", value.asInstanceOf[js.Any])
      
      inline def setRefreshRateUndefined: Self = StObject.set(x, "refreshRate", js.undefined)
      
      inline def setViewportSelector(value: String | HTMLElement | SVGElement): Self = StObject.set(x, "viewportSelector", value.asInstanceOf[js.Any])
      
      inline def setViewportSelectorUndefined: Self = StObject.set(x, "viewportSelector", js.undefined)
      
      inline def setZoomEnabled(value: Boolean): Self = StObject.set(x, "zoomEnabled", value.asInstanceOf[js.Any])
      
      inline def setZoomEnabledUndefined: Self = StObject.set(x, "zoomEnabled", js.undefined)
      
      inline def setZoomScaleSensitivity(value: Double): Self = StObject.set(x, "zoomScaleSensitivity", value.asInstanceOf[js.Any])
      
      inline def setZoomScaleSensitivityUndefined: Self = StObject.set(x, "zoomScaleSensitivity", js.undefined)
    }
  }
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait PointModifier extends StObject {
    
    var x: Double | Boolean
    
    var y: Double | Boolean
  }
  object PointModifier {
    
    inline def apply(x: Double | Boolean, y: Double | Boolean): PointModifier = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointModifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointModifier] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double | Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double | Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sizes extends StObject {
    
    var height: Double
    
    var realZoom: Double
    
    var viewBox: Height
    
    var width: Double
  }
  object Sizes {
    
    inline def apply(height: Double, realZoom: Double, viewBox: Height, width: Double): Sizes = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], realZoom = realZoom.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sizes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sizes] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setRealZoom(value: Double): Self = StObject.set(x, "realZoom", value.asInstanceOf[js.Any])
      
      inline def setViewBox(value: Height): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
