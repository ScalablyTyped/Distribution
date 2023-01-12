package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestSessionExploredWorkItemReference
  extends StObject
     with TestSessionWorkItemReference {
  
  /**
    * Workitem references of workitems filed as a part of the current workitem exploration.
    */
  var associatedWorkItems: js.Array[TestSessionWorkItemReference]
  
  /**
    * Time when exploration of workitem ended.
    */
  var endTime: js.Date
  
  /**
    * Time when explore of workitem was started.
    */
  var startTime: js.Date
}
object TestSessionExploredWorkItemReference {
  
  inline def apply(
    associatedWorkItems: js.Array[TestSessionWorkItemReference],
    endTime: js.Date,
    id: Double,
    startTime: js.Date,
    `type`: String
  ): TestSessionExploredWorkItemReference = {
    val __obj = js.Dynamic.literal(associatedWorkItems = associatedWorkItems.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSessionExploredWorkItemReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestSessionExploredWorkItemReference] (val x: Self) extends AnyVal {
    
    inline def setAssociatedWorkItems(value: js.Array[TestSessionWorkItemReference]): Self = StObject.set(x, "associatedWorkItems", value.asInstanceOf[js.Any])
    
    inline def setAssociatedWorkItemsVarargs(value: TestSessionWorkItemReference*): Self = StObject.set(x, "associatedWorkItems", js.Array(value*))
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
