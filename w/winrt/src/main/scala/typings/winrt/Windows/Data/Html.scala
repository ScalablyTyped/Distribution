package typings.winrt.Windows.Data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Html {
  
  trait HtmlUtilities extends StObject
  
  trait IHtmlUtilities extends StObject {
    
    def convertToText(html: String): String
  }
  object IHtmlUtilities {
    
    @scala.inline
    def apply(convertToText: String => String): IHtmlUtilities = {
      val __obj = js.Dynamic.literal(convertToText = js.Any.fromFunction1(convertToText))
      __obj.asInstanceOf[IHtmlUtilities]
    }
    
    @scala.inline
    implicit class IHtmlUtilitiesMutableBuilder[Self <: IHtmlUtilities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConvertToText(value: String => String): Self = StObject.set(x, "convertToText", js.Any.fromFunction1(value))
    }
  }
}
