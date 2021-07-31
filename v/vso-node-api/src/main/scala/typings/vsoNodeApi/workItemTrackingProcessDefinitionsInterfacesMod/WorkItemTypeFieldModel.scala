package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemTypeFieldModel extends StObject {
  
  var allowGroups: Boolean
  
  var defaultValue: String
  
  var name: String
  
  var pickList: PickListMetadataModel
  
  var readOnly: Boolean
  
  var referenceName: String
  
  var required: Boolean
  
  var `type`: FieldType
  
  var url: String
}
object WorkItemTypeFieldModel {
  
  @scala.inline
  def apply(
    allowGroups: Boolean,
    defaultValue: String,
    name: String,
    pickList: PickListMetadataModel,
    readOnly: Boolean,
    referenceName: String,
    required: Boolean,
    `type`: FieldType,
    url: String
  ): WorkItemTypeFieldModel = {
    val __obj = js.Dynamic.literal(allowGroups = allowGroups.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pickList = pickList.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeFieldModel]
  }
  
  @scala.inline
  implicit class WorkItemTypeFieldModelMutableBuilder[Self <: WorkItemTypeFieldModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowGroups(value: Boolean): Self = StObject.set(x, "allowGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickList(value: PickListMetadataModel): Self = StObject.set(x, "pickList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceName(value: String): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: FieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
