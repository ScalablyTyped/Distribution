package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrCode extends StObject {
  
  /**
    * 错误码
    *
    * - `10001` 用户禁止使用摄像头
    * - `10002` 用户禁止使用录音
    * - `10003` 背景音资源 (BGM) 加载失败
    * - `10004` 等待画面资源 (waiting-image) 加载失败
    */
  var errCode: Double = js.native
  
  var errMsg: String = js.native
}
object ErrCode {
  
  @scala.inline
  def apply(errCode: Double, errMsg: String): ErrCode = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrCode]
  }
  
  @scala.inline
  implicit class ErrCodeMutableBuilder[Self <: ErrCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
