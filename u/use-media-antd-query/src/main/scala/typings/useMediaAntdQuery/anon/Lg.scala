package typings.useMediaAntdQuery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lg extends js.Object {
  var lg: MaxWidth
  var md: MaxWidth
  var sm: MaxWidth
  var xl: MaxWidth
  var xs: MatchMedia
  var xxl: MinWidth
}

object Lg {
  @scala.inline
  def apply(lg: MaxWidth, md: MaxWidth, sm: MaxWidth, xl: MaxWidth, xs: MatchMedia, xxl: MinWidth): Lg = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], xxl = xxl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lg]
  }
}

