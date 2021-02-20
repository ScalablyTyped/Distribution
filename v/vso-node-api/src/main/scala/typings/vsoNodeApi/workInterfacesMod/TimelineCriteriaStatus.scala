package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineCriteriaStatus extends StObject {
  
  var message: String = js.native
  
  var `type`: TimelineCriteriaStatusCode = js.native
}
object TimelineCriteriaStatus {
  
  @scala.inline
  def apply(message: String, `type`: TimelineCriteriaStatusCode): TimelineCriteriaStatus = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineCriteriaStatus]
  }
  
  @scala.inline
  implicit class TimelineCriteriaStatusMutableBuilder[Self <: TimelineCriteriaStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TimelineCriteriaStatusCode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
