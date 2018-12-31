package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPushSearchCriteria extends js.Object {
  var fromDate: stdLib.Date
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: scala.Boolean
  var includeRefUpdates: scala.Boolean
  var pusherId: java.lang.String
  var refName: java.lang.String
  var toDate: stdLib.Date
}

