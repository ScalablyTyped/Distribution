package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an operation status change. */
trait BarcodeScannerStatusUpdatedEventArgs extends StObject {
  
  /** Gets the vendor specific status code. */
  var extendedStatus: Double
  
  /** Gets the status change information. */
  var status: BarcodeScannerStatus
}
object BarcodeScannerStatusUpdatedEventArgs {
  
  inline def apply(extendedStatus: Double, status: BarcodeScannerStatus): BarcodeScannerStatusUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(extendedStatus = extendedStatus.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerStatusUpdatedEventArgs]
  }
  
  extension [Self <: BarcodeScannerStatusUpdatedEventArgs](x: Self) {
    
    inline def setExtendedStatus(value: Double): Self = StObject.set(x, "extendedStatus", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: BarcodeScannerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
