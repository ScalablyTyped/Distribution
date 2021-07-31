package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseDefinitionEnvironmentTemplate extends StObject {
  
  var canDelete: Boolean
  
  var category: String
  
  var description: String
  
  var environment: ReleaseDefinitionEnvironment
  
  var iconTaskId: String
  
  var iconUri: String
  
  var id: String
  
  var isDeleted: Boolean
  
  var name: String
}
object ReleaseDefinitionEnvironmentTemplate {
  
  @scala.inline
  def apply(
    canDelete: Boolean,
    category: String,
    description: String,
    environment: ReleaseDefinitionEnvironment,
    iconTaskId: String,
    iconUri: String,
    id: String,
    isDeleted: Boolean,
    name: String
  ): ReleaseDefinitionEnvironmentTemplate = {
    val __obj = js.Dynamic.literal(canDelete = canDelete.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], iconTaskId = iconTaskId.asInstanceOf[js.Any], iconUri = iconUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionEnvironmentTemplate]
  }
  
  @scala.inline
  implicit class ReleaseDefinitionEnvironmentTemplateMutableBuilder[Self <: ReleaseDefinitionEnvironmentTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanDelete(value: Boolean): Self = StObject.set(x, "canDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: ReleaseDefinitionEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconTaskId(value: String): Self = StObject.set(x, "iconTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUri(value: String): Self = StObject.set(x, "iconUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
