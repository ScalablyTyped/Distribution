package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteFailMask extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 是否显示透明蒙层
    */
  var mask: js.UndefOr[Boolean] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 提示的内容
    */
  var title: js.UndefOr[String] = js.undefined
}

object Anon_CompleteFailMask {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    fail: () => Unit = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    success: () => Unit = null,
    title: String = null
  ): Anon_CompleteFailMask = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_CompleteFailMask]
  }
}

