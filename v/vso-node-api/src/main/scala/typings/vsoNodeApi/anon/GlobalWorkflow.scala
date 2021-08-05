package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalWorkflow extends StObject {
  
  var globalWorkflow: scala.Double
  
  var workItemType: scala.Double
}
object GlobalWorkflow {
  
  inline def apply(globalWorkflow: scala.Double, workItemType: scala.Double): GlobalWorkflow = {
    val __obj = js.Dynamic.literal(globalWorkflow = globalWorkflow.asInstanceOf[js.Any], workItemType = workItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalWorkflow]
  }
  
  extension [Self <: GlobalWorkflow](x: Self) {
    
    inline def setGlobalWorkflow(value: scala.Double): Self = StObject.set(x, "globalWorkflow", value.asInstanceOf[js.Any])
    
    inline def setWorkItemType(value: scala.Double): Self = StObject.set(x, "workItemType", value.asInstanceOf[js.Any])
  }
}
