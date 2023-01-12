package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringFormatterOptionsPreviewableOptionsMod {
  
  trait PreviewableOptions extends StObject {
    
    /**
      * A value indicating whether the value should be visible in the table header.
      */
    var valueToHeader: js.UndefOr[Boolean] = js.undefined
  }
  object PreviewableOptions {
    
    inline def apply(): PreviewableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreviewableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreviewableOptions] (val x: Self) extends AnyVal {
      
      inline def setValueToHeader(value: Boolean): Self = StObject.set(x, "valueToHeader", value.asInstanceOf[js.Any])
      
      inline def setValueToHeaderUndefined: Self = StObject.set(x, "valueToHeader", js.undefined)
    }
  }
}
