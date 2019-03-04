package typings
package tstlLib.iteratorIReverseIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReverseIterator[T, Base /* <: IReversableIterator[T, Base, This] */, This /* <: IReverseIterator[T, Base, This] */]
  extends tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, This] {
  /**
    * Get base iterator.
    *
    * @return The base iterator.
    */
  def base(): Base
}

object IReverseIterator {
  @scala.inline
  def apply[T, Base /* <: IReversableIterator[T, Base, This] */, This /* <: IReverseIterator[T, Base, This] */](
    base: js.Function0[Base],
    equals: js.Function1[This, scala.Boolean],
    next: js.Function0[This],
    prev: js.Function0[This],
    value: T
  ): IReverseIterator[T, Base, This] = {
    val __obj = js.Dynamic.literal(base = base, equals = equals, next = next, prev = prev, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IReverseIterator[T, Base, This]]
  }
}

