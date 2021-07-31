package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the PosPrinter.StatusUpdated event that occurs when the status of a point-of-service printer changes. */
trait PosPrinterStatusUpdatedEventArgs extends StObject {
  
  /** Gets the new status of the point-of-service printer after the status of the printer changes. */
  var status: PosPrinterStatus
}
object PosPrinterStatusUpdatedEventArgs {
  
  @scala.inline
  def apply(status: PosPrinterStatus): PosPrinterStatusUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosPrinterStatusUpdatedEventArgs]
  }
  
  @scala.inline
  implicit class PosPrinterStatusUpdatedEventArgsMutableBuilder[Self <: PosPrinterStatusUpdatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: PosPrinterStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
