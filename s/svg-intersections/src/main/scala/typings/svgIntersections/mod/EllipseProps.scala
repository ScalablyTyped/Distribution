package typings.svgIntersections.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EllipseProps
  extends _SvgProperties[js.Any] {
  var cx: Double = js.native
  var cy: Double = js.native
  var rx: Double = js.native
  var ry: Double = js.native
}

object EllipseProps {
  @scala.inline
  def apply(cx: Double, cy: Double, rx: Double, ry: Double): EllipseProps = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipseProps]
  }
  @scala.inline
  implicit class EllipsePropsOps[Self <: EllipseProps] (val x: Self) extends AnyVal {
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
    def setCx(value: Double): Self = this.set("cx", value.asInstanceOf[js.Any])
    @scala.inline
    def setCy(value: Double): Self = this.set("cy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRx(value: Double): Self = this.set("rx", value.asInstanceOf[js.Any])
    @scala.inline
    def setRy(value: Double): Self = this.set("ry", value.asInstanceOf[js.Any])
  }
  
}

