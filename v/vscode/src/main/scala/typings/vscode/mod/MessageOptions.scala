package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageOptions extends js.Object {
  /**
  		 * Indicates that this message should be modal.
  		 */
  var modal: js.UndefOr[Boolean] = js.undefined
}

object MessageOptions {
  @scala.inline
  def apply(modal: js.UndefOr[Boolean] = js.undefined): MessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageOptions]
  }
}

