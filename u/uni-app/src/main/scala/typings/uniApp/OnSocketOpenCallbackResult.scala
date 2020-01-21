package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSocketOpenCallbackResult extends js.Object {
  /**
    * 连接成功的 HTTP 响应 Header
    */
  var header: js.UndefOr[js.Any] = js.undefined
}

object OnSocketOpenCallbackResult {
  @scala.inline
  def apply(header: js.Any = null): OnSocketOpenCallbackResult = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSocketOpenCallbackResult]
  }
}

