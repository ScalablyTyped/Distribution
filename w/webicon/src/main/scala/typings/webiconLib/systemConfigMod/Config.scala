package typings
package webiconLib.systemConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * A set of alias-names for icon-sets.
    */
  var alias: js.UndefOr[
    webiconLib.systemIdentityMapMod.IdentityMap[java.lang.String, webiconLib.iconOptionsAliasOptionsMod.AliasOptions]
  ] = js.undefined
  /**
    * An alias of the `defaultSource`-property.
    */
  var default: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: this['defaultSource'] */ js.Any
  ] = js.undefined
  /**
    * The default icon-set to provide.
    */
  var defaultIconSetUrl: js.UndefOr[
    java.lang.String | webiconLib.iconOptionsSvgIconSetOptionsMod.SvgIconSetOptions | webiconLib.iconOptionsSvgCumulativeIconSetOptionsMod.SvgCumulativeIconSetOptions
  ] = js.undefined
  /**
    * The default icon-set to use.
    */
  var defaultSource: js.UndefOr[java.lang.String | webiconLib.systemIdentifiableMod.Identifiable] = js.undefined
  /**
    * An alias of the `defaultIconSetUrl`-property.
    */
  var defaultSvgIconSetUrl: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any
  ] = js.undefined
  /**
    * The default size for svg-icons.
    */
  var defaultSvgIconSize: js.UndefOr[scala.Double | webiconLib.iconOptionsSizeableOptionsMod.SizeableOptions] = js.undefined
  /**
    * An alias of the `defaultIconSetUrl`-property.
    */
  var defaultSvgSetUrl: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any
  ] = js.undefined
  /**
    * An alias of the `fonts`-property.
    */
  var font: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: this['fonts'] */ js.Any
  ] = js.undefined
  /**
    * A set of icon-fonts to provide.
    */
  var fonts: js.UndefOr[
    webiconLib.systemIdentityMapMod.IdentityMap[
      webiconLib.iconCssClassConfigMod.CssClassConfig, 
      webiconLib.iconOptionsCssIconSetOptionsMod.CssIconSetOptions
    ]
  ] = js.undefined
  /**
    * An alias of the `icons`-property.
    */
  var icon: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: this['icons'] */ js.Any
  ] = js.undefined
  /**
    * An alias of the `svgSets`-property.
    */
  var iconSet: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: this['svgSets'] */ js.Any
  ] = js.undefined
  /**
    * An alias of the `svgSets`-property.
    */
  var iconSets: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: this['svgSets'] */ js.Any
  ] = js.undefined
  /**
    * The icons to provide.
    */
  var icons: js.UndefOr[
    webiconLib.systemIdentityMapMod.IdentityMap[
      java.lang.String, 
      webiconLib.iconOptionsImageIconOptionsMod.ImageIconOptions | webiconLib.iconOptionsSvgIconOptionsMod.SvgIconOptions
    ]
  ] = js.undefined
  /**
    * An alias of the `alias`-property.
    */
  var sourceAlias: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: this['alias'] */ js.Any
  ] = js.undefined
  /**
    * An alias of the `sprites`-property.
    */
  var sprite: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: this['sprites'] */ js.Any
  ] = js.undefined
  /**
    * A set of sprite-icons to provide.
    */
  var sprites: js.UndefOr[
    webiconLib.systemIdentityMapMod.IdentityMap[
      webiconLib.iconCssClassConfigMod.CssClassConfig, 
      webiconLib.iconOptionsCssIconSetOptionsMod.CssIconSetOptions
    ]
  ] = js.undefined
  /**
    * An alias of the `svgSets`-property.
    */
  var svgSet: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: this['svgSets'] */ js.Any
  ] = js.undefined
  /**
    * The svg-sets to provide.
    */
  var svgSets: js.UndefOr[
    webiconLib.systemIdentityMapMod.IdentityMap[
      java.lang.String, 
      webiconLib.iconOptionsSvgIconSetOptionsMod.SvgIconSetOptions | webiconLib.iconOptionsSvgCumulativeIconSetOptionsMod.SvgCumulativeIconSetOptions
    ]
  ] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    alias: webiconLib.systemIdentityMapMod.IdentityMap[java.lang.String, webiconLib.iconOptionsAliasOptionsMod.AliasOptions] = null,
    default: /* import warning: ImportType.apply Failed type conversion: this['defaultSource'] */ js.Any = null,
    defaultIconSetUrl: java.lang.String | webiconLib.iconOptionsSvgIconSetOptionsMod.SvgIconSetOptions | webiconLib.iconOptionsSvgCumulativeIconSetOptionsMod.SvgCumulativeIconSetOptions = null,
    defaultSource: java.lang.String | webiconLib.systemIdentifiableMod.Identifiable = null,
    defaultSvgIconSetUrl: /* import warning: ImportType.apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any = null,
    defaultSvgIconSize: scala.Double | webiconLib.iconOptionsSizeableOptionsMod.SizeableOptions = null,
    defaultSvgSetUrl: /* import warning: ImportType.apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any = null,
    font: /* import warning: ImportType.apply Failed type conversion: this['fonts'] */ js.Any = null,
    fonts: webiconLib.systemIdentityMapMod.IdentityMap[
      webiconLib.iconCssClassConfigMod.CssClassConfig, 
      webiconLib.iconOptionsCssIconSetOptionsMod.CssIconSetOptions
    ] = null,
    icon: /* import warning: ImportType.apply Failed type conversion: this['icons'] */ js.Any = null,
    iconSet: /* import warning: ImportType.apply Failed type conversion: this['svgSets'] */ js.Any = null,
    iconSets: /* import warning: ImportType.apply Failed type conversion: this['svgSets'] */ js.Any = null,
    icons: webiconLib.systemIdentityMapMod.IdentityMap[
      java.lang.String, 
      webiconLib.iconOptionsImageIconOptionsMod.ImageIconOptions | webiconLib.iconOptionsSvgIconOptionsMod.SvgIconOptions
    ] = null,
    sourceAlias: /* import warning: ImportType.apply Failed type conversion: this['alias'] */ js.Any = null,
    sprite: /* import warning: ImportType.apply Failed type conversion: this['sprites'] */ js.Any = null,
    sprites: webiconLib.systemIdentityMapMod.IdentityMap[
      webiconLib.iconCssClassConfigMod.CssClassConfig, 
      webiconLib.iconOptionsCssIconSetOptionsMod.CssIconSetOptions
    ] = null,
    svgSet: /* import warning: ImportType.apply Failed type conversion: this['svgSets'] */ js.Any = null,
    svgSets: webiconLib.systemIdentityMapMod.IdentityMap[
      java.lang.String, 
      webiconLib.iconOptionsSvgIconSetOptionsMod.SvgIconSetOptions | webiconLib.iconOptionsSvgCumulativeIconSetOptionsMod.SvgCumulativeIconSetOptions
    ] = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (defaultIconSetUrl != null) __obj.updateDynamic("defaultIconSetUrl")(defaultIconSetUrl.asInstanceOf[js.Any])
    if (defaultSource != null) __obj.updateDynamic("defaultSource")(defaultSource.asInstanceOf[js.Any])
    if (defaultSvgIconSetUrl != null) __obj.updateDynamic("defaultSvgIconSetUrl")(defaultSvgIconSetUrl)
    if (defaultSvgIconSize != null) __obj.updateDynamic("defaultSvgIconSize")(defaultSvgIconSize.asInstanceOf[js.Any])
    if (defaultSvgSetUrl != null) __obj.updateDynamic("defaultSvgSetUrl")(defaultSvgSetUrl)
    if (font != null) __obj.updateDynamic("font")(font)
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconSet != null) __obj.updateDynamic("iconSet")(iconSet)
    if (iconSets != null) __obj.updateDynamic("iconSets")(iconSets)
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (sourceAlias != null) __obj.updateDynamic("sourceAlias")(sourceAlias)
    if (sprite != null) __obj.updateDynamic("sprite")(sprite)
    if (sprites != null) __obj.updateDynamic("sprites")(sprites.asInstanceOf[js.Any])
    if (svgSet != null) __obj.updateDynamic("svgSet")(svgSet)
    if (svgSets != null) __obj.updateDynamic("svgSets")(svgSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

