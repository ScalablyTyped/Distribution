package typings.twitterStreamChannels.mod

import typings.twitterStreamChannels.mod.StreamChannels.StreamChannelsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class TwitterStreamChannels
  * @param {object} credentials
  * @param {String} credentials.consumer_key
  * @param {String} credentials.consumer_secret
  * @param {String} credentials.access_token
  * @param {String} credentials.access_token_secret
  * @return {TwitterStreamChannels}
  */
@js.native
trait TwitterStreamChannels extends js.Object {
  
  /**
    * Returns a Twitter API client on which you can do pretty much what you want.
    * More here https://github.com/ttezel/twit
    * @method getApiClient
    * @returns {Twit}
    * @see https://github.com/topheman/twitter-stream-channels/blob/master/lib/TwitterStreamChannels.js#L113
    */
  def getApiClient(): typings.twit.mod.^ = js.native
  
  /**
    * Opens a Twitter Stream and returns you an other one on which you'll be able to attach events for each channels
    * @method streamChannels
    * @param {object} options You can use the same filter options as described in the Twitter stream API for `statuses/filter` https://dev.twitter.com/docs/api/1.1/post/statuses/filter
    * @param {object|Array} options.track Pass an object describing your channels. If you don't want to use channels, you can pass directly an array of keywords.
    * @param {String} [options.follow] A comma separated list of user IDs, indicating the users to return statuses for in the stream
    * @param {String} [options.locations] Specifies a set of bounding boxes to track. More about how to format this parameter here : https://dev.twitter.com/docs/streaming-apis/parameters#locations
    * @param {Boolean} [options.enableChannelsEvents=true] If true, will fire the events like 'channels/channelName'
    * @param {Boolean} [options.enableRootChannelsEvent=true] If true, will fire the event 'channels'
    * @param {Boolean} [options.enableKeywordsEvents=false] If true, will fire the events 'keywords/keywordName' (disabled by default)
    * @return {StreamChannels}
    * @see https://github.com/topheman/twitter-stream-channels/blob/master/lib/TwitterStreamChannels.js#L131
    */
  def streamChannels(options: StreamChannelsOptions): StreamChannels = js.native
}
object TwitterStreamChannels {
  
  @scala.inline
  def apply(getApiClient: () => typings.twit.mod.^, streamChannels: StreamChannelsOptions => StreamChannels): TwitterStreamChannels = {
    val __obj = js.Dynamic.literal(getApiClient = js.Any.fromFunction0(getApiClient), streamChannels = js.Any.fromFunction1(streamChannels))
    __obj.asInstanceOf[TwitterStreamChannels]
  }
  
  @scala.inline
  implicit class TwitterStreamChannelsOps[Self <: TwitterStreamChannels] (val x: Self) extends AnyVal {
    
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
    def setGetApiClient(value: () => typings.twit.mod.^): Self = this.set("getApiClient", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStreamChannels(value: StreamChannelsOptions => StreamChannels): Self = this.set("streamChannels", js.Any.fromFunction1(value))
  }
}
