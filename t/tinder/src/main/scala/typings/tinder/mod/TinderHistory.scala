package typings.tinder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TinderHistory extends js.Object {
  
  var blocks: js.Array[String] = js.native
  
   // todo
  var deleted_lists: js.Array[_] = js.native
  
   // todo
  var last_activity_date: String = js.native
  
   // todo
  var liked_messages: js.Array[TinderLikedMessage] = js.native
  
  var lists: js.Array[_] = js.native
  
  var matches: js.Array[TinderMatch] = js.native
  
  var squads: js.Array[_] = js.native
}
object TinderHistory {
  
  @scala.inline
  def apply(
    blocks: js.Array[String],
    deleted_lists: js.Array[_],
    last_activity_date: String,
    liked_messages: js.Array[TinderLikedMessage],
    lists: js.Array[_],
    matches: js.Array[TinderMatch],
    squads: js.Array[_]
  ): TinderHistory = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], deleted_lists = deleted_lists.asInstanceOf[js.Any], last_activity_date = last_activity_date.asInstanceOf[js.Any], liked_messages = liked_messages.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], squads = squads.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinderHistory]
  }
  
  @scala.inline
  implicit class TinderHistoryOps[Self <: TinderHistory] (val x: Self) extends AnyVal {
    
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
    def setBlocksVarargs(value: String*): Self = this.set("blocks", js.Array(value :_*))
    
    @scala.inline
    def setBlocks(value: js.Array[String]): Self = this.set("blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleted_listsVarargs(value: js.Any*): Self = this.set("deleted_lists", js.Array(value :_*))
    
    @scala.inline
    def setDeleted_lists(value: js.Array[_]): Self = this.set("deleted_lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_activity_date(value: String): Self = this.set("last_activity_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiked_messagesVarargs(value: TinderLikedMessage*): Self = this.set("liked_messages", js.Array(value :_*))
    
    @scala.inline
    def setLiked_messages(value: js.Array[TinderLikedMessage]): Self = this.set("liked_messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListsVarargs(value: js.Any*): Self = this.set("lists", js.Array(value :_*))
    
    @scala.inline
    def setLists(value: js.Array[_]): Self = this.set("lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesVarargs(value: TinderMatch*): Self = this.set("matches", js.Array(value :_*))
    
    @scala.inline
    def setMatches(value: js.Array[TinderMatch]): Self = this.set("matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSquadsVarargs(value: js.Any*): Self = this.set("squads", js.Array(value :_*))
    
    @scala.inline
    def setSquads(value: js.Array[_]): Self = this.set("squads", value.asInstanceOf[js.Any])
  }
}
