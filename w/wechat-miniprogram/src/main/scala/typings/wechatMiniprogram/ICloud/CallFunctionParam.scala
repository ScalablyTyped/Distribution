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
  
  inline def apply(name: String): CallFunctionParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFunctionParam]
  }
  
  extension [Self <: CallFunctionParam](x: Self) {
    
    inline def setData(value: CallFunctionData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSlow(value: Boolean): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
    
    inline def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
  }
}
