package typings.tuyaPanelKit.mod

import typings.react.mod.ComponentType
import typings.tuyaPanelKit.anon.NavigationAny
import typings.tuyaPanelKit.stackTypesMod.StackNavigationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationRoute extends js.Object {
  
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
  implicit class NavigationRouteOps[Self <: NavigationRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setScene(value: ComponentType[js.Object]): Self = this.set("Scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenOptionsFunction1(value: /* props */ NavigationAny => StackNavigationOptions): Self = this.set("screenOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScreenOptions(value: StackNavigationOptions | (js.Function1[/* props */ NavigationAny, StackNavigationOptions])): Self = this.set("screenOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenOptions: Self = this.set("screenOptions", js.undefined)
  }
}
