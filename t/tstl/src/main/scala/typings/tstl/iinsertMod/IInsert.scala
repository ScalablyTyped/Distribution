package typings.tstl.iinsertMod

import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInsert[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] extends js.Object {
  
  def insert(it: Iterator, value: ValueType[Iterator]): Iterator = js.native
}
object IInsert {
  
  @scala.inline
  def apply[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](insert: (Iterator, ValueType[Iterator]) => Iterator): IInsert[Iterator] = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction2(insert))
    __obj.asInstanceOf[IInsert[Iterator]]
  }
  
  @scala.inline
  implicit class IInsertOps[Self <: IInsert[_], Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] (val x: Self with IInsert[Iterator]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInsert(value: (Iterator, ValueType[Iterator]) => Iterator): Self = this.set("insert", js.Any.fromFunction2(value))
  }
}
