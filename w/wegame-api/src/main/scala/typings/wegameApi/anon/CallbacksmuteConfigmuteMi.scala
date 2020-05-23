package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined wegame-api.wx.types.Callbacks & {  muteConfig  :{  muteMicrophone ? :boolean,   muteEarphone ? :boolean}} */
trait CallbacksmuteConfigmuteMi extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 静音设置
    */
  var muteConfig: MuteEarphone
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object CallbacksmuteConfigmuteMi {
  @scala.inline
  def apply(
    muteConfig: MuteEarphone,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): CallbacksmuteConfigmuteMi = {
    val __obj = js.Dynamic.literal(muteConfig = muteConfig.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[CallbacksmuteConfigmuteMi]
  }
}

