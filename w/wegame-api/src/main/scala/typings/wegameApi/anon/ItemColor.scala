package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemColor extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 按钮的文字颜色，默认值#000000
    */
  var itemColor: js.UndefOr[String] = js.native
  /**
    * 按钮的文字数组，数组长度最大为 6
    */
  var itemList: js.Array[String] = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}

object ItemColor {
  @scala.inline
  def apply(itemList: js.Array[String]): ItemColor = {
    val __obj = js.Dynamic.literal(itemList = itemList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemColor]
  }
  @scala.inline
  implicit class ItemColorOps[Self <: ItemColor] (val x: Self) extends AnyVal {
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
    def setItemListVarargs(value: String*): Self = this.set("itemList", js.Array(value :_*))
    @scala.inline
    def setItemList(value: js.Array[String]): Self = this.set("itemList", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setItemColor(value: String): Self = this.set("itemColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemColor: Self = this.set("itemColor", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

