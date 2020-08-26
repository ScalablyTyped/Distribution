package typings.wepy.anon

import typings.wepy.wxEnhancedMod.LagLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Padding extends js.Object {
  var padding: js.Array[Double] = js.native
  var points: js.Array[LagLng] = js.native
}

object Padding {
  @scala.inline
  def apply(padding: js.Array[Double], points: js.Array[LagLng]): Padding = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
  @scala.inline
  implicit class PaddingOps[Self <: Padding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = this.set("padding", js.Array(value :_*))
    @scala.inline
    def setPadding(value: js.Array[Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointsVarargs(value: LagLng*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[LagLng]): Self = this.set("points", value.asInstanceOf[js.Any])
  }
  
}

