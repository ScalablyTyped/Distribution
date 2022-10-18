package typings.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the ErrorOccurred event. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.BarcodeScannerErrorOccurredEventArgs")
@js.native
open class BarcodeScannerErrorOccurredEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerErrorOccurredEventArgs {
  
  /** Gets the data associated with the ErrorOccurred event. */
  /* CompleteClass */
  var errorData: typings.winrtUwp.Windows.Devices.PointOfService.UnifiedPosErrorData = js.native
  
  /** Indicates whether it is worthwhile to make another attempt at the operation. */
  /* CompleteClass */
  var isRetriable: Boolean = js.native
  
  /** Gets any data that was successfully read. */
  /* CompleteClass */
  var partialInputData: typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerReport = js.native
}
