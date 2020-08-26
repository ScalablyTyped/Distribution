package typings.svgIntersections.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineProps
  extends _SvgProperties[js.Any] {
  var x1: Double = js.native
  var x2: Double = js.native
  var y1: Double = js.native
  var y2: Double = js.native
}

object LineProps {
  @scala.inline
  def apply(x1: Double, x2: Double, y1: Double, y2: Double): LineProps = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineProps]
  }
  @scala.inline
  implicit class LinePropsOps[Self <: LineProps] (val x: Self) extends AnyVal {
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
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def setX2(value: Double): Self = this.set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
    @scala.inline
    def setY2(value: Double): Self = this.set("y2", value.asInstanceOf[js.Any])
  }
  
}

