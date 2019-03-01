package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LivePlayerContext extends js.Object {
  /** 退出全屏 */
  def exitFullScreen(options: BaseOptions[_, _]): scala.Unit
  /** 静音 */
  def mute(options: BaseOptions[_, _]): scala.Unit
  /** 播放 */
  def play(options: BaseOptions[_, _]): scala.Unit
  /** 进入全屏 */
  def requestFullScreen(options: RequestFullScreenOptions): scala.Unit
  /** 停止 */
  def stop(options: BaseOptions[_, _]): scala.Unit
}

object LivePlayerContext {
  @scala.inline
  def apply(
    exitFullScreen: js.Function1[BaseOptions[_, _], scala.Unit],
    mute: js.Function1[BaseOptions[_, _], scala.Unit],
    play: js.Function1[BaseOptions[_, _], scala.Unit],
    requestFullScreen: js.Function1[RequestFullScreenOptions, scala.Unit],
    stop: js.Function1[BaseOptions[_, _], scala.Unit]
  ): LivePlayerContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exitFullScreen")(exitFullScreen)
    __obj.updateDynamic("mute")(mute)
    __obj.updateDynamic("play")(play)
    __obj.updateDynamic("requestFullScreen")(requestFullScreen)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[LivePlayerContext]
  }
}

