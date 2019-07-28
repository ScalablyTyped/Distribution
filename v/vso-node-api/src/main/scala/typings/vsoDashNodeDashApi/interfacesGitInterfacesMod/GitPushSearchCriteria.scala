package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPushSearchCriteria extends js.Object {
  var fromDate: Date
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean
  var includeRefUpdates: Boolean
  var pusherId: String
  var refName: String
  var toDate: Date
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
    val __obj = js.Dynamic.literal(fromDate = fromDate, includeLinks = includeLinks, includeRefUpdates = includeRefUpdates, pusherId = pusherId, refName = refName, toDate = toDate)
  
    __obj.asInstanceOf[GitPushSearchCriteria]
  }
}

