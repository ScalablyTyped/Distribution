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

