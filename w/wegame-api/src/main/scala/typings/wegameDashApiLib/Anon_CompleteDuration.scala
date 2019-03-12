package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteDuration extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 提示的延迟时间
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 图标
    */
  var icon: js.UndefOr[
    wegameDashApiLib.wegameDashApiLibStrings.success | wegameDashApiLib.wegameDashApiLibStrings.loading
  ] = js.undefined
  /**
    * 自定义图标的本地路径，image 的优先级高于 icon
    */
  var image: js.UndefOr[java.lang.String] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 提示的内容
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CompleteDuration {
  @scala.inline
  def apply(
    complete: () => scala.Unit = null,
    duration: scala.Int | scala.Double = null,
    fail: () => scala.Unit = null,
    icon: wegameDashApiLib.wegameDashApiLibStrings.success | wegameDashApiLib.wegameDashApiLibStrings.loading = null,
    image: java.lang.String = null,
    success: () => scala.Unit = null,
    title: java.lang.String = null
  ): Anon_CompleteDuration = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_CompleteDuration]
  }
}

