package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewableOptionsMod {
  
  @js.native
  trait PreviewableOptions extends StObject {
    
    /**
      * A value indicating whether the value should be visible in the table header.
      */
    var valueToHeader: js.UndefOr[Boolean] = js.native
  }
  object PreviewableOptions {
    
    @scala.inline
    def apply(): PreviewableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreviewableOptions]
    }
    
    @scala.inline
    implicit class PreviewableOptionsMutableBuilder[Self <: PreviewableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValueToHeader(value: Boolean): Self = StObject.set(x, "valueToHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueToHeaderUndefined: Self = StObject.set(x, "valueToHeader", js.undefined)
    }
  }
}
