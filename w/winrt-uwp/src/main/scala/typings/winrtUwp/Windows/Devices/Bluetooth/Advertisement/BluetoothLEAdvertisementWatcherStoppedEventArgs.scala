package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a Stopped event on a BluetoothLEAdvertisementWatcher . */
@js.native
trait BluetoothLEAdvertisementWatcherStoppedEventArgs extends js.Object {
  
  /** Gets the error status for Stopped event. */
  var error: BluetoothError = js.native
}
object BluetoothLEAdvertisementWatcherStoppedEventArgs {
  
  @scala.inline
  def apply(error: BluetoothError): BluetoothLEAdvertisementWatcherStoppedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementWatcherStoppedEventArgs]
  }
  
  @scala.inline
  implicit class BluetoothLEAdvertisementWatcherStoppedEventArgsOps[Self <: BluetoothLEAdvertisementWatcherStoppedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: BluetoothError): Self = this.set("error", value.asInstanceOf[js.Any])
  }
}
