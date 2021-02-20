package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickListMetadataModel extends StObject {
  
  /**
    * ID of the picklist
    */
  var id: String = js.native
  
  /**
    * Is input values by user only limited to suggested values
    */
  var isSuggested: Boolean = js.native
  
  /**
    * Name of the picklist
    */
  var name: String = js.native
  
  /**
    * Type of picklist
    */
  var `type`: String = js.native
  
  /**
    * Url of the picklist
    */
  var url: String = js.native
}
object PickListMetadataModel {
  
  @scala.inline
  def apply(id: String, isSuggested: Boolean, name: String, `type`: String, url: String): PickListMetadataModel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isSuggested = isSuggested.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickListMetadataModel]
  }
  
  @scala.inline
  implicit class PickListMetadataModelMutableBuilder[Self <: PickListMetadataModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSuggested(value: Boolean): Self = StObject.set(x, "isSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
