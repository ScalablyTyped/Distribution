package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.loading
import typings.wegameApi.wegameApiStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 提示的延迟时间
    */
  var duration: js.UndefOr[Double] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 图标
    */
  var icon: js.UndefOr[success | loading] = js.undefined
  /**
    * 自定义图标的本地路径，image 的优先级高于 icon
    */
  var image: js.UndefOr[String] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 提示的内容
    */
  var title: js.UndefOr[String] = js.undefined
}

object Title {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    duration: js.UndefOr[Double] = js.undefined,
    fail: () => Unit = null,
    icon: success | loading = null,
    image: String = null,
    success: () => Unit = null,
    title: String = null
  ): Title = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
}

