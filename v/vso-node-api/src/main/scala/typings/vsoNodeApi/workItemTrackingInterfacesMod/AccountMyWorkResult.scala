package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountMyWorkResult extends StObject {
  
  /**
    * True, when length of WorkItemDetails is same as the limit
    */
  var querySizeLimitExceeded: Boolean = js.native
  
  /**
    * WorkItem Details
    */
  var workItemDetails: js.Array[AccountWorkWorkItemModel] = js.native
}
object AccountMyWorkResult {
  
  @scala.inline
  def apply(querySizeLimitExceeded: Boolean, workItemDetails: js.Array[AccountWorkWorkItemModel]): AccountMyWorkResult = {
    val __obj = js.Dynamic.literal(querySizeLimitExceeded = querySizeLimitExceeded.asInstanceOf[js.Any], workItemDetails = workItemDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountMyWorkResult]
  }
  
  @scala.inline
  implicit class AccountMyWorkResultMutableBuilder[Self <: AccountMyWorkResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuerySizeLimitExceeded(value: Boolean): Self = StObject.set(x, "querySizeLimitExceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemDetails(value: js.Array[AccountWorkWorkItemModel]): Self = StObject.set(x, "workItemDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemDetailsVarargs(value: AccountWorkWorkItemModel*): Self = StObject.set(x, "workItemDetails", js.Array(value :_*))
  }
}
