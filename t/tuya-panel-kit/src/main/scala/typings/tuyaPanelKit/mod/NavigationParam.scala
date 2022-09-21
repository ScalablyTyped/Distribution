package typings.tuyaPanelKit.mod

import typings.tuyaPanelKit.stackTypesMod.StackNavigationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationParam extends StObject {
  
  var router: js.Array[NavigationRoute]
  
  var screenOptions: js.UndefOr[ScreenOptions] = js.undefined
}
object NavigationParam {
  
  inline def apply(router: js.Array[NavigationRoute]): NavigationParam = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationParam]
  }
  
  extension [Self <: NavigationParam](x: Self) {
    
    inline def setRouter(value: js.Array[NavigationRoute]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    
    inline def setRouterVarargs(value: NavigationRoute*): Self = StObject.set(x, "router", js.Array(value*))
    
    inline def setScreenOptions(value: ScreenOptions): Self = StObject.set(x, "screenOptions", value.asInstanceOf[js.Any])
    
    inline def setScreenOptionsFunction1(value: /* props */ typings.tuyaPanelKit.anon.NavigationRoute => StackNavigationOptions): Self = StObject.set(x, "screenOptions", js.Any.fromFunction1(value))
    
    inline def setScreenOptionsUndefined: Self = StObject.set(x, "screenOptions", js.undefined)
  }
}
