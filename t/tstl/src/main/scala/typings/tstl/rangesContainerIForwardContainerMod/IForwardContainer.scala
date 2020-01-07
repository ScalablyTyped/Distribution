package typings.tstl.rangesContainerIForwardContainerMod

import typings.tstl.containerVectorMod.Vector.Iterator
import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.internalContainerPartialISizeMod.ISize
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
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
  type SimilarType[Container /* <: js.Array[_] | IForwardContainer[_] */] = (js.Array[
    typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer.ValueType[Container]
  ]) | (IForwardContainer[
    IForwardIterator[
      typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer.ValueType[Container], 
      js.Any
    ]
  ])
  type ValueType[Container /* <: js.Array[_] | IForwardContainer[_] */] = typings.tstl.functionalIPointerMod.IPointer.ValueType[IteratorType[Container]]
}

