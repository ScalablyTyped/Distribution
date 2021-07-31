package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraFrameListener extends StObject {
  
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
