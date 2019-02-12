package typings
package tstlLib.baseDisposableIBidirectionalContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBidirectionalContainer[IteratorT /* <: tstlLib.iteratorIReverseIteratorMod.IReversableIterator[
tstlLib.functionalIPointerMod.IPointerNs.ValueType[IteratorT], 
IteratorT, 
ReverseIteratorT] */, ReverseIteratorT /* <: tstlLib.iteratorIReverseIteratorMod.IReverseIterator[
tstlLib.functionalIPointerMod.IPointerNs.ValueType[IteratorT], 
IteratorT, 
ReverseIteratorT] */]
  extends tstlLib.baseDisposableIForwardContainerMod.IForwardContainer[IteratorT] {
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

