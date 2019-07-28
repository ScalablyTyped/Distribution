package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnifiedPosErrorReason extends js.Object

/** Defines the constants that indicates the reason for the error event. */
@JSGlobal("Windows.Devices.PointOfService.UnifiedPosErrorReason")
@js.native
object UnifiedPosErrorReason extends js.Object {
  /** The device is busy. */
  @js.native
  sealed trait busy extends UnifiedPosErrorReason
  
  /** The device is closed. */
  @js.native
  sealed trait closed extends UnifiedPosErrorReason
  
  /** The device is not enabled. */
  @js.native
  sealed trait disabled extends UnifiedPosErrorReason
  
  /** The operation failed and returned a vendor specific error information. */
  @js.native
  sealed trait extended extends UnifiedPosErrorReason
  
  /** The operation failed although the device was connected and powered on. */
  @js.native
  sealed trait failure extends UnifiedPosErrorReason
  
  /** The operation is not supported or not available on the device. */
  @js.native
  sealed trait illegal extends UnifiedPosErrorReason
  
  /** The device is not connected or not powered on. */
  @js.native
  sealed trait noHardware extends UnifiedPosErrorReason
  
  /** Cannot communicate with the device, possibly due to a configuration error. */
  @js.native
  sealed trait noService extends UnifiedPosErrorReason
  
  /** The device is offline. */
  @js.native
  sealed trait offline extends UnifiedPosErrorReason
  
  /** The operation timed out while waiting for a response from the device. */
  @js.native
  sealed trait timeout extends UnifiedPosErrorReason
  
  /** Unknown reason. */
  @js.native
  sealed trait unknownErrorReason extends UnifiedPosErrorReason
  
  /* 9 */ val busy: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason.busy with Double = js.native
  /* 5 */ val closed: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason.closed with Double = js.native
  /* 2 */ val disabled: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason.disabled with Double = js.native
  /* 10 */ val extended: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason.extended with Double = js.native
  /* 7 */ val failure: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason.failure with Double = js.native
  /* 3 */ val illegal: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason.illegal with Double = js.native
  /* 4 */ val noHardware: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason.noHardware with Double = js.native
  /* 1 */ val noService: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason.noService with Double = js.native
  /* 6 */ val offline: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason.offline with Double = js.native
  /* 8 */ val timeout: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason.timeout with Double = js.native
  /* 0 */ val unknownErrorReason: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason.unknownErrorReason with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnifiedPosErrorReason with Double] = js.native
}

