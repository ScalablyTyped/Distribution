package typings.terminalDashKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShrinkAnonHeight extends js.Object {
  var shrink: js.UndefOr[Anon_Height] = js.undefined
}

object Anon_ShrinkAnonHeight {
  @scala.inline
  def apply(shrink: Anon_Height = null): Anon_ShrinkAnonHeight = {
    val __obj = js.Dynamic.literal()
    if (shrink != null) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ShrinkAnonHeight]
  }
}

