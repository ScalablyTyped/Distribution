package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait A[ParamList /* <: ParamListBase */] extends StObject {
  
  var a: ParamList
  
  var b: /* keyof ParamList */ String
}
object A {
  
  inline def apply[ParamList /* <: ParamListBase */](a: ParamList, b: /* keyof ParamList */ String): A[ParamList] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[A[ParamList]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: A[?], ParamList /* <: ParamListBase */] (val x: Self & A[ParamList]) extends AnyVal {
    
    inline def setA(value: ParamList): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: /* keyof ParamList */ String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
  }
}
