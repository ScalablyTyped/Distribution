package typings.wxDashServerDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrMsgFileID extends js.Object {
  var errMsg: String
  var fileID: String
  var status: Double
}

object Anon_ErrMsgFileID {
  @scala.inline
  def apply(errMsg: String, fileID: String, status: Double): Anon_ErrMsgFileID = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ErrMsgFileID]
  }
}

