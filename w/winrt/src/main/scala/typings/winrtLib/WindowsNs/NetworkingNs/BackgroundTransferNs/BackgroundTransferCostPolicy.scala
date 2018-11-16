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
  
  val always: always with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val unrestrictedOnly: unrestrictedOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferCostPolicy with java.lang.String
  ] = js.native
}

