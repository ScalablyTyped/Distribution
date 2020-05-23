package typings.whatwgMimetype.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowParameters extends js.Object {
  var allowParameters: js.UndefOr[Boolean] = js.undefined
}

object AllowParameters {
  @scala.inline
  def apply(allowParameters: js.UndefOr[Boolean] = js.undefined): AllowParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowParameters)) __obj.updateDynamic("allowParameters")(allowParameters.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowParameters]
  }
}

