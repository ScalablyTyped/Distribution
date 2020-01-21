package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrMsg extends js.Object {
  var errMsg: String
  var isEnrolled: Boolean
}

object AnonErrMsg {
  @scala.inline
  def apply(errMsg: String, isEnrolled: Boolean): AnonErrMsg = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], isEnrolled = isEnrolled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrMsg]
  }
}

