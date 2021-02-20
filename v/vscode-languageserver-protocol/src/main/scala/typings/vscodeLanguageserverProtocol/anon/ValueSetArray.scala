package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.CompletionItemTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueSetArray extends StObject {
  
  /**
    * The tags supported by the client.
    */
  var valueSet: js.Array[CompletionItemTag] = js.native
}
object ValueSetArray {
  
  @scala.inline
  def apply(valueSet: js.Array[CompletionItemTag]): ValueSetArray = {
    val __obj = js.Dynamic.literal(valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetArray]
  }
  
  @scala.inline
  implicit class ValueSetArrayMutableBuilder[Self <: ValueSetArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValueSet(value: js.Array[CompletionItemTag]): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSetVarargs(value: CompletionItemTag*): Self = StObject.set(x, "valueSet", js.Array(value :_*))
  }
}
