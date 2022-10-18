package typings.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the barcode data from the DataReceived event. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.BarcodeScannerDataReceivedEventArgs")
@js.native
open class BarcodeScannerDataReceivedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerDataReceivedEventArgs {
  
  /** Gets the data from the DataReceived event. */
  /* CompleteClass */
  var report: typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerReport = js.native
}
