package typings.winrtUwp.Windows.Media.Playback

import typings.std.Array
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Media.Core.AudioTrack
import typings.winrtUwp.Windows.Media.Core.ISingleSelectMediaTrackList
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.anon.Index
import typings.winrtUwp.anon.ItemsReturnValue
import typings.winrtUwp.winrtUwpStrings.selectedindexchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a read-only list of audio tracks, of which a single track can be selected at one time. */
@js.native
trait MediaPlaybackAudioTrackList extends Array[AudioTrack] {
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
  def getMany(startIndex: Double): ItemsReturnValue = js.native
  def indexOf(value: AudioTrack, extra: js.Any*): Index = js.native
  /* hack */
  @JSName("indexOf")
  def indexOf_Double(searchElement: AudioTrack): Double = js.native
  /** Occurs when the index of the currently selected audio track changes. */
  def onselectedindexchanged(ev: js.Any with WinRTEvent[ISingleSelectMediaTrackList]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectedindexchanged(`type`: selectedindexchanged, listener: TypedEventHandler[ISingleSelectMediaTrackList, _]): Unit = js.native
}

