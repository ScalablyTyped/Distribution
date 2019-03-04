package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 显示照片预览用的配置对象
  */
trait PreviewImageConfig extends WxBaseRequestConfig {
  /**
    * 当前显示图片的 http 链接
    */
  var current: java.lang.String
  /**
    * 需要预览的图片 http 链接列表
    */
  var urls: js.Array[java.lang.String]
}

object PreviewImageConfig {
  @scala.inline
  def apply(
    current: java.lang.String,
    urls: js.Array[java.lang.String],
    cancel: js.Function0[scala.Unit] = null,
    complete: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    fail: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    success: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null
  ): PreviewImageConfig = {
    val __obj = js.Dynamic.literal(current = current, urls = urls)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[PreviewImageConfig]
  }
}

