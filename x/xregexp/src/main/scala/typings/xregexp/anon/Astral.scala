package typings.xregexp.anon

import typings.xregexp.mod.FeatureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Astral extends FeatureOptions {
  var astral: js.UndefOr[Boolean] = js.undefined
  var namespacing: js.UndefOr[Boolean] = js.undefined
}

object Astral {
  @scala.inline
  def apply(astral: js.UndefOr[Boolean] = js.undefined, namespacing: js.UndefOr[Boolean] = js.undefined): Astral = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(astral)) __obj.updateDynamic("astral")(astral.get.asInstanceOf[js.Any])
    if (!js.isUndefined(namespacing)) __obj.updateDynamic("namespacing")(namespacing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Astral]
  }
}

