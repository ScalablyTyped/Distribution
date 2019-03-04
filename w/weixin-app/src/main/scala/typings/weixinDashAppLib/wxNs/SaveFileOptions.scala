package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveFileOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 返回文件的保存路径，res = {savedFilePath: '文件的保存路径'} */
  @JSName("success")
  var success_SaveFileOptions: js.UndefOr[js.Function1[/* res */ SavedFileData, scala.Unit]] = js.undefined
  /** 需要保存的文件的临时路径 */
  var tempFilePath: java.lang.String
}

object SaveFileOptions {
  @scala.inline
  def apply(
    tempFilePath: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ SavedFileData, scala.Unit] = null
  ): SaveFileOptions = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SaveFileOptions]
  }
}

