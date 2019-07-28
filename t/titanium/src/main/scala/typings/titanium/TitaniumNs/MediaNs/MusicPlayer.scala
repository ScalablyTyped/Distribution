package typings.titanium.TitaniumNs.MediaNs

import typings.titanium.TitaniumNs.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * This object represents a music controller.
		 */
@js.native
trait MusicPlayer extends Proxy {
  /**
  			 * Current point in song playback, in seconds.
  			 */
  var currentPlaybackTime: Double = js.native
  /**
  			 * An `Item` object representing the currently playing media item.
  			 */
  val nowPlaying: Item = js.native
  /**
  			 * Playback state.
  			 */
  val playbackState: Double = js.native
  /**
  			 * Repeat setting.
  			 */
  var repeatMode: Double = js.native
  /**
  			 * Shuffle setting.
  			 */
  var shuffleMode: Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.MusicPlayer.currentPlaybackTime> property.
  			 */
  def getCurrentPlaybackTime(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.MusicPlayer.nowPlaying> property.
  			 */
  def getNowPlaying(): Item = js.native
  /**
  			 * Gets the value of the <Titanium.Media.MusicPlayer.playbackState> property.
  			 */
  def getPlaybackState(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.MusicPlayer.repeatMode> property.
  			 */
  def getRepeatMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.MusicPlayer.shuffleMode> property.
  			 */
  def getShuffleMode(): Double = js.native
  /**
  			 * Pauses playback of the current media item.
  			 */
  def pause(): Unit = js.native
  /**
  			 * Begins playback of the current media item.
  			 */
  def play(): Unit = js.native
  /**
  			 * Begins seeking backward in the currently playing media.
  			 */
  def seekBackward(): Unit = js.native
  /**
  			 * Begins seeking forward in the currently playing media item.
  			 */
  def seekForward(): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.MusicPlayer.currentPlaybackTime> property.
  			 */
  def setCurrentPlaybackTime(currentPlaybackTime: Double): Unit = js.native
  /**
  			 * Sets the media queue.
  			 */
  def setQueue(queue: String): Unit = js.native
  /**
  			 * Sets the media queue.
  			 */
  def setQueue(queue: js.Array[Item]): Unit = js.native
  /**
  			 * Sets the media queue.
  			 */
  def setQueue(queue: Item): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.MusicPlayer.repeatMode> property.
  			 */
  def setRepeatMode(repeatMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.MusicPlayer.shuffleMode> property.
  			 */
  def setShuffleMode(shuffleMode: Double): Unit = js.native
  /**
  			 * Skips to the beginning of the currently playing media item.
  			 */
  def skipToBeginning(): Unit = js.native
  /**
  			 * Skips to the next media item in the queue.
  			 */
  def skipToNext(): Unit = js.native
  /**
  			 * Skips to the previous media item in the queue.
  			 */
  def skipToPrevious(): Unit = js.native
  /**
  			 * Stops playback of the current media queue.
  			 */
  def stop(): Unit = js.native
  /**
  			 * Ends a seek operation and returns to the previous playback state.
  			 * See also: [seekForward](Titanium.Media.MusicPlayer.seekForward) and
  			 * [seekBackward](Titanium.Media.MusicPlayer.seekBackward).
  			 */
  def stopSeeking(): Unit = js.native
}

