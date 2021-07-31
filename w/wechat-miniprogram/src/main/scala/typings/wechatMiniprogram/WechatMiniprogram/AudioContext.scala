package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioContext extends StObject {
  
  /** [AudioContext.pause()](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/AudioContext.pause.html)
    *
    * 暂停音频。 */
  def pause(): Unit
  
  /** [AudioContext.play()](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/AudioContext.play.html)
    *
    * 播放音频。 */
  def play(): Unit
  
  /** [AudioContext.seek(number position)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/AudioContext.seek.html)
    *
    * 跳转到指定位置。 */
  def seek(/** 跳转位置，单位 s */
  position: Double): Unit
  
  /** [AudioContext.setSrc(string src)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/AudioContext.setSrc.html)
    *
    * 设置音频地址 */
  def setSrc(/** 音频地址 */
  src: String): Unit
}
object AudioContext {
  
  @scala.inline
  def apply(pause: () => Unit, play: () => Unit, seek: Double => Unit, setSrc: String => Unit): AudioContext = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), seek = js.Any.fromFunction1(seek), setSrc = js.Any.fromFunction1(setSrc))
    __obj.asInstanceOf[AudioContext]
  }
  
  @scala.inline
  implicit class AudioContextMutableBuilder[Self <: AudioContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSeek(value: Double => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSrc(value: String => Unit): Self = StObject.set(x, "setSrc", js.Any.fromFunction1(value))
  }
}
