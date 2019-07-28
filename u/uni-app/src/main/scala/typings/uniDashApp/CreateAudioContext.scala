package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAudioContext extends js.Object {
  /**
    * 暂停
    */
  def pause(): Unit
  /**
    * 播放
    */
  def play(): Unit
  /**
    * 跳转到指定位置，单位 s
    */
  def seek(): Unit
  /**
    * 音频的地址
    */
  def setSrc(): Unit
}

object CreateAudioContext {
  @scala.inline
  def apply(pause: () => Unit, play: () => Unit, seek: () => Unit, setSrc: () => Unit): CreateAudioContext = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), seek = js.Any.fromFunction0(seek), setSrc = js.Any.fromFunction0(setSrc))
  
    __obj.asInstanceOf[CreateAudioContext]
  }
}

