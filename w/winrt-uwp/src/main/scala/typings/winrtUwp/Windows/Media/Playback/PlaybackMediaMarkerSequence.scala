package typings.winrtUwp.Windows.Media.Playback

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An ordered collection of PlaybackMediaMarker objects. */
@JSGlobal("Windows.Media.Playback.PlaybackMediaMarkerSequence")
@js.native
/** Initializes a new instance of the PlaybackMediaMarkerSequence class. */
class PlaybackMediaMarkerSequence () extends js.Object {
  /** Returns the number of items in the sequence. */
  var size: Double = js.native
  /** Removes all elements from the sequence. */
  def clear(): Unit = js.native
  /**
    * Gets an IIterator pointing at the first PlaybackMediaMarker in the sequence.
    * @return Iterator pointing at the first media marker in the sequence.
    */
  def first(): IIterator[PlaybackMediaMarker] = js.native
  /**
    * Adds a PlaybackMediaMarker to the sequence in it's ordered position.
    * @param value The media marker to insert into the sequence.
    */
  def insert(value: PlaybackMediaMarker): Unit = js.native
}

