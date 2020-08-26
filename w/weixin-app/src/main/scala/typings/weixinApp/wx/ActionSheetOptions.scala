package typings.weixinApp.wx

import typings.weixinApp.anon.TapIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionSheetOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 按钮的文字颜色，默认为"#000000"
    */
  var itemColor: js.UndefOr[String] = js.native
  /**
    * 按钮的文字数组，数组长度最大为6个
    */
  var itemList: js.Array[String] = js.native
  /**
    * 接口调用成功的回调函数
    */
  @JSName("success")
  var success_ActionSheetOptions: js.UndefOr[js.Function1[/* res */ TapIndex, Unit]] = js.native
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
    def setItemColor(value: String): Self = this.set("itemColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemColor: Self = this.set("itemColor", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ TapIndex => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

