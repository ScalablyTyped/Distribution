package typings
package titaniumLib.TitaniumNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * This object represents a music controller.
		 */
@js.native
trait MusicPlayer
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Current point in song playback, in seconds.
  			 */
  var currentPlaybackTime: scala.Double = js.native
  /**
  			 * An `Item` object representing the currently playing media item.
  			 */
  val nowPlaying: Item = js.native
  /**
  			 * Playback state.
  			 */
  val playbackState: scala.Double = js.native
  /**
  			 * Repeat setting.
  			 */
  var repeatMode: scala.Double = js.native
  /**
  			 * Shuffle setting.
  			 */
  var shuffleMode: scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.MusicPlayer.currentPlaybackTime> property.
  			 */
  def getCurrentPlaybackTime(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.MusicPlayer.nowPlaying> property.
  			 */
  def getNowPlaying(): Item = js.native
  /**
  			 * Gets the value of the <Titanium.Media.MusicPlayer.playbackState> property.
  			 */
  def getPlaybackState(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.MusicPlayer.repeatMode> property.
  			 */
  def getRepeatMode(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.MusicPlayer.shuffleMode> property.
  			 */
  def getShuffleMode(): scala.Double = js.native
  /**
  			 * Pauses playback of the current media item.
  			 */
  def pause(): scala.Unit = js.native
  /**
  			 * Begins playback of the current media item.
  			 */
  def play(): scala.Unit = js.native
  /**
  			 * Begins seeking backward in the currently playing media.
  			 */
  def seekBackward(): scala.Unit = js.native
  /**
  			 * Begins seeking forward in the currently playing media item.
  			 */
  def seekForward(): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.MusicPlayer.currentPlaybackTime> property.
  			 */
  def setCurrentPlaybackTime(currentPlaybackTime: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the media queue.
  			 */
  def setQueue(queue: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the media queue.
  			 */
  def setQueue(queue: js.Array[Item]): scala.Unit = js.native
  /**
  			 * Sets the media queue.
  			 */
  def setQueue(queue: Item): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.MusicPlayer.repeatMode> property.
  			 */
  def setRepeatMode(repeatMode: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.MusicPlayer.shuffleMode> property.
  			 */
  def setShuffleMode(shuffleMode: scala.Double): scala.Unit = js.native
  /**
  			 * Skips to the beginning of the currently playing media item.
  			 */
  def skipToBeginning(): scala.Unit = js.native
  /**
  			 * Skips to the next media item in the queue.
  			 */
  def skipToNext(): scala.Unit = js.native
  /**
  			 * Skips to the previous media item in the queue.
  			 */
  def skipToPrevious(): scala.Unit = js.native
  /**
  			 * Stops playback of the current media queue.
  			 */
  def stop(): scala.Unit = js.native
  /**
  			 * Ends a seek operation and returns to the previous playback state.
  			 * See also: [seekForward](Titanium.Media.MusicPlayer.seekForward) and
  			 * [seekBackward](Titanium.Media.MusicPlayer.seekBackward).
  			 */
  def stopSeeking(): scala.Unit = js.native
}

