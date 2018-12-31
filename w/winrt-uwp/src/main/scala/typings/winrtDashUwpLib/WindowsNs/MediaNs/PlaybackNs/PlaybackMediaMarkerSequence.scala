package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An ordered collection of PlaybackMediaMarker objects. */
@JSGlobal("Windows.Media.Playback.PlaybackMediaMarkerSequence")
@js.native
/** Initializes a new instance of the PlaybackMediaMarkerSequence class. */
class PlaybackMediaMarkerSequence () extends js.Object {
  /** Returns the number of items in the sequence. */
  var size: scala.Double = js.native
  /** Removes all elements from the sequence. */
  def clear(): scala.Unit = js.native
  /**
    * Gets an IIterator pointing at the first PlaybackMediaMarker in the sequence.
    * @return Iterator pointing at the first media marker in the sequence.
    */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[PlaybackMediaMarker] = js.native
  /**
    * Adds a PlaybackMediaMarker to the sequence in it's ordered position.
    * @param value The media marker to insert into the sequence.
    */
  def insert(value: PlaybackMediaMarker): scala.Unit = js.native
}

