package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeekBackgroundAudioOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 音乐位置，单位：秒 */
  var position: Double
}

object SeekBackgroundAudioOptions {
  @scala.inline
  def apply(
    position: Double,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): SeekBackgroundAudioOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SeekBackgroundAudioOptions]
  }
}

