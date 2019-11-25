package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options that modify how specified output is handled. */
trait DialogNodeOutputModifiers extends js.Object {
  /** Whether values in the output will overwrite output values in an array specified by previously executed dialog nodes. If this option is set to **false**, new values will be appended to previously specified values. */
  var overwrite: js.UndefOr[Boolean] = js.undefined
}

object DialogNodeOutputModifiers {
  @scala.inline
  def apply(overwrite: js.UndefOr[Boolean] = js.undefined): DialogNodeOutputModifiers = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeOutputModifiers]
  }
}

