package typings.tstl.baseDisposableIBidirectionalContainerMod

import typings.tstl.baseDisposableIForwardContainerMod.IForwardContainer
import typings.tstl.functionalIPointerMod.IPointerNs.ValueType
import typings.tstl.iteratorIReverseIteratorMod.IReversableIterator
import typings.tstl.iteratorIReverseIteratorMod.IReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBidirectionalContainer[IteratorT /* <: IReversableIterator[ValueType[IteratorT], IteratorT, ReverseIteratorT] */, ReverseIteratorT /* <: IReverseIterator[ValueType[IteratorT], IteratorT, ReverseIteratorT] */] extends IForwardContainer[IteratorT] {
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
  def apply[IteratorT /* <: IReversableIterator[ValueType[IteratorT], IteratorT, ReverseIteratorT] */, ReverseIteratorT /* <: IReverseIterator[ValueType[IteratorT], IteratorT, ReverseIteratorT] */](
    begin: () => IteratorT,
    end: () => IteratorT,
    rbegin: () => ReverseIteratorT,
    rend: () => ReverseIteratorT
  ): IBidirectionalContainer[IteratorT, ReverseIteratorT] = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction0(begin), end = js.Any.fromFunction0(end), rbegin = js.Any.fromFunction0(rbegin), rend = js.Any.fromFunction0(rend))
  
    __obj.asInstanceOf[IBidirectionalContainer[IteratorT, ReverseIteratorT]]
  }
}

