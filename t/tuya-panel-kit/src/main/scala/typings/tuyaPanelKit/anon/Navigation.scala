package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.typesMod.RouteProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigation[ParamList /* <: ParamListBase */] extends StObject {
  
  var navigation: js.Any = js.native
  
  var route: RouteProp[ParamList, /* keyof ParamList */ String] = js.native
}
object Navigation {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */](navigation: js.Any, route: RouteProp[ParamList, /* keyof ParamList */ String]): Navigation[ParamList] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigation[ParamList]]
  }
  
  @scala.inline
  implicit class NavigationMutableBuilder[Self <: Navigation[_], ParamList /* <: ParamListBase */] (val x: Self with Navigation[ParamList]) extends AnyVal {
    
    @scala.inline
    def setNavigation(value: js.Any): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute(value: RouteProp[ParamList, /* keyof ParamList */ String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
