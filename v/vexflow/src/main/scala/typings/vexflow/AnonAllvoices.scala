package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllvoices extends js.Object {
  var all_voices: js.UndefOr[Boolean] = js.undefined
}

object AnonAllvoices {
  @scala.inline
  def apply(all_voices: js.UndefOr[Boolean] = js.undefined): AnonAllvoices = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all_voices)) __obj.updateDynamic("all_voices")(all_voices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllvoices]
  }
}

