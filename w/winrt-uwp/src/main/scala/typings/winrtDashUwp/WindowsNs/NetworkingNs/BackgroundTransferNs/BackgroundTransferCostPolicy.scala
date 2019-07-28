package typings.winrtDashUwp.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 2 */ val always: typings.winrtDashUwp.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferCostPolicy.always with Double = js.native
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferCostPolicy.default with Double = js.native
  /* 1 */ val unrestrictedOnly: typings.winrtDashUwp.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferCostPolicy.unrestrictedOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundTransferCostPolicy with Double] = js.native
}

