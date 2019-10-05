package typings.winrtDashUwp.Windows.Media.Playback

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorChangedEventArgs
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.Media.Core.MediaSource
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.audiotrackschanged
import typings.winrtDashUwp.winrtDashUwpStrings.timedmetadatatrackschanged
import typings.winrtDashUwp.winrtDashUwpStrings.videotrackschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a media item that can be played back. This class acts as a wrapper around a MediaSource that exposes the audio tracks, video tracks, and timed metadata tracks included in the media source. */
@JSGlobal("Windows.Media.Playback.MediaPlaybackItem")
@js.native
class MediaPlaybackItem protected () extends js.Object {
   /* unmapped type */ /**
    * Initializes a new instance of the MediaPlaybackItem class.
    * @param source The media source from which the MediaPlaybackItem is created.
    */
  def this(source: MediaSource) = this()
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

/* static members */
@JSGlobal("Windows.Media.Playback.MediaPlaybackItem")
@js.native
object MediaPlaybackItem extends js.Object {
  var findFromMediaSource: js.Any = js.native
}

