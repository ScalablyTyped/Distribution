package typings.wxServerSdk.mod

import typings.wxServerSdk.anon.ErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TetTempFileURLSuccess extends js.Object {
  var fileList: js.Array[ErrMsg]
}

object TetTempFileURLSuccess {
  @scala.inline
  def apply(fileList: js.Array[ErrMsg]): TetTempFileURLSuccess = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[TetTempFileURLSuccess]
  }
}

