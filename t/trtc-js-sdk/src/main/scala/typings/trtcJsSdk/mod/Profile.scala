package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  /** 比特率 kbs */
  var bitrate: Double
  /** 帧率 */
  var frameRate: Double
  /** 视频高度 */
  var height: Double
  /** 视频宽度 */
  var width: Double
}

object Profile {
  @scala.inline
  def apply(bitrate: Double, frameRate: Double, height: Double, width: Double): Profile = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], frameRate = frameRate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

