package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrCodeResponse extends js.Object {
  var errCode: Double
}

object ErrCodeResponse {
  @scala.inline
  def apply(errCode: Double): ErrCodeResponse = {
    val __obj = js.Dynamic.literal(errCode = errCode)
  
    __obj.asInstanceOf[ErrCodeResponse]
  }
}

