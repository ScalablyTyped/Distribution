package typings.winrt.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BackgroundTransferCostPolicy extends js.Object
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy")
@js.native
object BackgroundTransferCostPolicy extends js.Object {
  
  @js.native
  sealed trait always extends BackgroundTransferCostPolicy
  
  @js.native
  sealed trait default extends BackgroundTransferCostPolicy
  
  @js.native
  sealed trait unrestrictedOnly extends BackgroundTransferCostPolicy
}
