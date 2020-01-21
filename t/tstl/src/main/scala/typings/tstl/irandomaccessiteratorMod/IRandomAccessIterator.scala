package typings.tstl.irandomaccessiteratorMod

import typings.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRandomAccessIterator[T, Iterator /* <: IRandomAccessIterator[T, Iterator] */] extends IBidirectionalIterator[T, Iterator] {
  /**
    * Advance iterator.
    *
    * @param n Step to advance.
    * @return The advanced iterator.
    */
  def advance(n: Double): Iterator
  /**
    * Get index.
    *
    * @return The index.
    */
  def index(): Double
}

object IRandomAccessIterator {
  @scala.inline
  def apply[T, Iterator /* <: IRandomAccessIterator[T, Iterator] */](
    advance: Double => Iterator,
    index: () => Double,
    next: () => Iterator,
    prev: () => Iterator,
    value: T
  ): IRandomAccessIterator[T, Iterator] = {
    val __obj = js.Dynamic.literal(advance = js.Any.fromFunction1(advance), index = js.Any.fromFunction0(index), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRandomAccessIterator[T, Iterator]]
  }
}

