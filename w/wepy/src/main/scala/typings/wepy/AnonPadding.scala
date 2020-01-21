package typings.wepy

import typings.wepy.wxEnhancedMod.LagLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPadding extends js.Object {
  var padding: js.Array[Double]
  var points: js.Array[LagLng]
}

object AnonPadding {
  @scala.inline
  def apply(padding: js.Array[Double], points: js.Array[LagLng]): AnonPadding = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPadding]
  }
}

