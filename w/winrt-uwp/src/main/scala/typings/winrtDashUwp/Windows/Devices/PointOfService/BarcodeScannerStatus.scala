package typings.winrtDashUwp.Windows.Devices.PointOfService

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
  sealed trait extended extends BarcodeScannerStatus
  
  /** The device power is off or detached from the terminal. This is valid if UnifiedPosPowerReportingType is Advanced. */
  @js.native
  sealed trait off extends BarcodeScannerStatus
  
  /** The device power is off or the device is offline. This is valid if UnifiedPosPowerReportingType is Standard. */
  @js.native
  sealed trait offOrOffline extends BarcodeScannerStatus
  
  /** The device power is on, but it is not ready or unable to respond to requests. This is valid if UnifiedPosPowerReportingType is Advanced. */
  @js.native
  sealed trait offline extends BarcodeScannerStatus
  
  /** The device is online. This is valid if UnifiedPosPowerReportingType is Standard or Advanced. */
  @js.native
  sealed trait online extends BarcodeScannerStatus
  
  /* 4 */ val extended: typings.winrtDashUwp.Windows.Devices.PointOfService.BarcodeScannerStatus.extended with Double = js.native
  /* 1 */ val off: typings.winrtDashUwp.Windows.Devices.PointOfService.BarcodeScannerStatus.off with Double = js.native
  /* 3 */ val offOrOffline: typings.winrtDashUwp.Windows.Devices.PointOfService.BarcodeScannerStatus.offOrOffline with Double = js.native
  /* 2 */ val offline: typings.winrtDashUwp.Windows.Devices.PointOfService.BarcodeScannerStatus.offline with Double = js.native
  /* 0 */ val online: typings.winrtDashUwp.Windows.Devices.PointOfService.BarcodeScannerStatus.online with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BarcodeScannerStatus with Double] = js.native
}

