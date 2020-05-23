package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrCode extends js.Object {
  var errCode: Double
  var errMsg: String
}

object ErrCode {
  @scala.inline
  def apply(errCode: Double, errMsg: String): ErrCode = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrCode]
  }
}

