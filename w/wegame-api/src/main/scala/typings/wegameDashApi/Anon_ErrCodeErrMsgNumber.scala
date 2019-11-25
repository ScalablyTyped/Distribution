package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrCodeErrMsgNumber extends js.Object {
  /**
    * 错误码
    */
  var errCode: Double
  /**
    * 调用结果（错误原因）
    */
  var errMsg: String
}

object Anon_ErrCodeErrMsgNumber {
  @scala.inline
  def apply(errCode: Double, errMsg: String): Anon_ErrCodeErrMsgNumber = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ErrCodeErrMsgNumber]
  }
}

