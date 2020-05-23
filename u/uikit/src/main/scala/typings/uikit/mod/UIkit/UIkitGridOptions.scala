package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitGridOptions extends js.Object {
  var `first-column`: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[String] = js.undefined
  var masonry: js.UndefOr[Boolean] = js.undefined
  var parallax: js.UndefOr[Double] = js.undefined
}

object UIkitGridOptions {
  @scala.inline
  def apply(
    `first-column`: String = null,
    margin: String = null,
    masonry: js.UndefOr[Boolean] = js.undefined,
    parallax: js.UndefOr[Double] = js.undefined
  ): UIkitGridOptions = {
    val __obj = js.Dynamic.literal()
    if (`first-column` != null) __obj.updateDynamic("first-column")(`first-column`.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(masonry)) __obj.updateDynamic("masonry")(masonry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parallax)) __obj.updateDynamic("parallax")(parallax.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitGridOptions]
  }
}

