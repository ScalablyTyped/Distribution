package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyStringNameRouteName[RouteName /* <: String */] extends StObject {
  
  /**
    * Unique key for the route.
    */
  var key: String
  
  /**
    * User-provided name for the route.
    */
  var name: RouteName
}
object KeyStringNameRouteName {
  
  @scala.inline
  def apply[RouteName /* <: String */](key: String, name: RouteName): KeyStringNameRouteName[RouteName] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyStringNameRouteName[RouteName]]
  }
  
  @scala.inline
  implicit class KeyStringNameRouteNameMutableBuilder[Self <: KeyStringNameRouteName[?], RouteName /* <: String */] (val x: Self & KeyStringNameRouteName[RouteName]) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: RouteName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
