package typings.tuyaPanelKit.mod

import typings.tuyaPanelKit.anon.NavigationAny
import typings.tuyaPanelKit.stackTypesMod.StackNavigationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationParam extends js.Object {
  
  var router: js.Array[NavigationRoute] = js.native
  
  var screenOptions: js.UndefOr[ScreenOptions] = js.native
}
object NavigationParam {
  
  @scala.inline
  def apply(router: js.Array[NavigationRoute]): NavigationParam = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationParam]
  }
  
  @scala.inline
  implicit class NavigationParamOps[Self <: NavigationParam] (val x: Self) extends AnyVal {
    
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
    def setRouterVarargs(value: NavigationRoute*): Self = this.set("router", js.Array(value :_*))
    
    @scala.inline
    def setRouter(value: js.Array[NavigationRoute]): Self = this.set("router", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenOptionsFunction1(value: /* props */ NavigationAny => StackNavigationOptions): Self = this.set("screenOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScreenOptions(value: ScreenOptions): Self = this.set("screenOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenOptions: Self = this.set("screenOptions", js.undefined)
  }
}
