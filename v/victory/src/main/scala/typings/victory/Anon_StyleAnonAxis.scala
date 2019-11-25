package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StyleAnonAxis extends js.Object {
  var style: js.UndefOr[Anon_Axis] = js.undefined
}

object Anon_StyleAnonAxis {
  @scala.inline
  def apply(style: Anon_Axis = null): Anon_StyleAnonAxis = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_StyleAnonAxis]
  }
}

