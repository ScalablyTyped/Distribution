package typings.webicon

import typings.webicon.svgIconMod.SvgIcon
import typings.webicon.urlConfigMod.UrlConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconSetOptionsMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.webicon.iconMod.Icon because Already inherited
  - typings.webicon.sizeableMod.Sizeable because Already inherited
  - typings.webicon.downloadableMod.Downloadable because var conflicts: iconIdParser. Inlined url, uri
  - typings.webicon.sizeableOptionsMod.SizeableOptions because var conflicts: iconSize. Inlined size, svgIconSize */ @js.native
  trait IconSetOptions extends SvgIcon {
    
    /**
      * A value indicating whether the icons are loaded separately.
      */
    var cumulative: js.UndefOr[Boolean] = js.native
    
    /**
      * An alias of the `iconSize`-property.
      */
    var size: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
      ] = js.native
    
    /**
      * An alias of the `iconSize`-property.
      */
    var svgIconSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
      ] = js.native
    
    /**
      * An alias of the `url`-property.
      */
    var uri: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any
      ] = js.native
    
    /**
      * The url to load the source from.
      */
    var url: js.UndefOr[UrlConfig[scala.Nothing]] = js.native
  }
  object IconSetOptions {
    
    @scala.inline
    def apply(): IconSetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconSetOptions]
    }
    
    @scala.inline
    implicit class IconSetOptionsMutableBuilder[Self <: IconSetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCumulative(value: Boolean): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCumulativeUndefined: Self = StObject.set(x, "cumulative", js.undefined)
      
      @scala.inline
      def setSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSvgIconSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
      ): Self = StObject.set(x, "svgIconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgIconSizeUndefined: Self = StObject.set(x, "svgIconSize", js.undefined)
      
      @scala.inline
      def setUri(value: /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      @scala.inline
      def setUrl(value: UrlConfig[scala.Nothing]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
