package typings.tstl

import typings.tstl.iforwardcontainerMod.IForwardContainer
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.irandomaccessiteratorMod.IRandomAccessIterator
import typings.tstl.vectorMod.Vector.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/container/IRandomAccessContainer", JSImport.Namespace)
@js.native
object irandomaccesscontainerMod extends js.Object {
  @js.native
  object IRandomAccessContainer extends js.Object {
    type IteratorType[Container /* <: js.Array[_] | IRandomAccessContainer[_] */] = js.Any | Iterator[js.Any]
    type ValueType[Container /* <: js.Array[_] | IRandomAccessContainer[_] */] = typings.tstl.iforwardcontainerMod.IForwardContainer.ValueType[IteratorType[Container]]
  }
  
  type IRandomAccessContainer[IteratorT /* <: IRandomAccessIterator[ValueType[IteratorT], IteratorT] */] = IForwardContainer[IteratorT]
}

