package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemComments extends StObject {
  
  /**
    * Comments collection.
    */
  var comments: js.Array[WorkItemComment]
  
  /**
    * The count of comments.
    */
  var count: Double
  
  /**
    * Count of comments from the revision.
    */
  var fromRevisionCount: Double
  
  /**
    * Total count of comments.
    */
  var totalCount: Double
}
object WorkItemComments {
  
  inline def apply(comments: js.Array[WorkItemComment], count: Double, fromRevisionCount: Double, totalCount: Double): WorkItemComments = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], fromRevisionCount = fromRevisionCount.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemComments]
  }
  
  extension [Self <: WorkItemComments](x: Self) {
    
    inline def setComments(value: js.Array[WorkItemComment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsVarargs(value: WorkItemComment*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setFromRevisionCount(value: Double): Self = StObject.set(x, "fromRevisionCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
  }
}
