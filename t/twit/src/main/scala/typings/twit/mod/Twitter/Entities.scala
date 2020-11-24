package typings.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entities extends js.Object {
  
  var hashtags: js.Array[HashtagEntity] = js.native
  
  var media: js.Array[MediaEntity] = js.native
  
  var polls: js.Array[PollEntity] = js.native
  
  var symbols: js.Array[SymbolEntity] = js.native
  
  var urls: js.Array[UrlEntity] = js.native
  
  var user_mentions: js.Array[UserMentionEntity] = js.native
}
object Entities {
  
  @scala.inline
  def apply(
    hashtags: js.Array[HashtagEntity],
    media: js.Array[MediaEntity],
    polls: js.Array[PollEntity],
    symbols: js.Array[SymbolEntity],
    urls: js.Array[UrlEntity],
    user_mentions: js.Array[UserMentionEntity]
  ): Entities = {
    val __obj = js.Dynamic.literal(hashtags = hashtags.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], polls = polls.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], user_mentions = user_mentions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entities]
  }
  
  @scala.inline
  implicit class EntitiesOps[Self <: Entities] (val x: Self) extends AnyVal {
    
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
    def setHashtagsVarargs(value: HashtagEntity*): Self = this.set("hashtags", js.Array(value :_*))
    
    @scala.inline
    def setHashtags(value: js.Array[HashtagEntity]): Self = this.set("hashtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaVarargs(value: MediaEntity*): Self = this.set("media", js.Array(value :_*))
    
    @scala.inline
    def setMedia(value: js.Array[MediaEntity]): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollsVarargs(value: PollEntity*): Self = this.set("polls", js.Array(value :_*))
    
    @scala.inline
    def setPolls(value: js.Array[PollEntity]): Self = this.set("polls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolsVarargs(value: SymbolEntity*): Self = this.set("symbols", js.Array(value :_*))
    
    @scala.inline
    def setSymbols(value: js.Array[SymbolEntity]): Self = this.set("symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsVarargs(value: UrlEntity*): Self = this.set("urls", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: js.Array[UrlEntity]): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_mentionsVarargs(value: UserMentionEntity*): Self = this.set("user_mentions", js.Array(value :_*))
    
    @scala.inline
    def setUser_mentions(value: js.Array[UserMentionEntity]): Self = this.set("user_mentions", value.asInstanceOf[js.Any])
  }
}
