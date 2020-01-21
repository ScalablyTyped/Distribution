package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintOptionStates with Double] = js.native
  /* 2 */ @js.native
  object constrained extends TopLevel[constrained with Double]
  
  /* 1 */ @js.native
  object enabled extends TopLevel[enabled with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

