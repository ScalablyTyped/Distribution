package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.wechatMiniprogramNumbers.`1`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`2`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`3`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrMsg extends js.Object {
  
  /**
    * MediaError.code
    *
    * - 1 获取资源被用户禁止
    * - 2 网络错误
    * - 3 解码错误
    * - 4 不合适资源
    */
  var errMsg: `1` | `2` | `3` | `4` = js.native
}
object ErrMsg {
  
  @scala.inline
  def apply(errMsg: `1` | `2` | `3` | `4`): ErrMsg = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrMsg]
  }
  
  @scala.inline
  implicit class ErrMsgOps[Self <: ErrMsg] (val x: Self) extends AnyVal {
    
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
    def setErrMsg(value: `1` | `2` | `3` | `4`): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
}
