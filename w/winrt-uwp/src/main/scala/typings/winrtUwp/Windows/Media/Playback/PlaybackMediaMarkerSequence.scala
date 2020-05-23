package typings.winrtUwp.Windows.Media.Playback

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An ordered collection of PlaybackMediaMarker objects. */
trait PlaybackMediaMarkerSequence extends js.Object {
  /** Returns the number of items in the sequence. */
  var size: Double
  /** Removes all elements from the sequence. */
  def clear(): Unit
  /**
    * Gets an IIterator pointing at the first PlaybackMediaMarker in the sequence.
    * @return Iterator pointing at the first media marker in the sequence.
    */
  def first(): IIterator[PlaybackMediaMarker]
  /**
    * Adds a PlaybackMediaMarker to the sequence in it's ordered position.
    * @param value The media marker to insert into the sequence.
    */
  def insert(value: PlaybackMediaMarker): Unit
}

object PlaybackMediaMarkerSequence {
  @scala.inline
  def apply(
    clear: () => Unit,
    first: () => IIterator[PlaybackMediaMarker],
    insert: PlaybackMediaMarker => Unit,
    size: Double
  ): PlaybackMediaMarkerSequence = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), insert = js.Any.fromFunction1(insert), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackMediaMarkerSequence]
  }
}

