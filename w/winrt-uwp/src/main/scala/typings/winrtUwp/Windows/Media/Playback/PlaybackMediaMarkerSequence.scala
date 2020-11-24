package typings.winrtUwp.Windows.Media.Playback

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An ordered collection of PlaybackMediaMarker objects. */
@js.native
trait PlaybackMediaMarkerSequence extends js.Object {
  
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
  
  /** Returns the number of items in the sequence. */
  var size: Double = js.native
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
  
  @scala.inline
  implicit class PlaybackMediaMarkerSequenceOps[Self <: PlaybackMediaMarkerSequence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFirst(value: () => IIterator[PlaybackMediaMarker]): Self = this.set("first", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsert(value: PlaybackMediaMarker => Unit): Self = this.set("insert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
