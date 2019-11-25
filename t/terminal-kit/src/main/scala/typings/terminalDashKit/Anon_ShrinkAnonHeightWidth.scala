package typings.terminalDashKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShrinkAnonHeightWidth extends js.Object {
  var shrink: js.UndefOr[Anon_HeightWidth] = js.undefined
}

object Anon_ShrinkAnonHeightWidth {
  @scala.inline
  def apply(shrink: Anon_HeightWidth = null): Anon_ShrinkAnonHeightWidth = {
    val __obj = js.Dynamic.literal()
    if (shrink != null) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ShrinkAnonHeightWidth]
  }
}

