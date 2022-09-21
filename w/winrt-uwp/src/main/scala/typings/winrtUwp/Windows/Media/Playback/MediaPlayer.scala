package typings.winrtUwp.Windows.Media.Playback

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Media.Core.IMediaSource
import typings.winrtUwp.Windows.Media.Protection.MediaProtectionManager
import typings.winrtUwp.Windows.Media.SystemMediaTransportControls
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.bufferingended
import typings.winrtUwp.winrtUwpStrings.bufferingstarted
import typings.winrtUwp.winrtUwpStrings.currentstatechanged
import typings.winrtUwp.winrtUwpStrings.mediaended
import typings.winrtUwp.winrtUwpStrings.mediafailed
import typings.winrtUwp.winrtUwpStrings.mediaopened
import typings.winrtUwp.winrtUwpStrings.mediaplayerratechanged
import typings.winrtUwp.winrtUwpStrings.playbackmediamarkerreached
import typings.winrtUwp.winrtUwpStrings.seekcompleted
import typings.winrtUwp.winrtUwpStrings.volumechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to media playback functionality such as play, pause, fast-forward, rewind, and volume. */
@js.native
trait MediaPlayer extends StObject {
  
  /**
    * Adds an audio effect to the playback stream of the MediaPlayer .
    * @param activatableClassId The activatable class ID of the audio effect to add to the playback stream.
    * @param effectOptional A value indicating whether the effect is optional.
    * @param configuration A property set containing configuration settings for the specified audio effect.
    */
  def addAudioEffect(activatableClassId: String, effectOptional: Boolean, configuration: IPropertySet): Unit = js.native
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bufferingended(`type`: bufferingended, listener: TypedEventHandler[MediaPlayer, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bufferingstarted(`type`: bufferingstarted, listener: TypedEventHandler[MediaPlayer, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentstatechanged(`type`: currentstatechanged, listener: TypedEventHandler[MediaPlayer, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mediaended(`type`: mediaended, listener: TypedEventHandler[MediaPlayer, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mediafailed(`type`: mediafailed, listener: TypedEventHandler[MediaPlayer, MediaPlayerFailedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mediaopened(`type`: mediaopened, listener: TypedEventHandler[MediaPlayer, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mediaplayerratechanged(
    `type`: mediaplayerratechanged,
    listener: TypedEventHandler[MediaPlayer, MediaPlayerRateChangedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackmediamarkerreached(
    `type`: playbackmediamarkerreached,
    listener: TypedEventHandler[MediaPlayer, PlaybackMediaMarkerReachedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seekcompleted(`type`: seekcompleted, listener: TypedEventHandler[MediaPlayer, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechanged(`type`: volumechanged, listener: TypedEventHandler[MediaPlayer, Any]): Unit = js.native
  
  /** Gets or sets the type of audio that is currently being played. */
  var audioCategory: MediaPlayerAudioCategory = js.native
  
  /** Gets or sets a value that describes the primary usage of the device that is being used to play back audio. */
  var audioDeviceType: MediaPlayerAudioDeviceType = js.native
  
  /** Gets or sets a Boolean value indicating if playback automatically starts after the media is loaded. */
  var autoPlay: Boolean = js.native
  
  /** Gets the amount of buffering that is completed for the media content, expressed as a percentage. */
  var bufferingProgress: Double = js.native
  
  /** Gets a Boolean value indicating if the media can be paused. */
  var canPause: Boolean = js.native
  
  /** Gets a Boolean value indicating if the media supports seeking to a specific position. */
  var canSeek: Boolean = js.native
  
  /** Gets the current state of media playback. */
  var currentState: MediaPlayerState = js.native
  
  /** Gets or sets a Boolean value indicating if the media will playback in a repeating loop. */
  var isLoopingEnabled: Boolean = js.native
  
  /** Gets or sets a Boolean value indicating if the audio is muted. */
  var isMuted: Boolean = js.native
  
  /** Gets a Boolean value indicating if the content is protected by a digital rights management system. */
  var isProtected: Boolean = js.native
  
  /** Get the actual duration of the media without applying the PlaybackRate . */
  var naturalDuration: Double = js.native
  
  /** Occurs when buffering has finished. */
  def onbufferingended(ev: Any & WinRTEvent[MediaPlayer]): Unit = js.native
  /** Occurs when buffering has finished. */
  @JSName("onbufferingended")
  var onbufferingended_Original: TypedEventHandler[MediaPlayer, Any] = js.native
  
  /** Occurs when buffering has started. */
  def onbufferingstarted(ev: Any & WinRTEvent[MediaPlayer]): Unit = js.native
  /** Occurs when buffering has started. */
  @JSName("onbufferingstarted")
  var onbufferingstarted_Original: TypedEventHandler[MediaPlayer, Any] = js.native
  
  /** Occurs when the state of the media player has changed. */
  def oncurrentstatechanged(ev: Any & WinRTEvent[MediaPlayer]): Unit = js.native
  /** Occurs when the state of the media player has changed. */
  @JSName("oncurrentstatechanged")
  var oncurrentstatechanged_Original: TypedEventHandler[MediaPlayer, Any] = js.native
  
  /** Occurs when the media has finished playback. */
  def onmediaended(ev: Any & WinRTEvent[MediaPlayer]): Unit = js.native
  /** Occurs when the media has finished playback. */
  @JSName("onmediaended")
  var onmediaended_Original: TypedEventHandler[MediaPlayer, Any] = js.native
  
  /** Occurs when an error is encountered. */
  def onmediafailed(ev: MediaPlayerFailedEventArgs & WinRTEvent[MediaPlayer]): Unit = js.native
  /** Occurs when an error is encountered. */
  @JSName("onmediafailed")
  var onmediafailed_Original: TypedEventHandler[MediaPlayer, MediaPlayerFailedEventArgs] = js.native
  
  /** Occurs when the media is opened. */
  def onmediaopened(ev: Any & WinRTEvent[MediaPlayer]): Unit = js.native
  /** Occurs when the media is opened. */
  @JSName("onmediaopened")
  var onmediaopened_Original: TypedEventHandler[MediaPlayer, Any] = js.native
  
  /** Occurs when the media playback rate has changed. */
  def onmediaplayerratechanged(ev: MediaPlayerRateChangedEventArgs & WinRTEvent[MediaPlayer]): Unit = js.native
  /** Occurs when the media playback rate has changed. */
  @JSName("onmediaplayerratechanged")
  var onmediaplayerratechanged_Original: TypedEventHandler[MediaPlayer, MediaPlayerRateChangedEventArgs] = js.native
  
  /** Occurs when a media marker has been reached during playback. */
  def onplaybackmediamarkerreached(ev: PlaybackMediaMarkerReachedEventArgs & WinRTEvent[MediaPlayer]): Unit = js.native
  /** Occurs when a media marker has been reached during playback. */
  @JSName("onplaybackmediamarkerreached")
  var onplaybackmediamarkerreached_Original: TypedEventHandler[MediaPlayer, PlaybackMediaMarkerReachedEventArgs] = js.native
  
  /** Occurs when a seek operation has finished. */
  def onseekcompleted(ev: Any & WinRTEvent[MediaPlayer]): Unit = js.native
  /** Occurs when a seek operation has finished. */
  @JSName("onseekcompleted")
  var onseekcompleted_Original: TypedEventHandler[MediaPlayer, Any] = js.native
  
  /** Occurs when the volume of the audio has changed. */
  def onvolumechanged(ev: Any & WinRTEvent[MediaPlayer]): Unit = js.native
  /** Occurs when the volume of the audio has changed. */
  @JSName("onvolumechanged")
  var onvolumechanged_Original: TypedEventHandler[MediaPlayer, Any] = js.native
  
  /** Pauses media playback. */
  def pause(): Unit = js.native
  
  /** Starts media playback. */
  def play(): Unit = js.native
  
  /** Gets the collection of timeline markers for the media. */
  var playbackMediaMarkers: PlaybackMediaMarkerSequence = js.native
  
  /** Gets or sets the playback rate, expressed as a percentage. */
  var playbackRate: Double = js.native
  
  /** Gets or sets the playback position within the media. */
  var position: Double = js.native
  
  /** Gets or sets the content protection manager for the media. */
  var protectionManager: MediaProtectionManager = js.native
  
  /** Removes all effects from the playback stream of the MediaPlayer . */
  def removeAllEffects(): Unit = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bufferingended(`type`: bufferingended, listener: TypedEventHandler[MediaPlayer, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bufferingstarted(`type`: bufferingstarted, listener: TypedEventHandler[MediaPlayer, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_currentstatechanged(`type`: currentstatechanged, listener: TypedEventHandler[MediaPlayer, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mediaended(`type`: mediaended, listener: TypedEventHandler[MediaPlayer, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mediafailed(`type`: mediafailed, listener: TypedEventHandler[MediaPlayer, MediaPlayerFailedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mediaopened(`type`: mediaopened, listener: TypedEventHandler[MediaPlayer, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mediaplayerratechanged(
    `type`: mediaplayerratechanged,
    listener: TypedEventHandler[MediaPlayer, MediaPlayerRateChangedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playbackmediamarkerreached(
    `type`: playbackmediamarkerreached,
    listener: TypedEventHandler[MediaPlayer, PlaybackMediaMarkerReachedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seekcompleted(`type`: seekcompleted, listener: TypedEventHandler[MediaPlayer, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechanged(`type`: volumechanged, listener: TypedEventHandler[MediaPlayer, Any]): Unit = js.native
  
  /**
    * Set the media source to a file.
    * @param file The media source file.
    */
  def setFileSource(file: IStorageFile): Unit = js.native
  
  /**
    * Sets the media source for playback.
    * @param source The media source for playback.
    */
  def setMediaSource(source: IMediaSource): Unit = js.native
  
  /**
    * Sets the media source to a stream.
    * @param stream The media source stream.
    */
  def setStreamSource(stream: IRandomAccessStream): Unit = js.native
  
  /**
    * Sets the path to the media.
    * @param value The path to the media.
    */
  def setUriSource(value: Uri): Unit = js.native
  
  /** Sets the playback source of the media player. */
  var source: IMediaPlaybackSource = js.native
  
  /** Gets an instance of the SystemMediaTransportControls class to enable user control of playback of the MediaPlayer and to allow the app to show information about the currently playing content in the system UI. */
  var systemMediaTransportControls: SystemMediaTransportControls = js.native
  
  /** Get or sets the audio volume for media playback. */
  var volume: Double = js.native
}
