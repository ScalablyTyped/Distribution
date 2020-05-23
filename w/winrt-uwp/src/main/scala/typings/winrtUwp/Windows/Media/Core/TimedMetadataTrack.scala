package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.cueentered
import typings.winrtUwp.winrtUwpStrings.cueexited
import typings.winrtUwp.winrtUwpStrings.trackfailed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a timed metadata track. The track contains a list of IMediaCue objects and raises events at the beginning and end of the time window of each cue. */
@js.native
trait TimedMetadataTrack extends js.Object {
  /** Gets the list of media cues in the TimedMetadataTrack that are currently active. A cue is considered active after its StartTime has been reached until its Duration has been exceeded. */
  var activeCues: IVectorView[IMediaCue] = js.native
  /** Gets a read-only list of the media cues in the TimedMetadataTrack . */
  var cues: IVectorView[IMediaCue] = js.native
  /** Gets the custom string value containing routing information for cues. */
  var dispatchType: String = js.native
  /** Gets the identifier for the timed metadata track. */
  var id: String = js.native
  /** Gets or sets the label for the timed metadata track. */
  var label: String = js.native
  /** Gets a string indicating the language of the timed metadata track. */
  var language: String = js.native
  /** Occurs when a media time window of a media cue is entered. The time window is defined by the StartTime and Duration of the cue. */
  @JSName("oncueentered")
  var oncueentered_Original: TypedEventHandler[TimedMetadataTrack, MediaCueEventArgs] = js.native
  /** Occurs when a media time window of a media cue is exited. The time window is defined by the StartTime and Duration of the cue. */
  @JSName("oncueexited")
  var oncueexited_Original: TypedEventHandler[TimedMetadataTrack, MediaCueEventArgs] = js.native
  /** Raised when an error occurs with the TimedMetadataTrack . */
  @JSName("ontrackfailed")
  var ontrackfailed_Original: TypedEventHandler[TimedMetadataTrack, TimedMetadataTrackFailedEventArgs] = js.native
  /** Gets a value indicating the kind of metadata contained in the track. */
  var timedMetadataKind: TimedMetadataKind = js.native
  /** Gets a value specifying the type of the media track. For TimedMetadataTrack this value will always be MediaTrackKind::TimedMetadata . */
  var trackKind: MediaTrackKind = js.native
  /**
    * Adds the specified media cue to the TimedMetadataTrack .
    * @param cue The media cue to add.
    */
  def addCue(cue: IMediaCue): Unit = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cueentered(`type`: cueentered, listener: TypedEventHandler[TimedMetadataTrack, MediaCueEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cueexited(`type`: cueexited, listener: TypedEventHandler[TimedMetadataTrack, MediaCueEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_trackfailed(
    `type`: trackfailed,
    listener: TypedEventHandler[TimedMetadataTrack, TimedMetadataTrackFailedEventArgs]
  ): Unit = js.native
  /** Occurs when a media time window of a media cue is entered. The time window is defined by the StartTime and Duration of the cue. */
  def oncueentered(ev: MediaCueEventArgs with WinRTEvent[TimedMetadataTrack]): Unit = js.native
  /** Occurs when a media time window of a media cue is exited. The time window is defined by the StartTime and Duration of the cue. */
  def oncueexited(ev: MediaCueEventArgs with WinRTEvent[TimedMetadataTrack]): Unit = js.native
  /** Raised when an error occurs with the TimedMetadataTrack . */
  def ontrackfailed(ev: TimedMetadataTrackFailedEventArgs with WinRTEvent[TimedMetadataTrack]): Unit = js.native
  /**
    * Removes the specified media cue from the TimedMetadataTrack .
    * @param cue The media cue to remove.
    */
  def removeCue(cue: IMediaCue): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cueentered(`type`: cueentered, listener: TypedEventHandler[TimedMetadataTrack, MediaCueEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cueexited(`type`: cueexited, listener: TypedEventHandler[TimedMetadataTrack, MediaCueEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_trackfailed(
    `type`: trackfailed,
    listener: TypedEventHandler[TimedMetadataTrack, TimedMetadataTrackFailedEventArgs]
  ): Unit = js.native
}

