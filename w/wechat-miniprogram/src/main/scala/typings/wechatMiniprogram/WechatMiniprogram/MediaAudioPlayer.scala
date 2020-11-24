package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** MediaAudioPlayer 实例，可通过 [wx.createMediaAudioPlayer](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.createMediaAudioPlayer.html) 接口获取实例。 */
@js.native
trait MediaAudioPlayer extends js.Object {
  
  /** [Promise MediaAudioPlayer.addAudioSource([VideoDecoder](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.html) source)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/MediaAudioPlayer.addAudioSource.html)
    *
    * 添加音频源 */
  def addAudioSource(
    /** [VideoDecoder](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.html)
    *
    * 视频解码器实例。作为音频源添加到音频播放器中 */
  source: VideoDecoder
  ): js.Promise[_] = js.native
  
  /** [Promise MediaAudioPlayer.destroy()](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/MediaAudioPlayer.destroy.html)
    *
    * 销毁播放器 */
  def destroy(): js.Promise[_] = js.native
  
  /** [Promise MediaAudioPlayer.removeAudioSource([VideoDecoder](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.html) source)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/MediaAudioPlayer.removeAudioSource.html)
    *
    * 移除音频源 */
  def removeAudioSource(
    /** [VideoDecoder](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.html)
    *
    * 视频解码器实例 */
  source: VideoDecoder
  ): js.Promise[_] = js.native
  
  /** [Promise MediaAudioPlayer.start()](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/MediaAudioPlayer.start.html)
    *
    * 启动播放器 */
  def start(): js.Promise[_] = js.native
  
  /** [Promise MediaAudioPlayer.stop()](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/MediaAudioPlayer.stop.html)
    *
    * 停止播放器 */
  def stop(): js.Promise[_] = js.native
  
  /** 音量。范围 0~1。默认为 1 */
  var volume: Double = js.native
}
object MediaAudioPlayer {
  
  @scala.inline
  def apply(
    addAudioSource: VideoDecoder => js.Promise[_],
    destroy: () => js.Promise[_],
    removeAudioSource: VideoDecoder => js.Promise[_],
    start: () => js.Promise[_],
    stop: () => js.Promise[_],
    volume: Double
  ): MediaAudioPlayer = {
    val __obj = js.Dynamic.literal(addAudioSource = js.Any.fromFunction1(addAudioSource), destroy = js.Any.fromFunction0(destroy), removeAudioSource = js.Any.fromFunction1(removeAudioSource), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaAudioPlayer]
  }
  
  @scala.inline
  implicit class MediaAudioPlayerOps[Self <: MediaAudioPlayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddAudioSource(value: VideoDecoder => js.Promise[_]): Self = this.set("addAudioSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => js.Promise[_]): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveAudioSource(value: VideoDecoder => js.Promise[_]): Self = this.set("removeAudioSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: () => js.Promise[_]): Self = this.set("start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => js.Promise[_]): Self = this.set("stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
}
