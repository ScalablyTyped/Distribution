package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoContext extends js.Object {
  
  /** [VideoContext.exitFullScreen()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/VideoContext.exitFullScreen.html)
    *
    * 退出全屏
    *
    * 最低基础库： `1.4.0` */
  def exitFullScreen(): Unit = js.native
  
  /** [VideoContext.exitPictureInPicture(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/VideoContext.exitPictureInPicture.html)
    *
    * 退出小窗，该方法可在任意页面调用 */
  def exitPictureInPicture(): Unit = js.native
  def exitPictureInPicture(option: ExitPictureInPictureOption): Unit = js.native
  
  /** [VideoContext.hideStatusBar()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/VideoContext.hideStatusBar.html)
    *
    * 隐藏状态栏，仅在iOS全屏下有效
    *
    * 最低基础库： `2.1.0` */
  def hideStatusBar(): Unit = js.native
  
  /** [VideoContext.pause()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/VideoContext.pause.html)
    *
    * 暂停视频 */
  def pause(): Unit = js.native
  
  /** [VideoContext.play()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/VideoContext.play.html)
    *
    * 播放视频 */
  def play(): Unit = js.native
  
  /** [VideoContext.playbackRate(number rate)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/VideoContext.playbackRate.html)
    *
    * 设置倍速播放
    *
    * 最低基础库： `1.4.0` */
  def playbackRate(/** 倍率，支持 0.5/0.8/1.0/1.25/1.5，2.6.3 起支持 2.0 倍速 */
  rate: Double): Unit = js.native
  
  /** [VideoContext.requestFullScreen(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/VideoContext.requestFullScreen.html)
    *
    * 进入全屏。若有自定义内容需在全屏时展示，需将内容节点放置到 video 节点内。
    *
    * 最低基础库： `1.4.0` */
  def requestFullScreen(option: VideoContextRequestFullScreenOption): Unit = js.native
  
  /** [VideoContext.seek(number position)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/VideoContext.seek.html)
    *
    * 跳转到指定位置 */
  def seek(/** 跳转到的位置，单位 s */
  position: Double): Unit = js.native
  
  /** [VideoContext.sendDanmu(Object data)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/VideoContext.sendDanmu.html)
    *
    * 发送弹幕 */
  def sendDanmu(/** 弹幕内容 */
  data: Danmu): Unit = js.native
  
  /** [VideoContext.showStatusBar()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/VideoContext.showStatusBar.html)
    *
    * 显示状态栏，仅在iOS全屏下有效
    *
    * 最低基础库： `2.1.0` */
  def showStatusBar(): Unit = js.native
  
  /** [VideoContext.stop()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/VideoContext.stop.html)
    *
    * 停止视频
    *
    * 最低基础库： `1.7.0` */
  def stop(): Unit = js.native
}
