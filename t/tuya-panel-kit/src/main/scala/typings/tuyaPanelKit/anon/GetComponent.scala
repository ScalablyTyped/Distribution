package typings.tuyaPanelKit.anon

import typings.react.mod.ReactNode
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComponent[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] extends StObject {
  
  /**
    * Render callback to render content of this screen.
    */
  def children(props: Route[ParamList, RouteName]): ReactNode
  
  var component: js.UndefOr[scala.Nothing] = js.undefined
  
  var getComponent: js.UndefOr[scala.Nothing] = js.undefined
}
object GetComponent {
  
  inline def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](children: Route[ParamList, RouteName] => ReactNode): GetComponent[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[GetComponent[ParamList, RouteName]]
  }
  
  extension [Self <: GetComponent[?, ?], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](x: Self & (GetComponent[ParamList, RouteName])) {
    
    inline def setChildren(value: Route[ParamList, RouteName] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
