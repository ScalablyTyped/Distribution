package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportingWorkItemRevisionsFilter extends js.Object {
  /**
    * A list of fields to return in work item revisions. Omit this parameter to get all reportable fields.
    */
  var fields: js.Array[String] = js.native
  /**
    * Include deleted work item in the result.
    */
  var includeDeleted: Boolean = js.native
  /**
    * Return an identity reference instead of a string value for identity fields.
    */
  var includeIdentityRef: Boolean = js.native
  /**
    * Include only the latest version of a work item, skipping over all previous revisions of the work item.
    */
  var includeLatestOnly: Boolean = js.native
  /**
    * Include tag reference instead of string value for System.Tags field
    */
  var includeTagRef: Boolean = js.native
  /**
    * A list of types to filter the results to specific work item types. Omit this parameter to get work item revisions of all work item types.
    */
  var types: js.Array[String] = js.native
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
  @scala.inline
  implicit class ReportingWorkItemRevisionsFilterOps[Self <: ReportingWorkItemRevisionsFilter] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeDeleted(value: Boolean): Self = this.set("includeDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeIdentityRef(value: Boolean): Self = this.set("includeIdentityRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeLatestOnly(value: Boolean): Self = this.set("includeLatestOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeTagRef(value: Boolean): Self = this.set("includeTagRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

