package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait System extends StObject {
  
  var none: scala.Double = js.native
  
  var system: scala.Double = js.native
  
  var user: scala.Double = js.native
}
object System {
  
  @scala.inline
  def apply(none: scala.Double, system: scala.Double, user: scala.Double): System = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[System]
  }
  
  @scala.inline
  implicit class SystemMutableBuilder[Self <: System] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: scala.Double): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: scala.Double): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
