package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LivePusherContext extends StObject {
  
  /** [LivePusherContext.pause(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePusherContext.pause.html)
    *
    * 暂停推流 */
  def pause(): Unit = js.native
  def pause(option: PauseOption): Unit = js.native
  
  /** [LivePusherContext.pauseBGM(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePusherContext.pauseBGM.html)
    *
    * 暂停背景音
    *
    * 最低基础库： `2.4.0` */
  def pauseBGM(): Unit = js.native
  def pauseBGM(option: PauseBGMOption): Unit = js.native
  
  /** [LivePusherContext.playBGM(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePusherContext.playBGM.html)
    *
    * 播放背景音
    *
    * 最低基础库： `2.4.0` */
  def playBGM(option: PlayBGMOption): Unit = js.native
  
  /** [LivePusherContext.resume(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePusherContext.resume.html)
    *
    * 恢复推流 */
  def resume(): Unit = js.native
  def resume(option: ResumeOption): Unit = js.native
  
  /** [LivePusherContext.resumeBGM(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePusherContext.resumeBGM.html)
    *
    * 恢复背景音
    *
    * 最低基础库： `2.4.0` */
  def resumeBGM(): Unit = js.native
  def resumeBGM(option: ResumeBGMOption): Unit = js.native
  
  /** [LivePusherContext.sendMessage(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePusherContext.sendMessage.html)
    *
    * 发送SEI消息
    *
    * 最低基础库： `2.10.0` */
  def sendMessage(): Unit = js.native
  def sendMessage(option: SendMessageOption): Unit = js.native
  
  /** [LivePusherContext.setBGMVolume(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePusherContext.setBGMVolume.html)
    *
    * 设置背景音音量
    *
    * 最低基础库： `2.4.0` */
  def setBGMVolume(option: SetBGMVolumeOption): Unit = js.native
  
  /** [LivePusherContext.setMICVolume(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePusherContext.setMICVolume.html)
    *
    * 设置麦克风音量
    *
    * 最低基础库： `2.10.0` */
  def setMICVolume(option: SetMICVolumeOption): Unit = js.native
  
  /** [LivePusherContext.snapshot(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePusherContext.snapshot.html)
    *
    * 快照
    *
    * 最低基础库： `1.9.90` */
  def snapshot(option: LivePusherContextSnapshotOption): Unit = js.native
  
  /** [LivePusherContext.start(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePusherContext.start.html)
    *
    * 开始推流，同时开启摄像头预览 */
  def start(): Unit = js.native
  def start(option: CameraFrameListenerStartOption): Unit = js.native
  
  /** [LivePusherContext.startPreview(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePusherContext.startPreview.html)
    *
    * 开启摄像头预览
    *
    * 最低基础库： `2.7.0` */
  def startPreview(): Unit = js.native
  def startPreview(option: StartPreviewOption): Unit = js.native
  
  /** [LivePusherContext.stop(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePusherContext.stop.html)
    *
    * 停止推流，同时停止摄像头预览 */
  def stop(): Unit = js.native
  def stop(option: StopOption): Unit = js.native
  
  /** [LivePusherContext.stopBGM(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePusherContext.stopBGM.html)
    *
    * 停止背景音
    *
    * 最低基础库： `2.4.0` */
  def stopBGM(): Unit = js.native
  def stopBGM(option: StopBGMOption): Unit = js.native
  
  /** [LivePusherContext.stopPreview(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePusherContext.stopPreview.html)
    *
    * 关闭摄像头预览
    *
    * 最低基础库： `2.7.0` */
  def stopPreview(): Unit = js.native
  def stopPreview(option: StopPreviewOption): Unit = js.native
  
  /** [LivePusherContext.switchCamera(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePusherContext.switchCamera.html)
    *
    * 切换前后摄像头 */
  def switchCamera(): Unit = js.native
  def switchCamera(option: SwitchCameraOption): Unit = js.native
  
  /** [LivePusherContext.toggleTorch(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePusherContext.toggleTorch.html)
    *
    * 切换手电筒
    *
    * 最低基础库： `2.1.0` */
  def toggleTorch(): Unit = js.native
  def toggleTorch(option: ToggleTorchOption): Unit = js.native
}
