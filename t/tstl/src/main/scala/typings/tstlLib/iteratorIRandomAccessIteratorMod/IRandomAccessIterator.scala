package typings
package tstlLib.iteratorIRandomAccessIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRandomAccessIterator[T, Iterator /* <: IRandomAccessIterator[T, Iterator] */]
  extends tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, Iterator] {
  /**
    * Advance iterator.
    *
    * @param n Step to advance.
    * @return The advanced iterator.
    */
  def advance(n: scala.Double): Iterator
  /**
    * Get index.
    *
    * @return The index.
    */
  def index(): scala.Double
}

object IRandomAccessIterator {
  @scala.inline
  def apply[T, Iterator /* <: IRandomAccessIterator[T, Iterator] */](
    advance: js.Function1[scala.Double, Iterator],
    equals: js.Function1[Iterator, scala.Boolean],
    index: js.Function0[scala.Double],
    next: js.Function0[Iterator],
    prev: js.Function0[Iterator],
    value: T
  ): IRandomAccessIterator[T, Iterator] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("advance")(advance)
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("prev")(prev)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRandomAccessIterator[T, Iterator]]
  }
}

