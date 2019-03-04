package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 媒体-----音频播放控制
trait PlayVoiceOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 需要播放的语音文件的文件路径 */
  var filePath: java.lang.String
}

object PlayVoiceOptions {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): PlayVoiceOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[PlayVoiceOptions]
  }
}

