package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.ICloud.CallFunctionData
import typings.wechatMiniprogram.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wechat-miniprogram.RQ<wechat-miniprogram.ICloud.CallFunctionParam> */
trait RQCallFunctionParam extends StObject {
  
  var config: js.UndefOr[ICloudConfig] = js.undefined
  
  var data: js.UndefOr[CallFunctionData] = js.undefined
  
  var name: String
  
  var slow: js.UndefOr[Boolean] = js.undefined
}
object RQCallFunctionParam {
  
  inline def apply(name: String): RQCallFunctionParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQCallFunctionParam]
  }
  
  extension [Self <: RQCallFunctionParam](x: Self) {
    
    inline def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setData(value: CallFunctionData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSlow(value: Boolean): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
    
    inline def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
  }
}
