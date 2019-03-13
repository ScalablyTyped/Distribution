package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageOptions extends js.Object {
  /**
  		 * Indicates that this message should be modal.
  		 */
  var modal: js.UndefOr[scala.Boolean] = js.undefined
}

object MessageOptions {
  @scala.inline
  def apply(modal: js.UndefOr[scala.Boolean] = js.undefined): MessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    __obj.asInstanceOf[MessageOptions]
  }
}

