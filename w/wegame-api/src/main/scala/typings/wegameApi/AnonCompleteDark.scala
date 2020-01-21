package typings.wegameApi

import typings.wegameApi.wegameApiStrings.dark
import typings.wegameApi.wegameApiStrings.light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompleteDark extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 样式风格
    */
  var style: light | dark
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnonCompleteDark {
  @scala.inline
  def apply(
    style: light | dark,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): AnonCompleteDark = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[AnonCompleteDark]
  }
}

