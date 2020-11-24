package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitPushSearchCriteria extends js.Object {
  
  var fromDate: Date = js.native
  
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean = js.native
  
  var includeRefUpdates: Boolean = js.native
  
  var pusherId: String = js.native
  
  var refName: String = js.native
  
  var toDate: Date = js.native
}
object GitPushSearchCriteria {
  
  @scala.inline
  def apply(
    fromDate: Date,
    includeLinks: Boolean,
    includeRefUpdates: Boolean,
    pusherId: String,
    refName: String,
    toDate: Date
  ): GitPushSearchCriteria = {
    val __obj = js.Dynamic.literal(fromDate = fromDate.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], includeRefUpdates = includeRefUpdates.asInstanceOf[js.Any], pusherId = pusherId.asInstanceOf[js.Any], refName = refName.asInstanceOf[js.Any], toDate = toDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPushSearchCriteria]
  }
  
  @scala.inline
  implicit class GitPushSearchCriteriaOps[Self <: GitPushSearchCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFromDate(value: Date): Self = this.set("fromDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeLinks(value: Boolean): Self = this.set("includeLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeRefUpdates(value: Boolean): Self = this.set("includeRefUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPusherId(value: String): Self = this.set("pusherId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefName(value: String): Self = this.set("refName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToDate(value: Date): Self = this.set("toDate", value.asInstanceOf[js.Any])
  }
}
