package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrMsgFileList extends js.Object {
  var errMsg: String
  var fileList: js.Array[js.Object]
}

object Anon_ErrMsgFileList {
  @scala.inline
  def apply(errMsg: String, fileList: js.Array[js.Object]): Anon_ErrMsgFileList = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ErrMsgFileList]
  }
}

