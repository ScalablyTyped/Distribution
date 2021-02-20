package typings.webicon

import typings.webicon.cssClassConfigMod.CssClassConfig
import typings.webicon.iconMod.Icon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssIconSetOptionsMod {
  
  @js.native
  trait CssIconSetOptions extends Icon {
    
    /**
      * An alias of the `className`-property.
      */
    var `class`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any
      ] = js.native
    
    /**
      * Either a text-pattern or a callback which provides a css-classname.
      *
      * The symbols `?` and `%` in the text-pattern are replaced by the icon-id.
      */
    var className: js.UndefOr[CssClassConfig] = js.native
    
    /**
      * An alias of the `className`-property.
      */
    var cssClass: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any
      ] = js.native
  }
  object CssIconSetOptions {
    
    @scala.inline
    def apply(): CssIconSetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CssIconSetOptions]
    }
    
    @scala.inline
    implicit class CssIconSetOptionsMutableBuilder[Self <: CssIconSetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any
      ): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: CssClassConfig): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameFunction2(value: (/* id */ String, /* params */ js.Array[String]) => String): Self = StObject.set(x, "className", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setCssClass(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any
      ): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    }
  }
}
