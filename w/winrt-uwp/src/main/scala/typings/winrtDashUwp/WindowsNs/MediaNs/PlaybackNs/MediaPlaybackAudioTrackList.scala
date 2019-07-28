package typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs

import typings.std.Array
import typings.winrtDashUwp.Anon_Index
import typings.winrtDashUwp.Anon_ItemsReturnValueAudioTrack
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IIterator
import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.AudioTrack
import typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.ISingleSelectMediaTrackList
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.selectedindexchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a read-only list of audio tracks, of which a single track can be selected at one time. */
@JSGlobal("Windows.Media.Playback.MediaPlaybackAudioTrackList")
@js.native
abstract class MediaPlaybackAudioTrackList () extends Array[AudioTrack] {
  /** Occurs when the index of the currently selected audio track changes. */
  @JSName("onselectedindexchanged")
  var onselectedindexchanged_Original: TypedEventHandler[ISingleSelectMediaTrackList, _] = js.native
  /** Gets or sets the index of the currently selected audio track in the list. */
  var selectedIndex: Double = js.native
  /** Gets the number of audio tracks in the list. */
  var size: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedindexchanged(`type`: selectedindexchanged, listener: TypedEventHandler[ISingleSelectMediaTrackList, _]): Unit = js.native
  /**
    * Returns an iterator that iterates over the items in the collection.
    * @return The iterator.
    */
  def first(): IIterator[AudioTrack] = js.native
  /**
    * Returns the audio track at the specified index.
    * @param index The zero-based index of the audio track.
    * @return The audio track at the specified index.
    */
  def getAt(index: Double): AudioTrack = js.native
  /**
    * Retrieves the audio tracks that start at the specified index in the list.
    * @param startIndex The zero-based index of the start of the audio tracks in the list.
    */
  def getMany(startIndex: Double): Anon_ItemsReturnValueAudioTrack = js.native
  def indexOf(value: AudioTrack, extra: js.Any*): Anon_Index = js.native
  /**
    * Retrieves the index of a specified audio track in the list.
    * @param value The audio track to find in the vector view.
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: AudioTrack): Anon_Index = js.native
  /** Occurs when the index of the currently selected audio track changes. */
  def onselectedindexchanged(ev: js.Any with WinRTEvent[ISingleSelectMediaTrackList]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectedindexchanged(`type`: selectedindexchanged, listener: TypedEventHandler[ISingleSelectMediaTrackList, _]): Unit = js.native
}

