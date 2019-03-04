package typings
package tstlLib.iteratorIReverseIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReversableIterator[T, IteratorT /* <: IReversableIterator[T, IteratorT, ReverseT] */, ReverseT /* <: IReverseIterator[T, IteratorT, ReverseT] */]
  extends tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, IteratorT] {
  /**
    * Construct reverse iterator.
    *
    * @return The reverse iterator.
    */
  def reverse(): ReverseT
}

object IReversableIterator {
  @scala.inline
  def apply[T, IteratorT /* <: IReversableIterator[T, IteratorT, ReverseT] */, ReverseT /* <: IReverseIterator[T, IteratorT, ReverseT] */](
    equals: js.Function1[IteratorT, scala.Boolean],
    next: js.Function0[IteratorT],
    prev: js.Function0[IteratorT],
    reverse: js.Function0[ReverseT],
    value: T
  ): IReversableIterator[T, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(equals = equals, next = next, prev = prev, reverse = reverse, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IReversableIterator[T, IteratorT, ReverseT]]
  }
}

