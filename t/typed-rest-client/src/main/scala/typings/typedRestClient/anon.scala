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
    
    @scala.inline
    def apply(): ArrayFormat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrayFormat]
    }
    
    @scala.inline
    implicit class ArrayFormatMutableBuilder[Self <: ArrayFormat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayFormat(value: String): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayFormatUndefined: Self = StObject.set(x, "arrayFormat", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setShouldAllowDots(value: Boolean): Self = StObject.set(x, "shouldAllowDots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldAllowDotsUndefined: Self = StObject.set(x, "shouldAllowDots", js.undefined)
      
      @scala.inline
      def setShouldOnlyEncodeValues(value: Boolean): Self = StObject.set(x, "shouldOnlyEncodeValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldOnlyEncodeValuesUndefined: Self = StObject.set(x, "shouldOnlyEncodeValues", js.undefined)
    }
  }
}
