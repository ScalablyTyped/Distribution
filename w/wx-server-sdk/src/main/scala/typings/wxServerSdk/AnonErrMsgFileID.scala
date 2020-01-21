package typings.wxServerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrMsgFileID extends js.Object {
  var errMsg: String
  var fileID: String
  var status: Double
}

object AnonErrMsgFileID {
  @scala.inline
  def apply(errMsg: String, fileID: String, status: Double): AnonErrMsgFileID = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrMsgFileID]
  }
}

