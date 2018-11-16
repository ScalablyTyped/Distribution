package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TetheringCapability extends js.Object

/** Defines values that can be returned after calling getTetheringCapability to indicate the tethering capabilities of a network account. */
@JSGlobal("Windows.Networking.NetworkOperators.TetheringCapability")
@js.native
object TetheringCapability extends js.Object {
  /** Tethering is disabled according to the current group policy. */
  @js.native
  sealed trait disabledByGroupPolicy
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringCapability
  
  /** Tethering not available due to hardware limitations. */
  @js.native
  sealed trait disabledByHardwareLimitation
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringCapability
  
  /** Tethering operations disabled for this account by the network operator. */
  @js.native
  sealed trait disabledByOperator
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringCapability
  
  /** An application required for tethering operations is not available. */
  @js.native
  sealed trait disabledByRequiredAppNotInstalled
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringCapability
  
  /** Tethering is not supported by the current account services. */
  @js.native
  sealed trait disabledBySku
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringCapability
  
  /** Tethering has been disabled by the system because the app lacks the necessary DeviceCapability entry in its manifest. See CreateFromConnectionProfile for more information about manifest requirements. */
  @js.native
  sealed trait disabledBySystemCapability
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringCapability
  
  /** Tethering is disabled for unknown reasons. */
  @js.native
  sealed trait disabledDueToUnknownCause
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringCapability
  
  /** Tethering is enabled. */
  @js.native
  sealed trait enabled
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringCapability
  
  val disabledByGroupPolicy: disabledByGroupPolicy with java.lang.String = js.native
  val disabledByHardwareLimitation: disabledByHardwareLimitation with java.lang.String = js.native
  val disabledByOperator: disabledByOperator with java.lang.String = js.native
  val disabledByRequiredAppNotInstalled: disabledByRequiredAppNotInstalled with java.lang.String = js.native
  val disabledBySku: disabledBySku with java.lang.String = js.native
  val disabledBySystemCapability: disabledBySystemCapability with java.lang.String = js.native
  val disabledDueToUnknownCause: disabledDueToUnknownCause with java.lang.String = js.native
  val enabled: enabled with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringCapability with java.lang.String
  ] = js.native
}

