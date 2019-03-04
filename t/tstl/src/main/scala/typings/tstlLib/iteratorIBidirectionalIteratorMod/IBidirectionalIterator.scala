package typings
package tstlLib.iteratorIBidirectionalIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBidirectionalIterator[T, Iterator /* <: IBidirectionalIterator[T, Iterator] */]
  extends tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator] {
  /**
    * Get previous iterator.
    *
    * @return The previous iterator.
    */
  def prev(): Iterator
}

object IBidirectionalIterator {
  @scala.inline
  def apply[T, Iterator /* <: IBidirectionalIterator[T, Iterator] */](
    equals: js.Function1[Iterator, scala.Boolean],
    next: js.Function0[Iterator],
    prev: js.Function0[Iterator],
    value: T
  ): IBidirectionalIterator[T, Iterator] = {
    val __obj = js.Dynamic.literal(equals = equals, next = next, prev = prev, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBidirectionalIterator[T, Iterator]]
  }
}

