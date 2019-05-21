package typings
package webiconLib.iconOptionsSvgIconSetOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- webiconLib.iconOptionsStoreableMod.Storeable because var conflicts: iconIdParser, uri, url. Inlined preloadable, iconIdResolver */ trait SvgIconSetOptions
  extends webiconLib.iconOptionsIconSetOptionsMod.IconSetOptions {
  @JSName("cumulative")
  var cumulative_SvgIconSetOptions: js.UndefOr[webiconLib.webiconLibNumbers.`false`] = js.undefined
  /**
    * Resolves the id of the underlying source.
    *
    * @param id
    * The underlying id of the source.
    *
    * @return
    * The resolved id of the source.
    */
  var iconIdResolver: js.UndefOr[js.Function1[/* id */ java.lang.String, java.lang.String]] = js.undefined
  /**
    * A value indicating whether the source is preloadable.
    */
  var preloadable: js.UndefOr[scala.Boolean] = js.undefined
}

object SvgIconSetOptions {
  @scala.inline
  def apply(
    cumulative: webiconLib.webiconLibNumbers.`false` = null,
    iconIdParser: (/* id */ java.lang.String, /* params */ js.Array[java.lang.String]) => java.lang.String = null,
    iconIdResolver: /* id */ java.lang.String => java.lang.String = null,
    iconSize: scala.Int | scala.Double = null,
    preloadable: js.UndefOr[scala.Boolean] = js.undefined,
    size: /* import warning: ImportType.apply Failed type conversion: this['iconSize'] */ js.Any = null,
    svgIconSize: /* import warning: ImportType.apply Failed type conversion: this['iconSize'] */ js.Any = null,
    uri: /* import warning: ImportType.apply Failed type conversion: this['url'] */ js.Any = null,
    url: webiconLib.webUrlConfigMod.UrlConfig[scala.Nothing] = null,
    viewBox: java.lang.String = null
  ): SvgIconSetOptions = {
    val __obj = js.Dynamic.literal()
    if (cumulative != null) __obj.updateDynamic("cumulative")(cumulative)
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    if (iconIdResolver != null) __obj.updateDynamic("iconIdResolver")(js.Any.fromFunction1(iconIdResolver))
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadable)) __obj.updateDynamic("preloadable")(preloadable)
    if (size != null) __obj.updateDynamic("size")(size)
    if (svgIconSize != null) __obj.updateDynamic("svgIconSize")(svgIconSize)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    __obj.asInstanceOf[SvgIconSetOptions]
  }
}

