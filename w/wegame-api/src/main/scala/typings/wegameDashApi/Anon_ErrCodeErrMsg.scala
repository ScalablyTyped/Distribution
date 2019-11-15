package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrCodeErrMsg extends js.Object {
  /**
    * 错误码
    */
  var errCode: Double
  /**
    * 调用结果
    */
  var errMsg: String
  /**
    * 在此通话中的成员 openId 名单
    */
  var openIdList: js.Array[String]
}

object Anon_ErrCodeErrMsg {
  @scala.inline
  def apply(errCode: Double, errMsg: String, openIdList: js.Array[String]): Anon_ErrCodeErrMsg = {
    val __obj = js.Dynamic.literal(errCode = errCode, errMsg = errMsg, openIdList = openIdList)
  
    __obj.asInstanceOf[Anon_ErrCodeErrMsg]
  }
}

