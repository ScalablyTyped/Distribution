package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountMyWorkResult extends StObject {
  
  /**
    * True, when length of WorkItemDetails is same as the limit
    */
  var querySizeLimitExceeded: Boolean
  
  /**
    * WorkItem Details
    */
  var workItemDetails: js.Array[AccountWorkWorkItemModel]
}
object AccountMyWorkResult {
  
  inline def apply(querySizeLimitExceeded: Boolean, workItemDetails: js.Array[AccountWorkWorkItemModel]): AccountMyWorkResult = {
    val __obj = js.Dynamic.literal(querySizeLimitExceeded = querySizeLimitExceeded.asInstanceOf[js.Any], workItemDetails = workItemDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountMyWorkResult]
  }
  
  extension [Self <: AccountMyWorkResult](x: Self) {
    
    inline def setQuerySizeLimitExceeded(value: Boolean): Self = StObject.set(x, "querySizeLimitExceeded", value.asInstanceOf[js.Any])
    
    inline def setWorkItemDetails(value: js.Array[AccountWorkWorkItemModel]): Self = StObject.set(x, "workItemDetails", value.asInstanceOf[js.Any])
    
    inline def setWorkItemDetailsVarargs(value: AccountWorkWorkItemModel*): Self = StObject.set(x, "workItemDetails", js.Array(value*))
  }
}
