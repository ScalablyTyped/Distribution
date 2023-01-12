package typings.webicon

import typings.webicon.iconCssClassConfigMod.CssClassConfig
import typings.webicon.iconIconMod.Icon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconOptionsCssIconSetOptionsMod {
  
  trait CssIconSetOptions
    extends StObject
       with Icon {
    
    /**
      * An alias of the `className`-property.
      */
    var `class`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any
      ] = js.undefined
    
    /**
      * Either a text-pattern or a callback which provides a css-classname.
      *
      * The symbols `?` and `%` in the text-pattern are replaced by the icon-id.
      */
    var className: js.UndefOr[CssClassConfig] = js.undefined
    
    /**
      * An alias of the `className`-property.
      */
    var cssClass: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any
      ] = js.undefined
  }
  object CssIconSetOptions {
    
    inline def apply(): CssIconSetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CssIconSetOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CssIconSetOptions] (val x: Self) extends AnyVal {
      
      inline def setClass(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any
      ): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: CssClassConfig): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameFunction2(value: (/* id */ String, /* params */ js.Array[String]) => String): Self = StObject.set(x, "className", js.Any.fromFunction2(value))
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setCssClass(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any
      ): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    }
  }
}
