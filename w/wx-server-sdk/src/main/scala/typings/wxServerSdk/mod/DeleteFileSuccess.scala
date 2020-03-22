package typings.wxServerSdk.mod

import typings.wxServerSdk.AnonStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileSuccess extends js.Object {
  var fileList: js.Array[AnonStatus]
}

object DeleteFileSuccess {
  @scala.inline
  def apply(fileList: js.Array[AnonStatus]): DeleteFileSuccess = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteFileSuccess]
  }
}

