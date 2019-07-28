package typings.tstl.baseDisposableIForwardContainerMod

import typings.tstl.functionalIPointerMod.IPointerNs.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IForwardContainer[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] extends js.Object {
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
  def apply[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](begin: () => Iterator, end: () => Iterator): IForwardContainer[Iterator] = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction0(begin), end = js.Any.fromFunction0(end))
  
    __obj.asInstanceOf[IForwardContainer[Iterator]]
  }
}

