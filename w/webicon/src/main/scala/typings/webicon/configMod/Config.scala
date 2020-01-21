package typings.webicon.configMod

import typings.webicon.aliasOptionsMod.AliasOptions
import typings.webicon.cssClassConfigMod.CssClassConfig
import typings.webicon.cssIconSetOptionsMod.CssIconSetOptions
import typings.webicon.identifiableMod.Identifiable
import typings.webicon.identityMapMod.IdentityMap
import typings.webicon.imageIconOptionsMod.ImageIconOptions
import typings.webicon.sizeableOptionsMod.SizeableOptions
import typings.webicon.svgCumulativeIconSetOptionsMod.SvgCumulativeIconSetOptions
import typings.webicon.svgIconOptionsMod.SvgIconOptions
import typings.webicon.svgIconSetOptionsMod.SvgIconSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * A set of alias-names for icon-sets.
    */
  var alias: js.UndefOr[IdentityMap[String, AliasOptions]] = js.undefined
  /**
    * An alias of the `defaultSource`-property.
    */
  var default: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['defaultSource'] */ js.Any
  ] = js.undefined
  /**
    * The default icon-set to provide.
    */
  var defaultIconSetUrl: js.UndefOr[String | SvgIconSetOptions | SvgCumulativeIconSetOptions] = js.undefined
  /**
    * The default icon-set to use.
    */
  var defaultSource: js.UndefOr[String | Identifiable] = js.undefined
  /**
    * An alias of the `defaultIconSetUrl`-property.
    */
  var defaultSvgIconSetUrl: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any
  ] = js.undefined
  /**
    * The default size for svg-icons.
    */
  var defaultSvgIconSize: js.UndefOr[Double | SizeableOptions] = js.undefined
  /**
    * An alias of the `defaultIconSetUrl`-property.
    */
  var defaultSvgSetUrl: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any
  ] = js.undefined
  /**
    * An alias of the `fonts`-property.
    */
  var font: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['fonts'] */ js.Any
  ] = js.undefined
  /**
    * A set of icon-fonts to provide.
    */
  var fonts: js.UndefOr[IdentityMap[CssClassConfig, CssIconSetOptions]] = js.undefined
  /**
    * An alias of the `icons`-property.
    */
  var icon: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['icons'] */ js.Any
  ] = js.undefined
  /**
    * An alias of the `svgSets`-property.
    */
  var iconSet: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any
  ] = js.undefined
  /**
    * An alias of the `svgSets`-property.
    */
  var iconSets: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any
  ] = js.undefined
  /**
    * The icons to provide.
    */
  var icons: js.UndefOr[IdentityMap[String, ImageIconOptions | SvgIconOptions]] = js.undefined
  /**
    * An alias of the `alias`-property.
    */
  var sourceAlias: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['alias'] */ js.Any
  ] = js.undefined
  /**
    * An alias of the `sprites`-property.
    */
  var sprite: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['sprites'] */ js.Any
  ] = js.undefined
  /**
    * A set of sprite-icons to provide.
    */
  var sprites: js.UndefOr[IdentityMap[CssClassConfig, CssIconSetOptions]] = js.undefined
  /**
    * An alias of the `svgSets`-property.
    */
  var svgSet: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any
  ] = js.undefined
  /**
    * The svg-sets to provide.
    */
  var svgSets: js.UndefOr[IdentityMap[String, SvgIconSetOptions | SvgCumulativeIconSetOptions]] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    alias: IdentityMap[String, AliasOptions] = null,
    default: /* import warning: importer.ImportType#apply Failed type conversion: this['defaultSource'] */ js.Any = null,
    defaultIconSetUrl: String | SvgIconSetOptions | SvgCumulativeIconSetOptions = null,
    defaultSource: String | Identifiable = null,
    defaultSvgIconSetUrl: /* import warning: importer.ImportType#apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any = null,
    defaultSvgIconSize: Double | SizeableOptions = null,
    defaultSvgSetUrl: /* import warning: importer.ImportType#apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any = null,
    font: /* import warning: importer.ImportType#apply Failed type conversion: this['fonts'] */ js.Any = null,
    fonts: IdentityMap[CssClassConfig, CssIconSetOptions] = null,
    icon: /* import warning: importer.ImportType#apply Failed type conversion: this['icons'] */ js.Any = null,
    iconSet: /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any = null,
    iconSets: /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any = null,
    icons: IdentityMap[String, ImageIconOptions | SvgIconOptions] = null,
    sourceAlias: /* import warning: importer.ImportType#apply Failed type conversion: this['alias'] */ js.Any = null,
    sprite: /* import warning: importer.ImportType#apply Failed type conversion: this['sprites'] */ js.Any = null,
    sprites: IdentityMap[CssClassConfig, CssIconSetOptions] = null,
    svgSet: /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any = null,
    svgSets: IdentityMap[String, SvgIconSetOptions | SvgCumulativeIconSetOptions] = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (defaultIconSetUrl != null) __obj.updateDynamic("defaultIconSetUrl")(defaultIconSetUrl.asInstanceOf[js.Any])
    if (defaultSource != null) __obj.updateDynamic("defaultSource")(defaultSource.asInstanceOf[js.Any])
    if (defaultSvgIconSetUrl != null) __obj.updateDynamic("defaultSvgIconSetUrl")(defaultSvgIconSetUrl.asInstanceOf[js.Any])
    if (defaultSvgIconSize != null) __obj.updateDynamic("defaultSvgIconSize")(defaultSvgIconSize.asInstanceOf[js.Any])
    if (defaultSvgSetUrl != null) __obj.updateDynamic("defaultSvgSetUrl")(defaultSvgSetUrl.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconSet != null) __obj.updateDynamic("iconSet")(iconSet.asInstanceOf[js.Any])
    if (iconSets != null) __obj.updateDynamic("iconSets")(iconSets.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (sourceAlias != null) __obj.updateDynamic("sourceAlias")(sourceAlias.asInstanceOf[js.Any])
    if (sprite != null) __obj.updateDynamic("sprite")(sprite.asInstanceOf[js.Any])
    if (sprites != null) __obj.updateDynamic("sprites")(sprites.asInstanceOf[js.Any])
    if (svgSet != null) __obj.updateDynamic("svgSet")(svgSet.asInstanceOf[js.Any])
    if (svgSets != null) __obj.updateDynamic("svgSets")(svgSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

