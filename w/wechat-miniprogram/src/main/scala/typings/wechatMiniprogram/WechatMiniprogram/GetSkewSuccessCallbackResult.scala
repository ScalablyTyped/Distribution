package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSkewSuccessCallbackResult extends js.Object {
  
  var errMsg: String = js.native
  
  /** 倾斜角 */
  var skew: Double = js.native
}
object GetSkewSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, skew: Double): GetSkewSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], skew = skew.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSkewSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetSkewSuccessCallbackResultOps[Self <: GetSkewSuccessCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setSkew(value: Double): Self = this.set("skew", value.asInstanceOf[js.Any])
  }
}
