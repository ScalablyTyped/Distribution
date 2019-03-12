package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuShareWeibo extends ShareTimelineConfig {
  /**
    * 分享描述
    */
  var desc: java.lang.String
}

object MenuShareWeibo {
  @scala.inline
  def apply(
    desc: java.lang.String,
    link: java.lang.String,
    title: java.lang.String,
    cancel: () => scala.Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => scala.Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => scala.Unit = null,
    imgUrl: java.lang.String = null,
    success: /* res */ js.UndefOr[js.Any] => scala.Unit = null,
    trigger: () => scala.Unit = null
  ): MenuShareWeibo = {
    val __obj = js.Dynamic.literal(desc = desc, link = link, title = title)
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (trigger != null) __obj.updateDynamic("trigger")(js.Any.fromFunction0(trigger))
    __obj.asInstanceOf[MenuShareWeibo]
  }
}

