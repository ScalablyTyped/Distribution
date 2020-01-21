package typings.wxJsSdkDt.wx

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
  var current: String
  /**
    * 需要预览的图片 http 链接列表
    */
  var urls: js.Array[String]
}

object PreviewImageConfig {
  @scala.inline
  def apply(
    current: String,
    urls: js.Array[String],
    cancel: () => Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null,
    success: /* res */ js.UndefOr[js.Any] => Unit = null
  ): PreviewImageConfig = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[PreviewImageConfig]
  }
}

