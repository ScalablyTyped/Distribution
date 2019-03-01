package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MChooseLocationOptions(res: ChooseLocationData): scala.Unit
}

object ChooseLocationOptions {
  @scala.inline
  def apply(
    success: js.Function1[ChooseLocationData, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): ChooseLocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[ChooseLocationOptions]
  }
}

