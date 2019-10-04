package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoxWidth extends js.Object {
  var boxWidth: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[Anon_Max] = js.undefined
}

object Anon_BoxWidth {
  @scala.inline
  def apply(boxWidth: Int | Double = null, style: Anon_Max = null): Anon_BoxWidth = {
    val __obj = js.Dynamic.literal()
    if (boxWidth != null) __obj.updateDynamic("boxWidth")(boxWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Anon_BoxWidth]
  }
}

