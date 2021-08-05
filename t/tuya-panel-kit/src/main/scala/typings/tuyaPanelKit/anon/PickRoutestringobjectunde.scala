package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.Route<string, object | undefined>, 'name' | 'params'> */
trait PickRoutestringobjectunde extends StObject {
  
  var name: js.UndefOr[js.Any] = js.undefined
  
  var params: js.UndefOr[js.Any] = js.undefined
}
object PickRoutestringobjectunde {
  
  inline def apply(): PickRoutestringobjectunde = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickRoutestringobjectunde]
  }
  
  extension [Self <: PickRoutestringobjectunde](x: Self) {
    
    inline def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
