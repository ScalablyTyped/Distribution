package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sparklines extends js.Object {
  var paddingX: Double = js.native
  var paddingY: Double = js.native
  var radius: Double = js.native
  def template(item: js.Any, common: String, data: js.Array[_], column: js.Any, index: Double): String = js.native
}

object Sparklines {
  @scala.inline
  def apply(
    paddingX: Double,
    paddingY: Double,
    radius: Double,
    template: (js.Any, String, js.Array[_], js.Any, Double) => String
  ): Sparklines = {
    val __obj = js.Dynamic.literal(paddingX = paddingX.asInstanceOf[js.Any], paddingY = paddingY.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], template = js.Any.fromFunction5(template))
    __obj.asInstanceOf[Sparklines]
  }
  @scala.inline
  implicit class SparklinesOps[Self <: Sparklines] (val x: Self) extends AnyVal {
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
    def setPaddingX(value: Double): Self = this.set("paddingX", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingY(value: Double): Self = this.set("paddingY", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: (js.Any, String, js.Array[_], js.Any, Double) => String): Self = this.set("template", js.Any.fromFunction5(value))
  }
  
}

