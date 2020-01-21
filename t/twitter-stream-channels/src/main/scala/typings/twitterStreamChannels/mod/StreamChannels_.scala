package typings.twitterStreamChannels.mod

import typings.node.eventsMod.EventEmitter
import typings.twitterStreamChannels.AnonRemoveAllListeners
import typings.twitterStreamChannels.mod.StreamChannels.Channels
import typings.twitterStreamChannels.mod.StreamChannels.StreamChannelsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twitter-stream-channels", "StreamChannels")
@js.native
class StreamChannels_ protected () extends EventEmitter {
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
  def stop(options: AnonRemoveAllListeners): StreamChannels = js.native
}

