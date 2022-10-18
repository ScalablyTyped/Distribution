package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyParams[RouteName /* <: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String */] extends StObject {
  
  var key: String
  
  var params: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase[RouteName] */ js.Any
  ] = js.undefined
}
object KeyParams {
  
  inline def apply[RouteName /* <: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String */](key: String): KeyParams[RouteName] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyParams[RouteName]]
  }
  
  extension [Self <: KeyParams[?], RouteName /* <: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String */](x: Self & KeyParams[RouteName]) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase[RouteName] */ js.Any
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
