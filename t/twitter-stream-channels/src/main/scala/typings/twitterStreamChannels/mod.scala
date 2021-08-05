package typings.twitterStreamChannels

import typings.node.eventsMod.EventEmitter
import typings.twitterStreamChannels.anon.RemoveAllListeners
import typings.twitterStreamChannels.mod.StreamChannels.Channels
import typings.twitterStreamChannels.mod.StreamChannels.StreamChannelsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  class ^ protected ()
    extends StObject
       with TwitterStreamChannels {
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
    override def getApiClient(): typings.twit.mod.^ = js.native
    
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
  
  @JSImport("twitter-stream-channels", "StreamChannels")
  @js.native
  class StreamChannels protected () extends EventEmitter {
    /**
      * @see https://github.com/topheman/twitter-stream-channels/blob/master/lib/StreamChannels.js#L25
      */
    def this(apiClient: typings.twit.mod.^, options: StreamChannelsOptions) = this()
    
    /**
      * Returns your channel description
      * @method getChannels
      * @returns {StreamChannels.channels}
      * @see https://github.com/topheman/twitter-stream-channels/blob/master/lib/StreamChannels.js#L145
      */
    def getChannels(): Channels = js.native
    
    /**
      * Returns an object key/value - key:your channels - value:the full text search RegExp for the keywords of this channel
      * @method getchannelsKeywordsLowerCasedRegExp
      * @returns {StreamChannels.channels}
      * @see https://github.com/topheman/twitter-stream-channels/blob/master/lib/StreamChannels.js#L163
      */
    def getChannelsKeywordsLowerCasedRegExp(): Channels = js.native
    
    /**
      * Returns an array of the keywords you're tracking (duplicates were removed)
      * @method getTrackedKeywords
      * @returns {Array}
      * @see https://github.com/topheman/twitter-stream-channels/blob/master/lib/StreamChannels.js#L145
      */
    def getTrackedKeywords(): js.Array[String] = js.native
    
    /**
      * Call this function to restart the stream after you called `.stop()` on it.
      *
      * Note: there is no need to call `.start()` to begin streaming. ` TwitterStreamChannels.streamChannels` calls .start() for you.
      * @method start
      * @returns {StreamChannels}
      * @see https://github.com/topheman/twitter-stream-channels/blob/master/lib/StreamChannels.js#L120
      */
    def start(): StreamChannels = js.native
    
    /**
      * Closes the opened stream with Twitter
      * @method stop
      * @param {object} [options]
      * @param {object} [options.removeAllListeners=false] If true removes all the listeners set on the stream
      * @returns {StreamChannels}
      * @see https://github.com/topheman/twitter-stream-channels/blob/master/lib/StreamChannels.js#L120
      */
    def stop(): StreamChannels = js.native
    def stop(options: RemoveAllListeners): StreamChannels = js.native
  }
  object StreamChannels {
    
    trait Channels extends StObject
    
    trait StreamChannelsOptions extends StObject {
      
      var enableChannelsEvents: js.UndefOr[Boolean] = js.undefined
      
      var enableKeywordsEvents: js.UndefOr[Boolean] = js.undefined
      
      var enableRootChannelsEvent: js.UndefOr[Boolean] = js.undefined
      
      var follow: js.UndefOr[String] = js.undefined
      
      var locations: js.UndefOr[String] = js.undefined
      
      var track: js.UndefOr[js.Object] = js.undefined
    }
    object StreamChannelsOptions {
      
      inline def apply(): StreamChannelsOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StreamChannelsOptions]
      }
      
      extension [Self <: StreamChannelsOptions](x: Self) {
        
        inline def setEnableChannelsEvents(value: Boolean): Self = StObject.set(x, "enableChannelsEvents", value.asInstanceOf[js.Any])
        
        inline def setEnableChannelsEventsUndefined: Self = StObject.set(x, "enableChannelsEvents", js.undefined)
        
        inline def setEnableKeywordsEvents(value: Boolean): Self = StObject.set(x, "enableKeywordsEvents", value.asInstanceOf[js.Any])
        
        inline def setEnableKeywordsEventsUndefined: Self = StObject.set(x, "enableKeywordsEvents", js.undefined)
        
        inline def setEnableRootChannelsEvent(value: Boolean): Self = StObject.set(x, "enableRootChannelsEvent", value.asInstanceOf[js.Any])
        
        inline def setEnableRootChannelsEventUndefined: Self = StObject.set(x, "enableRootChannelsEvent", js.undefined)
        
        inline def setFollow(value: String): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
        
        inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
        
        inline def setLocations(value: String): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
        
        inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
        
        inline def setTrack(value: js.Object): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
        
        inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
      }
    }
  }
  
  /**
    * @class TwitterStreamChannels
    * @param {object} credentials
    * @param {String} credentials.consumer_key
    * @param {String} credentials.consumer_secret
    * @param {String} credentials.access_token
    * @param {String} credentials.access_token_secret
    * @return {TwitterStreamChannels}
    */
  trait TwitterStreamChannels extends StObject {
    
    /**
      * Returns a Twitter API client on which you can do pretty much what you want.
      * More here https://github.com/ttezel/twit
      * @method getApiClient
      * @returns {Twit}
      * @see https://github.com/topheman/twitter-stream-channels/blob/master/lib/TwitterStreamChannels.js#L113
      */
    def getApiClient(): typings.twit.mod.^
    
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
    def streamChannels(options: StreamChannelsOptions): StreamChannels
  }
  object TwitterStreamChannels {
    
    inline def apply(getApiClient: () => typings.twit.mod.^, streamChannels: StreamChannelsOptions => StreamChannels): TwitterStreamChannels = {
      val __obj = js.Dynamic.literal(getApiClient = js.Any.fromFunction0(getApiClient), streamChannels = js.Any.fromFunction1(streamChannels))
      __obj.asInstanceOf[TwitterStreamChannels]
    }
    
    extension [Self <: TwitterStreamChannels](x: Self) {
      
      inline def setGetApiClient(value: () => typings.twit.mod.^): Self = StObject.set(x, "getApiClient", js.Any.fromFunction0(value))
      
      inline def setStreamChannels(value: StreamChannelsOptions => StreamChannels): Self = StObject.set(x, "streamChannels", js.Any.fromFunction1(value))
    }
  }
}
