package typings.tstl.iforwardcontainerMod

import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.isizeMod.ISize
import typings.tstl.vectorMod.Vector.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IForwardContainer[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] extends ISize {
  
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  def begin(): Iterator = js.native
  
  /**
    * Iterator to the end.
    *
    * @return Iterator to the end.
    */
  def end(): Iterator = js.native
}
@JSImport("tstl/ranges/container/IForwardContainer", "IForwardContainer")
@js.native
object IForwardContainer extends js.Object {
  
  /**
    * Deduct iterator type.
    */
  type IteratorType[Container /* <: js.Array[_] | IForwardContainer[_] */] = js.Any | Iterator[js.Any]
  
  /**
    * Deduct similar type.
    */
  type SimilarType[Container /* <: js.Array[_] | IForwardContainer[_] */] = js.Array[typings.tstl.iforwardcontainerMod.IForwardContainer.ValueType[Container]] | (IForwardContainer[
    IForwardIterator[typings.tstl.iforwardcontainerMod.IForwardContainer.ValueType[Container], js.Any]
  ])
  
  /**
    * Deduct value type.
    */
  type ValueType[Container /* <: js.Array[_] | IForwardContainer[_] */] = typings.tstl.ipointerMod.IPointer.ValueType[IteratorType[Container]]
}
