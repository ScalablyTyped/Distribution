package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSavedFileInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  var filePath: java.lang.String
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_GetSavedFileInfoOptions: js.UndefOr[js.Function1[/* res */ SavedFileInfoData, scala.Unit]] = js.undefined
}

object GetSavedFileInfoOptions {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ SavedFileInfoData, scala.Unit] = null
  ): GetSavedFileInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filePath")(filePath)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[GetSavedFileInfoOptions]
  }
}

