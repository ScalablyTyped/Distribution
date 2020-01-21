package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralCallbackResult extends js.Object {
  /**
    * 错误信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
}

object GeneralCallbackResult {
  @scala.inline
  def apply(errMsg: String = null): GeneralCallbackResult = {
    val __obj = js.Dynamic.literal()
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralCallbackResult]
  }
}

