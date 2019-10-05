package typings.tstl.tstlMod

import typings.tstl.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer
import typings.tstl.containerVectorMod.Vector.ReverseIterator
import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIReverseIteratorMod.IReversableIterator
import typings.tstl.iteratorIReverseIteratorMod.IReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "rbegin")
@js.native
object rbegin extends js.Object {
  def apply[T](container: js.Array[T]): ReverseIterator[T] = js.native
  def apply[Iterator /* <: IReversableIterator[ValueType[Iterator], Iterator, ReverseIterator] */, ReverseIterator /* <: IReverseIterator[ValueType[Iterator], Iterator, ReverseIterator] */](container: IBidirectionalContainer[Iterator, ReverseIterator]): ReverseIterator = js.native
}

