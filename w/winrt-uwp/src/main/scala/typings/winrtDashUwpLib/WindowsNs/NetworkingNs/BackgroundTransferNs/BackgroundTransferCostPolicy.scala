package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs

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
  sealed trait always
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferCostPolicy
  
  /** Allow transfers on metered networks. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferCostPolicy
  
  /** Do not allow transfers on metered networks. */
  @js.native
  sealed trait unrestrictedOnly
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferCostPolicy
  
  val always: always with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val unrestrictedOnly: unrestrictedOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferCostPolicy with java.lang.String
  ] = js.native
}

