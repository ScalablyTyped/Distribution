package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundTransferCostPolicy extends js.Object

@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy")
@js.native
object BackgroundTransferCostPolicy extends js.Object {
  @js.native
  sealed trait always
    extends winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferCostPolicy
  
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferCostPolicy
  
  @js.native
  sealed trait unrestrictedOnly
    extends winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferCostPolicy
  
  /* 2 */ val always: always with scala.Double = js.native
  /* 0 */ val default: default with scala.Double = js.native
  /* 1 */ val unrestrictedOnly: unrestrictedOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferCostPolicy with scala.Double
  ] = js.native
}

