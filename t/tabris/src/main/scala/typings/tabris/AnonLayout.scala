package typings.tabris

import typings.tabris.mod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLayout extends js.Object {
  var layout: js.UndefOr[Layout] = js.undefined
}

object AnonLayout {
  @scala.inline
  def apply(layout: Layout = null): AnonLayout = {
    val __obj = js.Dynamic.literal()
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLayout]
  }
}

