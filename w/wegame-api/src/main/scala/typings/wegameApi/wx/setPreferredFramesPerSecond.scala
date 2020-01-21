package typings.wegameApi.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.setPreferredFramesPerSecond")
@js.native
object setPreferredFramesPerSecond extends js.Object {
  /**
    * 可以修改渲染帧率。默认渲染帧率为 60 帧每秒。修改后，requestAnimationFrame 的回调频率会发生改变。
    * @param fps 帧率，有效范围 1 - 60。
    */
  def apply(fps: Double): Unit = js.native
}

