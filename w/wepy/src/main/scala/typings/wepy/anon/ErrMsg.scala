package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrMsg extends js.Object {
  var errMsg: String
  var isEnrolled: Boolean
}

object ErrMsg {
  @scala.inline
  def apply(errMsg: String, isEnrolled: Boolean): ErrMsg = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], isEnrolled = isEnrolled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrMsg]
  }
}

