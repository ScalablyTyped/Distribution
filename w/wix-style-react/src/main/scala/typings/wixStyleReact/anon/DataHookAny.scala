package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHookAny extends StObject {
  
  var children: Any
  
  var dataHook: Any
}
object DataHookAny {
  
  inline def apply(children: Any, dataHook: Any): DataHookAny = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHookAny]
  }
  
  extension [Self <: DataHookAny](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
  }
}
