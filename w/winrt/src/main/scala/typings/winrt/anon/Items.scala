package typings.winrt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Items[T] extends js.Object {
  var items: js.Array[T] = js.native
  var returnValue: Double = js.native
}

object Items {
  @scala.inline
  def apply[T](items: js.Array[T], returnValue: Double): Items[T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items[T]]
  }
  @scala.inline
  implicit class ItemsOps[Self <: Items[_], T] (val x: Self with Items[T]) extends AnyVal {
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
    def setItemsVarargs(value: T*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[T]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: Double): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

