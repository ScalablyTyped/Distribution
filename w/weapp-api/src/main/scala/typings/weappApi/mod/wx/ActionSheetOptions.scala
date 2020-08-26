package typings.weappApi.mod.wx

import typings.weappApi.anon.TapIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionSheetOptions extends js.Object {
  var complete: js.UndefOr[ResponseCallback] = js.native
  var fail: js.UndefOr[ResponseCallback] = js.native
  // 按钮的文字颜色
  var itemColor: js.UndefOr[String] = js.native
  // 必填，按钮的文字数组，数组长度最大为 6
  var itemList: js.Array[String] = js.native
  var success: js.UndefOr[ActionSheetSuccessCallback] = js.native
}

object ActionSheetOptions {
  @scala.inline
  def apply(itemList: js.Array[String]): ActionSheetOptions = {
    val __obj = js.Dynamic.literal(itemList = itemList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetOptions]
  }
  @scala.inline
  implicit class ActionSheetOptionsOps[Self <: ActionSheetOptions] (val x: Self) extends AnyVal {
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
    def setComplete(value: /* res */ js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setItemColor(value: String): Self = this.set("itemColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemColor: Self = this.set("itemColor", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ TapIndex => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

