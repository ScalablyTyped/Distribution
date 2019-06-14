package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BarcodeScannerStatus extends js.Object

/** Defines the constants that indicates the barcode scanner status. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScannerStatus")
@js.native
object BarcodeScannerStatus extends js.Object {
  /** Vendor specific status information. */
  @js.native
  sealed trait extended
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.BarcodeScannerStatus
  
  /** The device power is off or detached from the terminal. This is valid if UnifiedPosPowerReportingType is Advanced. */
  @js.native
  sealed trait off
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.BarcodeScannerStatus
  
  /** The device power is off or the device is offline. This is valid if UnifiedPosPowerReportingType is Standard. */
  @js.native
  sealed trait offOrOffline
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.BarcodeScannerStatus
  
  /** The device power is on, but it is not ready or unable to respond to requests. This is valid if UnifiedPosPowerReportingType is Advanced. */
  @js.native
  sealed trait offline
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.BarcodeScannerStatus
  
  /** The device is online. This is valid if UnifiedPosPowerReportingType is Standard or Advanced. */
  @js.native
  sealed trait online
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.BarcodeScannerStatus
  
  /* 4 */ val extended: extended with scala.Double = js.native
  /* 1 */ val off: off with scala.Double = js.native
  /* 3 */ val offOrOffline: offOrOffline with scala.Double = js.native
  /* 2 */ val offline: offline with scala.Double = js.native
  /* 0 */ val online: online with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.BarcodeScannerStatus with scala.Double
  ] = js.native
}

