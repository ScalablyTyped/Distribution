package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a timed metadata track. The track contains a list of IMediaCue objects and raises events at the beginning and end of the time window of each cue. */
@JSGlobal("Windows.Media.Core.TimedMetadataTrack")
@js.native
class TimedMetadataTrack protected () extends js.Object {
  /**
    * Initializes a new instance of the TimedMetadataTrack class.
    * @param id An identifier for the new timed metadata track.
    * @param language A string indicating the language of the new timed metadata track.
    * @param kind A value indicating the kind of metadata contained in the new track.
    */
  def this(id: java.lang.String, language: java.lang.String, kind: TimedMetadataKind) = this()
  /** Gets the list of media cues in the TimedMetadataTrack that are currently active. A cue is considered active after its StartTime has been reached until its Duration has been exceeded. */
  var activeCues: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IMediaCue] = js.native
  /** Gets a read-only list of the media cues in the TimedMetadataTrack . */
  var cues: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IMediaCue] = js.native
  /** Gets the custom string value containing routing information for cues. */
  var dispatchType: java.lang.String = js.native
  /** Gets the identifier for the timed metadata track. */
  var id: java.lang.String = js.native
  /** Gets or sets the label for the timed metadata track. */
  var label: java.lang.String = js.native
  /** Gets a string indicating the language of the timed metadata track. */
  var language: java.lang.String = js.native
  /** Occurs when a media time window of a media cue is entered. The time window is defined by the StartTime and Duration of the cue. */
  @JSName("oncueentered")
  var oncueentered_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[TimedMetadataTrack, MediaCueEventArgs] = js.native
  /** Occurs when a media time window of a media cue is exited. The time window is defined by the StartTime and Duration of the cue. */
  @JSName("oncueexited")
  var oncueexited_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[TimedMetadataTrack, MediaCueEventArgs] = js.native
  /** Raised when an error occurs with the TimedMetadataTrack . */
  @JSName("ontrackfailed")
  var ontrackfailed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[TimedMetadataTrack, TimedMetadataTrackFailedEventArgs] = js.native
  /** Gets a value indicating the kind of metadata contained in the track. */
  var timedMetadataKind: TimedMetadataKind = js.native
  /** Gets a value specifying the type of the media track. For TimedMetadataTrack this value will always be MediaTrackKind::TimedMetadata . */
  var trackKind: MediaTrackKind = js.native
  /**
    * Adds the specified media cue to the TimedMetadataTrack .
    * @param cue The media cue to add.
    */
  def addCue(cue: IMediaCue): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cueentered(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.cueentered,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[TimedMetadataTrack, MediaCueEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cueexited(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.cueexited,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[TimedMetadataTrack, MediaCueEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_trackfailed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.trackfailed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[TimedMetadataTrack, TimedMetadataTrackFailedEventArgs]
  ): scala.Unit = js.native
  /** Occurs when a media time window of a media cue is entered. The time window is defined by the StartTime and Duration of the cue. */
  def oncueentered(ev: MediaCueEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[TimedMetadataTrack]): scala.Unit = js.native
  /** Occurs when a media time window of a media cue is exited. The time window is defined by the StartTime and Duration of the cue. */
  def oncueexited(ev: MediaCueEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[TimedMetadataTrack]): scala.Unit = js.native
  /** Raised when an error occurs with the TimedMetadataTrack . */
  def ontrackfailed(
    ev: TimedMetadataTrackFailedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[TimedMetadataTrack]
  ): scala.Unit = js.native
  /**
    * Removes the specified media cue from the TimedMetadataTrack .
    * @param cue The media cue to remove.
    */
  def removeCue(cue: IMediaCue): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cueentered(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.cueentered,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[TimedMetadataTrack, MediaCueEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cueexited(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.cueexited,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[TimedMetadataTrack, MediaCueEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_trackfailed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.trackfailed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[TimedMetadataTrack, TimedMetadataTrackFailedEventArgs]
  ): scala.Unit = js.native
}

