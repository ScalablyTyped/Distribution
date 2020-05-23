package typings.wepy.anon

import typings.wepy.wxEnhancedMod.LagLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Padding extends js.Object {
  var padding: js.Array[Double]
  var points: js.Array[LagLng]
}

object Padding {
  @scala.inline
  def apply(padding: js.Array[Double], points: js.Array[LagLng]): Padding = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
}

