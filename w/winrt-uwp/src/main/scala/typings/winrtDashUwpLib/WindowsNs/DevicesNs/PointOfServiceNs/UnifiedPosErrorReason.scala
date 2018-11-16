package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

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
  sealed trait busy
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason
  
  /** The device is closed. */
  @js.native
  sealed trait closed
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason
  
  /** The device is not enabled. */
  @js.native
  sealed trait disabled
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason
  
  /** The operation failed and returned a vendor specific error information. */
  @js.native
  sealed trait extended
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason
  
  /** The operation failed although the device was connected and powered on. */
  @js.native
  sealed trait failure
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason
  
  /** The operation is not supported or not available on the device. */
  @js.native
  sealed trait illegal
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason
  
  /** The device is not connected or not powered on. */
  @js.native
  sealed trait noHardware
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason
  
  /** Cannot communicate with the device, possibly due to a configuration error. */
  @js.native
  sealed trait noService
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason
  
  /** The device is offline. */
  @js.native
  sealed trait offline
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason
  
  /** The operation timed out while waiting for a response from the device. */
  @js.native
  sealed trait timeout
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason
  
  /** Unknown reason. */
  @js.native
  sealed trait unknownErrorReason
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason
  
  val busy: busy with java.lang.String = js.native
  val closed: closed with java.lang.String = js.native
  val disabled: disabled with java.lang.String = js.native
  val extended: extended with java.lang.String = js.native
  val failure: failure with java.lang.String = js.native
  val illegal: illegal with java.lang.String = js.native
  val noHardware: noHardware with java.lang.String = js.native
  val noService: noService with java.lang.String = js.native
  val offline: offline with java.lang.String = js.native
  val timeout: timeout with java.lang.String = js.native
  val unknownErrorReason: unknownErrorReason with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorReason with java.lang.String
  ] = js.native
}

