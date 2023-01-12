package typings.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldModel extends StObject {
  
  /**
    * Description about field
    */
  var description: String
  
  /**
    * ID of the field
    */
  var id: String
  
  /**
    * Name of the field
    */
  var name: String
  
  /**
    * Reference to picklist in this field
    */
  var pickList: PickListMetadataModel
  
  /**
    * Type of field
    */
  var `type`: FieldType
  
  /**
    * Url to the field
    */
  var url: String
}
object FieldModel {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: FieldModel] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPickList(value: PickListMetadataModel): Self = StObject.set(x, "pickList", value.asInstanceOf[js.Any])
    
    inline def setType(value: FieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
