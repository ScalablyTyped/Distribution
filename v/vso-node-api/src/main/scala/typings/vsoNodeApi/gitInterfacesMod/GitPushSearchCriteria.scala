package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitPushSearchCriteria extends StObject {
  
  var fromDate: js.Date
  
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean
  
  var includeRefUpdates: Boolean
  
  var pusherId: String
  
  var refName: String
  
  var toDate: js.Date
}
object GitPushSearchCriteria {
  
  inline def apply(
    fromDate: js.Date,
    includeLinks: Boolean,
    includeRefUpdates: Boolean,
    pusherId: String,
    refName: String,
    toDate: js.Date
  ): GitPushSearchCriteria = {
    val __obj = js.Dynamic.literal(fromDate = fromDate.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], includeRefUpdates = includeRefUpdates.asInstanceOf[js.Any], pusherId = pusherId.asInstanceOf[js.Any], refName = refName.asInstanceOf[js.Any], toDate = toDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPushSearchCriteria]
  }
  
  extension [Self <: GitPushSearchCriteria](x: Self) {
    
    inline def setFromDate(value: js.Date): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
    
    inline def setIncludeLinks(value: Boolean): Self = StObject.set(x, "includeLinks", value.asInstanceOf[js.Any])
    
    inline def setIncludeRefUpdates(value: Boolean): Self = StObject.set(x, "includeRefUpdates", value.asInstanceOf[js.Any])
    
    inline def setPusherId(value: String): Self = StObject.set(x, "pusherId", value.asInstanceOf[js.Any])
    
    inline def setRefName(value: String): Self = StObject.set(x, "refName", value.asInstanceOf[js.Any])
    
    inline def setToDate(value: js.Date): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
  }
}
