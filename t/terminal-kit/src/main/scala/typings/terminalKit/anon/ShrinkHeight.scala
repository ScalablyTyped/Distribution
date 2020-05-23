package typings.terminalKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShrinkHeight extends js.Object {
  var shrink: js.UndefOr[Height] = js.undefined
}

object ShrinkHeight {
  @scala.inline
  def apply(shrink: Height = null): ShrinkHeight = {
    val __obj = js.Dynamic.literal()
    if (shrink != null) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShrinkHeight]
  }
}

