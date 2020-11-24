package typings.tinder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TinderMessage extends js.Object {
  
  var _id: String = js.native
  
  var created_date: String = js.native
  
  var from: String = js.native
  
  var match_id: String = js.native
  
  var message: String = js.native
  
  var sent_date: String = js.native
  
  var timestamp: Double = js.native
  
  var to: String = js.native
}
object TinderMessage {
  
  @scala.inline
  def apply(
    _id: String,
    created_date: String,
    from: String,
    match_id: String,
    message: String,
    sent_date: String,
    timestamp: Double,
    to: String
  ): TinderMessage = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], created_date = created_date.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], match_id = match_id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sent_date = sent_date.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinderMessage]
  }
  
  @scala.inline
  implicit class TinderMessageOps[Self <: TinderMessage] (val x: Self) extends AnyVal {
    
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
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_date(value: String): Self = this.set("created_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch_id(value: String): Self = this.set("match_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSent_date(value: String): Self = this.set("sent_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
