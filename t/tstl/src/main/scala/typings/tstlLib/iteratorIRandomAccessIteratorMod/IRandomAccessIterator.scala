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

