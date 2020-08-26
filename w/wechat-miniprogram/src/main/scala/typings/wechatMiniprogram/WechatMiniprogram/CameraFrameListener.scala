package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraFrameListener extends js.Object {
  /** [CameraFrameListener.start(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraFrameListener.start.html)
    *
    * 开始监听帧数据 */
  def start(): Unit = js.native
  def start(option: CameraFrameListenerStartOption): Unit = js.native
  /** [CameraFrameListener.stop(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraFrameListener.stop.html)
    *
    * 停止监听帧数据 */
  def stop(): Unit = js.native
  def stop(option: StopOption): Unit = js.native
}

