package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClipboardDataSuccessRes extends js.Object {
  /**
    * 剪贴板的内容
    */
  var data: js.UndefOr[String] = js.undefined
}

object GetClipboardDataSuccessRes {
  @scala.inline
  def apply(data: String = null): GetClipboardDataSuccessRes = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClipboardDataSuccessRes]
  }
}

