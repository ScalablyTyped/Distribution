package typings.winrt.Windows.Graphics.Printing.OptionDetails

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.constrained
import typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.enabled
import typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.none
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintOptionStates with Double] = js.native
  /* 2 */ @js.native
  object constrained extends TopLevel[constrained with Double]
  
  /* 1 */ @js.native
  object enabled extends TopLevel[enabled with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

