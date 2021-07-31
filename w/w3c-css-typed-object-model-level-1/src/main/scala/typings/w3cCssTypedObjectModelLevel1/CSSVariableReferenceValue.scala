package typings.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSVariableReferenceValue extends StObject {
  
  val fallback: js.UndefOr[CSSUnparsedValue] = js.undefined
  
  var variable: String
}
object CSSVariableReferenceValue {
  
  @scala.inline
  def apply(variable: String): CSSVariableReferenceValue = {
    val __obj = js.Dynamic.literal(variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSVariableReferenceValue]
  }
  
  @scala.inline
  implicit class CSSVariableReferenceValueMutableBuilder[Self <: CSSVariableReferenceValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallback(value: CSSUnparsedValue): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    @scala.inline
    def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
  }
}
