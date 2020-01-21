package typings.tstl.iforwardcontainerMod

import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.isizeMod.ISize
import typings.tstl.vectorMod.Vector.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IForwardContainer[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] extends ISize {
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  def begin(): Iterator
  /**
    * Iterator to the end.
    *
    * @return Iterator to the end.
    */
  def end(): Iterator
}

@JSImport("tstl/ranges/container/IForwardContainer", "IForwardContainer")
@js.native
object IForwardContainer extends js.Object {
  type IteratorType[Container /* <: js.Array[_] | IForwardContainer[_] */] = js.Any | Iterator[js.Any]
  type SimilarType[Container /* <: js.Array[_] | IForwardContainer[_] */] = js.Array[typings.tstl.iforwardcontainerMod.IForwardContainer.ValueType[Container]] | (IForwardContainer[
    IForwardIterator[typings.tstl.iforwardcontainerMod.IForwardContainer.ValueType[Container], js.Any]
  ])
  type ValueType[Container /* <: js.Array[_] | IForwardContainer[_] */] = typings.tstl.ipointerMod.IPointer.ValueType[IteratorType[Container]]
}

