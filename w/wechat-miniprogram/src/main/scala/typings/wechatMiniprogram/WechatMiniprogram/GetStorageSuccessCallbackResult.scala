package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStorageSuccessCallbackResult extends StObject {
  
  /** key对应的内容 */
  var data: js.Any = js.native
  
  var errMsg: String = js.native
}
object GetStorageSuccessCallbackResult {
  
  @scala.inline
  def apply(data: js.Any, errMsg: String): GetStorageSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStorageSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetStorageSuccessCallbackResultMutableBuilder[Self <: GetStorageSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
