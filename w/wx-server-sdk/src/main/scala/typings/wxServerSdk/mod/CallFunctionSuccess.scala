package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallFunctionSuccess extends js.Object {
  var errMsg: String
  var requestID: String
  var result: String
}

object CallFunctionSuccess {
  @scala.inline
  def apply(errMsg: String, requestID: String, result: String): CallFunctionSuccess = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], requestID = requestID.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFunctionSuccess]
  }
}

