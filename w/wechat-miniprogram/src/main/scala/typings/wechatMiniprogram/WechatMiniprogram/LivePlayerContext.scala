package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LivePlayerContext extends StObject {
  
  /** [LivePlayerContext.exitFullScreen(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePlayerContext.exitFullScreen.html)
    *
    * 退出全屏 */
  def exitFullScreen(): Unit = js.native
  def exitFullScreen(option: ExitFullScreenOption): Unit = js.native
  
  /** [LivePlayerContext.exitPictureInPicture(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePlayerContext.exitPictureInPicture.html)
    *
    * 退出小窗，该方法可在任意页面调用 */
  def exitPictureInPicture(): Unit = js.native
  def exitPictureInPicture(option: ExitPictureInPictureOption): Unit = js.native
  
  /** [LivePlayerContext.mute(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePlayerContext.mute.html)
    *
    * 静音 */
  def mute(): Unit = js.native
  def mute(option: MuteOption): Unit = js.native
  
  /** [LivePlayerContext.pause(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePlayerContext.pause.html)
    *
    * 暂停
    *
    * 最低基础库： `1.9.90` */
  def pause(): Unit = js.native
  def pause(option: PauseOption): Unit = js.native
  
  /** [LivePlayerContext.play(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePlayerContext.play.html)
    *
    * 播放 */
  def play(): Unit = js.native
  def play(option: PlayOption): Unit = js.native
  
  /** [LivePlayerContext.requestFullScreen(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePlayerContext.requestFullScreen.html)
    *
    * 进入全屏 */
  def requestFullScreen(option: LivePlayerContextRequestFullScreenOption): Unit = js.native
  
  /** [LivePlayerContext.requestPictureInPicture(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePlayerContext.requestPictureInPicture.html)
    *
    * 进入小窗
    *
    * 最低基础库： `2.15.0` */
  def requestPictureInPicture(): Unit = js.native
  def requestPictureInPicture(option: RequestPictureInPictureOption): Unit = js.native
  
  /** [LivePlayerContext.resume(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePlayerContext.resume.html)
    *
    * 恢复
    *
    * 最低基础库： `1.9.90` */
  def resume(): Unit = js.native
  def resume(option: ResumeOption): Unit = js.native
  
  /** [LivePlayerContext.snapshot(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePlayerContext.snapshot.html)
    *
    * 截图
    *
    * 最低基础库： `2.7.1` */
  def snapshot(option: LivePlayerContextSnapshotOption): Unit = js.native
  
  /** [LivePlayerContext.stop(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePlayerContext.stop.html)
    *
    * 停止 */
  def stop(): Unit = js.native
  def stop(option: StopOption): Unit = js.native
}
