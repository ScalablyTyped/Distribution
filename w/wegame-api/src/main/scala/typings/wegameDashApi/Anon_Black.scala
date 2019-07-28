package typings.wegameDashApi

import typings.wegameDashApi.wegameDashApiStrings.black
import typings.wegameDashApi.wegameDashApiStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Black extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: white | black
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Anon_Black {
  @scala.inline
  def apply(
    style: white | black,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): Anon_Black = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[Anon_Black]
  }
}

