package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextProcessor extends js.Object {
  
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
  implicit class ITextProcessorOps[Self <: ITextProcessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProcessText(value: (String, Boolean) => String): Self = this.set("processText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProcessTextEx(value: (String, Boolean, Boolean) => js.Any): Self = this.set("processTextEx", js.Any.fromFunction3(value))
  }
}
