package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyNameRouteName[RouteName /* <: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String */] extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var name: RouteName
  
  var params: /* import warning: importer.ImportType#apply Failed type conversion: tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase[RouteName] */ js.Any
}
object KeyNameRouteName {
  
  @scala.inline
  def apply[RouteName /* <: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String */](
    name: RouteName,
    params: /* import warning: importer.ImportType#apply Failed type conversion: tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase[RouteName] */ js.Any
  ): KeyNameRouteName[RouteName] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyNameRouteName[RouteName]]
  }
  
  @scala.inline
  implicit class KeyNameRouteNameMutableBuilder[Self <: KeyNameRouteName[?], RouteName /* <: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String */] (val x: Self & KeyNameRouteName[RouteName]) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setName(value: RouteName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase[RouteName] */ js.Any
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
