package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyStringNameRouteName[RouteName /* <: String */] extends StObject {
  
  /**
    * Unique key for the route.
    */
  var key: String = js.native
  
  /**
    * User-provided name for the route.
    */
  var name: RouteName = js.native
}
object KeyStringNameRouteName {
  
  @scala.inline
  def apply[RouteName /* <: String */](key: String, name: RouteName): KeyStringNameRouteName[RouteName] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyStringNameRouteName[RouteName]]
  }
  
  @scala.inline
  implicit class KeyStringNameRouteNameMutableBuilder[Self <: KeyStringNameRouteName[_], RouteName /* <: String */] (val x: Self with KeyStringNameRouteName[RouteName]) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: RouteName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
