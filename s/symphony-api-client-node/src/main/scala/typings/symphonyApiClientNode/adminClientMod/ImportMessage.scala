package typings.symphonyApiClientNode.adminClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportMessage extends js.Object {
  
  var data: js.UndefOr[js.Any] = js.native
  
  var intendedMessageFromUserId: Double = js.native
  
  var intendedMessageTimestamp: Double = js.native
  
  var message: String = js.native
  
  var originalMessageId: js.UndefOr[String] = js.native
  
  var originatingSystemId: String = js.native
  
  var streamId: String = js.native
}
object ImportMessage {
  
  @scala.inline
  def apply(
    intendedMessageFromUserId: Double,
    intendedMessageTimestamp: Double,
    message: String,
    originatingSystemId: String,
    streamId: String
  ): ImportMessage = {
    val __obj = js.Dynamic.literal(intendedMessageFromUserId = intendedMessageFromUserId.asInstanceOf[js.Any], intendedMessageTimestamp = intendedMessageTimestamp.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], originatingSystemId = originatingSystemId.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportMessage]
  }
  
  @scala.inline
  implicit class ImportMessageOps[Self <: ImportMessage] (val x: Self) extends AnyVal {
    
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
    def setIntendedMessageFromUserId(value: Double): Self = this.set("intendedMessageFromUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntendedMessageTimestamp(value: Double): Self = this.set("intendedMessageTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginatingSystemId(value: String): Self = this.set("originatingSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: String): Self = this.set("streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setOriginalMessageId(value: String): Self = this.set("originalMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalMessageId: Self = this.set("originalMessageId", js.undefined)
  }
}
