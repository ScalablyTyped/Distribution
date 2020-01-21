package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BarcodeScannerStatus with Double] = js.native
  /* 4 */ @js.native
  object extended extends TopLevel[extended with Double]
  
  /* 1 */ @js.native
  object off extends TopLevel[off with Double]
  
  /* 3 */ @js.native
  object offOrOffline extends TopLevel[offOrOffline with Double]
  
  /* 2 */ @js.native
  object offline extends TopLevel[offline with Double]
  
  /* 0 */ @js.native
  object online extends TopLevel[online with Double]
  
}

