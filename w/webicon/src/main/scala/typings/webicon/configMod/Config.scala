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

@js.native
trait Config extends js.Object {
  /**
    * A set of alias-names for icon-sets.
    */
  var alias: js.UndefOr[IdentityMap[String, AliasOptions]] = js.native
  /**
    * An alias of the `defaultSource`-property.
    */
  var default: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['defaultSource'] */ js.Any
  ] = js.native
  /**
    * The default icon-set to provide.
    */
  var defaultIconSetUrl: js.UndefOr[String | SvgIconSetOptions | SvgCumulativeIconSetOptions] = js.native
  /**
    * The default icon-set to use.
    */
  var defaultSource: js.UndefOr[String | Identifiable] = js.native
  /**
    * An alias of the `defaultIconSetUrl`-property.
    */
  var defaultSvgIconSetUrl: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any
  ] = js.native
  /**
    * The default size for svg-icons.
    */
  var defaultSvgIconSize: js.UndefOr[Double | SizeableOptions] = js.native
  /**
    * An alias of the `defaultIconSetUrl`-property.
    */
  var defaultSvgSetUrl: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any
  ] = js.native
  /**
    * An alias of the `fonts`-property.
    */
  var font: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['fonts'] */ js.Any
  ] = js.native
  /**
    * A set of icon-fonts to provide.
    */
  var fonts: js.UndefOr[IdentityMap[CssClassConfig, CssIconSetOptions]] = js.native
  /**
    * An alias of the `icons`-property.
    */
  var icon: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['icons'] */ js.Any
  ] = js.native
  /**
    * An alias of the `svgSets`-property.
    */
  var iconSet: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any
  ] = js.native
  /**
    * An alias of the `svgSets`-property.
    */
  var iconSets: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any
  ] = js.native
  /**
    * The icons to provide.
    */
  var icons: js.UndefOr[IdentityMap[String, ImageIconOptions | SvgIconOptions]] = js.native
  /**
    * An alias of the `alias`-property.
    */
  var sourceAlias: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['alias'] */ js.Any
  ] = js.native
  /**
    * An alias of the `sprites`-property.
    */
  var sprite: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['sprites'] */ js.Any
  ] = js.native
  /**
    * A set of sprite-icons to provide.
    */
  var sprites: js.UndefOr[IdentityMap[CssClassConfig, CssIconSetOptions]] = js.native
  /**
    * An alias of the `svgSets`-property.
    */
  var svgSet: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any
  ] = js.native
  /**
    * The svg-sets to provide.
    */
  var svgSets: js.UndefOr[IdentityMap[String, SvgIconSetOptions | SvgCumulativeIconSetOptions]] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAliasVarargs(value: (Identifiable with AliasOptions)*): Self = this.set("alias", js.Array(value :_*))
    @scala.inline
    def setAlias(value: IdentityMap[String, AliasOptions]): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setDefault(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['defaultSource'] */ js.Any
    ): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDefaultIconSetUrl(value: String | SvgIconSetOptions | SvgCumulativeIconSetOptions): Self = this.set("defaultIconSetUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultIconSetUrl: Self = this.set("defaultIconSetUrl", js.undefined)
    @scala.inline
    def setDefaultSource(value: String | Identifiable): Self = this.set("defaultSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSource: Self = this.set("defaultSource", js.undefined)
    @scala.inline
    def setDefaultSvgIconSetUrl(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any
    ): Self = this.set("defaultSvgIconSetUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSvgIconSetUrl: Self = this.set("defaultSvgIconSetUrl", js.undefined)
    @scala.inline
    def setDefaultSvgIconSize(value: Double | SizeableOptions): Self = this.set("defaultSvgIconSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSvgIconSize: Self = this.set("defaultSvgIconSize", js.undefined)
    @scala.inline
    def setDefaultSvgSetUrl(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any
    ): Self = this.set("defaultSvgSetUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSvgSetUrl: Self = this.set("defaultSvgSetUrl", js.undefined)
    @scala.inline
    def setFont(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['fonts'] */ js.Any
    ): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setFontsVarargs(value: (Identifiable with CssIconSetOptions)*): Self = this.set("fonts", js.Array(value :_*))
    @scala.inline
    def setFonts(value: IdentityMap[CssClassConfig, CssIconSetOptions]): Self = this.set("fonts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFonts: Self = this.set("fonts", js.undefined)
    @scala.inline
    def setIcon(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['icons'] */ js.Any
    ): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconSet(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any
    ): Self = this.set("iconSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconSet: Self = this.set("iconSet", js.undefined)
    @scala.inline
    def setIconSets(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any
    ): Self = this.set("iconSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconSets: Self = this.set("iconSets", js.undefined)
    @scala.inline
    def setIconsVarargs(value: (Identifiable with (ImageIconOptions | SvgIconOptions))*): Self = this.set("icons", js.Array(value :_*))
    @scala.inline
    def setIcons(value: IdentityMap[String, ImageIconOptions | SvgIconOptions]): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setSourceAlias(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['alias'] */ js.Any
    ): Self = this.set("sourceAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceAlias: Self = this.set("sourceAlias", js.undefined)
    @scala.inline
    def setSprite(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['sprites'] */ js.Any
    ): Self = this.set("sprite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSprite: Self = this.set("sprite", js.undefined)
    @scala.inline
    def setSpritesVarargs(value: (Identifiable with CssIconSetOptions)*): Self = this.set("sprites", js.Array(value :_*))
    @scala.inline
    def setSprites(value: IdentityMap[CssClassConfig, CssIconSetOptions]): Self = this.set("sprites", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSprites: Self = this.set("sprites", js.undefined)
    @scala.inline
    def setSvgSet(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any
    ): Self = this.set("svgSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgSet: Self = this.set("svgSet", js.undefined)
    @scala.inline
    def setSvgSetsVarargs(value: (Identifiable with (SvgIconSetOptions | SvgCumulativeIconSetOptions))*): Self = this.set("svgSets", js.Array(value :_*))
    @scala.inline
    def setSvgSets(value: IdentityMap[String, SvgIconSetOptions | SvgCumulativeIconSetOptions]): Self = this.set("svgSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgSets: Self = this.set("svgSets", js.undefined)
  }
  
}

