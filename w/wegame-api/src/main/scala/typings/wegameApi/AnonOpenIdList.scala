package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpenIdList extends js.Object {
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

object AnonOpenIdList {
  @scala.inline
  def apply(errCode: Double, errMsg: String, openIdList: js.Array[String]): AnonOpenIdList = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], openIdList = openIdList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpenIdList]
  }
}

