package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BackgroundTransferCostPolicy extends js.Object
/** Defines values used to specify whether transfers can occur on metered networks. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy")
@js.native
object BackgroundTransferCostPolicy extends js.Object {
  
  /** Always download regardless of network cost. (e.g. even while a user is roaming) */
  @js.native
  sealed trait always extends BackgroundTransferCostPolicy
  
  /** Allow transfers on metered networks. */
  @js.native
  sealed trait default extends BackgroundTransferCostPolicy
  
  /** Do not allow transfers on metered networks. */
  @js.native
  sealed trait unrestrictedOnly extends BackgroundTransferCostPolicy
}
