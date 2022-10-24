package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassNameAny extends StObject {
  
  var className: Any
  
  var dataHook: Any
}
object ClassNameAny {
  
  inline def apply(className: Any, dataHook: Any): ClassNameAny = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNameAny]
  }
  
  extension [Self <: ClassNameAny](x: Self) {
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
  }
}
