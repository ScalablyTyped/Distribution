package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoStats extends js.Object {
  /** 视频高度 */
  var framesHeight: Double
  /** 视频宽度 */
  var framesWidth: Double
}

object VideoStats {
  @scala.inline
  def apply(framesHeight: Double, framesWidth: Double): VideoStats = {
    val __obj = js.Dynamic.literal(framesHeight = framesHeight.asInstanceOf[js.Any], framesWidth = framesWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStats]
  }
}

