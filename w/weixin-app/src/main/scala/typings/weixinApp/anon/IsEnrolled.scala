package typings.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsEnrolled extends js.Object {
   // 是否已录入信息
  var errMsg: String
  var isEnrolled: Boolean
}

object IsEnrolled {
  @scala.inline
  def apply(errMsg: String, isEnrolled: Boolean): IsEnrolled = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], isEnrolled = isEnrolled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEnrolled]
  }
}

