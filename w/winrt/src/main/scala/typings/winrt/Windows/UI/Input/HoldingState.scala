package typings.winrt.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HoldingState extends js.Object
@JSGlobal("Windows.UI.Input.HoldingState")
@js.native
object HoldingState extends js.Object {
  
  @js.native
  sealed trait canceled extends HoldingState
  
  @js.native
  sealed trait completed extends HoldingState
  
  @js.native
  sealed trait started extends HoldingState
}
