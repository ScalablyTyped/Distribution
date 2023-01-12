package typings.winrtUwp.Windows.Networking.Proximity

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a message that's received from a subscription. */
trait ProximityMessage extends StObject {
  
  /** Gets the binary data of the message. */
  var data: IBuffer
  
  /** Gets the message data as text. */
  var dataAsString: String
  
  /** Gets the type of the message. */
  var messageType: String
  
  /** Gets the subscription ID of the message. */
  var subscriptionId: Double
}
object ProximityMessage {
  
  inline def apply(data: IBuffer, dataAsString: String, messageType: String, subscriptionId: Double): ProximityMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataAsString = dataAsString.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximityMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProximityMessage] (val x: Self) extends AnyVal {
    
    inline def setData(value: IBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataAsString(value: String): Self = StObject.set(x, "dataAsString", value.asInstanceOf[js.Any])
    
    inline def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionId(value: Double): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
  }
}
