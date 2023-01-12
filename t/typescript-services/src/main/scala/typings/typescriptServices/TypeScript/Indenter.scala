package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indenter extends StObject {
  
  def decreaseIndent(): Unit
  
  def getIndent(): String
  
  def increaseIndent(): Unit
  
  var indentAmt: Double
}
object Indenter {
  
  inline def apply(decreaseIndent: () => Unit, getIndent: () => String, increaseIndent: () => Unit, indentAmt: Double): Indenter = {
    val __obj = js.Dynamic.literal(decreaseIndent = js.Any.fromFunction0(decreaseIndent), getIndent = js.Any.fromFunction0(getIndent), increaseIndent = js.Any.fromFunction0(increaseIndent), indentAmt = indentAmt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indenter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Indenter] (val x: Self) extends AnyVal {
    
    inline def setDecreaseIndent(value: () => Unit): Self = StObject.set(x, "decreaseIndent", js.Any.fromFunction0(value))
    
    inline def setGetIndent(value: () => String): Self = StObject.set(x, "getIndent", js.Any.fromFunction0(value))
    
    inline def setIncreaseIndent(value: () => Unit): Self = StObject.set(x, "increaseIndent", js.Any.fromFunction0(value))
    
    inline def setIndentAmt(value: Double): Self = StObject.set(x, "indentAmt", value.asInstanceOf[js.Any])
  }
}
