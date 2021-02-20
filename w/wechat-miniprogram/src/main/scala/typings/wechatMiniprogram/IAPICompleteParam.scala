package typings.wechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.wechatMiniprogram.IAPISuccessParam
  - typings.wechatMiniprogram.IAPIError
*/
trait IAPICompleteParam extends StObject
object IAPICompleteParam {
  
  @scala.inline
  def IAPIError(errMsg: String): typings.wechatMiniprogram.IAPIError = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wechatMiniprogram.IAPIError]
  }
  
  @scala.inline
  def IAPISuccessParam(errMsg: String): typings.wechatMiniprogram.IAPISuccessParam = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wechatMiniprogram.IAPISuccessParam]
  }
}
