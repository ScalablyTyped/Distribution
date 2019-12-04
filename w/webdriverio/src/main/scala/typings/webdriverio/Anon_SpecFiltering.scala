package typings.webdriverio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SpecFiltering extends js.Object {
  var specFiltering: js.UndefOr[Boolean] = js.undefined
}

object Anon_SpecFiltering {
  @scala.inline
  def apply(specFiltering: js.UndefOr[Boolean] = js.undefined): Anon_SpecFiltering = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(specFiltering)) __obj.updateDynamic("specFiltering")(specFiltering.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SpecFiltering]
  }
}

