package typings.webicon.sizeableOptionsMod

import typings.webicon.sizeableMod.Sizeable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeableOptions extends Sizeable {
  /**
    * An alias of the `iconSize`-property.
    */
  var size: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
  ] = js.undefined
  /**
    * An alias of the `iconSize`-property.
    */
  var svgIconSize: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
  ] = js.undefined
}

object SizeableOptions {
  @scala.inline
  def apply(
    iconSize: js.UndefOr[Double] = js.undefined,
    size: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any = null,
    svgIconSize: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any = null
  ): SizeableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(iconSize)) __obj.updateDynamic("iconSize")(iconSize.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (svgIconSize != null) __obj.updateDynamic("svgIconSize")(svgIconSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeableOptions]
  }
}

