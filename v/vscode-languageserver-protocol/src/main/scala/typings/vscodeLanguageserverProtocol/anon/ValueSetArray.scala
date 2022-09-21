package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.CompletionItemTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueSetArray extends StObject {
  
  /**
    * The tags supported by the client.
    */
  var valueSet: js.Array[CompletionItemTag]
}
object ValueSetArray {
  
  inline def apply(valueSet: js.Array[CompletionItemTag]): ValueSetArray = {
    val __obj = js.Dynamic.literal(valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetArray]
  }
  
  extension [Self <: ValueSetArray](x: Self) {
    
    inline def setValueSet(value: js.Array[CompletionItemTag]): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    inline def setValueSetVarargs(value: CompletionItemTag*): Self = StObject.set(x, "valueSet", js.Array(value*))
  }
}
