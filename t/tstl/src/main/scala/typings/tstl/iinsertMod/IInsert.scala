package typings.tstl.iinsertMod

import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInsert[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] extends js.Object {
  def insert(it: Iterator, value: ValueType[Iterator]): Iterator
}

object IInsert {
  @scala.inline
  def apply[Iterator](insert: (Iterator, ValueType[Iterator]) => Iterator): IInsert[Iterator] = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction2(insert))
    __obj.asInstanceOf[IInsert[Iterator]]
  }
}

