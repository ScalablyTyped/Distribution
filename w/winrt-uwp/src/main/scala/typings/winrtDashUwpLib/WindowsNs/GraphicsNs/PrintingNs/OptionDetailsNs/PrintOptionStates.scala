package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintOptionStates extends js.Object

/** Specifies the print task option states. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionStates")
@js.native
object PrintOptionStates extends js.Object {
  /** The UI for the print tasks is visible to the user. */
  @js.native
  sealed trait constrained
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionStates
  
  /** The UI for the print tasks has been enabled. */
  @js.native
  sealed trait enabled
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionStates
  
  /** The UI for the print tasks has not been enabled. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionStates
  
  /* 2 */ val constrained: constrained with scala.Double = js.native
  /* 1 */ val enabled: enabled with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionStates with scala.Double
  ] = js.native
}

