package typings
package webiconLib.iconOptionsSvgIconOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- webiconLib.iconSvgIconMod.SvgIcon because var conflicts: iconIdParser, iconSize. Inlined viewBox */ trait SvgIconOptions
  extends webiconLib.iconOptionsImageIconOptionsMod.ImageIconOptions
     with webiconLib.iconOptionsSizeableOptionsMod.SizeableOptions {
  /**
    * The default viewBox of the icon.
    */
  var viewBox: js.UndefOr[java.lang.String] = js.undefined
}

object SvgIconOptions {
  @scala.inline
  def apply(
    iconIdParser: (/* id */ java.lang.String, /* params */ js.Array[java.lang.String]) => java.lang.String = null,
    iconIdResolver: /* id */ java.lang.String => java.lang.String = null,
    iconSize: scala.Int | scala.Double = null,
    preloadable: js.UndefOr[scala.Boolean] = js.undefined,
    size: /* import warning: ImportType.apply Failed type conversion: this['iconSize'] */ js.Any = null,
    svgIconSize: /* import warning: ImportType.apply Failed type conversion: this['iconSize'] */ js.Any = null,
    uri: /* import warning: ImportType.apply Failed type conversion: this['url'] */ js.Any = null,
    url: webiconLib.webUrlConfigMod.UrlConfig[scala.Nothing] = null,
    viewBox: java.lang.String = null
  ): SvgIconOptions = {
    val __obj = js.Dynamic.literal()
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    if (iconIdResolver != null) __obj.updateDynamic("iconIdResolver")(js.Any.fromFunction1(iconIdResolver))
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadable)) __obj.updateDynamic("preloadable")(preloadable)
    if (size != null) __obj.updateDynamic("size")(size)
    if (svgIconSize != null) __obj.updateDynamic("svgIconSize")(svgIconSize)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    __obj.asInstanceOf[SvgIconOptions]
  }
}

