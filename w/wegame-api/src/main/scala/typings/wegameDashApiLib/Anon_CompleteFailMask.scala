package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteFailMask extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 是否显示透明蒙层
    */
  var mask: js.UndefOr[scala.Boolean] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 提示的内容
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CompleteFailMask {
  @scala.inline
  def apply(
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function0[scala.Unit] = null,
    mask: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Function0[scala.Unit] = null,
    title: java.lang.String = null
  ): Anon_CompleteFailMask = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask)
    if (success != null) __obj.updateDynamic("success")(success)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_CompleteFailMask]
  }
}

