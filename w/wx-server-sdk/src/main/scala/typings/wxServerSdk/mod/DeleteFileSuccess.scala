package typings.wxServerSdk.mod

import typings.wxServerSdk.AnonErrMsgFileID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileSuccess extends js.Object {
  var fileList: js.Array[AnonErrMsgFileID]
}

object DeleteFileSuccess {
  @scala.inline
  def apply(fileList: js.Array[AnonErrMsgFileID]): DeleteFileSuccess = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteFileSuccess]
  }
}

