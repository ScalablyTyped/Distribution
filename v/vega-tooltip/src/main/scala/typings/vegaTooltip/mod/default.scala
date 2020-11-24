package typings.vegaTooltip.mod

import typings.vegaTypings.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vega-tooltip", "default")
@js.native
object default extends js.Object {
  
  /**
    * Create a tooltip handler and register it with the provided view.
    *
    * @param view The Vega view.
    * @param opt Tooltip options.
    */
  def apply(view: View): Handler = js.native
  def apply(view: View, opt: Options): Handler = js.native
}
