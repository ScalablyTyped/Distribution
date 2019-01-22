package typings
package tstlLib.baseDisposableIBidirectionalContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBidirectionalContainer[T, IteratorT /* <: tstlLib.iteratorIReverseIteratorMod.IReversableIterator[T, IteratorT, ReverseIteratorT] */, ReverseIteratorT /* <: tstlLib.iteratorIReverseIteratorMod.IReverseIterator[T, IteratorT, ReverseIteratorT] */]
  extends tstlLib.baseDisposableIForwardContainerMod.IForwardContainer[T, IteratorT] {
  /**
    * Reverse iterator to the first element in reverse.
    *
    * @return Reverse iterator to the first.
    */
  def rbegin(): ReverseIteratorT
  /**
    * Reverse iterator to the reverse end.
    *
    * @return Reverse iterator to the end.
    */
  def rend(): ReverseIteratorT
}

