package typings.twitterForWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for a data relevants to the Web Intent just actioned.
  */
@js.native
trait TwitterIntentEventData extends js.Object {
  
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
  implicit class TwitterIntentEventDataOps[Self <: TwitterIntentEventData] (val x: Self) extends AnyVal {
    
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
    def setScreen_name(value: String): Self = this.set("screen_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreen_name: Self = this.set("screen_name", js.undefined)
    
    @scala.inline
    def setSource_tweet_id(value: String): Self = this.set("source_tweet_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource_tweet_id: Self = this.set("source_tweet_id", js.undefined)
    
    @scala.inline
    def setTweet_id(value: String): Self = this.set("tweet_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTweet_id: Self = this.set("tweet_id", js.undefined)
    
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_id: Self = this.set("user_id", js.undefined)
  }
}
