package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemField extends WorkItemTrackingResource {
  
  /**
    * The description of the field.
    */
  var description: String = js.native
  
  /**
    * Indicates whether this field is an identity field.
    */
  var isIdentity: Boolean = js.native
  
  /**
    * Indicates whether this instance is picklist.
    */
  var isPicklist: Boolean = js.native
  
  /**
    * Indicates whether this instance is a suggested picklist .
    */
  var isPicklistSuggested: Boolean = js.native
  
  /**
    * The name of the field.
    */
  var name: String = js.native
  
  /**
    * Indicates whether the field is [read only].
    */
  var readOnly: Boolean = js.native
  
  /**
    * The reference name of the field.
    */
  var referenceName: String = js.native
  
  /**
    * The supported operations on this field.
    */
  var supportedOperations: js.Array[WorkItemFieldOperation] = js.native
  
  /**
    * The type of the field.
    */
  var `type`: FieldType = js.native
  
  /**
    * The usage of the field.
    */
  var usage: FieldUsage = js.native
}
object WorkItemField {
  
  @scala.inline
  def apply(
    _links: js.Any,
    description: String,
    isIdentity: Boolean,
    isPicklist: Boolean,
    isPicklistSuggested: Boolean,
    name: String,
    readOnly: Boolean,
    referenceName: String,
    supportedOperations: js.Array[WorkItemFieldOperation],
    `type`: FieldType,
    url: String,
    usage: FieldUsage
  ): WorkItemField = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isIdentity = isIdentity.asInstanceOf[js.Any], isPicklist = isPicklist.asInstanceOf[js.Any], isPicklistSuggested = isPicklistSuggested.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], supportedOperations = supportedOperations.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemField]
  }
  
  @scala.inline
  implicit class WorkItemFieldMutableBuilder[Self <: WorkItemField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIdentity(value: Boolean): Self = StObject.set(x, "isIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPicklist(value: Boolean): Self = StObject.set(x, "isPicklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPicklistSuggested(value: Boolean): Self = StObject.set(x, "isPicklistSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceName(value: String): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedOperations(value: js.Array[WorkItemFieldOperation]): Self = StObject.set(x, "supportedOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedOperationsVarargs(value: WorkItemFieldOperation*): Self = StObject.set(x, "supportedOperations", js.Array(value :_*))
    
    @scala.inline
    def setType(value: FieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsage(value: FieldUsage): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
  }
}
