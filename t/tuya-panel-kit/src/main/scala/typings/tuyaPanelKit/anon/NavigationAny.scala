package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.typesMod.RouteProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationAny extends StObject {
  
  var navigation: js.Any = js.native
  
  var route: RouteProp[ParamListBase, String] = js.native
}
object NavigationAny {
  
  @scala.inline
  def apply(navigation: js.Any, route: RouteProp[ParamListBase, String]): NavigationAny = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationAny]
  }
  
  @scala.inline
  implicit class NavigationAnyMutableBuilder[Self <: NavigationAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNavigation(value: js.Any): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute(value: RouteProp[ParamListBase, String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
