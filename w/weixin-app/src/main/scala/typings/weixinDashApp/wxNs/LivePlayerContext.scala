package typings.weixinDashApp.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LivePlayerContext extends js.Object {
  /** 退出全屏 */
  def exitFullScreen(options: BaseOptions[_, _]): Unit
  /** 静音 */
  def mute(options: BaseOptions[_, _]): Unit
  /** 播放 */
  def play(options: BaseOptions[_, _]): Unit
  /** 进入全屏 */
  def requestFullScreen(options: RequestFullScreenOptions): Unit
  /** 停止 */
  def stop(options: BaseOptions[_, _]): Unit
}

object LivePlayerContext {
  @scala.inline
  def apply(
    exitFullScreen: BaseOptions[_, _] => Unit,
    mute: BaseOptions[_, _] => Unit,
    play: BaseOptions[_, _] => Unit,
    requestFullScreen: RequestFullScreenOptions => Unit,
    stop: BaseOptions[_, _] => Unit
  ): LivePlayerContext = {
    val __obj = js.Dynamic.literal(exitFullScreen = js.Any.fromFunction1(exitFullScreen), mute = js.Any.fromFunction1(mute), play = js.Any.fromFunction1(play), requestFullScreen = js.Any.fromFunction1(requestFullScreen), stop = js.Any.fromFunction1(stop))
  
    __obj.asInstanceOf[LivePlayerContext]
  }
}

