package typings.tuyaPanelKit.stackTypesMod

import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.typesMod.RouteProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackScreenProps[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] extends js.Object {
  
  var navigation: StackNavigationProp[ParamList, RouteName] = js.native
  
  var route: RouteProp[ParamList, RouteName] = js.native
}
object StackScreenProps {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](navigation: StackNavigationProp[ParamList, RouteName], route: RouteProp[ParamList, RouteName]): StackScreenProps[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackScreenProps[ParamList, RouteName]]
  }
  
  @scala.inline
  implicit class StackScreenPropsOps[Self <: StackScreenProps[_, _], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] (val x: Self with (StackScreenProps[ParamList, RouteName])) extends AnyVal {
    
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
    def setNavigation(value: StackNavigationProp[ParamList, RouteName]): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute(value: RouteProp[ParamList, RouteName]): Self = this.set("route", value.asInstanceOf[js.Any])
  }
}
