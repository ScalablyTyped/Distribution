package typings.webicon

import typings.webicon.iconSizeableMod.Sizeable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconOptionsSizeableOptionsMod {
  
  trait SizeableOptions
    extends StObject
       with Sizeable {
    
    /**
      * An alias of the `iconSize`-property.
      */
    var size: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
      ] = js.undefined
    
    /**
      * An alias of the `iconSize`-property.
      */
    var svgIconSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
      ] = js.undefined
  }
  object SizeableOptions {
    
    inline def apply(): SizeableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SizeableOptions] (val x: Self) extends AnyVal {
      
      inline def setSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSvgIconSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
      ): Self = StObject.set(x, "svgIconSize", value.asInstanceOf[js.Any])
      
      inline def setSvgIconSizeUndefined: Self = StObject.set(x, "svgIconSize", js.undefined)
    }
  }
}
