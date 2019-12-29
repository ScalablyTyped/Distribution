package typings.winrtDashUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceUnpairingResultStatus extends js.Object

/** The result of the unpairing action. */
@JSGlobal("Windows.Devices.Enumeration.DeviceUnpairingResultStatus")
@js.native
object DeviceUnpairingResultStatus extends js.Object {
  /** The caller does not have sufficient permissions to unpair the device. */
  @js.native
  sealed trait accessDenied extends DeviceUnpairingResultStatus
  
  /** The device object was already unpaired. */
  @js.native
  sealed trait alreadyUnpaired extends DeviceUnpairingResultStatus
  
  /** An unknown failure occurred. */
  @js.native
  sealed trait failed extends DeviceUnpairingResultStatus
  
  /** The device object is currently in the middle of either a pairing or unpairing action. */
  @js.native
  sealed trait operationAlreadyInProgress extends DeviceUnpairingResultStatus
  
  /** The device object is successfully unpaired. */
  @js.native
  sealed trait unpaired extends DeviceUnpairingResultStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceUnpairingResultStatus with Double] = js.native
  /* 3 */ @js.native
  object accessDenied extends TopLevel[accessDenied with Double]
  
  /* 1 */ @js.native
  object alreadyUnpaired extends TopLevel[alreadyUnpaired with Double]
  
  /* 4 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 2 */ @js.native
  object operationAlreadyInProgress extends TopLevel[operationAlreadyInProgress with Double]
  
  /* 0 */ @js.native
  object unpaired extends TopLevel[unpaired with Double]
  
}

