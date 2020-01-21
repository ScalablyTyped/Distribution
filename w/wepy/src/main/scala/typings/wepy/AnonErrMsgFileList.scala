package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrMsgFileList extends js.Object {
  var errMsg: String
  var fileList: js.Array[js.Object]
}

object AnonErrMsgFileList {
  @scala.inline
  def apply(errMsg: String, fileList: js.Array[js.Object]): AnonErrMsgFileList = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrMsgFileList]
  }
}

