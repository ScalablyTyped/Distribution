package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextProcessor extends StObject {
  
  def processText(text: String, returnDisplayValue: Boolean): String
  
  def processTextEx(text: String, returnDisplayValue: Boolean, doEncoding: Boolean): Any
}
object ITextProcessor {
  
  inline def apply(processText: (String, Boolean) => String, processTextEx: (String, Boolean, Boolean) => Any): ITextProcessor = {
    val __obj = js.Dynamic.literal(processText = js.Any.fromFunction2(processText), processTextEx = js.Any.fromFunction3(processTextEx))
    __obj.asInstanceOf[ITextProcessor]
  }
  
  extension [Self <: ITextProcessor](x: Self) {
    
    inline def setProcessText(value: (String, Boolean) => String): Self = StObject.set(x, "processText", js.Any.fromFunction2(value))
    
    inline def setProcessTextEx(value: (String, Boolean, Boolean) => Any): Self = StObject.set(x, "processTextEx", js.Any.fromFunction3(value))
  }
}
