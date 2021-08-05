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
  
  inline def apply(name: String, referenceName: String): WorkItemFieldOperation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemFieldOperation]
  }
  
  extension [Self <: WorkItemFieldOperation](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReferenceName(value: String): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
  }
}
