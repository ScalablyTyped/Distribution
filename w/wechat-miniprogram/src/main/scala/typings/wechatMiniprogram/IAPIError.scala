package typings.wechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAPIError
  extends StObject
     with IAPICompleteParam {
  
  var errMsg: String
}
object IAPIError {
  
  @scala.inline
  def apply(errMsg: String): IAPIError = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAPIError]
  }
  
  @scala.inline
  implicit class IAPIErrorMutableBuilder[Self <: IAPIError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
