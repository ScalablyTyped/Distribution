package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.black
import typings.wegameApi.wegameApiStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSuccess extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: white | black
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object StyleSuccess {
  @scala.inline
  def apply(
    style: white | black,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): StyleSuccess = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[StyleSuccess]
  }
}

