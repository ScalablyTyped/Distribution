package typings.wechatMiniprogram.ICloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallFunctionParam
  extends StObject
     with ICloudAPIParam[CallFunctionResult] {
  
  var data: js.UndefOr[CallFunctionData] = js.undefined
  
  var name: String
  
  var slow: js.UndefOr[Boolean] = js.undefined
}
object CallFunctionParam {
  
  @scala.inline
  def apply(name: String): CallFunctionParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFunctionParam]
  }
  
  @scala.inline
  implicit class CallFunctionParamMutableBuilder[Self <: CallFunctionParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: CallFunctionData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlow(value: Boolean): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
  }
}
