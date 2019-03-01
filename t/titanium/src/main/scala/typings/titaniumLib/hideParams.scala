package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for the <Titanium.UI.OptionDialog.hide> method.
  */
trait hideParams extends js.Object {
  /**
  	 * Determines whether to animate the dialog as it is dismissed.
  	 */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
}

object hideParams {
  @scala.inline
  def apply(animated: js.UndefOr[scala.Boolean] = js.undefined): hideParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    __obj.asInstanceOf[hideParams]
  }
}

