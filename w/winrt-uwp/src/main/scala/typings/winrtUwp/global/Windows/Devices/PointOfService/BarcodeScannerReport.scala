package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the barcode scanner data. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.BarcodeScannerReport")
@js.native
open class BarcodeScannerReport ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerReport {
  
  /** Gets the full raw data from the DataReceived event. */
  /* CompleteClass */
  var scanData: IBuffer = js.native
  
  /** Gets the decoded barcode label, which does not include the header, checksum, and other miscellaneous information. */
  /* CompleteClass */
  var scanDataLabel: IBuffer = js.native
  
  /** Gets the decoded barcode label type. Possible values are defined in the BarcodeSymbologies class. */
  /* CompleteClass */
  var scanDataType: Double = js.native
}
