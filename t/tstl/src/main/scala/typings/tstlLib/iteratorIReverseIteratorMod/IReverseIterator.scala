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
  def apply[T, Base /* <: IReversableIterator[T, Base, This] */, This /* <: IReverseIterator[T, Base, This] */](base: () => Base, equals: This => scala.Boolean, next: () => This, prev: () => This, value: T): IReverseIterator[T, Base, This] = {
    val __obj = js.Dynamic.literal(base = js.Any.fromFunction0(base), equals = js.Any.fromFunction1(equals), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IReverseIterator[T, Base, This]]
  }
}

