package typings.useMediaAntdQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLg extends js.Object {
  var lg: AnonMaxWidth
  var md: AnonMaxWidth
  var sm: AnonMaxWidth
  var xl: AnonMaxWidth
  var xs: AnonMatchMedia
  var xxl: AnonMinWidth
}

object AnonLg {
  @scala.inline
  def apply(
    lg: AnonMaxWidth,
    md: AnonMaxWidth,
    sm: AnonMaxWidth,
    xl: AnonMaxWidth,
    xs: AnonMatchMedia,
    xxl: AnonMinWidth
  ): AnonLg = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], xxl = xxl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLg]
  }
}

