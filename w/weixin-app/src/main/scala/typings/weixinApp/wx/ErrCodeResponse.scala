package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrCodeResponse extends StObject {
  
  var errCode: Double
}
object ErrCodeResponse {
  
  inline def apply(errCode: Double): ErrCodeResponse = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrCodeResponse]
  }
  
  extension [Self <: ErrCodeResponse](x: Self) {
    
    inline def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
  }
}
