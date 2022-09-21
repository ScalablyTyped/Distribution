package typings.tabris.anon

import typings.tabris.mod.Flatten
import typings.tabris.mod.TextInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputs extends StObject {
  
  var children: js.UndefOr[Flatten[String | TextInput | Cid]] = js.undefined
  
  var textInputs: js.UndefOr[scala.Nothing] = js.undefined
}
object TextInputs {
  
  inline def apply(): TextInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputs]
  }
  
  extension [Self <: TextInputs](x: Self) {
    
    inline def setChildren(value: Flatten[String | TextInput | Cid]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (String | TextInput | Cid)*): Self = StObject.set(x, "children", js.Array(value*))
  }
}
