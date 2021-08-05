package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait C extends StObject {
  
  var a: ParamListBase
  
  var b: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String
}
object C {
  
  inline def apply(
    a: ParamListBase,
    b: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String
  ): C = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[C]
  }
  
  extension [Self <: C](x: Self) {
    
    inline def setA(value: ParamListBase): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(
      value: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String
    ): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
  }
}
