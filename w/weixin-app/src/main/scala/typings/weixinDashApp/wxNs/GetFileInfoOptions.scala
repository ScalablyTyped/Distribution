package typings.weixinDashApp.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 计算文件摘要的算法，默认值 md5，有效值：md5，sha1 */
  var digestAlgorithm: js.UndefOr[String] = js.undefined
  /** 本地文件路径 */
  var filePath: String
  @JSName("success")
  var success_GetFileInfoOptions: js.UndefOr[js.Function1[/* options */ GetFileInfoSuccess, Unit]] = js.undefined
}

object GetFileInfoOptions {
  @scala.inline
  def apply(
    filePath: String,
    complete: /* res */ js.Any => Unit = null,
    digestAlgorithm: String = null,
    fail: js.Any => Unit = null,
    success: /* options */ GetFileInfoSuccess => Unit = null
  ): GetFileInfoOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (digestAlgorithm != null) __obj.updateDynamic("digestAlgorithm")(digestAlgorithm)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetFileInfoOptions]
  }
}

