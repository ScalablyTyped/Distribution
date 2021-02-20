package typings.webicon

import typings.webicon.sizeableMod.Sizeable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizeableOptionsMod {
  
  @js.native
  trait SizeableOptions extends Sizeable {
    
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
  }
  object SizeableOptions {
    
    @scala.inline
    def apply(): SizeableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeableOptions]
    }
    
    @scala.inline
    implicit class SizeableOptionsMutableBuilder[Self <: SizeableOptions] (val x: Self) extends AnyVal {
      
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
    }
  }
}
