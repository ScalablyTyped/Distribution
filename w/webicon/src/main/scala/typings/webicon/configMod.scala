package typings.webicon

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @js.native
  trait Config extends StObject {
    
    /**
      * An alias of the `defaultSource`-property.
      */
    var default: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['defaultSource'] */ js.Any
      ] = js.native
    
    /**
      * A set of alias-names for icon-sets.
      */
    var alias: js.UndefOr[IdentityMap[String, AliasOptions]] = js.native
    
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
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: IdentityMap[String, AliasOptions]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setAliasVarargs(value: (Identifiable with AliasOptions)*): Self = StObject.set(x, "alias", js.Array(value :_*))
      
      @scala.inline
      def setDefault(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['defaultSource'] */ js.Any
      ): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultIconSetUrl(value: String | SvgIconSetOptions | SvgCumulativeIconSetOptions): Self = StObject.set(x, "defaultIconSetUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultIconSetUrlUndefined: Self = StObject.set(x, "defaultIconSetUrl", js.undefined)
      
      @scala.inline
      def setDefaultSource(value: String | Identifiable): Self = StObject.set(x, "defaultSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSourceUndefined: Self = StObject.set(x, "defaultSource", js.undefined)
      
      @scala.inline
      def setDefaultSvgIconSetUrl(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any
      ): Self = StObject.set(x, "defaultSvgIconSetUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSvgIconSetUrlUndefined: Self = StObject.set(x, "defaultSvgIconSetUrl", js.undefined)
      
      @scala.inline
      def setDefaultSvgIconSize(value: Double | SizeableOptions): Self = StObject.set(x, "defaultSvgIconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSvgIconSizeUndefined: Self = StObject.set(x, "defaultSvgIconSize", js.undefined)
      
      @scala.inline
      def setDefaultSvgSetUrl(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any
      ): Self = StObject.set(x, "defaultSvgSetUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSvgSetUrlUndefined: Self = StObject.set(x, "defaultSvgSetUrl", js.undefined)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setFont(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['fonts'] */ js.Any
      ): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFonts(value: IdentityMap[CssClassConfig, CssIconSetOptions]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      @scala.inline
      def setFontsVarargs(value: (Identifiable with CssIconSetOptions)*): Self = StObject.set(x, "fonts", js.Array(value :_*))
      
      @scala.inline
      def setIcon(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['icons'] */ js.Any
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSet(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any
      ): Self = StObject.set(x, "iconSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSetUndefined: Self = StObject.set(x, "iconSet", js.undefined)
      
      @scala.inline
      def setIconSets(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any
      ): Self = StObject.set(x, "iconSets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSetsUndefined: Self = StObject.set(x, "iconSets", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIcons(value: IdentityMap[String, ImageIconOptions | SvgIconOptions]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      @scala.inline
      def setIconsVarargs(value: (Identifiable with (ImageIconOptions | SvgIconOptions))*): Self = StObject.set(x, "icons", js.Array(value :_*))
      
      @scala.inline
      def setSourceAlias(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['alias'] */ js.Any
      ): Self = StObject.set(x, "sourceAlias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceAliasUndefined: Self = StObject.set(x, "sourceAlias", js.undefined)
      
      @scala.inline
      def setSprite(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['sprites'] */ js.Any
      ): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpriteUndefined: Self = StObject.set(x, "sprite", js.undefined)
      
      @scala.inline
      def setSprites(value: IdentityMap[CssClassConfig, CssIconSetOptions]): Self = StObject.set(x, "sprites", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpritesUndefined: Self = StObject.set(x, "sprites", js.undefined)
      
      @scala.inline
      def setSpritesVarargs(value: (Identifiable with CssIconSetOptions)*): Self = StObject.set(x, "sprites", js.Array(value :_*))
      
      @scala.inline
      def setSvgSet(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any
      ): Self = StObject.set(x, "svgSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgSetUndefined: Self = StObject.set(x, "svgSet", js.undefined)
      
      @scala.inline
      def setSvgSets(value: IdentityMap[String, SvgIconSetOptions | SvgCumulativeIconSetOptions]): Self = StObject.set(x, "svgSets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgSetsUndefined: Self = StObject.set(x, "svgSets", js.undefined)
      
      @scala.inline
      def setSvgSetsVarargs(value: (Identifiable with (SvgIconSetOptions | SvgCumulativeIconSetOptions))*): Self = StObject.set(x, "svgSets", js.Array(value :_*))
    }
  }
}
