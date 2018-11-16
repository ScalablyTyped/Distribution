package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a read-only list of timed metadata tracks. */
@JSGlobal("Windows.Media.Playback.MediaPlaybackTimedMetadataTrackList")
@js.native
abstract class MediaPlaybackTimedMetadataTrackList ()
  extends stdLib.Array[winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataTrack] {
  /** Occurs when the presentation mode of the MediaPlaybackTimedMetadataTrackList changes. */
  @JSName("onpresentationmodechanged")
  var onpresentationmodechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlaybackTimedMetadataTrackList, TimedMetadataPresentationModeChangedEventArgs] = js.native
  /** Gets the number of timed metadata tracks in the list. */
  var size: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_presentationmodechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.presentationmodechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlaybackTimedMetadataTrackList, TimedMetadataPresentationModeChangedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Returns an iterator that iterates over the items in the collection.
                   * @return The iterator.
                   */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataTrack] = js.native
  /**
                   * Returns the timed metadata track at the specified index.
                   * @param index The zero-based index of the timed metadata track.
                   * @return The timed metadata track at the specified index.
                   */
  def getAt(index: scala.Double): winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataTrack = js.native
  /**
                   * Retrieves the timed metadata tracks that start at the specified index in the list.
                   * @param startIndex The zero-based index of the start of the timed metadata tracks in the list.
                   */
  def getMany(startIndex: scala.Double): winrtDashUwpLib.Anon_ItemsReturnValueTimedMetadataTrack = js.native
  /**
                   * Gets the presentation mode of the timed metadata track with the specified index.
                   * @param index The index of the timed metadata track for which the presentation mode is queried.
                   * @return The presentation mode.
                   */
  def getPresentationMode(index: scala.Double): TimedMetadataTrackPresentationMode = js.native
  def indexOf(value: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataTrack, extra: js.Any*): winrtDashUwpLib.Anon_Index = js.native
  /**
                   * Retrieves the index of a specified timed metadata track in the list.
                   * @param value The timed metadata track to find in the vector view.
                   */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataTrack): winrtDashUwpLib.Anon_Index = js.native
  /** Occurs when the presentation mode of the MediaPlaybackTimedMetadataTrackList changes. */
  def onpresentationmodechanged(
    ev: TimedMetadataPresentationModeChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaPlaybackTimedMetadataTrackList]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_presentationmodechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.presentationmodechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlaybackTimedMetadataTrackList, TimedMetadataPresentationModeChangedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Sets the presentation mode of the timed metadata track with the specified index.
                   * @param index The index of the timed metadata track for which the presentation mode is set.
                   * @param value The presentation mode to set.
                   */
  def setPresentationMode(index: scala.Double, value: TimedMetadataTrackPresentationMode): scala.Unit = js.native
}

