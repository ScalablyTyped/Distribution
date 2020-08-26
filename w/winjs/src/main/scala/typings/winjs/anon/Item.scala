package typings.winjs.anon

import typings.winjs.WinJS.Utilities.IPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item[T] extends js.Object {
  var item: T = js.native
  var position: IPosition = js.native
}

object Item {
  @scala.inline
  def apply[T](item: T, position: IPosition): Item[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item[T]]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item[_], T] (val x: Self with Item[T]) extends AnyVal {
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
    def setItem(value: T): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: IPosition): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

