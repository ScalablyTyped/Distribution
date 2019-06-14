package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintOptionStates extends js.Object

@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionStates")
@js.native
object PrintOptionStates extends js.Object {
  @js.native
  sealed trait constrained
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionStates
  
  @js.native
  sealed trait enabled
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionStates
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionStates
  
  /* 2 */ val constrained: constrained with scala.Double = js.native
  /* 1 */ val enabled: enabled with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionStates with scala.Double
  ] = js.native
}

