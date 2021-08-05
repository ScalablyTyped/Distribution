package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemTypeStateColors extends StObject {
  
  /**
    * Work item type state colors
    */
  var stateColors: js.Array[WorkItemStateColor]
  
  /**
    * Work item type name
    */
  var workItemTypeName: String
}
object WorkItemTypeStateColors {
  
  inline def apply(stateColors: js.Array[WorkItemStateColor], workItemTypeName: String): WorkItemTypeStateColors = {
    val __obj = js.Dynamic.literal(stateColors = stateColors.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeStateColors]
  }
  
  extension [Self <: WorkItemTypeStateColors](x: Self) {
    
    inline def setStateColors(value: js.Array[WorkItemStateColor]): Self = StObject.set(x, "stateColors", value.asInstanceOf[js.Any])
    
    inline def setStateColorsVarargs(value: WorkItemStateColor*): Self = StObject.set(x, "stateColors", js.Array(value :_*))
    
    inline def setWorkItemTypeName(value: String): Self = StObject.set(x, "workItemTypeName", value.asInstanceOf[js.Any])
  }
}
