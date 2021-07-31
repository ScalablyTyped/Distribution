package typings.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an operation status change. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScannerStatusUpdatedEventArgs")
@js.native
abstract class BarcodeScannerStatusUpdatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerStatusUpdatedEventArgs {
  
  /** Gets the vendor specific status code. */
  /* CompleteClass */
  var extendedStatus: Double = js.native
  
  /** Gets the status change information. */
  /* CompleteClass */
  var status: typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerStatus = js.native
}
