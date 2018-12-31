package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs

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
  def this(source: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSource) = this()
  /** Gets a read-only list of audio tracks in the MediaSource associated with the MediaPlaybackItem . */
  var audioTracks: MediaPlaybackAudioTrackList = js.native
  /** Occurs when the list of audio tracks in the MediaSource associated with the MediaPlaybackItem changes. */
  @JSName("onaudiotrackschanged")
  var onaudiotrackschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
    MediaPlaybackItem, 
    winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorChangedEventArgs
  ] = js.native
  /** Occurs when the list of timed metadata tracks in the MediaSource associated with the MediaPlaybackItem changes. */
  @JSName("ontimedmetadatatrackschanged")
  var ontimedmetadatatrackschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
    MediaPlaybackItem, 
    winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorChangedEventArgs
  ] = js.native
  /** Occurs when the list of video tracks in the MediaSource associated with the MediaPlaybackItem changes. */
  @JSName("onvideotrackschanged")
  var onvideotrackschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
    MediaPlaybackItem, 
    winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorChangedEventArgs
  ] = js.native
  /** Gets the MediaSource object associated with the MediaPlaybackItem . */
  var source: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSource = js.native
  /** Gets a read-only list of timed metadata tracks in the MediaSource associated with the MediaPlaybackItem . */
  var timedMetadataTracks: MediaPlaybackTimedMetadataTrackList = js.native
  /** Gets a read-only list of video tracks in the MediaSource associated with the MediaPlaybackItem . */
  var videoTracks: MediaPlaybackVideoTrackList = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audiotrackschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.audiotrackschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      MediaPlaybackItem, 
      winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorChangedEventArgs
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timedmetadatatrackschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.timedmetadatatrackschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      MediaPlaybackItem, 
      winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorChangedEventArgs
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_videotrackschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.videotrackschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      MediaPlaybackItem, 
      winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorChangedEventArgs
    ]
  ): scala.Unit = js.native
  /** Occurs when the list of audio tracks in the MediaSource associated with the MediaPlaybackItem changes. */
  def onaudiotrackschanged(
    ev: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaPlaybackItem]
  ): scala.Unit = js.native
  /** Occurs when the list of timed metadata tracks in the MediaSource associated with the MediaPlaybackItem changes. */
  def ontimedmetadatatrackschanged(
    ev: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaPlaybackItem]
  ): scala.Unit = js.native
  /** Occurs when the list of video tracks in the MediaSource associated with the MediaPlaybackItem changes. */
  def onvideotrackschanged(
    ev: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaPlaybackItem]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audiotrackschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.audiotrackschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      MediaPlaybackItem, 
      winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorChangedEventArgs
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timedmetadatatrackschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.timedmetadatatrackschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      MediaPlaybackItem, 
      winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorChangedEventArgs
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_videotrackschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.videotrackschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      MediaPlaybackItem, 
      winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorChangedEventArgs
    ]
  ): scala.Unit = js.native
}

/** Represents a media item that can be played back. This class acts as a wrapper around a MediaSource that exposes the audio tracks, video tracks, and timed metadata tracks included in the media source. */
@JSGlobal("Windows.Media.Playback.MediaPlaybackItem")
@js.native
object MediaPlaybackItem extends js.Object {
  var findFromMediaSource: js.Any = js.native
}

