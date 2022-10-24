package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset extends StObject {
  
  var dataHook: Any
  
  var offset: Any
}
object Offset {
  
  inline def apply(dataHook: Any, offset: Any): Offset = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  extension [Self <: Offset](x: Self) {
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
