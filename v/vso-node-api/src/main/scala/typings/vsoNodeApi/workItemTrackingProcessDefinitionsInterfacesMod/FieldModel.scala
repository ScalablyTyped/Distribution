package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldModel extends StObject {
  
  /**
    * Description about field
    */
  var description: String = js.native
  
  /**
    * ID of the field
    */
  var id: String = js.native
  
  /**
    * Name of the field
    */
  var name: String = js.native
  
  /**
    * Reference to picklist in this field
    */
  var pickList: PickListMetadataModel = js.native
  
  /**
    * Type of field
    */
  var `type`: FieldType = js.native
  
  /**
    * Url to the field
    */
  var url: String = js.native
}
object FieldModel {
  
  @scala.inline
  def apply(
    description: String,
    id: String,
    name: String,
    pickList: PickListMetadataModel,
    `type`: FieldType,
    url: String
  ): FieldModel = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pickList = pickList.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldModel]
  }
  
  @scala.inline
  implicit class FieldModelMutableBuilder[Self <: FieldModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickList(value: PickListMetadataModel): Self = StObject.set(x, "pickList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: FieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
