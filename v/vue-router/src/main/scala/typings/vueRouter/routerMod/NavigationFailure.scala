package typings.vueRouter.routerMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationFailure
  extends StObject
     with Error {
  
  var from: Route
  
  var to: Route
  
  var `type`: Double
}
object NavigationFailure {
  
  inline def apply(from: Route, message: String, name: String, to: Route, `type`: Double): NavigationFailure = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationFailure]
  }
  
  extension [Self <: NavigationFailure](x: Self) {
    
    inline def setFrom(value: Route): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Route): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
