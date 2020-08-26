package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Outline extends js.Object {
  var ha: Double = js.native
  var outline: js.Array[Double] = js.native
  var x_max: Double = js.native
  var x_min: Double = js.native
}

object Outline {
  @scala.inline
  def apply(ha: Double, outline: js.Array[Double], x_max: Double, x_min: Double): Outline = {
    val __obj = js.Dynamic.literal(ha = ha.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], x_max = x_max.asInstanceOf[js.Any], x_min = x_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outline]
  }
  @scala.inline
  implicit class OutlineOps[Self <: Outline] (val x: Self) extends AnyVal {
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
    def setHa(value: Double): Self = this.set("ha", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlineVarargs(value: Double*): Self = this.set("outline", js.Array(value :_*))
    @scala.inline
    def setOutline(value: js.Array[Double]): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def setX_max(value: Double): Self = this.set("x_max", value.asInstanceOf[js.Any])
    @scala.inline
    def setX_min(value: Double): Self = this.set("x_min", value.asInstanceOf[js.Any])
  }
  
}

