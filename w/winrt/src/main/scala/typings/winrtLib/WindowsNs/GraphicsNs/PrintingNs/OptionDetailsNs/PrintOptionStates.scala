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
  
  val constrained: constrained with java.lang.String = js.native
  val enabled: enabled with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionStates with java.lang.String
  ] = js.native
}

