package typings.tstl

import typings.tstl.containerVectorMod.Vector.Iterator
import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIRandomAccessIteratorMod.IRandomAccessIterator
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/container/IRandomAccessContainer", JSImport.Namespace)
@js.native
object rangesContainerIRandomAccessContainerMod extends js.Object {
  @js.native
  object IRandomAccessContainer extends js.Object {
    type IteratorType[Container /* <: js.Array[_] | IRandomAccessContainer[_] */] = js.Any | Iterator[js.Any]
    type ValueType[Container /* <: js.Array[_] | IRandomAccessContainer[_] */] = typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer.ValueType[IteratorType[Container]]
  }
  
  type IRandomAccessContainer[IteratorT /* <: IRandomAccessIterator[ValueType[IteratorT], IteratorT] */] = IForwardContainer[IteratorT]
}

