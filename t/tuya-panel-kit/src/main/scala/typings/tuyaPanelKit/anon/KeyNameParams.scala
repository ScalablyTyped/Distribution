package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyNameParams[RouteName_4 /* <: String */] extends StObject {
  
  // tslint:disable-next-line no-redundant-undefined
  var key: js.UndefOr[String] = js.undefined
  
  // tslint:disable-next-line no-unnecessary-generics
  var name: RouteName_4
  
  var params: js.UndefOr[js.Object] = js.undefined
}
object KeyNameParams {
  
  inline def apply[RouteName_4 /* <: String */](name: RouteName_4): KeyNameParams[RouteName_4] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyNameParams[RouteName_4]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyNameParams[?], RouteName_4 /* <: String */] (val x: Self & KeyNameParams[RouteName_4]) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: RouteName_4): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
