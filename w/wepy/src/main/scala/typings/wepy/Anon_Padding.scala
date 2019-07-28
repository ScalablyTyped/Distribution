package typings.wepy

import typings.wepy.wxUnderscoreEnhancedMod.LagLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Padding extends js.Object {
  var padding: js.Array[Double]
  var points: js.Array[LagLng]
}

object Anon_Padding {
  @scala.inline
  def apply(padding: js.Array[Double], points: js.Array[LagLng]): Anon_Padding = {
    val __obj = js.Dynamic.literal(padding = padding, points = points)
  
    __obj.asInstanceOf[Anon_Padding]
  }
}

