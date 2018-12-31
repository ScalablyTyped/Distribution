package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Play To target. */
@JSGlobal("Windows.Media.PlayTo.PlayToReceiver")
@js.native
/** Creates a new instance of a Play To receiver. */
class PlayToReceiver () extends js.Object {
  /** Gets or sets the display name of the Play To target. */
  var friendlyName: java.lang.String = js.native
  /** Occurs when the time location of the playback has changed. */
  @JSName("oncurrenttimechangerequested")
  var oncurrenttimechangerequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, CurrentTimeChangeRequestedEventArgs] = js.native
  /** Occurs when the audio has been muted or unmuted. */
  @JSName("onmutechangerequested")
  var onmutechangerequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, MuteChangeRequestedEventArgs] = js.native
  /** Occurs when audio or video playback has been paused. */
  @JSName("onpauserequested")
  var onpauserequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, _] = js.native
  /** Occurs when the rate of audio or video playback has changed. */
  @JSName("onplaybackratechangerequested")
  var onplaybackratechangerequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, _] = js.native
  /** Occurs when audio or video playback starts. */
  @JSName("onplayrequested")
  var onplayrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, _] = js.native
  /** Occurs when the source media for the Play To receiver have changed. */
  @JSName("onsourcechangerequested")
  var onsourcechangerequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, SourceChangeRequestedEventArgs] = js.native
  /** Occurs when a request has been made for the Play To receiver to stop playing the streamed media. */
  @JSName("onstoprequested")
  var onstoprequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, _] = js.native
  /** Occurs when the current playback position has changed. */
  @JSName("ontimeupdaterequested")
  var ontimeupdaterequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, _] = js.native
  /** Occurs when the volume for the source audio or video has changed. */
  @JSName("onvolumechangerequested")
  var onvolumechangerequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, VolumeChangeRequestedEventArgs] = js.native
  /** Gets a set of custom properties for the Play To receiver. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet = js.native
  /** Gets or sets a value that indicates whether the Play To target supports audio. */
  var supportsAudio: scala.Boolean = js.native
  /** Gets or sets a value that indicates whether the Play To target supports images. */
  var supportsImage: scala.Boolean = js.native
  /** Gets or sets a value that indicates whether the Play To target supports video. */
  var supportsVideo: scala.Boolean = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currenttimechangerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.currenttimechangerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, CurrentTimeChangeRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mutechangerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mutechangerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, MuteChangeRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pauserequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.pauserequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackratechangerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.playbackratechangerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.playrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourcechangerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sourcechangerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, SourceChangeRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stoprequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stoprequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdaterequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.timeupdaterequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechangerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.volumechangerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, VolumeChangeRequestedEventArgs]
  ): scala.Unit = js.native
  /**
    * Notifies the Play To receiver that the duration of the audio or video playback has changed.
    * @param duration The new duration of the audio or video media.
    */
  def notifyDurationChange(duration: scala.Double): scala.Unit = js.native
  /** Notifies the Play To receiver that the audio or video playback has ended. */
  def notifyEnded(): scala.Unit = js.native
  /** Notifies the Play To receiver that an error has occurred in displaying or playing the media. */
  def notifyError(): scala.Unit = js.native
  /** Notifies the Play To receiver that metadata for the media has finished loading. */
  def notifyLoadedMetadata(): scala.Unit = js.native
  /** Notifies the Play To receiver that the audio or video playback has been paused. */
  def notifyPaused(): scala.Unit = js.native
  /** Notifies the Play To receiver that the audio or video playback has started. */
  def notifyPlaying(): scala.Unit = js.native
  /**
    * Notifies the Play To receiver that the rate of the audio or video playback has changed.
    * @param rate The new value of the playback rate.
    */
  def notifyRateChange(rate: scala.Double): scala.Unit = js.native
  /** Notifies the Play To receiver that the audio or video playback element has started at a new playback location. */
  def notifySeeked(): scala.Unit = js.native
  /** Notifies the Play To receiver that the audio or video playback element is seeking a new playback location. */
  def notifySeeking(): scala.Unit = js.native
  /** Notifies the Play To receiver that the audio or video playback has stopped. */
  def notifyStopped(): scala.Unit = js.native
  /**
    * Notifies the Play To receiver that the time location of the audio or video playback has changed.
    * @param currentTime The new time location of the playback.
    */
  def notifyTimeUpdate(currentTime: scala.Double): scala.Unit = js.native
  /**
    * Notifies the Play To receiver that the volume of the audio or video playback has changed.
    * @param volume The new value for the volume.
    * @param mute True if the volume was muted; otherwise false.
    */
  def notifyVolumeChange(volume: scala.Double, mute: scala.Boolean): scala.Unit = js.native
  /** Occurs when the time location of the playback has changed. */
  def oncurrenttimechangerequested(ev: CurrentTimeChangeRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PlayToReceiver]): scala.Unit = js.native
  /** Occurs when the audio has been muted or unmuted. */
  def onmutechangerequested(ev: MuteChangeRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PlayToReceiver]): scala.Unit = js.native
  /** Occurs when audio or video playback has been paused. */
  def onpauserequested(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PlayToReceiver]): scala.Unit = js.native
  /** Occurs when the rate of audio or video playback has changed. */
  def onplaybackratechangerequested(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PlayToReceiver]): scala.Unit = js.native
  /** Occurs when audio or video playback starts. */
  def onplayrequested(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PlayToReceiver]): scala.Unit = js.native
  /** Occurs when the source media for the Play To receiver have changed. */
  def onsourcechangerequested(ev: SourceChangeRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PlayToReceiver]): scala.Unit = js.native
  /** Occurs when a request has been made for the Play To receiver to stop playing the streamed media. */
  def onstoprequested(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PlayToReceiver]): scala.Unit = js.native
  /** Occurs when the current playback position has changed. */
  def ontimeupdaterequested(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PlayToReceiver]): scala.Unit = js.native
  /** Occurs when the volume for the source audio or video has changed. */
  def onvolumechangerequested(ev: VolumeChangeRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PlayToReceiver]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_currenttimechangerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.currenttimechangerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, CurrentTimeChangeRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mutechangerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mutechangerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, MuteChangeRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pauserequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.pauserequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playbackratechangerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.playbackratechangerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.playrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourcechangerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sourcechangerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, SourceChangeRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stoprequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stoprequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdaterequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.timeupdaterequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechangerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.volumechangerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToReceiver, VolumeChangeRequestedEventArgs]
  ): scala.Unit = js.native
  /**
    * Start receiving Play To commands.
    * @return An asynchronous handler that's called when the start operation is complete.
    */
  def startAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Stop receiving Play To commands.
    * @return An asynchronous handler that's called when the stop operation is complete.
    */
  def stopAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

