package typings.svgSpritemapWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sizes extends js.Object {
  /**
    * Whether to include the width and height attributes on the root SVG element.
    * The default value for this option is based on the value of the sprite.generate.use option but when specified will always overwrite it.
    */
  var sizes: js.UndefOr[Boolean] = js.undefined
}

object Sizes {
  @scala.inline
  def apply(sizes: js.UndefOr[Boolean] = js.undefined): Sizes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sizes)) __obj.updateDynamic("sizes")(sizes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sizes]
  }
}

