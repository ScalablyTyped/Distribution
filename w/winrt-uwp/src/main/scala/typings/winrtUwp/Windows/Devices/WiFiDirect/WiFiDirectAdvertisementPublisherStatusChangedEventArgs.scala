package typings.winrtUwp.Windows.Devices.WiFiDirect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a StatusChanged event on a WiFiDirectAdvertisementPublisher . */
trait WiFiDirectAdvertisementPublisherStatusChangedEventArgs extends StObject {
  
  /** Gets the error status for a StatusChanged event on a WiFiDirectAdvertisementPublisher . */
  var error: WiFiDirectError
  
  /** Gets the new status of the WiFiDirectAdvertisementPublisher . */
  var status: WiFiDirectAdvertisementPublisherStatus
}
object WiFiDirectAdvertisementPublisherStatusChangedEventArgs {
  
  inline def apply(error: WiFiDirectError, status: WiFiDirectAdvertisementPublisherStatus): WiFiDirectAdvertisementPublisherStatusChangedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectAdvertisementPublisherStatusChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WiFiDirectAdvertisementPublisherStatusChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setError(value: WiFiDirectError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: WiFiDirectAdvertisementPublisherStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
