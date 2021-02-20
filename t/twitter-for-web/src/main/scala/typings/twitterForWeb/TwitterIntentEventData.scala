package typings.twitterForWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for a data relevants to the Web Intent just actioned.
  */
@js.native
trait TwitterIntentEventData extends StObject {
  
  /**
    * The screen_name of a user;
    */
  var screen_name: js.UndefOr[String] = js.native
  
  /**
    * The ID of a source Tweet.
    */
  var source_tweet_id: js.UndefOr[String] = js.native
  
  /**
    * The ID of a Tweet.
    */
  var tweet_id: js.UndefOr[String] = js.native
  
  /**
    * The ID of a user.
    */
  var user_id: js.UndefOr[String] = js.native
}
object TwitterIntentEventData {
  
  @scala.inline
  def apply(): TwitterIntentEventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwitterIntentEventData]
  }
  
  @scala.inline
  implicit class TwitterIntentEventDataMutableBuilder[Self <: TwitterIntentEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScreen_name(value: String): Self = StObject.set(x, "screen_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen_nameUndefined: Self = StObject.set(x, "screen_name", js.undefined)
    
    @scala.inline
    def setSource_tweet_id(value: String): Self = StObject.set(x, "source_tweet_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_tweet_idUndefined: Self = StObject.set(x, "source_tweet_id", js.undefined)
    
    @scala.inline
    def setTweet_id(value: String): Self = StObject.set(x, "tweet_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTweet_idUndefined: Self = StObject.set(x, "tweet_id", js.undefined)
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
