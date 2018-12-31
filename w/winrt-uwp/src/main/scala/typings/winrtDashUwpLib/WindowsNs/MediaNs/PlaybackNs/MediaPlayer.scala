package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to media playback functionality such as play, pause, fast-forward, rewind, and volume. */
@JSGlobal("Windows.Media.Playback.MediaPlayer")
@js.native
abstract class MediaPlayer () extends js.Object {
  /** Gets or sets the type of audio that is currently being played. */
  var audioCategory: MediaPlayerAudioCategory = js.native
  /** Gets or sets a value that describes the primary usage of the device that is being used to play back audio. */
  var audioDeviceType: MediaPlayerAudioDeviceType = js.native
  /** Gets or sets a Boolean value indicating if playback automatically starts after the media is loaded. */
  var autoPlay: scala.Boolean = js.native
  /** Gets the amount of buffering that is completed for the media content, expressed as a percentage. */
  var bufferingProgress: scala.Double = js.native
  /** Gets a Boolean value indicating if the media can be paused. */
  var canPause: scala.Boolean = js.native
  /** Gets a Boolean value indicating if the media supports seeking to a specific position. */
  var canSeek: scala.Boolean = js.native
  /** Gets the current state of media playback. */
  var currentState: MediaPlayerState = js.native
  /** Gets or sets a Boolean value indicating if the media will playback in a repeating loop. */
  var isLoopingEnabled: scala.Boolean = js.native
  /** Gets or sets a Boolean value indicating if the audio is muted. */
  var isMuted: scala.Boolean = js.native
  /** Gets a Boolean value indicating if the content is protected by a digital rights management system. */
  var isProtected: scala.Boolean = js.native
  /** Get the actual duration of the media without applying the PlaybackRate . */
  var naturalDuration: scala.Double = js.native
  /** Occurs when buffering has finished. */
  @JSName("onbufferingended")
  var onbufferingended_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _] = js.native
  /** Occurs when buffering has started. */
  @JSName("onbufferingstarted")
  var onbufferingstarted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _] = js.native
  /** Occurs when the state of the media player has changed. */
  @JSName("oncurrentstatechanged")
  var oncurrentstatechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _] = js.native
  /** Occurs when the media has finished playback. */
  @JSName("onmediaended")
  var onmediaended_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _] = js.native
  /** Occurs when an error is encountered. */
  @JSName("onmediafailed")
  var onmediafailed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, MediaPlayerFailedEventArgs] = js.native
  /** Occurs when the media is opened. */
  @JSName("onmediaopened")
  var onmediaopened_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _] = js.native
  /** Occurs when the media playback rate has changed. */
  @JSName("onmediaplayerratechanged")
  var onmediaplayerratechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, MediaPlayerRateChangedEventArgs] = js.native
  /** Occurs when a media marker has been reached during playback. */
  @JSName("onplaybackmediamarkerreached")
  var onplaybackmediamarkerreached_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, PlaybackMediaMarkerReachedEventArgs] = js.native
  /** Occurs when a seek operation has finished. */
  @JSName("onseekcompleted")
  var onseekcompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _] = js.native
  /** Occurs when the volume of the audio has changed. */
  @JSName("onvolumechanged")
  var onvolumechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _] = js.native
  /** Gets the collection of timeline markers for the media. */
  var playbackMediaMarkers: PlaybackMediaMarkerSequence = js.native
  /** Gets or sets the playback rate, expressed as a percentage. */
  var playbackRate: scala.Double = js.native
  /** Gets or sets the playback position within the media. */
  var position: scala.Double = js.native
  /** Gets or sets the content protection manager for the media. */
  var protectionManager: winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.MediaProtectionManager = js.native
  /** Sets the playback source of the media player. */
  var source: IMediaPlaybackSource = js.native
  /** Gets an instance of the SystemMediaTransportControls class to enable user control of playback of the MediaPlayer and to allow the app to show information about the currently playing content in the system UI. */
  var systemMediaTransportControls: winrtDashUwpLib.WindowsNs.MediaNs.SystemMediaTransportControls = js.native
  /** Get or sets the audio volume for media playback. */
  var volume: scala.Double = js.native
  /**
    * Adds an audio effect to the playback stream of the MediaPlayer .
    * @param activatableClassId The activatable class ID of the audio effect to add to the playback stream.
    * @param effectOptional A value indicating whether the effect is optional.
    * @param configuration A property set containing configuration settings for the specified audio effect.
    */
  def addAudioEffect(
    activatableClassId: java.lang.String,
    effectOptional: scala.Boolean,
    configuration: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bufferingended(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.bufferingended,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bufferingstarted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.bufferingstarted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentstatechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.currentstatechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mediaended(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mediaended,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mediafailed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mediafailed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, MediaPlayerFailedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mediaopened(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mediaopened,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mediaplayerratechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mediaplayerratechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, MediaPlayerRateChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackmediamarkerreached(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.playbackmediamarkerreached,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, PlaybackMediaMarkerReachedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seekcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.seekcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.volumechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _]
  ): scala.Unit = js.native
  /** Occurs when buffering has finished. */
  def onbufferingended(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaPlayer]): scala.Unit = js.native
  /** Occurs when buffering has started. */
  def onbufferingstarted(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaPlayer]): scala.Unit = js.native
  /** Occurs when the state of the media player has changed. */
  def oncurrentstatechanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaPlayer]): scala.Unit = js.native
  /** Occurs when the media has finished playback. */
  def onmediaended(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaPlayer]): scala.Unit = js.native
  /** Occurs when an error is encountered. */
  def onmediafailed(ev: MediaPlayerFailedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaPlayer]): scala.Unit = js.native
  /** Occurs when the media is opened. */
  def onmediaopened(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaPlayer]): scala.Unit = js.native
  /** Occurs when the media playback rate has changed. */
  def onmediaplayerratechanged(ev: MediaPlayerRateChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaPlayer]): scala.Unit = js.native
  /** Occurs when a media marker has been reached during playback. */
  def onplaybackmediamarkerreached(ev: PlaybackMediaMarkerReachedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaPlayer]): scala.Unit = js.native
  /** Occurs when a seek operation has finished. */
  def onseekcompleted(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaPlayer]): scala.Unit = js.native
  /** Occurs when the volume of the audio has changed. */
  def onvolumechanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaPlayer]): scala.Unit = js.native
  /** Pauses media playback. */
  def pause(): scala.Unit = js.native
  /** Starts media playback. */
  def play(): scala.Unit = js.native
  /** Removes all effects from the playback stream of the MediaPlayer . */
  def removeAllEffects(): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bufferingended(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.bufferingended,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bufferingstarted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.bufferingstarted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_currentstatechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.currentstatechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mediaended(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mediaended,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mediafailed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mediafailed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, MediaPlayerFailedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mediaopened(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mediaopened,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mediaplayerratechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mediaplayerratechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, MediaPlayerRateChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playbackmediamarkerreached(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.playbackmediamarkerreached,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, PlaybackMediaMarkerReachedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seekcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.seekcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.volumechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlayer, _]
  ): scala.Unit = js.native
  /**
    * Set the media source to a file.
    * @param file The media source file.
    */
  def setFileSource(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): scala.Unit = js.native
  /**
    * Sets the media source for playback.
    * @param source The media source for playback.
    */
  def setMediaSource(source: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.IMediaSource): scala.Unit = js.native
  /**
    * Sets the media source to a stream.
    * @param stream The media source stream.
    */
  def setStreamSource(stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): scala.Unit = js.native
  /**
    * Sets the path to the media.
    * @param value The path to the media.
    */
  def setUriSource(value: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): scala.Unit = js.native
}

