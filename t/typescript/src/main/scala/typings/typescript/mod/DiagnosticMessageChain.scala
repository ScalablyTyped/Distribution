package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagnosticMessageChain extends StObject {
  
  var category: DiagnosticCategory = js.native
  
  var code: Double = js.native
  
  var messageText: java.lang.String = js.native
  
  var next: js.UndefOr[js.Array[DiagnosticMessageChain]] = js.native
}
object DiagnosticMessageChain {
  
  @scala.inline
  def apply(category: DiagnosticCategory, code: Double, messageText: java.lang.String): DiagnosticMessageChain = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticMessageChain]
  }
  
  @scala.inline
  implicit class DiagnosticMessageChainMutableBuilder[Self <: DiagnosticMessageChain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: DiagnosticCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageText(value: java.lang.String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: js.Array[DiagnosticMessageChain]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setNextVarargs(value: DiagnosticMessageChain*): Self = StObject.set(x, "next", js.Array(value :_*))
  }
}
