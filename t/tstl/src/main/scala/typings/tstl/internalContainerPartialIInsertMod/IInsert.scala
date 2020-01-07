package typings.tstl.internalContainerPartialIInsertMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInsert[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] extends js.Object {
  def insert(it: Iterator, value: ValueType[Iterator]): Iterator
}

object IInsert {
  @scala.inline
  def apply[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](insert: (Iterator, ValueType[Iterator]) => Iterator): IInsert[Iterator] = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction2(insert))
  
    __obj.asInstanceOf[IInsert[Iterator]]
  }
}

