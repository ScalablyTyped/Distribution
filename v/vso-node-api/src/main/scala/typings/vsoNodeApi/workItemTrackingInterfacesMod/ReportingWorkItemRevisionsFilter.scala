package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportingWorkItemRevisionsFilter extends js.Object {
  /**
    * A list of fields to return in work item revisions. Omit this parameter to get all reportable fields.
    */
  var fields: js.Array[String]
  /**
    * Include deleted work item in the result.
    */
  var includeDeleted: Boolean
  /**
    * Return an identity reference instead of a string value for identity fields.
    */
  var includeIdentityRef: Boolean
  /**
    * Include only the latest version of a work item, skipping over all previous revisions of the work item.
    */
  var includeLatestOnly: Boolean
  /**
    * Include tag reference instead of string value for System.Tags field
    */
  var includeTagRef: Boolean
  /**
    * A list of types to filter the results to specific work item types. Omit this parameter to get work item revisions of all work item types.
    */
  var types: js.Array[String]
}

object ReportingWorkItemRevisionsFilter {
  @scala.inline
  def apply(
    fields: js.Array[String],
    includeDeleted: Boolean,
    includeIdentityRef: Boolean,
    includeLatestOnly: Boolean,
    includeTagRef: Boolean,
    types: js.Array[String]
  ): ReportingWorkItemRevisionsFilter = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], includeDeleted = includeDeleted.asInstanceOf[js.Any], includeIdentityRef = includeIdentityRef.asInstanceOf[js.Any], includeLatestOnly = includeLatestOnly.asInstanceOf[js.Any], includeTagRef = includeTagRef.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportingWorkItemRevisionsFilter]
  }
}

