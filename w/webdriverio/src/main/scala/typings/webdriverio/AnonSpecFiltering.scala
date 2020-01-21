package typings.webdriverio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSpecFiltering extends js.Object {
  var specFiltering: js.UndefOr[Boolean] = js.undefined
}

object AnonSpecFiltering {
  @scala.inline
  def apply(specFiltering: js.UndefOr[Boolean] = js.undefined): AnonSpecFiltering = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(specFiltering)) __obj.updateDynamic("specFiltering")(specFiltering.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSpecFiltering]
  }
}

