package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagnosticInfo extends StObject {
  
  var category: DiagnosticCategory = js.native
  
  var code: Double = js.native
  
  var message: String = js.native
}
object DiagnosticInfo {
  
  @scala.inline
  def apply(category: DiagnosticCategory, code: Double, message: String): DiagnosticInfo = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticInfo]
  }
  
  @scala.inline
  implicit class DiagnosticInfoMutableBuilder[Self <: DiagnosticInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: DiagnosticCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
