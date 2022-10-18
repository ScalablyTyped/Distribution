package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import typings.tuyaPanelKit.`@reactNavigationStackTypesMod`.StackNavigationEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BC[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] extends StObject {
  
  var a: ParamList
  
  var b: RouteName
  
  var c: StackNavigationEventMap
}
object BC {
  
  inline def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](a: ParamList, b: RouteName, c: StackNavigationEventMap): BC[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[BC[ParamList, RouteName]]
  }
  
  extension [Self <: BC[?, ?], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](x: Self & (BC[ParamList, RouteName])) {
    
    inline def setA(value: ParamList): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: RouteName): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setC(value: StackNavigationEventMap): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
  }
}
