package typings.tuyaPanelKit.mod

import typings.react.mod.ComponentType
import typings.tuyaPanelKit.stackTypesMod.StackNavigationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationRoute extends StObject {
  
  var component: ComponentType[js.Object]
  
  var name: String
  
  var options: js.UndefOr[
    StackNavigationOptions | (js.Function1[/* props */ typings.tuyaPanelKit.anon.NavigationRoute, StackNavigationOptions]) | NavigationOptions
  ] = js.undefined
}
object NavigationRoute {
  
  inline def apply(component: ComponentType[js.Object], name: String): NavigationRoute = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationRoute]
  }
  
  extension [Self <: NavigationRoute](x: Self) {
    
    inline def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(
      value: StackNavigationOptions | (js.Function1[/* props */ typings.tuyaPanelKit.anon.NavigationRoute, StackNavigationOptions]) | NavigationOptions
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsFunction1(value: /* props */ typings.tuyaPanelKit.anon.NavigationRoute => StackNavigationOptions): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
