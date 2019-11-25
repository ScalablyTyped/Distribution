package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderWidth extends js.Object {
  var borderWidth: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[Anon_DataLabels] = js.undefined
}

object Anon_BorderWidth {
  @scala.inline
  def apply(borderWidth: Int | Double = null, style: Anon_DataLabels = null): Anon_BorderWidth = {
    val __obj = js.Dynamic.literal()
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderWidth]
  }
}

