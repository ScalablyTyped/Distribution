package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemFieldOperation extends StObject {
  
  /**
    * Name of the operation.
    */
  var name: String
  
  /**
    * Reference name of the operation.
    */
  var referenceName: String
}
object WorkItemFieldOperation {
  
  @scala.inline
  def apply(name: String, referenceName: String): WorkItemFieldOperation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemFieldOperation]
  }
  
  @scala.inline
  implicit class WorkItemFieldOperationMutableBuilder[Self <: WorkItemFieldOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceName(value: String): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
  }
}
