package typings.winrt.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintOptionStates extends js.Object

@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionStates")
@js.native
object PrintOptionStates extends js.Object {
  @js.native
  sealed trait constrained extends PrintOptionStates
  
  @js.native
  sealed trait enabled extends PrintOptionStates
  
  @js.native
  sealed trait none extends PrintOptionStates
  
  /* 2 */ val constrained: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.constrained with Double = js.native
  /* 1 */ val enabled: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.enabled with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintOptionStates with Double] = js.native
}

