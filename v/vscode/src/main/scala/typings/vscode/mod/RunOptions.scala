package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunOptions extends js.Object {
  /**
  		 * Controls whether task variables are re-evaluated on rerun.
  		 */
  var reevaluateOnRerun: js.UndefOr[Boolean] = js.undefined
}

object RunOptions {
  @scala.inline
  def apply(reevaluateOnRerun: js.UndefOr[Boolean] = js.undefined): RunOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reevaluateOnRerun)) __obj.updateDynamic("reevaluateOnRerun")(reevaluateOnRerun.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunOptions]
  }
}

