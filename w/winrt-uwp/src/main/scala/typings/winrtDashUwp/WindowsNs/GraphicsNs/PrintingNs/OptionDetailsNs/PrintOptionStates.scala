package typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

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
  sealed trait constrained extends PrintOptionStates
  
  /** The UI for the print tasks has been enabled. */
  @js.native
  sealed trait enabled extends PrintOptionStates
  
  /** The UI for the print tasks has not been enabled. */
  @js.native
  sealed trait none extends PrintOptionStates
  
  /* 2 */ val constrained: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionStates.constrained with Double = js.native
  /* 1 */ val enabled: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionStates.enabled with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionStates.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintOptionStates with Double] = js.native
}

