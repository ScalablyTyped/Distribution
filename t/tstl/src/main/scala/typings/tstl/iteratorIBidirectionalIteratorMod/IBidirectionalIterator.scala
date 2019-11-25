package typings.tstl.iteratorIBidirectionalIteratorMod

import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBidirectionalIterator[T, Iterator /* <: IBidirectionalIterator[T, Iterator] */] extends IForwardIterator[T, Iterator] {
  /**
    * Get previous iterator.
    *
    * @return The previous iterator.
    */
  def prev(): Iterator
}

object IBidirectionalIterator {
  @scala.inline
  def apply[T, Iterator /* <: IBidirectionalIterator[T, Iterator] */](next: () => Iterator, prev: () => Iterator, value: T): IBidirectionalIterator[T, Iterator] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBidirectionalIterator[T, Iterator]]
  }
}

