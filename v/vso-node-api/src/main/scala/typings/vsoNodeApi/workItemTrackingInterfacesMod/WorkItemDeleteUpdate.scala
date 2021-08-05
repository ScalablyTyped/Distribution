package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemDeleteUpdate extends StObject {
  
  /**
    * Sets a value indicating whether this work item is deleted.
    */
  var isDeleted: Boolean
}
object WorkItemDeleteUpdate {
  
  inline def apply(isDeleted: Boolean): WorkItemDeleteUpdate = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemDeleteUpdate]
  }
  
  extension [Self <: WorkItemDeleteUpdate](x: Self) {
    
    inline def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
  }
}
