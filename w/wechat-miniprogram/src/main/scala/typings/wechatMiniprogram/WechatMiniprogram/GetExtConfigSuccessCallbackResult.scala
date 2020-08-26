package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExtConfigSuccessCallbackResult extends js.Object {
  var errMsg: String = js.native
  /** 第三方平台自定义的数据 */
  var extConfig: IAnyObject = js.native
}

object GetExtConfigSuccessCallbackResult {
  @scala.inline
  def apply(errMsg: String, extConfig: IAnyObject): GetExtConfigSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], extConfig = extConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExtConfigSuccessCallbackResult]
  }
  @scala.inline
  implicit class GetExtConfigSuccessCallbackResultOps[Self <: GetExtConfigSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setExtConfig(value: IAnyObject): Self = this.set("extConfig", value.asInstanceOf[js.Any])
  }
  
}

