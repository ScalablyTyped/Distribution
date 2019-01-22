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

