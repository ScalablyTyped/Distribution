package typings.wxDashServerDashSdk.wxDashServerDashSdkMod

import typings.wxDashServerDashSdk.Anon_ErrMsgFileID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileSuccess extends js.Object {
  var fileList: js.Array[Anon_ErrMsgFileID]
}

object DeleteFileSuccess {
  @scala.inline
  def apply(fileList: js.Array[Anon_ErrMsgFileID]): DeleteFileSuccess = {
    val __obj = js.Dynamic.literal(fileList = fileList)
  
    __obj.asInstanceOf[DeleteFileSuccess]
  }
}

