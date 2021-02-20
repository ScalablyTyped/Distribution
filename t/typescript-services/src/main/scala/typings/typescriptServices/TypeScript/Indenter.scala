package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Indenter extends StObject {
  
  def decreaseIndent(): Unit = js.native
  
  def getIndent(): String = js.native
  
  def increaseIndent(): Unit = js.native
  
  var indentAmt: Double = js.native
}
object Indenter {
  
  @scala.inline
  def apply(decreaseIndent: () => Unit, getIndent: () => String, increaseIndent: () => Unit, indentAmt: Double): Indenter = {
    val __obj = js.Dynamic.literal(decreaseIndent = js.Any.fromFunction0(decreaseIndent), getIndent = js.Any.fromFunction0(getIndent), increaseIndent = js.Any.fromFunction0(increaseIndent), indentAmt = indentAmt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indenter]
  }
  
  @scala.inline
  implicit class IndenterMutableBuilder[Self <: Indenter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecreaseIndent(value: () => Unit): Self = StObject.set(x, "decreaseIndent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndent(value: () => String): Self = StObject.set(x, "getIndent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIncreaseIndent(value: () => Unit): Self = StObject.set(x, "increaseIndent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndentAmt(value: Double): Self = StObject.set(x, "indentAmt", value.asInstanceOf[js.Any])
  }
}
