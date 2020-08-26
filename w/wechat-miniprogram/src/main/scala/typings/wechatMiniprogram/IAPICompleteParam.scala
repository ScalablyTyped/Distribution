package typings.wechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wechatMiniprogram.IAPISuccessParam
  - typings.wechatMiniprogram.IAPIError
*/
trait IAPICompleteParam extends js.Object

object IAPICompleteParam {
  @scala.inline
  def IAPISuccessParam(errMsg: String): IAPICompleteParam = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAPICompleteParam]
  }
  @scala.inline
  def IAPIError(errMsg: String): IAPICompleteParam = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAPICompleteParam]
  }
}

