package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAudioContext extends js.Object {
  /**
    * 暂停
    */
  def pause(): scala.Unit
  /**
    * 播放
    */
  def play(): scala.Unit
  /**
    * 跳转到指定位置，单位 s
    */
  def seek(): scala.Unit
  /**
    * 音频的地址
    */
  def setSrc(): scala.Unit
}

object CreateAudioContext {
  @scala.inline
  def apply(pause: () => scala.Unit, play: () => scala.Unit, seek: () => scala.Unit, setSrc: () => scala.Unit): CreateAudioContext = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), seek = js.Any.fromFunction0(seek), setSrc = js.Any.fromFunction0(setSrc))
  
    __obj.asInstanceOf[CreateAudioContext]
  }
}

