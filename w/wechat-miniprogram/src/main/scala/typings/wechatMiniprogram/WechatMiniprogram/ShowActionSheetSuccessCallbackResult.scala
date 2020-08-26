package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowActionSheetSuccessCallbackResult extends js.Object {
  var errMsg: String = js.native
  /** 用户点击的按钮序号，从上到下的顺序，从0开始 */
  var tapIndex: Double = js.native
}

object ShowActionSheetSuccessCallbackResult {
  @scala.inline
  def apply(errMsg: String, tapIndex: Double): ShowActionSheetSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], tapIndex = tapIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowActionSheetSuccessCallbackResult]
  }
  @scala.inline
  implicit class ShowActionSheetSuccessCallbackResultOps[Self <: ShowActionSheetSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setTapIndex(value: Double): Self = this.set("tapIndex", value.asInstanceOf[js.Any])
  }
  
}

