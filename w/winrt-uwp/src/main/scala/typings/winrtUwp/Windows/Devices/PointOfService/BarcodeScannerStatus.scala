package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BarcodeScannerStatus extends StObject
/** Defines the constants that indicates the barcode scanner status. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScannerStatus")
@js.native
object BarcodeScannerStatus extends StObject {
  
  /** Vendor specific status information. */
  @js.native
  sealed trait extended
    extends StObject
       with BarcodeScannerStatus
  
  /** The device power is off or detached from the terminal. This is valid if UnifiedPosPowerReportingType is Advanced. */
  @js.native
  sealed trait off
    extends StObject
       with BarcodeScannerStatus
  
  /** The device power is off or the device is offline. This is valid if UnifiedPosPowerReportingType is Standard. */
  @js.native
  sealed trait offOrOffline
    extends StObject
       with BarcodeScannerStatus
  
  /** The device power is on, but it is not ready or unable to respond to requests. This is valid if UnifiedPosPowerReportingType is Advanced. */
  @js.native
  sealed trait offline
    extends StObject
       with BarcodeScannerStatus
  
  /** The device is online. This is valid if UnifiedPosPowerReportingType is Standard or Advanced. */
  @js.native
  sealed trait online
    extends StObject
       with BarcodeScannerStatus
}
