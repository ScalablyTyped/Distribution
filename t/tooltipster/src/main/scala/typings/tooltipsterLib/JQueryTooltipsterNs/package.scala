package typings
package tooltipsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQueryTooltipsterNs {
  type TooltipEventName = tooltipsterLib.tooltipsterLibStrings.init | tooltipsterLib.tooltipsterLibStrings.before | tooltipsterLib.tooltipsterLibStrings.ready | tooltipsterLib.tooltipsterLibStrings.after | tooltipsterLib.tooltipsterLibStrings.format | tooltipsterLib.tooltipsterLibStrings.position | tooltipsterLib.tooltipsterLibStrings.close | tooltipsterLib.tooltipsterLibStrings.closing | tooltipsterLib.tooltipsterLibStrings.created | tooltipsterLib.tooltipsterLibStrings.destroy | tooltipsterLib.tooltipsterLibStrings.destroyed | tooltipsterLib.tooltipsterLibStrings.dismissable | tooltipsterLib.tooltipsterLibStrings.geometry | tooltipsterLib.tooltipsterLibStrings.positionTest | tooltipsterLib.tooltipsterLibStrings.positionTested | tooltipsterLib.tooltipsterLibStrings.reposition | tooltipsterLib.tooltipsterLibStrings.repositioned | tooltipsterLib.tooltipsterLibStrings.scroll | tooltipsterLib.tooltipsterLibStrings.start | tooltipsterLib.tooltipsterLibStrings.startcancel | tooltipsterLib.tooltipsterLibStrings.startend | tooltipsterLib.tooltipsterLibStrings.state | tooltipsterLib.tooltipsterLibStrings.updated
  type TooltipPositioningSide = tooltipsterLib.tooltipsterLibStrings.top | tooltipsterLib.tooltipsterLibStrings.bottom | tooltipsterLib.tooltipsterLibStrings.left | tooltipsterLib.tooltipsterLibStrings.right
  type TooltipsterStandardCallbackFunction = js.Function2[/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper, scala.Unit]
}
