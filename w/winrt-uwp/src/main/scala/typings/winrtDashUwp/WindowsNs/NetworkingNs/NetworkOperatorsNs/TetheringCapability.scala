package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

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
  sealed trait disabledByGroupPolicy extends TetheringCapability
  
  /** Tethering not available due to hardware limitations. */
  @js.native
  sealed trait disabledByHardwareLimitation extends TetheringCapability
  
  /** Tethering operations disabled for this account by the network operator. */
  @js.native
  sealed trait disabledByOperator extends TetheringCapability
  
  /** An application required for tethering operations is not available. */
  @js.native
  sealed trait disabledByRequiredAppNotInstalled extends TetheringCapability
  
  /** Tethering is not supported by the current account services. */
  @js.native
  sealed trait disabledBySku extends TetheringCapability
  
  /** Tethering has been disabled by the system because the app lacks the necessary DeviceCapability entry in its manifest. See CreateFromConnectionProfile for more information about manifest requirements. */
  @js.native
  sealed trait disabledBySystemCapability extends TetheringCapability
  
  /** Tethering is disabled for unknown reasons. */
  @js.native
  sealed trait disabledDueToUnknownCause extends TetheringCapability
  
  /** Tethering is enabled. */
  @js.native
  sealed trait enabled extends TetheringCapability
  
  /* 1 */ val disabledByGroupPolicy: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringCapability.disabledByGroupPolicy with Double = js.native
  /* 2 */ val disabledByHardwareLimitation: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringCapability.disabledByHardwareLimitation with Double = js.native
  /* 3 */ val disabledByOperator: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringCapability.disabledByOperator with Double = js.native
  /* 5 */ val disabledByRequiredAppNotInstalled: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringCapability.disabledByRequiredAppNotInstalled with Double = js.native
  /* 4 */ val disabledBySku: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringCapability.disabledBySku with Double = js.native
  /* 7 */ val disabledBySystemCapability: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringCapability.disabledBySystemCapability with Double = js.native
  /* 6 */ val disabledDueToUnknownCause: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringCapability.disabledDueToUnknownCause with Double = js.native
  /* 0 */ val enabled: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringCapability.enabled with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TetheringCapability with Double] = js.native
}

