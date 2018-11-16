package typings
package tooltipsterLib.JQueryTooltipsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITooltipsterHelper extends js.Object {
  /** provided on functionBefore and functionAfter callbacks */
  var event: js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | scala.Null] = js.undefined
  /** provided on position callback */
  var geo: js.UndefOr[ITooltipsterGeoHelper] = js.undefined
  /** provided on position callback */
  var mode: js.UndefOr[
    tooltipsterLib.tooltipsterLibStrings.natural | tooltipsterLib.tooltipsterLibStrings.constrained
  ] = js.undefined
  var origin: stdLib.HTMLElement
  /** provided on functionReady and open callbacks */
  var tooltip: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** provided on position callback */
  var tooltipClone: js.UndefOr[stdLib.HTMLElement] = js.undefined
}

