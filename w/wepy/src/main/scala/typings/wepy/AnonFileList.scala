package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFileList extends js.Object {
  var errMsg: String
  var fileList: js.Array[js.Object]
}

object AnonFileList {
  @scala.inline
  def apply(errMsg: String, fileList: js.Array[js.Object]): AnonFileList = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFileList]
  }
}

