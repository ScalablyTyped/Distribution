package typings.webicon.svgIconOptionsMod

import typings.webicon.sizeableOptionsMod.SizeableOptions
import typings.webicon.storeableMod.Storeable
import typings.webicon.urlConfigMod.UrlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.webicon.sizeableMod.Sizeable because Already inherited
- typings.webicon.iconMod.Icon because Already inherited
- typings.webicon.svgIconMod.SvgIcon because var conflicts: iconIdParser, iconSize. Inlined viewBox */ trait SvgIconOptions
  extends Storeable
     with SizeableOptions {
  /**
    * The default viewBox of the icon.
    */
  var viewBox: js.UndefOr[String] = js.undefined
}

object SvgIconOptions {
  @scala.inline
  def apply(
    iconIdParser: (/* id */ String, /* params */ js.Array[String]) => String = null,
    iconIdResolver: /* id */ String => String = null,
    iconSize: js.UndefOr[Double] = js.undefined,
    preloadable: js.UndefOr[Boolean] = js.undefined,
    size: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any = null,
    svgIconSize: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any = null,
    uri: /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any = null,
    url: UrlConfig[scala.Nothing] = null,
    viewBox: String = null
  ): SvgIconOptions = {
    val __obj = js.Dynamic.literal()
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    if (iconIdResolver != null) __obj.updateDynamic("iconIdResolver")(js.Any.fromFunction1(iconIdResolver))
    if (!js.isUndefined(iconSize)) __obj.updateDynamic("iconSize")(iconSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadable)) __obj.updateDynamic("preloadable")(preloadable.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (svgIconSize != null) __obj.updateDynamic("svgIconSize")(svgIconSize.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgIconOptions]
  }
}

