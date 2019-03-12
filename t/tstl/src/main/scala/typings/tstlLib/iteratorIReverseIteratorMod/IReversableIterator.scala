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
    equals: IteratorT => scala.Boolean,
    next: () => IteratorT,
    prev: () => IteratorT,
    reverse: () => ReverseT,
    value: T
  ): IReversableIterator[T, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), reverse = js.Any.fromFunction0(reverse), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IReversableIterator[T, IteratorT, ReverseT]]
  }
}

