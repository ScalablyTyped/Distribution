package typings.wixUiTestUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHookWrapper extends StObject {
  
  var dataHook: String
  
  var wrapper: Any
}
object DataHookWrapper {
  
  inline def apply(dataHook: String, wrapper: Any): DataHookWrapper = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHookWrapper]
  }
  
  extension [Self <: DataHookWrapper](x: Self) {
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setWrapper(value: Any): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
  }
}
