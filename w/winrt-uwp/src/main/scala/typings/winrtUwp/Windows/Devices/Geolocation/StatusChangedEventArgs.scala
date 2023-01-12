package typings.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information for the StatusChanged event. */
trait StatusChangedEventArgs extends StObject {
  
  /** The updated status of the Geolocator object. */
  var status: PositionStatus
}
object StatusChangedEventArgs {
  
  inline def apply(status: PositionStatus): StatusChangedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: PositionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
