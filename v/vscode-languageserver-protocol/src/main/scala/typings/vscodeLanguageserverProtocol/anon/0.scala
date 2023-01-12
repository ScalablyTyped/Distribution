package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.InsertTextMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var valueSet: js.Array[InsertTextMode]
}
object `0` {
  
  inline def apply(valueSet: js.Array[InsertTextMode]): `0` = {
    val __obj = js.Dynamic.literal(valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setValueSet(value: js.Array[InsertTextMode]): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    inline def setValueSetVarargs(value: InsertTextMode*): Self = StObject.set(x, "valueSet", js.Array(value*))
  }
}
