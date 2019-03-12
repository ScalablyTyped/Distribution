package typings
package svgDashPanDashZoomLib.SvgPanZoomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var beforePan: js.UndefOr[
    js.Function2[/* oldPan */ Point, /* newPan */ Point, scala.Unit | scala.Boolean | PointModifier]
  ] = js.undefined
   // (default 'auto')
  var beforeZoom: js.UndefOr[
    js.Function2[/* oldScale */ scala.Double, /* newScale */ scala.Double, scala.Unit | scala.Boolean]
  ] = js.undefined
   // (default true)
  var center: js.UndefOr[scala.Boolean] = js.undefined
   // enable or disable viewport fit in SVG (default true)
  var contain: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * insert icons to give user an option in addition to mouse events to control pan/zoom (default disabled)
    * @type {boolean}
    */
  var controlIconsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var customEventsHandler: js.UndefOr[CustomEventHandler] = js.undefined
  /**
    * enable or disable zooming by double clicking (default enabled)
    * @type {boolean}
    */
  var dblClickZoomEnabled: js.UndefOr[scala.Boolean] = js.undefined
   // (default null)
  var eventsListenerElement: js.UndefOr[stdLib.SVGElement] = js.undefined
   // Maximum Zoom level  (Default 10)
  var fit: js.UndefOr[scala.Boolean] = js.undefined
   // Minimum Zoom level (Default 0.5)
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
   // Zoom sensitivity (Default 0.2)
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  /**
    * enable or disable zooming by scrolling (default enabled)
    * @type {boolean}
    */
  var mouseWheelZoomEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var onPan: js.UndefOr[js.Function1[/* newPan */ Point, scala.Unit]] = js.undefined
  var onUpdatedCTM: js.UndefOr[js.Function1[/* newCTM */ stdLib.SVGMatrix, scala.Unit]] = js.undefined
  var onZoom: js.UndefOr[js.Function1[/* newScale */ scala.Double, scala.Unit]] = js.undefined
  /**
    * enable or disable panning (default enabled)
    * @type {boolean}
    */
  var panEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * prevent mouse events to bubble up (default enabled)
    * @type {boolean}
    */
  var preventMouseEventsDefault: js.UndefOr[scala.Boolean] = js.undefined
   // enable or disable viewport centering in SVG (default true)
  var refreshRate: js.UndefOr[scala.Double | svgDashPanDashZoomLib.svgDashPanDashZoomLibStrings.auto] = js.undefined
  /**
    * can be querySelector string or SVGElement (default enabled)
    * @type {string|HTMLElement|SVGElement}
    */
  var viewportSelector: js.UndefOr[java.lang.String | stdLib.HTMLElement | stdLib.SVGElement] = js.undefined
  /**
    * enable or disable zooming (default enabled)
    * @type {boolean}
    */
  var zoomEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var zoomScaleSensitivity: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    beforePan: (/* oldPan */ Point, /* newPan */ Point) => scala.Unit | scala.Boolean | PointModifier = null,
    beforeZoom: (/* oldScale */ scala.Double, /* newScale */ scala.Double) => scala.Unit | scala.Boolean = null,
    center: js.UndefOr[scala.Boolean] = js.undefined,
    contain: js.UndefOr[scala.Boolean] = js.undefined,
    controlIconsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    customEventsHandler: CustomEventHandler = null,
    dblClickZoomEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    eventsListenerElement: stdLib.SVGElement = null,
    fit: js.UndefOr[scala.Boolean] = js.undefined,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    mouseWheelZoomEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    onPan: /* newPan */ Point => scala.Unit = null,
    onUpdatedCTM: /* newCTM */ stdLib.SVGMatrix => scala.Unit = null,
    onZoom: /* newScale */ scala.Double => scala.Unit = null,
    panEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    preventMouseEventsDefault: js.UndefOr[scala.Boolean] = js.undefined,
    refreshRate: scala.Double | svgDashPanDashZoomLib.svgDashPanDashZoomLibStrings.auto = null,
    viewportSelector: java.lang.String | stdLib.HTMLElement | stdLib.SVGElement = null,
    zoomEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    zoomScaleSensitivity: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (beforePan != null) __obj.updateDynamic("beforePan")(js.Any.fromFunction2(beforePan))
    if (beforeZoom != null) __obj.updateDynamic("beforeZoom")(js.Any.fromFunction2(beforeZoom))
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (!js.isUndefined(contain)) __obj.updateDynamic("contain")(contain)
    if (!js.isUndefined(controlIconsEnabled)) __obj.updateDynamic("controlIconsEnabled")(controlIconsEnabled)
    if (customEventsHandler != null) __obj.updateDynamic("customEventsHandler")(customEventsHandler)
    if (!js.isUndefined(dblClickZoomEnabled)) __obj.updateDynamic("dblClickZoomEnabled")(dblClickZoomEnabled)
    if (eventsListenerElement != null) __obj.updateDynamic("eventsListenerElement")(eventsListenerElement)
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseWheelZoomEnabled)) __obj.updateDynamic("mouseWheelZoomEnabled")(mouseWheelZoomEnabled)
    if (onPan != null) __obj.updateDynamic("onPan")(js.Any.fromFunction1(onPan))
    if (onUpdatedCTM != null) __obj.updateDynamic("onUpdatedCTM")(js.Any.fromFunction1(onUpdatedCTM))
    if (onZoom != null) __obj.updateDynamic("onZoom")(js.Any.fromFunction1(onZoom))
    if (!js.isUndefined(panEnabled)) __obj.updateDynamic("panEnabled")(panEnabled)
    if (!js.isUndefined(preventMouseEventsDefault)) __obj.updateDynamic("preventMouseEventsDefault")(preventMouseEventsDefault)
    if (refreshRate != null) __obj.updateDynamic("refreshRate")(refreshRate.asInstanceOf[js.Any])
    if (viewportSelector != null) __obj.updateDynamic("viewportSelector")(viewportSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomEnabled)) __obj.updateDynamic("zoomEnabled")(zoomEnabled)
    if (zoomScaleSensitivity != null) __obj.updateDynamic("zoomScaleSensitivity")(zoomScaleSensitivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

