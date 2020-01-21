package typings.whatwgMimetype

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowParameters extends js.Object {
  var allowParameters: js.UndefOr[Boolean] = js.undefined
}

object AnonAllowParameters {
  @scala.inline
  def apply(allowParameters: js.UndefOr[Boolean] = js.undefined): AnonAllowParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowParameters)) __obj.updateDynamic("allowParameters")(allowParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowParameters]
  }
}

