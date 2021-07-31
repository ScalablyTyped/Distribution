package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticMessage extends StObject {
  
  var category: DiagnosticCategory
  
  var code: Double
  
  var key: java.lang.String
  
  var message: java.lang.String
  
  var reportsDeprecated: js.UndefOr[js.Object] = js.undefined
  
  var reportsUnnecessary: js.UndefOr[js.Object] = js.undefined
}
object DiagnosticMessage {
  
  @scala.inline
  def apply(category: DiagnosticCategory, code: Double, key: java.lang.String, message: java.lang.String): DiagnosticMessage = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticMessage]
  }
  
  @scala.inline
  implicit class DiagnosticMessageMutableBuilder[Self <: DiagnosticMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: DiagnosticCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: java.lang.String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportsDeprecated(value: js.Object): Self = StObject.set(x, "reportsDeprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportsDeprecatedUndefined: Self = StObject.set(x, "reportsDeprecated", js.undefined)
    
    @scala.inline
    def setReportsUnnecessary(value: js.Object): Self = StObject.set(x, "reportsUnnecessary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportsUnnecessaryUndefined: Self = StObject.set(x, "reportsUnnecessary", js.undefined)
  }
}
