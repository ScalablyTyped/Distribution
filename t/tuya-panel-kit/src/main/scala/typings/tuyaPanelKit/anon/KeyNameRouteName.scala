package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyNameRouteName[RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: ParamListBase */] extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var name: RouteName
  
  var params: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
}
object KeyNameRouteName {
  
  inline def apply[RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: ParamListBase */](
    name: RouteName,
    params: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ): KeyNameRouteName[RouteName, ParamList] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyNameRouteName[RouteName, ParamList]]
  }
  
  extension [Self <: KeyNameRouteName[?, ?], RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: ParamListBase */](x: Self & (KeyNameRouteName[RouteName, ParamList])) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: RouteName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
