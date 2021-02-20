package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.stackTypesMod.StackNavigationEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BC[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] extends StObject {
  
  var a: ParamList = js.native
  
  var b: RouteName = js.native
  
  var c: StackNavigationEventMap = js.native
}
object BC {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](a: ParamList, b: RouteName, c: StackNavigationEventMap): BC[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[BC[ParamList, RouteName]]
  }
  
  @scala.inline
  implicit class BCMutableBuilder[Self <: BC[_, _], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] (val x: Self with (BC[ParamList, RouteName])) extends AnyVal {
    
    @scala.inline
    def setA(value: ParamList): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: RouteName): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC(value: StackNavigationEventMap): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
  }
}
