package typings.uikit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Svg extends js.Object {
  var svg: js.Promise[_] = js.native
}

object Svg {
  @scala.inline
  def apply(svg: js.Promise[_]): Svg = {
    val __obj = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Svg]
  }
  @scala.inline
  implicit class SvgOps[Self <: Svg] (val x: Self) extends AnyVal {
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
    def setSvg(value: js.Promise[_]): Self = this.set("svg", value.asInstanceOf[js.Any])
  }
  
}

