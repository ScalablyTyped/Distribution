package typings.xstyledStyledComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Breakpoints_ extends js.Object {
  var lg: js.Any = js.native
  var md: js.Any = js.native
  var sm: js.Any = js.native
  var xl: js.Any = js.native
  var xs: js.Any = js.native
}

object Breakpoints_ {
  @scala.inline
  def apply(lg: js.Any, md: js.Any, sm: js.Any, xl: js.Any, xs: js.Any): Breakpoints_ = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breakpoints_]
  }
  @scala.inline
  implicit class Breakpoints_Ops[Self <: Breakpoints_] (val x: Self) extends AnyVal {
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
    def setLg(value: js.Any): Self = this.set("lg", value.asInstanceOf[js.Any])
    @scala.inline
    def setMd(value: js.Any): Self = this.set("md", value.asInstanceOf[js.Any])
    @scala.inline
    def setSm(value: js.Any): Self = this.set("sm", value.asInstanceOf[js.Any])
    @scala.inline
    def setXl(value: js.Any): Self = this.set("xl", value.asInstanceOf[js.Any])
    @scala.inline
    def setXs(value: js.Any): Self = this.set("xs", value.asInstanceOf[js.Any])
  }
  
}

