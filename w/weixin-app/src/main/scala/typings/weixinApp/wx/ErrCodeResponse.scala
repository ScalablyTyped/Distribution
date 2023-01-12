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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrCodeResponse] (val x: Self) extends AnyVal {
    
    inline def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
  }
}
