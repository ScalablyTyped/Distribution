package typings.wxServerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrMsg extends js.Object {
  var errMsg: String
  var fileID: String
  var status: Double
  var tempFileURL: String
}

object ErrMsg {
  @scala.inline
  def apply(errMsg: String, fileID: String, status: Double, tempFileURL: String): ErrMsg = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tempFileURL = tempFileURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrMsg]
  }
}

