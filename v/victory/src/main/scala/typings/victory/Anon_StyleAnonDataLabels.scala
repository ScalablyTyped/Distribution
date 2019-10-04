package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StyleAnonDataLabels extends js.Object {
  var style: js.UndefOr[Anon_DataLabels] = js.undefined
}

object Anon_StyleAnonDataLabels {
  @scala.inline
  def apply(style: Anon_DataLabels = null): Anon_StyleAnonDataLabels = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Anon_StyleAnonDataLabels]
  }
}

