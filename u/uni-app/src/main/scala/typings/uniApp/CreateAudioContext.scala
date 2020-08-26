package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAudioContext extends js.Object {
  /**
    * 暂停
    */
  def pause(): Unit = js.native
  /**
    * 播放
    */
  def play(): Unit = js.native
  /**
    * 跳转到指定位置，单位 s
    */
  def seek(): Unit = js.native
  /**
    * 音频的地址
    */
  def setSrc(): Unit = js.native
}

object CreateAudioContext {
  @scala.inline
  def apply(pause: () => Unit, play: () => Unit, seek: () => Unit, setSrc: () => Unit): CreateAudioContext = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), seek = js.Any.fromFunction0(seek), setSrc = js.Any.fromFunction0(setSrc))
    __obj.asInstanceOf[CreateAudioContext]
  }
  @scala.inline
  implicit class CreateAudioContextOps[Self <: CreateAudioContext] (val x: Self) extends AnyVal {
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
    def setSeek(value: () => Unit): Self = this.set("seek", js.Any.fromFunction0(value))
    @scala.inline
    def setSetSrc(value: () => Unit): Self = this.set("setSrc", js.Any.fromFunction0(value))
  }
  
}

