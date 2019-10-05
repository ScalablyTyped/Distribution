package typings.webicon.iconOptionsIconSetOptionsMod

import typings.webicon.iconSvgIconMod.SvgIcon
import typings.webicon.webUrlConfigMod.UrlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.webicon.iconIconMod.Icon because Already inherited
- typings.webicon.iconSizeableMod.Sizeable because Already inherited
- typings.webicon.iconOptionsDownloadableMod.Downloadable because var conflicts: iconIdParser. Inlined url, uri
- typings.webicon.iconOptionsSizeableOptionsMod.SizeableOptions because var conflicts: iconSize. Inlined size, svgIconSize */ trait IconSetOptions extends SvgIcon {
  /**
    * A value indicating whether the icons are loaded separately.
    */
  var cumulative: js.UndefOr[Boolean] = js.undefined
  /**
    * An alias of the `iconSize`-property.
    */
  var size: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: this['iconSize'] */ js.Any
  ] = js.undefined
  /**
    * An alias of the `iconSize`-property.
    */
  var svgIconSize: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: this['iconSize'] */ js.Any
  ] = js.undefined
  /**
    * An alias of the `url`-property.
    */
  var uri: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: this['url'] */ js.Any
  ] = js.undefined
  /**
    * The url to load the source from.
    */
  var url: js.UndefOr[UrlConfig[scala.Nothing]] = js.undefined
}

object IconSetOptions {
  @scala.inline
  def apply(
    cumulative: js.UndefOr[Boolean] = js.undefined,
    iconIdParser: (/* id */ String, /* params */ js.Array[String]) => String = null,
    iconSize: Int | Double = null,
    size: /* import warning: ImportType.apply Failed type conversion: this['iconSize'] */ js.Any = null,
    svgIconSize: /* import warning: ImportType.apply Failed type conversion: this['iconSize'] */ js.Any = null,
    uri: /* import warning: ImportType.apply Failed type conversion: this['url'] */ js.Any = null,
    url: UrlConfig[scala.Nothing] = null,
    viewBox: String = null
  ): IconSetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cumulative)) __obj.updateDynamic("cumulative")(cumulative)
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (svgIconSize != null) __obj.updateDynamic("svgIconSize")(svgIconSize)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    __obj.asInstanceOf[IconSetOptions]
  }
}

