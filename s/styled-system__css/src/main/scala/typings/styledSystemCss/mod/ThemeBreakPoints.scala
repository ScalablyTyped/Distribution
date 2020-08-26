package typings.styledSystemCss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeBreakPoints extends _Theme {
  var breakpoints: js.Array[Double | String] = js.native
}

object ThemeBreakPoints {
  @scala.inline
  def apply(breakpoints: js.Array[Double | String]): ThemeBreakPoints = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeBreakPoints]
  }
  @scala.inline
  implicit class ThemeBreakPointsOps[Self <: ThemeBreakPoints] (val x: Self) extends AnyVal {
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
    def setBreakpointsVarargs(value: (Double | String)*): Self = this.set("breakpoints", js.Array(value :_*))
    @scala.inline
    def setBreakpoints(value: js.Array[Double | String]): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
  }
  
}

