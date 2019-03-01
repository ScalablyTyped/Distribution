package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopSearchBeaconsConfig extends WxBaseRequestConfig {
  @JSName("complete")
  def complete_MStopSearchBeaconsConfig(res: js.Any): scala.Unit
}

object StopSearchBeaconsConfig {
  @scala.inline
  def apply(
    complete: js.Function1[js.Any, scala.Unit],
    cancel: js.Function0[scala.Unit] = null,
    fail: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    success: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null
  ): StopSearchBeaconsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[StopSearchBeaconsConfig]
  }
}

