package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Both extends StObject {
  
  var both: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var team: scala.Double = js.native
  
  var user: scala.Double = js.native
}
object Both {
  
  @scala.inline
  def apply(both: scala.Double, none: scala.Double, team: scala.Double, user: scala.Double): Both = {
    val __obj = js.Dynamic.literal(both = both.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Both]
  }
  
  @scala.inline
  implicit class BothMutableBuilder[Self <: Both] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoth(value: scala.Double): Self = StObject.set(x, "both", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam(value: scala.Double): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: scala.Double): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
