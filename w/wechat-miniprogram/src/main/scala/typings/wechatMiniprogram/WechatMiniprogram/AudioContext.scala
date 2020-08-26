package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioContext extends js.Object {
  /** [AudioContext.pause()](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/AudioContext.pause.html)
    *
    * 暂停音频。 */
  def pause(): Unit = js.native
  /** [AudioContext.play()](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/AudioContext.play.html)
    *
    * 播放音频。 */
  def play(): Unit = js.native
  /** [AudioContext.seek(number position)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/AudioContext.seek.html)
    *
    * 跳转到指定位置。 */
  def seek(/** 跳转位置，单位 s */
  position: Double): Unit = js.native
  /** [AudioContext.setSrc(string src)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/AudioContext.setSrc.html)
    *
    * 设置音频地址 */
  def setSrc(/** 音频地址 */
  src: String): Unit = js.native
}

object AudioContext {
  @scala.inline
  def apply(pause: () => Unit, play: () => Unit, seek: Double => Unit, setSrc: String => Unit): AudioContext = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), seek = js.Any.fromFunction1(seek), setSrc = js.Any.fromFunction1(setSrc))
    __obj.asInstanceOf[AudioContext]
  }
  @scala.inline
  implicit class AudioContextOps[Self <: AudioContext] (val x: Self) extends AnyVal {
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
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("play", js.Any.fromFunction0(value))
    @scala.inline
    def setSeek(value: Double => Unit): Self = this.set("seek", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSrc(value: String => Unit): Self = this.set("setSrc", js.Any.fromFunction1(value))
  }
  
}

