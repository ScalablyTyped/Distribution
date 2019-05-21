package typings
package webiconLib.iconOptionsSizeableOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeableOptions
  extends webiconLib.iconSizeableMod.Sizeable {
  /**
    * An alias of the `iconSize`-property.
    */
  var size: /* import warning: ImportType.apply Failed type conversion: this['iconSize'] */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: this['iconSize'] */ js.Any
  ] = js.undefined
  /**
    * An alias of the `iconSize`-property.
    */
  var svgIconSize: /* import warning: ImportType.apply Failed type conversion: this['iconSize'] */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: this['iconSize'] */ js.Any
  ] = js.undefined
}

object SizeableOptions {
  @scala.inline
  def apply(
    iconSize: scala.Int | scala.Double = null,
    size: /* import warning: ImportType.apply Failed type conversion: this['iconSize'] */ js.Any = null,
    svgIconSize: /* import warning: ImportType.apply Failed type conversion: this['iconSize'] */ js.Any = null
  ): SizeableOptions = {
    val __obj = js.Dynamic.literal()
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (svgIconSize != null) __obj.updateDynamic("svgIconSize")(svgIconSize)
    __obj.asInstanceOf[SizeableOptions]
  }
}

