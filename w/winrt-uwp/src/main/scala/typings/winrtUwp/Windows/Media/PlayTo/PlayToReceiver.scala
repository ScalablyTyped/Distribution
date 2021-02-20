package typings.winrtUwp.Windows.Media.PlayTo

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.currenttimechangerequested
import typings.winrtUwp.winrtUwpStrings.mutechangerequested
import typings.winrtUwp.winrtUwpStrings.pauserequested
import typings.winrtUwp.winrtUwpStrings.playbackratechangerequested
import typings.winrtUwp.winrtUwpStrings.playrequested
import typings.winrtUwp.winrtUwpStrings.sourcechangerequested
import typings.winrtUwp.winrtUwpStrings.stoprequested
import typings.winrtUwp.winrtUwpStrings.timeupdaterequested
import typings.winrtUwp.winrtUwpStrings.volumechangerequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Play To target. */
@js.native
trait PlayToReceiver extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currenttimechangerequested(
    `type`: currenttimechangerequested,
    listener: TypedEventHandler[PlayToReceiver, CurrentTimeChangeRequestedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mutechangerequested(
    `type`: mutechangerequested,
    listener: TypedEventHandler[PlayToReceiver, MuteChangeRequestedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pauserequested(`type`: pauserequested, listener: TypedEventHandler[PlayToReceiver, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackratechangerequested(`type`: playbackratechangerequested, listener: TypedEventHandler[PlayToReceiver, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playrequested(`type`: playrequested, listener: TypedEventHandler[PlayToReceiver, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourcechangerequested(
    `type`: sourcechangerequested,
    listener: TypedEventHandler[PlayToReceiver, SourceChangeRequestedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stoprequested(`type`: stoprequested, listener: TypedEventHandler[PlayToReceiver, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdaterequested(`type`: timeupdaterequested, listener: TypedEventHandler[PlayToReceiver, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechangerequested(
    `type`: volumechangerequested,
    listener: TypedEventHandler[PlayToReceiver, VolumeChangeRequestedEventArgs]
  ): Unit = js.native
  
  /** Gets or sets the display name of the Play To target. */
  var friendlyName: String = js.native
  
  /**
    * Notifies the Play To receiver that the duration of the audio or video playback has changed.
    * @param duration The new duration of the audio or video media.
    */
  def notifyDurationChange(duration: Double): Unit = js.native
  
  /** Notifies the Play To receiver that the audio or video playback has ended. */
  def notifyEnded(): Unit = js.native
  
  /** Notifies the Play To receiver that an error has occurred in displaying or playing the media. */
  def notifyError(): Unit = js.native
  
  /** Notifies the Play To receiver that metadata for the media has finished loading. */
  def notifyLoadedMetadata(): Unit = js.native
  
  /** Notifies the Play To receiver that the audio or video playback has been paused. */
  def notifyPaused(): Unit = js.native
  
  /** Notifies the Play To receiver that the audio or video playback has started. */
  def notifyPlaying(): Unit = js.native
  
  /**
    * Notifies the Play To receiver that the rate of the audio or video playback has changed.
    * @param rate The new value of the playback rate.
    */
  def notifyRateChange(rate: Double): Unit = js.native
  
  /** Notifies the Play To receiver that the audio or video playback element has started at a new playback location. */
  def notifySeeked(): Unit = js.native
  
  /** Notifies the Play To receiver that the audio or video playback element is seeking a new playback location. */
  def notifySeeking(): Unit = js.native
  
  /** Notifies the Play To receiver that the audio or video playback has stopped. */
  def notifyStopped(): Unit = js.native
  
  /**
    * Notifies the Play To receiver that the time location of the audio or video playback has changed.
    * @param currentTime The new time location of the playback.
    */
  def notifyTimeUpdate(currentTime: Double): Unit = js.native
  
  /**
    * Notifies the Play To receiver that the volume of the audio or video playback has changed.
    * @param volume The new value for the volume.
    * @param mute True if the volume was muted; otherwise false.
    */
  def notifyVolumeChange(volume: Double, mute: Boolean): Unit = js.native
  
  /** Occurs when the time location of the playback has changed. */
  def oncurrenttimechangerequested(ev: CurrentTimeChangeRequestedEventArgs with WinRTEvent[PlayToReceiver]): Unit = js.native
  /** Occurs when the time location of the playback has changed. */
  @JSName("oncurrenttimechangerequested")
  var oncurrenttimechangerequested_Original: TypedEventHandler[PlayToReceiver, CurrentTimeChangeRequestedEventArgs] = js.native
  
  /** Occurs when the audio has been muted or unmuted. */
  def onmutechangerequested(ev: MuteChangeRequestedEventArgs with WinRTEvent[PlayToReceiver]): Unit = js.native
  /** Occurs when the audio has been muted or unmuted. */
  @JSName("onmutechangerequested")
  var onmutechangerequested_Original: TypedEventHandler[PlayToReceiver, MuteChangeRequestedEventArgs] = js.native
  
  /** Occurs when audio or video playback has been paused. */
  def onpauserequested(ev: js.Any with WinRTEvent[PlayToReceiver]): Unit = js.native
  /** Occurs when audio or video playback has been paused. */
  @JSName("onpauserequested")
  var onpauserequested_Original: TypedEventHandler[PlayToReceiver, _] = js.native
  
  /** Occurs when the rate of audio or video playback has changed. */
  def onplaybackratechangerequested(ev: js.Any with WinRTEvent[PlayToReceiver]): Unit = js.native
  /** Occurs when the rate of audio or video playback has changed. */
  @JSName("onplaybackratechangerequested")
  var onplaybackratechangerequested_Original: TypedEventHandler[PlayToReceiver, _] = js.native
  
  /** Occurs when audio or video playback starts. */
  def onplayrequested(ev: js.Any with WinRTEvent[PlayToReceiver]): Unit = js.native
  /** Occurs when audio or video playback starts. */
  @JSName("onplayrequested")
  var onplayrequested_Original: TypedEventHandler[PlayToReceiver, _] = js.native
  
  /** Occurs when the source media for the Play To receiver have changed. */
  def onsourcechangerequested(ev: SourceChangeRequestedEventArgs with WinRTEvent[PlayToReceiver]): Unit = js.native
  /** Occurs when the source media for the Play To receiver have changed. */
  @JSName("onsourcechangerequested")
  var onsourcechangerequested_Original: TypedEventHandler[PlayToReceiver, SourceChangeRequestedEventArgs] = js.native
  
  /** Occurs when a request has been made for the Play To receiver to stop playing the streamed media. */
  def onstoprequested(ev: js.Any with WinRTEvent[PlayToReceiver]): Unit = js.native
  /** Occurs when a request has been made for the Play To receiver to stop playing the streamed media. */
  @JSName("onstoprequested")
  var onstoprequested_Original: TypedEventHandler[PlayToReceiver, _] = js.native
  
  /** Occurs when the current playback position has changed. */
  def ontimeupdaterequested(ev: js.Any with WinRTEvent[PlayToReceiver]): Unit = js.native
  /** Occurs when the current playback position has changed. */
  @JSName("ontimeupdaterequested")
  var ontimeupdaterequested_Original: TypedEventHandler[PlayToReceiver, _] = js.native
  
  /** Occurs when the volume for the source audio or video has changed. */
  def onvolumechangerequested(ev: VolumeChangeRequestedEventArgs with WinRTEvent[PlayToReceiver]): Unit = js.native
  /** Occurs when the volume for the source audio or video has changed. */
  @JSName("onvolumechangerequested")
  var onvolumechangerequested_Original: TypedEventHandler[PlayToReceiver, VolumeChangeRequestedEventArgs] = js.native
  
  /** Gets a set of custom properties for the Play To receiver. */
  var properties: IPropertySet = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_currenttimechangerequested(
    `type`: currenttimechangerequested,
    listener: TypedEventHandler[PlayToReceiver, CurrentTimeChangeRequestedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mutechangerequested(
    `type`: mutechangerequested,
    listener: TypedEventHandler[PlayToReceiver, MuteChangeRequestedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pauserequested(`type`: pauserequested, listener: TypedEventHandler[PlayToReceiver, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playbackratechangerequested(`type`: playbackratechangerequested, listener: TypedEventHandler[PlayToReceiver, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playrequested(`type`: playrequested, listener: TypedEventHandler[PlayToReceiver, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourcechangerequested(
    `type`: sourcechangerequested,
    listener: TypedEventHandler[PlayToReceiver, SourceChangeRequestedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stoprequested(`type`: stoprequested, listener: TypedEventHandler[PlayToReceiver, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdaterequested(`type`: timeupdaterequested, listener: TypedEventHandler[PlayToReceiver, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechangerequested(
    `type`: volumechangerequested,
    listener: TypedEventHandler[PlayToReceiver, VolumeChangeRequestedEventArgs]
  ): Unit = js.native
  
  /**
    * Start receiving Play To commands.
    * @return An asynchronous handler that's called when the start operation is complete.
    */
  def startAsync(): IPromiseWithIAsyncAction = js.native
  
  /**
    * Stop receiving Play To commands.
    * @return An asynchronous handler that's called when the stop operation is complete.
    */
  def stopAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Gets or sets a value that indicates whether the Play To target supports audio. */
  var supportsAudio: Boolean = js.native
  
  /** Gets or sets a value that indicates whether the Play To target supports images. */
  var supportsImage: Boolean = js.native
  
  /** Gets or sets a value that indicates whether the Play To target supports video. */
  var supportsVideo: Boolean = js.native
}
