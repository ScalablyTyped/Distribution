package typings.webicon.svgIconSetOptionsMod

import typings.webicon.iconSetOptionsMod.IconSetOptions
import typings.webicon.urlConfigMod.UrlConfig
import typings.webicon.webiconBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.webicon.iconMod.Icon because Already inherited
- typings.webicon.downloadableMod.Downloadable because Already inherited
- typings.webicon.storeableMod.Storeable because var conflicts: iconIdParser, uri, url. Inlined preloadable, iconIdResolver */ trait SvgIconSetOptions extends IconSetOptions {
  @JSName("cumulative")
  var cumulative_SvgIconSetOptions: js.UndefOr[`false`] = js.undefined
  /**
    * Resolves the id of the underlying source.
    *
    * @param id
    * The underlying id of the source.
    *
    * @return
    * The resolved id of the source.
    */
  var iconIdResolver: js.UndefOr[js.Function1[/* id */ String, String]] = js.undefined
  /**
    * A value indicating whether the source is preloadable.
    */
  var preloadable: js.UndefOr[Boolean] = js.undefined
}

object SvgIconSetOptions {
  @scala.inline
  def apply(
    cumulative: `false` = null,
    iconIdParser: (/* id */ String, /* params */ js.Array[String]) => String = null,
    iconIdResolver: /* id */ String => String = null,
    iconSize: js.UndefOr[Double] = js.undefined,
    preloadable: js.UndefOr[Boolean] = js.undefined,
    size: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any = null,
    svgIconSize: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any = null,
    uri: /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any = null,
    url: UrlConfig[scala.Nothing] = null,
    viewBox: String = null
  ): SvgIconSetOptions = {
    val __obj = js.Dynamic.literal()
    if (cumulative != null) __obj.updateDynamic("cumulative")(cumulative.asInstanceOf[js.Any])
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    if (iconIdResolver != null) __obj.updateDynamic("iconIdResolver")(js.Any.fromFunction1(iconIdResolver))
    if (!js.isUndefined(iconSize)) __obj.updateDynamic("iconSize")(iconSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadable)) __obj.updateDynamic("preloadable")(preloadable.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (svgIconSize != null) __obj.updateDynamic("svgIconSize")(svgIconSize.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgIconSetOptions]
  }
}

