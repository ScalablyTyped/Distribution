package typings.svgSpritemapWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol extends js.Object {
  var symbol: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Whether to generate a <title> element containing the filename if no title is provided in the SVG.
    */
  var title: js.UndefOr[Boolean] = js.undefined
  var use: js.UndefOr[Boolean] = js.undefined
  var view: js.UndefOr[Boolean | String] = js.undefined
}

object Symbol {
  @scala.inline
  def apply(
    symbol: Boolean | String = null,
    title: js.UndefOr[Boolean] = js.undefined,
    use: js.UndefOr[Boolean] = js.undefined,
    view: Boolean | String = null
  ): Symbol = {
    val __obj = js.Dynamic.literal()
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.get.asInstanceOf[js.Any])
    if (!js.isUndefined(use)) __obj.updateDynamic("use")(use.get.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
}

