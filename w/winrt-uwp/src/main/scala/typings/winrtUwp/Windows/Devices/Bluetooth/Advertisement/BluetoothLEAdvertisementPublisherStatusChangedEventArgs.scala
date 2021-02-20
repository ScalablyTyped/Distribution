package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a StatusChanged event on a BluetoothLEAdvertisementPublisher . */
@js.native
trait BluetoothLEAdvertisementPublisherStatusChangedEventArgs extends StObject {
  
  /** Gets the error status for a StatusChanged event on a BluetoothLEAdvertisementPublisher . */
  var error: BluetoothError = js.native
  
  /** Gets the new status of the BluetoothLEAdvertisementPublisher . */
  var status: BluetoothLEAdvertisementPublisherStatus = js.native
}
object BluetoothLEAdvertisementPublisherStatusChangedEventArgs {
  
  @scala.inline
  def apply(error: BluetoothError, status: BluetoothLEAdvertisementPublisherStatus): BluetoothLEAdvertisementPublisherStatusChangedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementPublisherStatusChangedEventArgs]
  }
  
  @scala.inline
  implicit class BluetoothLEAdvertisementPublisherStatusChangedEventArgsMutableBuilder[Self <: BluetoothLEAdvertisementPublisherStatusChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: BluetoothError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: BluetoothLEAdvertisementPublisherStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
