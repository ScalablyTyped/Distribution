package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHookHeight extends StObject {
  
  var dataHook: Any
  
  var height: Any
}
object DataHookHeight {
  
  inline def apply(dataHook: Any, height: Any): DataHookHeight = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHookHeight]
  }
  
  extension [Self <: DataHookHeight](x: Self) {
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
  }
}
