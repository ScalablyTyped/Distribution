package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaQueryObserverObserveCallbackResult extends js.Object {
  /** 页面的当前状态是否满足所指定的 media query */
  var matches: Boolean = js.native
}

object MediaQueryObserverObserveCallbackResult {
  @scala.inline
  def apply(matches: Boolean): MediaQueryObserverObserveCallbackResult = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQueryObserverObserveCallbackResult]
  }
  @scala.inline
  implicit class MediaQueryObserverObserveCallbackResultOps[Self <: MediaQueryObserverObserveCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMatches(value: Boolean): Self = this.set("matches", value.asInstanceOf[js.Any])
  }
  
}

