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

object IBidirectionalContainer {
  @scala.inline
  def apply[IteratorT /* <: tstlLib.iteratorIReverseIteratorMod.IReversableIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[IteratorT], 
    IteratorT, 
    ReverseIteratorT
  ] */, ReverseIteratorT /* <: tstlLib.iteratorIReverseIteratorMod.IReverseIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[IteratorT], 
    IteratorT, 
    ReverseIteratorT
  ] */](
    begin: js.Function0[IteratorT],
    end: js.Function0[IteratorT],
    rbegin: js.Function0[ReverseIteratorT],
    rend: js.Function0[ReverseIteratorT]
  ): IBidirectionalContainer[IteratorT, ReverseIteratorT] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("begin")(begin)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("rbegin")(rbegin)
    __obj.updateDynamic("rend")(rend)
    __obj.asInstanceOf[IBidirectionalContainer[IteratorT, ReverseIteratorT]]
  }
}

