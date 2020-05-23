package typings.wordpressBlockEditor.blockInspectorMod.BlockInspector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var showNoBlockSelectedMessage: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(showNoBlockSelectedMessage: js.UndefOr[Boolean] = js.undefined): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showNoBlockSelectedMessage)) __obj.updateDynamic("showNoBlockSelectedMessage")(showNoBlockSelectedMessage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

