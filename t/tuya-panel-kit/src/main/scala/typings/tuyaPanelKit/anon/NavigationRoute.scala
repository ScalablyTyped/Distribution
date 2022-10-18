package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.`@reactNavigationCoreTypesMod`.RouteProp
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationRoute extends StObject {
  
  var navigation: Any
  
  var route: RouteProp[ParamListBase, String]
}
object NavigationRoute {
  
  inline def apply(navigation: Any, route: RouteProp[ParamListBase, String]): NavigationRoute = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationRoute]
  }
  
  extension [Self <: NavigationRoute](x: Self) {
    
    inline def setNavigation(value: Any): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: RouteProp[ParamListBase, String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
