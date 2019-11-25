package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrMsg extends js.Object {
  var errMsg: String
  var isEnrolled: Boolean
}

object Anon_ErrMsg {
  @scala.inline
  def apply(errMsg: String, isEnrolled: Boolean): Anon_ErrMsg = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], isEnrolled = isEnrolled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ErrMsg]
  }
}

