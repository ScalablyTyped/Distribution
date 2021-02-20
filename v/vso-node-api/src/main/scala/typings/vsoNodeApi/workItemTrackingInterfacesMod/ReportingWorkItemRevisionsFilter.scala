package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportingWorkItemRevisionsFilter extends StObject {
  
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
  implicit class ReportingWorkItemRevisionsFilterMutableBuilder[Self <: ReportingWorkItemRevisionsFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setIncludeDeleted(value: Boolean): Self = StObject.set(x, "includeDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeIdentityRef(value: Boolean): Self = StObject.set(x, "includeIdentityRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeLatestOnly(value: Boolean): Self = StObject.set(x, "includeLatestOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTagRef(value: Boolean): Self = StObject.set(x, "includeTagRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
