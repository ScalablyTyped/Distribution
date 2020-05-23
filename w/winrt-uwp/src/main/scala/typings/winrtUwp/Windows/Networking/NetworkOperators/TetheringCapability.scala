package typings.winrtUwp.Windows.Networking.NetworkOperators

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
  
}

