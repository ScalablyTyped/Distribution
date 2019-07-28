package typings.twitterDashStreamDashChannels.twitterDashStreamDashChannelsMod

import typings.twitterDashStreamDashChannels.twitterDashStreamDashChannelsMod.StreamChannelsNs.StreamChannelsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class TwitterStreamChannels
  * @param {object} credentials
  * @param {String} credentials.consumer_key
  * @param {String} credentials.consumer_secret
  * @param {String} credentials.access_token
  * @param {String} credentials.access_token_secret
  * @return {TwitterStreamChannels}
  */
@JSImport("twitter-stream-channels", JSImport.Namespace)
@js.native
class ^ protected () extends TwitterStreamChannels {
  /**
    * @see https://github.com/topheman/twitter-stream-channels/blob/master/lib/TwitterStreamChannels.js#L69
    */
  def this(config: js.Object) = this()
  /**
    * Returns a Twitter API client on which you can do pretty much what you want.
    * More here https://github.com/ttezel/twit
    * @method getApiClient
    * @returns {Twit}
    * @see https://github.com/topheman/twitter-stream-channels/blob/master/lib/TwitterStreamChannels.js#L113
    */
  /* CompleteClass */
  override def getApiClient(): typings.twit.twitMod.^ = js.native
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
  /* CompleteClass */
  override def streamChannels(options: StreamChannelsOptions): StreamChannels = js.native
}

