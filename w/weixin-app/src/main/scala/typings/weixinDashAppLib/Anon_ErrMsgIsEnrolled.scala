package typings
package weixinDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrMsgIsEnrolled extends js.Object {
   // 是否已录入信息
  var errMsg: java.lang.String
  var isEnrolled: scala.Boolean
}

object Anon_ErrMsgIsEnrolled {
  @scala.inline
  def apply(errMsg: java.lang.String, isEnrolled: scala.Boolean): Anon_ErrMsgIsEnrolled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errMsg")(errMsg)
    __obj.updateDynamic("isEnrolled")(isEnrolled)
    __obj.asInstanceOf[Anon_ErrMsgIsEnrolled]
  }
}

