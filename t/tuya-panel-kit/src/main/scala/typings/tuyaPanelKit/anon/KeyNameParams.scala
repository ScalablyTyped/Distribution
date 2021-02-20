package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyNameParams[RouteName_4 /* <: String */] extends StObject {
  
  // tslint:disable-next-line no-redundant-undefined
  var key: js.UndefOr[String] = js.native
  
  // tslint:disable-next-line no-unnecessary-generics
  var name: RouteName_4 = js.native
  
  var params: js.UndefOr[js.Object] = js.native
}
object KeyNameParams {
  
  @scala.inline
  def apply[RouteName_4 /* <: String */](name: RouteName_4): KeyNameParams[RouteName_4] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyNameParams[RouteName_4]]
  }
  
  @scala.inline
  implicit class KeyNameParamsMutableBuilder[Self <: KeyNameParams[_], RouteName_4 /* <: String */] (val x: Self with KeyNameParams[RouteName_4]) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setName(value: RouteName_4): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
