package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrCode extends js.Object {
  var errCode: Double
  var errMsg: String
}

object Anon_ErrCode {
  @scala.inline
  def apply(errCode: Double, errMsg: String): Anon_ErrCode = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ErrCode]
  }
}

