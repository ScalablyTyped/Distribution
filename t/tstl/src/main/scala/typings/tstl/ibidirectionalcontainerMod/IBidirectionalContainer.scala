package typings.tstl.ibidirectionalcontainerMod

import typings.tstl.iforwardcontainerMod.IForwardContainer
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.ireversableiteratorMod.IReversableIterator
import typings.tstl.ireverseiteratorMod.IReverseIterator
import typings.tstl.vectorMod.Vector.Iterator
import typings.tstl.vectorMod.Vector.ReverseIterator
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
  type ValueType[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */] = typings.tstl.ipointerMod.IPointer.ValueType[IteratorType[Container]]
}

