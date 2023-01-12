package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.DiagnosticTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueSet extends StObject {
  
  /**
    * The tags supported by the client.
    */
  var valueSet: js.Array[DiagnosticTag]
}
object ValueSet {
  
  inline def apply(valueSet: js.Array[DiagnosticTag]): ValueSet = {
    val __obj = js.Dynamic.literal(valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueSet] (val x: Self) extends AnyVal {
    
    inline def setValueSet(value: js.Array[DiagnosticTag]): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    inline def setValueSetVarargs(value: DiagnosticTag*): Self = StObject.set(x, "valueSet", js.Array(value*))
  }
}
