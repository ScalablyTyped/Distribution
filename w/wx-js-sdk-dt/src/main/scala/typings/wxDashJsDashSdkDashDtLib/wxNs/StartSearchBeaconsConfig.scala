package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSearchBeaconsConfig extends WxBaseRequestConfig {
  /**
    * 摇周边的业务ticket, 系统自动添加在摇出来的页面链接后面
    */
  var ticket: java.lang.String
  /**
    * 完成后的回调
    */
  @JSName("complete")
  def complete_MStartSearchBeaconsConfig(argv: js.Any): scala.Unit
}

object StartSearchBeaconsConfig {
  @scala.inline
  def apply(
    complete: js.Function1[js.Any, scala.Unit],
    ticket: java.lang.String,
    cancel: js.Function0[scala.Unit] = null,
    fail: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    success: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null
  ): StartSearchBeaconsConfig = {
    val __obj = js.Dynamic.literal(complete = complete, ticket = ticket)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[StartSearchBeaconsConfig]
  }
}

