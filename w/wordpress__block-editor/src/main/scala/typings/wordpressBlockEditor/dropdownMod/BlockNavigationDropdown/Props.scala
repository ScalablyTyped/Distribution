package typings.wordpressBlockEditor.dropdownMod.BlockNavigationDropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var isDisabled: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(isDisabled: js.UndefOr[Boolean] = js.undefined): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

