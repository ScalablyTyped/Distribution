package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextProcessor extends StObject {
  
  def processText(text: String, returnDisplayValue: Boolean): String = js.native
  
  def processTextEx(text: String, returnDisplayValue: Boolean, doEncoding: Boolean): js.Any = js.native
}
object ITextProcessor {
  
  @scala.inline
  def apply(processText: (String, Boolean) => String, processTextEx: (String, Boolean, Boolean) => js.Any): ITextProcessor = {
    val __obj = js.Dynamic.literal(processText = js.Any.fromFunction2(processText), processTextEx = js.Any.fromFunction3(processTextEx))
    __obj.asInstanceOf[ITextProcessor]
  }
  
  @scala.inline
  implicit class ITextProcessorMutableBuilder[Self <: ITextProcessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessText(value: (String, Boolean) => String): Self = StObject.set(x, "processText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProcessTextEx(value: (String, Boolean, Boolean) => js.Any): Self = StObject.set(x, "processTextEx", js.Any.fromFunction3(value))
  }
}
