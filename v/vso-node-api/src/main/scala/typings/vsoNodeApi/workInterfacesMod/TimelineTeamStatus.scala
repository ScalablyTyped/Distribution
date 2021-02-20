package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineTeamStatus extends StObject {
  
  var message: String = js.native
  
  var `type`: TimelineTeamStatusCode = js.native
}
object TimelineTeamStatus {
  
  @scala.inline
  def apply(message: String, `type`: TimelineTeamStatusCode): TimelineTeamStatus = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineTeamStatus]
  }
  
  @scala.inline
  implicit class TimelineTeamStatusMutableBuilder[Self <: TimelineTeamStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TimelineTeamStatusCode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
