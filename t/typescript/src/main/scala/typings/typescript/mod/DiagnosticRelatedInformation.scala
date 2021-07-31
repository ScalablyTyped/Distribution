package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticRelatedInformation extends StObject {
  
  var category: DiagnosticCategory
  
  var code: Double
  
  var file: js.UndefOr[SourceFile] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var messageText: java.lang.String | DiagnosticMessageChain
  
  var start: js.UndefOr[Double] = js.undefined
}
object DiagnosticRelatedInformation {
  
  @scala.inline
  def apply(category: DiagnosticCategory, code: Double, messageText: java.lang.String | DiagnosticMessageChain): DiagnosticRelatedInformation = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticRelatedInformation]
  }
  
  @scala.inline
  implicit class DiagnosticRelatedInformationMutableBuilder[Self <: DiagnosticRelatedInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: DiagnosticCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: SourceFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setMessageText(value: java.lang.String | DiagnosticMessageChain): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
