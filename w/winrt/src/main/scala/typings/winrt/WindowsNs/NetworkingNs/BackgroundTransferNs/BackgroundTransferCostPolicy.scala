package typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 2 */ val always: typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferCostPolicy.always with Double = js.native
  /* 0 */ val default: typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferCostPolicy.default with Double = js.native
  /* 1 */ val unrestrictedOnly: typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferCostPolicy.unrestrictedOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundTransferCostPolicy with Double] = js.native
}

