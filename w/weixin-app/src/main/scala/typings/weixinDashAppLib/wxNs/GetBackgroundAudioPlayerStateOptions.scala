package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBackgroundAudioPlayerStateOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  @JSName("complete")
  var complete_GetBackgroundAudioPlayerStateOptions: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** 接口调用失败的回调函数 */
  @JSName("fail")
  var fail_GetBackgroundAudioPlayerStateOptions: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_GetBackgroundAudioPlayerStateOptions: js.UndefOr[js.Function1[/* state */ BackgroundAudioPlayerState, scala.Unit]] = js.undefined
}

object GetBackgroundAudioPlayerStateOptions {
  @scala.inline
  def apply(
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function0[scala.Unit] = null,
    success: js.Function1[/* state */ BackgroundAudioPlayerState, scala.Unit] = null
  ): GetBackgroundAudioPlayerStateOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[GetBackgroundAudioPlayerStateOptions]
  }
}

