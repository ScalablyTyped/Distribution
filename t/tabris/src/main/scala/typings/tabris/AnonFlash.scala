package typings.tabris

import typings.tabris.tabrisStrings.auto
import typings.tabris.tabrisStrings.off
import typings.tabris.tabrisStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlash extends js.Object {
  var flash: js.UndefOr[auto | on | off] = js.undefined
}

object AnonFlash {
  @scala.inline
  def apply(flash: auto | on | off = null): AnonFlash = {
    val __obj = js.Dynamic.literal()
    if (flash != null) __obj.updateDynamic("flash")(flash.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlash]
  }
}

