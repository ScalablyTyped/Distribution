package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnlinkFailCallbackResult extends js.Object {
  /** 错误信息
    *
    * 可选值：
    * - 'fail permission denied, open ${path}': 指定的 path 路径没有读权限;
    * - 'fail no such file or directory ${path}': 文件不存在;
    * - 'fail operation not permitted, unlink ${filePath}': 传入的 filePath 是一个目录; */
  var errMsg: String = js.native
}

object UnlinkFailCallbackResult {
  @scala.inline
  def apply(errMsg: String): UnlinkFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlinkFailCallbackResult]
  }
  @scala.inline
  implicit class UnlinkFailCallbackResultOps[Self <: UnlinkFailCallbackResult] (val x: Self) extends AnyVal {
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
  }
  
}

