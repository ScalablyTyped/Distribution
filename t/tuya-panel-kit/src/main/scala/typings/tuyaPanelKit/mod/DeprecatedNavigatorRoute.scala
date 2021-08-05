package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecatedNavigatorRoute
  extends StObject
     with /* prop */ StringDictionary[js.Any] {
  
  var id: String
}
object DeprecatedNavigatorRoute {
  
  inline def apply(id: String): DeprecatedNavigatorRoute = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecatedNavigatorRoute]
  }
  
  extension [Self <: DeprecatedNavigatorRoute](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
