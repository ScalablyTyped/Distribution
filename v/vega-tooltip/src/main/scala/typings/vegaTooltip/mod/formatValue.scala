package typings.vegaTooltip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vega-tooltip", "formatValue")
@js.native
object formatValue extends js.Object {
  
  /**
    * Format the value to be shown in the tooltip.
    *
    * @param value The value to show in the tooltip.
    * @param valueToHtml Function to convert a single cell value to an HTML string
    */
  def apply(value: js.Any, valueToHtml: js.Function1[/* value */ js.Any, String], maxDepth: Double): String = js.native
}
