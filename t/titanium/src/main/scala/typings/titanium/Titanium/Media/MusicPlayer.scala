package typings.titanium.Titanium.Media

import typings.titanium.Titanium.Proxy
import typings.titanium.titaniumStrings.playingchange
import typings.titanium.titaniumStrings.statechange
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
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_playingchange(
    name: playingchange,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ MusicPlayerPlayingchangeEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    name: statechange,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ MusicPlayerStatechangeEvent, Unit]
  ): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_playingchange(name: playingchange): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_playingchange(name: playingchange, event: MusicPlayerPlayingchangeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_statechange(name: statechange): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_statechange(name: statechange, event: MusicPlayerStatechangeEvent): Unit = js.native
  /**
    * Gets the value of the <Titanium.Media.MusicPlayer.currentPlaybackTime> property.
    * @deprecated Access <Titanium.Media.MusicPlayer.currentPlaybackTime> instead.
    */
  def getCurrentPlaybackTime(): Double = js.native
  /**
    * Gets the value of the <Titanium.Media.MusicPlayer.nowPlaying> property.
    * @deprecated Access <Titanium.Media.MusicPlayer.nowPlaying> instead.
    */
  def getNowPlaying(): Item = js.native
  /**
    * Gets the value of the <Titanium.Media.MusicPlayer.playbackState> property.
    * @deprecated Access <Titanium.Media.MusicPlayer.playbackState> instead.
    */
  def getPlaybackState(): Double = js.native
  /**
    * Gets the value of the <Titanium.Media.MusicPlayer.repeatMode> property.
    * @deprecated Access <Titanium.Media.MusicPlayer.repeatMode> instead.
    */
  def getRepeatMode(): Double = js.native
  /**
    * Gets the value of the <Titanium.Media.MusicPlayer.shuffleMode> property.
    * @deprecated Access <Titanium.Media.MusicPlayer.shuffleMode> instead.
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
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_playingchange(
    name: playingchange,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ MusicPlayerPlayingchangeEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    name: statechange,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ MusicPlayerStatechangeEvent, Unit]
  ): Unit = js.native
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
    * @deprecated Set the value using <Titanium.Media.MusicPlayer.currentPlaybackTime> instead.
    */
  def setCurrentPlaybackTime(currentPlaybackTime: Double): Unit = js.native
  def setQueue(queue: String): Unit = js.native
  def setQueue(queue: js.Array[Item]): Unit = js.native
  /**
    * Sets the media queue.
    */
  def setQueue(queue: Item): Unit = js.native
  /**
    * Sets the value of the <Titanium.Media.MusicPlayer.repeatMode> property.
    * @deprecated Set the value using <Titanium.Media.MusicPlayer.repeatMode> instead.
    */
  def setRepeatMode(repeatMode: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.Media.MusicPlayer.shuffleMode> property.
    * @deprecated Set the value using <Titanium.Media.MusicPlayer.shuffleMode> instead.
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

