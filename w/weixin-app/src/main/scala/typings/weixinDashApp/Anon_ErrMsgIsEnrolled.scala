package typings.weixinDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrMsgIsEnrolled extends js.Object {
   // 是否已录入信息
  var errMsg: String
  var isEnrolled: Boolean
}

object Anon_ErrMsgIsEnrolled {
  @scala.inline
  def apply(errMsg: String, isEnrolled: Boolean): Anon_ErrMsgIsEnrolled = {
    val __obj = js.Dynamic.literal(errMsg = errMsg, isEnrolled = isEnrolled)
  
    __obj.asInstanceOf[Anon_ErrMsgIsEnrolled]
  }
}

