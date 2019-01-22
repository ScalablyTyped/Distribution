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

