package typings.webdriverio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecFiltering extends js.Object {
  var specFiltering: js.UndefOr[Boolean] = js.undefined
}

object SpecFiltering {
  @scala.inline
  def apply(specFiltering: js.UndefOr[Boolean] = js.undefined): SpecFiltering = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(specFiltering)) __obj.updateDynamic("specFiltering")(specFiltering.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecFiltering]
  }
}

