package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a DataReceived event on a MobileBroadbandDeviceServiceDataSession when data is received . */
@js.native
trait MobileBroadbandDeviceServiceDataReceivedEventArgs extends StObject {
  
  /** Gets the data received on the MobileBroadbandDeviceServiceDataSession . */
  var receivedData: IBuffer = js.native
}
object MobileBroadbandDeviceServiceDataReceivedEventArgs {
  
  @scala.inline
  def apply(receivedData: IBuffer): MobileBroadbandDeviceServiceDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(receivedData = receivedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandDeviceServiceDataReceivedEventArgs]
  }
  
  @scala.inline
  implicit class MobileBroadbandDeviceServiceDataReceivedEventArgsMutableBuilder[Self <: MobileBroadbandDeviceServiceDataReceivedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReceivedData(value: IBuffer): Self = StObject.set(x, "receivedData", value.asInstanceOf[js.Any])
  }
}
