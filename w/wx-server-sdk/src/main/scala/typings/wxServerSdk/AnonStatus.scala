package typings.wxServerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStatus extends js.Object {
  var errMsg: String
  var fileID: String
  var status: Double
}

object AnonStatus {
  @scala.inline
  def apply(errMsg: String, fileID: String, status: Double): AnonStatus = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStatus]
  }
}

