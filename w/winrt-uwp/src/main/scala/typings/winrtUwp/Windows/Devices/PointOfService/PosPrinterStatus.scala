package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the status of a point-of-service printer, such as the power state of the printer. */
trait PosPrinterStatus extends StObject {
  
  /** Gets extended information about the power state of the point-of-service printer that the original equipment manufacturer (OEM) defines. Value is only valid if the PosPrinterStatus.StatusKind property is PosPrinterStatusKind.Extended. */
  var extendedStatus: Double
  
  /** Gets the power state of a point-of-service printer. */
  var statusKind: PosPrinterStatusKind
}
object PosPrinterStatus {
  
  inline def apply(extendedStatus: Double, statusKind: PosPrinterStatusKind): PosPrinterStatus = {
    val __obj = js.Dynamic.literal(extendedStatus = extendedStatus.asInstanceOf[js.Any], statusKind = statusKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosPrinterStatus]
  }
  
  extension [Self <: PosPrinterStatus](x: Self) {
    
    inline def setExtendedStatus(value: Double): Self = StObject.set(x, "extendedStatus", value.asInstanceOf[js.Any])
    
    inline def setStatusKind(value: PosPrinterStatusKind): Self = StObject.set(x, "statusKind", value.asInstanceOf[js.Any])
  }
}
