package typings
package tstlLib.baseDisposableIForwardContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IForwardContainer[Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */] extends js.Object {
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

object IForwardContainer {
  @scala.inline
  def apply[Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](begin: js.Function0[Iterator], end: js.Function0[Iterator]): IForwardContainer[Iterator] = {
    val __obj = js.Dynamic.literal(begin = begin, end = end)
  
    __obj.asInstanceOf[IForwardContainer[Iterator]]
  }
}

