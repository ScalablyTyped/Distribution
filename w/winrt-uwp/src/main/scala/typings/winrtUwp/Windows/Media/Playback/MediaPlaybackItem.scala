package typings.winrtUwp.Windows.Media.Playback

import typings.winrtUwp.Windows.Foundation.Collections.IVectorChangedEventArgs
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Media.Core.MediaSource
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.audiotrackschanged
import typings.winrtUwp.winrtUwpStrings.timedmetadatatrackschanged
import typings.winrtUwp.winrtUwpStrings.videotrackschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a media item that can be played back. This class acts as a wrapper around a MediaSource that exposes the audio tracks, video tracks, and timed metadata tracks included in the media source. */
@js.native
trait MediaPlaybackItem extends js.Object {
  /** Gets a read-only list of audio tracks in the MediaSource associated with the MediaPlaybackItem . */
  var audioTracks: MediaPlaybackAudioTrackList = js.native
  /** Occurs when the list of audio tracks in the MediaSource associated with the MediaPlaybackItem changes. */
  @JSName("onaudiotrackschanged")
  var onaudiotrackschanged_Original: TypedEventHandler[MediaPlaybackItem, IVectorChangedEventArgs] = js.native
  /** Occurs when the list of timed metadata tracks in the MediaSource associated with the MediaPlaybackItem changes. */
  @JSName("ontimedmetadatatrackschanged")
  var ontimedmetadatatrackschanged_Original: TypedEventHandler[MediaPlaybackItem, IVectorChangedEventArgs] = js.native
  /** Occurs when the list of video tracks in the MediaSource associated with the MediaPlaybackItem changes. */
  @JSName("onvideotrackschanged")
  var onvideotrackschanged_Original: TypedEventHandler[MediaPlaybackItem, IVectorChangedEventArgs] = js.native
  /** Gets the MediaSource object associated with the MediaPlaybackItem . */
  var source: MediaSource = js.native
  /** Gets a read-only list of timed metadata tracks in the MediaSource associated with the MediaPlaybackItem . */
  var timedMetadataTracks: MediaPlaybackTimedMetadataTrackList = js.native
  /** Gets a read-only list of video tracks in the MediaSource associated with the MediaPlaybackItem . */
  var videoTracks: MediaPlaybackVideoTrackList = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audiotrackschanged(
    `type`: audiotrackschanged,
    listener: TypedEventHandler[MediaPlaybackItem, IVectorChangedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timedmetadatatrackschanged(
    `type`: timedmetadatatrackschanged,
    listener: TypedEventHandler[MediaPlaybackItem, IVectorChangedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_videotrackschanged(
    `type`: videotrackschanged,
    listener: TypedEventHandler[MediaPlaybackItem, IVectorChangedEventArgs]
  ): Unit = js.native
  /** Occurs when the list of audio tracks in the MediaSource associated with the MediaPlaybackItem changes. */
  def onaudiotrackschanged(ev: IVectorChangedEventArgs with WinRTEvent[MediaPlaybackItem]): Unit = js.native
  /** Occurs when the list of timed metadata tracks in the MediaSource associated with the MediaPlaybackItem changes. */
  def ontimedmetadatatrackschanged(ev: IVectorChangedEventArgs with WinRTEvent[MediaPlaybackItem]): Unit = js.native
  /** Occurs when the list of video tracks in the MediaSource associated with the MediaPlaybackItem changes. */
  def onvideotrackschanged(ev: IVectorChangedEventArgs with WinRTEvent[MediaPlaybackItem]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audiotrackschanged(
    `type`: audiotrackschanged,
    listener: TypedEventHandler[MediaPlaybackItem, IVectorChangedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timedmetadatatrackschanged(
    `type`: timedmetadatatrackschanged,
    listener: TypedEventHandler[MediaPlaybackItem, IVectorChangedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_videotrackschanged(
    `type`: videotrackschanged,
    listener: TypedEventHandler[MediaPlaybackItem, IVectorChangedEventArgs]
  ): Unit = js.native
}

