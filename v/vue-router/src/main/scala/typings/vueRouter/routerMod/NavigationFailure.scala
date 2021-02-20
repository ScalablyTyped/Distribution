package typings.vueRouter.routerMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationFailure extends Error {
  
  var from: Route = js.native
  
  var to: Route = js.native
  
  var `type`: Double = js.native
}
object NavigationFailure {
  
  @scala.inline
  def apply(from: Route, message: String, name: String, to: Route, `type`: Double): NavigationFailure = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationFailure]
  }
  
  @scala.inline
  implicit class NavigationFailureMutableBuilder[Self <: NavigationFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Route): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: Route): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
