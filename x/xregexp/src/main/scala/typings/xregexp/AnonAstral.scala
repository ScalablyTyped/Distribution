package typings.xregexp

import typings.xregexp.mod.FeatureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAstral extends FeatureOptions {
  var astral: js.UndefOr[Boolean] = js.undefined
  var namespacing: js.UndefOr[Boolean] = js.undefined
}

object AnonAstral {
  @scala.inline
  def apply(astral: js.UndefOr[Boolean] = js.undefined, namespacing: js.UndefOr[Boolean] = js.undefined): AnonAstral = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(astral)) __obj.updateDynamic("astral")(astral.asInstanceOf[js.Any])
    if (!js.isUndefined(namespacing)) __obj.updateDynamic("namespacing")(namespacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAstral]
  }
}

