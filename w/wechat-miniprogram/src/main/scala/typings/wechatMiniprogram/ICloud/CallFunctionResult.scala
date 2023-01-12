package typings.wechatMiniprogram.ICloud

import typings.wechatMiniprogram.AnyObject
import typings.wechatMiniprogram.IAPISuccessParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallFunctionResult
  extends StObject
     with IAPISuccessParam {
  
  var result: js.UndefOr[AnyObject | String] = js.undefined
}
object CallFunctionResult {
  
  inline def apply(errMsg: String): CallFunctionResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFunctionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallFunctionResult] (val x: Self) extends AnyVal {
    
    inline def setResult(value: AnyObject | String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
