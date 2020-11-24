package typings.tinder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TinderMatch extends js.Object {
  
  var _id: String = js.native
  
  var closed: Boolean = js.native
  
  var common_friend_count: Double = js.native
  
  var common_like_count: Double = js.native
  
  var created_date: String = js.native
  
  var dead: Boolean = js.native
  
  var following: Boolean = js.native
  
  var following_moments: Boolean = js.native
  
  var id: String = js.native
  
  var is_super_like: Boolean = js.native
  
  var last_activity_date: String = js.native
  
  var message_count: Double = js.native
  
  var messages: js.Array[TinderMessage] = js.native
  
  var muted: Boolean = js.native
  
  var participants: js.Array[String] = js.native
  
  var pending: Boolean = js.native
  
  var person: TinderPerson = js.native
}
object TinderMatch {
  
  @scala.inline
  def apply(
    _id: String,
    closed: Boolean,
    common_friend_count: Double,
    common_like_count: Double,
    created_date: String,
    dead: Boolean,
    following: Boolean,
    following_moments: Boolean,
    id: String,
    is_super_like: Boolean,
    last_activity_date: String,
    message_count: Double,
    messages: js.Array[TinderMessage],
    muted: Boolean,
    participants: js.Array[String],
    pending: Boolean,
    person: TinderPerson
  ): TinderMatch = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], common_friend_count = common_friend_count.asInstanceOf[js.Any], common_like_count = common_like_count.asInstanceOf[js.Any], created_date = created_date.asInstanceOf[js.Any], dead = dead.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], following_moments = following_moments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_super_like = is_super_like.asInstanceOf[js.Any], last_activity_date = last_activity_date.asInstanceOf[js.Any], message_count = message_count.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], person = person.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinderMatch]
  }
  
  @scala.inline
  implicit class TinderMatchOps[Self <: TinderMatch] (val x: Self) extends AnyVal {
    
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
    def setClosed(value: Boolean): Self = this.set("closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommon_friend_count(value: Double): Self = this.set("common_friend_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommon_like_count(value: Double): Self = this.set("common_like_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_date(value: String): Self = this.set("created_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDead(value: Boolean): Self = this.set("dead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowing(value: Boolean): Self = this.set("following", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowing_moments(value: Boolean): Self = this.set("following_moments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_super_like(value: Boolean): Self = this.set("is_super_like", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_activity_date(value: String): Self = this.set("last_activity_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage_count(value: Double): Self = this.set("message_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: TinderMessage*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[TinderMessage]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantsVarargs(value: String*): Self = this.set("participants", js.Array(value :_*))
    
    @scala.inline
    def setParticipants(value: js.Array[String]): Self = this.set("participants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending(value: Boolean): Self = this.set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerson(value: TinderPerson): Self = this.set("person", value.asInstanceOf[js.Any])
  }
}
