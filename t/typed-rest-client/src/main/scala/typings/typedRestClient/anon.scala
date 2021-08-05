package typings.typedRestClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ArrayFormat extends StObject {
    
    var arrayFormat: js.UndefOr[String] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
    
    var shouldAllowDots: js.UndefOr[Boolean] = js.undefined
    
    var shouldOnlyEncodeValues: js.UndefOr[Boolean] = js.undefined
  }
  object ArrayFormat {
    
    inline def apply(): ArrayFormat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrayFormat]
    }
    
    extension [Self <: ArrayFormat](x: Self) {
      
      inline def setArrayFormat(value: String): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      inline def setArrayFormatUndefined: Self = StObject.set(x, "arrayFormat", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setShouldAllowDots(value: Boolean): Self = StObject.set(x, "shouldAllowDots", value.asInstanceOf[js.Any])
      
      inline def setShouldAllowDotsUndefined: Self = StObject.set(x, "shouldAllowDots", js.undefined)
      
      inline def setShouldOnlyEncodeValues(value: Boolean): Self = StObject.set(x, "shouldOnlyEncodeValues", value.asInstanceOf[js.Any])
      
      inline def setShouldOnlyEncodeValuesUndefined: Self = StObject.set(x, "shouldOnlyEncodeValues", js.undefined)
    }
  }
}
