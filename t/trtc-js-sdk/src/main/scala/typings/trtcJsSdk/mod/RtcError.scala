package typings.trtcJsSdk.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RtcError extends Error {
  /** 获取错误码, 详细错误码列表参见 [ErrorCode](https://trtc-1252463788.file.myqcloud.com/web/docs/module-ErrorCode.html) */
  def getCode(): String
}

object RtcError {
  @scala.inline
  def apply(getCode: () => String, message: String, name: String, stack: String = null): RtcError = {
    val __obj = js.Dynamic.literal(getCode = js.Any.fromFunction0(getCode), message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RtcError]
  }
}

