package typings.styledSystemCss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeBreakPoints extends _Theme {
  var breakpoints: js.Array[Double | String]
}

object ThemeBreakPoints {
  @scala.inline
  def apply(breakpoints: js.Array[Double | String]): ThemeBreakPoints = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeBreakPoints]
  }
}

