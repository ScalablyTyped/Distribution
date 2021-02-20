package typings.wechatMiniprogram.ICloud

import typings.wechatMiniprogram.AnyObject
import typings.wechatMiniprogram.IAPISuccessParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallFunctionResult extends IAPISuccessParam {
  
  var result: js.UndefOr[AnyObject | String] = js.native
}
object CallFunctionResult {
  
  @scala.inline
  def apply(errMsg: String): CallFunctionResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFunctionResult]
  }
  
  @scala.inline
  implicit class CallFunctionResultMutableBuilder[Self <: CallFunctionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: AnyObject | String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
