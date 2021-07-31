package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineIterationStatus extends StObject {
  
  var message: String
  
  var `type`: TimelineIterationStatusCode
}
object TimelineIterationStatus {
  
  @scala.inline
  def apply(message: String, `type`: TimelineIterationStatusCode): TimelineIterationStatus = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineIterationStatus]
  }
  
  @scala.inline
  implicit class TimelineIterationStatusMutableBuilder[Self <: TimelineIterationStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TimelineIterationStatusCode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
