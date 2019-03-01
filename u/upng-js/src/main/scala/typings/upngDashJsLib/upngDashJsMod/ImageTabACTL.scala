package typings
package upngDashJsLib.upngDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageTabACTL extends js.Object {
  var num_frames: scala.Double
  var num_plays: scala.Double
}

object ImageTabACTL {
  @scala.inline
  def apply(num_frames: scala.Double, num_plays: scala.Double): ImageTabACTL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("num_frames")(num_frames)
    __obj.updateDynamic("num_plays")(num_plays)
    __obj.asInstanceOf[ImageTabACTL]
  }
}

