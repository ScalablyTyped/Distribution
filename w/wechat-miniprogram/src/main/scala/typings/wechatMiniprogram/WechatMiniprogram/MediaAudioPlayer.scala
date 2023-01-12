package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** MediaAudioPlayer 实例，可通过 [wx.createMediaAudioPlayer](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.createMediaAudioPlayer.html) 接口获取实例。 */
trait MediaAudioPlayer extends StObject {
  
  /** [Promise MediaAudioPlayer.addAudioSource([VideoDecoder](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.html) source)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/MediaAudioPlayer.addAudioSource.html)
    *
    * 添加音频源 */
  def addAudioSource(
    /** [VideoDecoder](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.html)
    *
    * 视频解码器实例。作为音频源添加到音频播放器中 */
  source: VideoDecoder
  ): js.Promise[Any]
  
  /** [Promise MediaAudioPlayer.destroy()](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/MediaAudioPlayer.destroy.html)
    *
    * 销毁播放器 */
  def destroy(): js.Promise[Any]
  
  /** [Promise MediaAudioPlayer.removeAudioSource([VideoDecoder](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.html) source)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/MediaAudioPlayer.removeAudioSource.html)
    *
    * 移除音频源 */
  def removeAudioSource(
    /** [VideoDecoder](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.html)
    *
    * 视频解码器实例 */
  source: VideoDecoder
  ): js.Promise[Any]
  
  /** [Promise MediaAudioPlayer.start()](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/MediaAudioPlayer.start.html)
    *
    * 启动播放器 */
  def start(): js.Promise[Any]
  
  /** [Promise MediaAudioPlayer.stop()](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/MediaAudioPlayer.stop.html)
    *
    * 停止播放器 */
  def stop(): js.Promise[Any]
  
  /** 音量。范围 0~1。默认为 1 */
  var volume: Double
}
object MediaAudioPlayer {
  
  inline def apply(
    addAudioSource: VideoDecoder => js.Promise[Any],
    destroy: () => js.Promise[Any],
    removeAudioSource: VideoDecoder => js.Promise[Any],
    start: () => js.Promise[Any],
    stop: () => js.Promise[Any],
    volume: Double
  ): MediaAudioPlayer = {
    val __obj = js.Dynamic.literal(addAudioSource = js.Any.fromFunction1(addAudioSource), destroy = js.Any.fromFunction0(destroy), removeAudioSource = js.Any.fromFunction1(removeAudioSource), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaAudioPlayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaAudioPlayer] (val x: Self) extends AnyVal {
    
    inline def setAddAudioSource(value: VideoDecoder => js.Promise[Any]): Self = StObject.set(x, "addAudioSource", js.Any.fromFunction1(value))
    
    inline def setDestroy(value: () => js.Promise[Any]): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setRemoveAudioSource(value: VideoDecoder => js.Promise[Any]): Self = StObject.set(x, "removeAudioSource", js.Any.fromFunction1(value))
    
    inline def setStart(value: () => js.Promise[Any]): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setStop(value: () => js.Promise[Any]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
