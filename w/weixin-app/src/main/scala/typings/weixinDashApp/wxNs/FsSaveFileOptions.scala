package typings.weixinDashApp.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsSaveFileOptions extends SaveFileOptions {
  var filePath: String
}

object FsSaveFileOptions {
  @scala.inline
  def apply(
    filePath: String,
    tempFilePath: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ SavedFileData => Unit = null
  ): FsSaveFileOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath, tempFilePath = tempFilePath)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[FsSaveFileOptions]
  }
}

