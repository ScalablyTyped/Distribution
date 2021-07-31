package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldUpdate extends StObject {
  
  var description: String
  
  var id: String
}
object FieldUpdate {
  
  @scala.inline
  def apply(description: String, id: String): FieldUpdate = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldUpdate]
  }
  
  @scala.inline
  implicit class FieldUpdateMutableBuilder[Self <: FieldUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
