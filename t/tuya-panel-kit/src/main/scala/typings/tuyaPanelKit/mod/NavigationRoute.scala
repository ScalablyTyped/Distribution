package typings.tuyaPanelKit.mod

import typings.react.mod.ComponentType
import typings.tuyaPanelKit.stackTypesMod.StackNavigationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationRoute extends StObject {
  
  var Scene: ComponentType[js.Object]
  
  var id: String
  
  var screenOptions: js.UndefOr[
    StackNavigationOptions | (js.Function1[/* props */ typings.tuyaPanelKit.anon.NavigationRoute, StackNavigationOptions])
  ] = js.undefined
}
object NavigationRoute {
  
  @scala.inline
  def apply(Scene: ComponentType[js.Object], id: String): NavigationRoute = {
    val __obj = js.Dynamic.literal(Scene = Scene.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationRoute]
  }
  
  @scala.inline
  implicit class NavigationRouteMutableBuilder[Self <: NavigationRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScene(value: ComponentType[js.Object]): Self = StObject.set(x, "Scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenOptions(
      value: StackNavigationOptions | (js.Function1[/* props */ typings.tuyaPanelKit.anon.NavigationRoute, StackNavigationOptions])
    ): Self = StObject.set(x, "screenOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenOptionsFunction1(value: /* props */ typings.tuyaPanelKit.anon.NavigationRoute => StackNavigationOptions): Self = StObject.set(x, "screenOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScreenOptionsUndefined: Self = StObject.set(x, "screenOptions", js.undefined)
  }
}
