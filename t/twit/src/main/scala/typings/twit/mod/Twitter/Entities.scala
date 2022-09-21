package typings.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entities extends StObject {
  
  var hashtags: js.Array[HashtagEntity]
  
  var media: js.Array[MediaEntity]
  
  var polls: js.Array[PollEntity]
  
  var symbols: js.Array[SymbolEntity]
  
  var urls: js.Array[UrlEntity]
  
  var user_mentions: js.Array[UserMentionEntity]
}
object Entities {
  
  inline def apply(
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
  
  extension [Self <: Entities](x: Self) {
    
    inline def setHashtags(value: js.Array[HashtagEntity]): Self = StObject.set(x, "hashtags", value.asInstanceOf[js.Any])
    
    inline def setHashtagsVarargs(value: HashtagEntity*): Self = StObject.set(x, "hashtags", js.Array(value*))
    
    inline def setMedia(value: js.Array[MediaEntity]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaVarargs(value: MediaEntity*): Self = StObject.set(x, "media", js.Array(value*))
    
    inline def setPolls(value: js.Array[PollEntity]): Self = StObject.set(x, "polls", value.asInstanceOf[js.Any])
    
    inline def setPollsVarargs(value: PollEntity*): Self = StObject.set(x, "polls", js.Array(value*))
    
    inline def setSymbols(value: js.Array[SymbolEntity]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsVarargs(value: SymbolEntity*): Self = StObject.set(x, "symbols", js.Array(value*))
    
    inline def setUrls(value: js.Array[UrlEntity]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: UrlEntity*): Self = StObject.set(x, "urls", js.Array(value*))
    
    inline def setUser_mentions(value: js.Array[UserMentionEntity]): Self = StObject.set(x, "user_mentions", value.asInstanceOf[js.Any])
    
    inline def setUser_mentionsVarargs(value: UserMentionEntity*): Self = StObject.set(x, "user_mentions", js.Array(value*))
  }
}
