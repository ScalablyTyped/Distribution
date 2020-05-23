package typings.twilioVideo.mod.VideoTrack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimensions extends js.Object {
  var height: Double | Null
  var width: Double | Null
}

object Dimensions {
  @scala.inline
  def apply(height: Double = null.asInstanceOf[Double], width: Double = null.asInstanceOf[Double]): Dimensions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimensions]
  }
}

