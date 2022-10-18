package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.DiagnosticTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  /**
    * The tags supported by the client.
    */
  var valueSet: js.Array[DiagnosticTag]
}
object `4` {
  
  inline def apply(valueSet: js.Array[DiagnosticTag]): `4` = {
    val __obj = js.Dynamic.literal(valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setValueSet(value: js.Array[DiagnosticTag]): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    inline def setValueSetVarargs(value: DiagnosticTag*): Self = StObject.set(x, "valueSet", js.Array(value*))
  }
}
