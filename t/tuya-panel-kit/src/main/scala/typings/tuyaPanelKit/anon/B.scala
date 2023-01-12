package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.`@reactNavigationCoreTypesMod`.EventMapBase
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait B[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, EventMap /* <: EventMapBase */] extends StObject {
  
  var a: ParamList
  
  var b: RouteName
  
  var c: EventMap
}
object B {
  
  inline def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, EventMap /* <: EventMapBase */](a: ParamList, b: RouteName, c: EventMap): B[ParamList, RouteName, EventMap] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[B[ParamList, RouteName, EventMap]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: B[?, ?, ?], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, EventMap /* <: EventMapBase */] (val x: Self & (B[ParamList, RouteName, EventMap])) extends AnyVal {
    
    inline def setA(value: ParamList): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: RouteName): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setC(value: EventMap): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
  }
}
