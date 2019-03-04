package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 计算文件摘要的算法，默认值 md5，有效值：md5，sha1 */
  var digestAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  /** 本地文件路径 */
  var filePath: java.lang.String
  @JSName("success")
  var success_GetFileInfoOptions: js.UndefOr[js.Function1[/* options */ GetFileInfoSuccess, scala.Unit]] = js.undefined
}

object GetFileInfoOptions {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    digestAlgorithm: java.lang.String = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* options */ GetFileInfoSuccess, scala.Unit] = null
  ): GetFileInfoOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (digestAlgorithm != null) __obj.updateDynamic("digestAlgorithm")(digestAlgorithm)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[GetFileInfoOptions]
  }
}

