package typings.winrt.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
