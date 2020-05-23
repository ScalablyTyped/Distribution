package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileList extends js.Object {
  var errMsg: String
  var fileList: js.Array[js.Object]
}

object FileList {
  @scala.inline
  def apply(errMsg: String, fileList: js.Array[js.Object]): FileList = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileList]
  }
}

