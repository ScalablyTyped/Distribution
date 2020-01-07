package typings.tstl.rangesContainerIBidirectionalContainerMod

import typings.tstl.containerVectorMod.Vector.Iterator
import typings.tstl.containerVectorMod.Vector.ReverseIterator
import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIReversableIteratorMod.IReversableIterator
import typings.tstl.iteratorIReverseIteratorMod.IReverseIterator
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer
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

@JSImport("tstl/ranges/container/IBidirectionalContainer", "IBidirectionalContainer")
@js.native
object IBidirectionalContainer extends js.Object {
  type IteratorType[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */] = js.Any | Iterator[js.Any]
  type ReverseIteratorType[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */] = js.Any | ReverseIterator[js.Any]
  type ValueType[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */] = typings.tstl.functionalIPointerMod.IPointer.ValueType[IteratorType[Container]]
}

