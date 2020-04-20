package typings.tabris

import typings.tabris.mod.LayoutDataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLayoutData extends js.Object {
  var layoutData: js.UndefOr[LayoutDataValue] = js.undefined
}

object AnonLayoutData {
  @scala.inline
  def apply(layoutData: LayoutDataValue = null): AnonLayoutData = {
    val __obj = js.Dynamic.literal()
    if (layoutData != null) __obj.updateDynamic("layoutData")(layoutData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLayoutData]
  }
}

