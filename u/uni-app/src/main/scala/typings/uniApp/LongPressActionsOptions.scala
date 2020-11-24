package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongPressActionsOptions extends js.Object {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 按钮的文字颜色，字符串格式，默认为"#000000"
    */
  var itemColor: js.UndefOr[String] = js.native
  
  /**
    * 按钮的文字数组
    */
  var itemList: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ LongPressActionsSuccessData, Unit]] = js.native
}
object LongPressActionsOptions {
  
  @scala.inline
  def apply(): LongPressActionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongPressActionsOptions]
  }
  
  @scala.inline
  implicit class LongPressActionsOptionsOps[Self <: LongPressActionsOptions] (val x: Self) extends AnyVal {
    
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
    def setItemListVarargs(value: String*): Self = this.set("itemList", js.Array(value :_*))
    
    @scala.inline
    def setItemList(value: js.Array[String]): Self = this.set("itemList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemList: Self = this.set("itemList", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ LongPressActionsSuccessData => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
