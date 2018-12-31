package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportingWorkItemRevisionsFilter extends js.Object {
  /**
    * A list of fields to return in work item revisions. Omit this parameter to get all reportable fields.
    */
  var fields: js.Array[java.lang.String]
  /**
    * Include deleted work item in the result.
    */
  var includeDeleted: scala.Boolean
  /**
    * Return an identity reference instead of a string value for identity fields.
    */
  var includeIdentityRef: scala.Boolean
  /**
    * Include only the latest version of a work item, skipping over all previous revisions of the work item.
    */
  var includeLatestOnly: scala.Boolean
  /**
    * Include tag reference instead of string value for System.Tags field
    */
  var includeTagRef: scala.Boolean
  /**
    * A list of types to filter the results to specific work item types. Omit this parameter to get work item revisions of all work item types.
    */
  var types: js.Array[java.lang.String]
}

