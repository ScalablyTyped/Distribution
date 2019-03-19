package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClipboardDataSuccessRes extends js.Object {
  /**
    * 剪贴板的内容
    */
  var data: js.UndefOr[java.lang.String] = js.undefined
}

object GetClipboardDataSuccessRes {
  @scala.inline
  def apply(data: java.lang.String = null): GetClipboardDataSuccessRes = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[GetClipboardDataSuccessRes]
  }
}

