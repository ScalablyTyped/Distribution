package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an operation status change. */
@js.native
trait BarcodeScannerStatusUpdatedEventArgs extends StObject {
  
  /** Gets the vendor specific status code. */
  var extendedStatus: Double = js.native
  
  /** Gets the status change information. */
  var status: BarcodeScannerStatus = js.native
}
object BarcodeScannerStatusUpdatedEventArgs {
  
  @scala.inline
  def apply(extendedStatus: Double, status: BarcodeScannerStatus): BarcodeScannerStatusUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(extendedStatus = extendedStatus.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerStatusUpdatedEventArgs]
  }
  
  @scala.inline
  implicit class BarcodeScannerStatusUpdatedEventArgsMutableBuilder[Self <: BarcodeScannerStatusUpdatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtendedStatus(value: Double): Self = StObject.set(x, "extendedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: BarcodeScannerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
