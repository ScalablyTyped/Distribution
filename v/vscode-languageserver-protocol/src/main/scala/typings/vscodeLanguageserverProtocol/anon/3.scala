package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.SymbolTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  /**
    * The tags supported by the client.
    */
  var valueSet: js.Array[SymbolTag]
}
object `3` {
  
  inline def apply(valueSet: js.Array[SymbolTag]): `3` = {
    val __obj = js.Dynamic.literal(valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
    
    inline def setValueSet(value: js.Array[SymbolTag]): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    inline def setValueSetVarargs(value: SymbolTag*): Self = StObject.set(x, "valueSet", js.Array(value*))
  }
}
