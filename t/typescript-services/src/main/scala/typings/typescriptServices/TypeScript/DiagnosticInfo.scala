package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticInfo extends StObject {
  
  var category: DiagnosticCategory
  
  var code: Double
  
  var message: String
}
object DiagnosticInfo {
  
  inline def apply(category: DiagnosticCategory, code: Double, message: String): DiagnosticInfo = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticInfo]
  }
  
  extension [Self <: DiagnosticInfo](x: Self) {
    
    inline def setCategory(value: DiagnosticCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
