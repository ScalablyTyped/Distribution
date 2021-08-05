package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExtConfigRes extends StObject {
  
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[String] = js.undefined
  
  /**
    * 第三方平台自定义的数据
    */
  var extConfig: js.UndefOr[js.Any] = js.undefined
}
object GetExtConfigRes {
  
  inline def apply(): GetExtConfigRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExtConfigRes]
  }
  
  extension [Self <: GetExtConfigRes](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
    
    inline def setExtConfig(value: js.Any): Self = StObject.set(x, "extConfig", value.asInstanceOf[js.Any])
    
    inline def setExtConfigUndefined: Self = StObject.set(x, "extConfig", js.undefined)
  }
}
