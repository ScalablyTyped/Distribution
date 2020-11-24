package typings.winrtUwp.Windows.Networking.Proximity

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a message that's received from a subscription. */
@js.native
trait ProximityMessage extends js.Object {
  
  /** Gets the binary data of the message. */
  var data: IBuffer = js.native
  
  /** Gets the message data as text. */
  var dataAsString: String = js.native
  
  /** Gets the type of the message. */
  var messageType: String = js.native
  
  /** Gets the subscription ID of the message. */
  var subscriptionId: Double = js.native
}
object ProximityMessage {
  
  @scala.inline
  def apply(data: IBuffer, dataAsString: String, messageType: String, subscriptionId: Double): ProximityMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataAsString = dataAsString.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximityMessage]
  }
  
  @scala.inline
  implicit class ProximityMessageOps[Self <: ProximityMessage] (val x: Self) extends AnyVal {
    
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
    def setData(value: IBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAsString(value: String): Self = this.set("dataAsString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageType(value: String): Self = this.set("messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionId(value: Double): Self = this.set("subscriptionId", value.asInstanceOf[js.Any])
  }
}
