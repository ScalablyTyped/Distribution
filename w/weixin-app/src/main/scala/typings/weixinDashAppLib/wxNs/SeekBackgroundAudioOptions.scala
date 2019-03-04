package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeekBackgroundAudioOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 音乐位置，单位：秒 */
  var position: scala.Double
}

object SeekBackgroundAudioOptions {
  @scala.inline
  def apply(
    position: scala.Double,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): SeekBackgroundAudioOptions = {
    val __obj = js.Dynamic.literal(position = position)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SeekBackgroundAudioOptions]
  }
}

