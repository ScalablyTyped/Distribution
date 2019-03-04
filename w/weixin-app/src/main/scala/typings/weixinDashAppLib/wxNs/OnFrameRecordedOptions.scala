package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnFrameRecordedOptions extends js.Object {
  /**  录音分片结果数据 */
  var frameBuffer: stdLib.ArrayBuffer
  /** 当前帧是否正常录音结束前的最后一帧 */
  var isLastFrame: scala.Boolean
}

object OnFrameRecordedOptions {
  @scala.inline
  def apply(frameBuffer: stdLib.ArrayBuffer, isLastFrame: scala.Boolean): OnFrameRecordedOptions = {
    val __obj = js.Dynamic.literal(frameBuffer = frameBuffer, isLastFrame = isLastFrame)
  
    __obj.asInstanceOf[OnFrameRecordedOptions]
  }
}

