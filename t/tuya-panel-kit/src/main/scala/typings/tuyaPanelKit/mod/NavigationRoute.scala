package typings.tuyaPanelKit.mod

import typings.react.mod.ComponentType
import typings.tuyaPanelKit.anon.NavigationAny
import typings.tuyaPanelKit.stackTypesMod.StackNavigationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationRoute extends StObject {
  
  var Scene: ComponentType[js.Object] = js.native
  
  var id: String = js.native
  
  var screenOptions: js.UndefOr[
    StackNavigationOptions | (js.Function1[/* props */ NavigationAny, StackNavigationOptions])
  ] = js.native
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
    def setScreenOptions(value: StackNavigationOptions | (js.Function1[/* props */ NavigationAny, StackNavigationOptions])): Self = StObject.set(x, "screenOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenOptionsFunction1(value: /* props */ NavigationAny => StackNavigationOptions): Self = StObject.set(x, "screenOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScreenOptionsUndefined: Self = StObject.set(x, "screenOptions", js.undefined)
  }
}
