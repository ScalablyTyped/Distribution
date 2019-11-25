package typings.wxDashJsDashSdkDashDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated
  */
trait MenuShareQQ extends ShareTimelineConfig {
  /**
    * 分享描述
    */
  var desc: String
}

object MenuShareQQ {
  @scala.inline
  def apply(
    desc: String,
    link: String,
    title: String,
    cancel: () => Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null,
    imgUrl: String = null,
    success: /* res */ js.UndefOr[js.Any] => Unit = null,
    trigger: () => Unit = null
  ): MenuShareQQ = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (trigger != null) __obj.updateDynamic("trigger")(js.Any.fromFunction0(trigger))
    __obj.asInstanceOf[MenuShareQQ]
  }
}

