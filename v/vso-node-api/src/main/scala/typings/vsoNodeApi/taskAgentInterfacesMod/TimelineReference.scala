package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineReference extends StObject {
  
  var changeId: Double
  
  var id: String
  
  var location: String
}
object TimelineReference {
  
  @scala.inline
  def apply(changeId: Double, id: String, location: String): TimelineReference = {
    val __obj = js.Dynamic.literal(changeId = changeId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineReference]
  }
  
  @scala.inline
  implicit class TimelineReferenceMutableBuilder[Self <: TimelineReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeId(value: Double): Self = StObject.set(x, "changeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
