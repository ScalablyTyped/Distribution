package typings.terminalKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShrinkWidth extends js.Object {
  var shrink: js.UndefOr[Width] = js.undefined
}

object ShrinkWidth {
  @scala.inline
  def apply(shrink: Width = null): ShrinkWidth = {
    val __obj = js.Dynamic.literal()
    if (shrink != null) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShrinkWidth]
  }
}

