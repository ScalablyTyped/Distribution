package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildDefinitionTemplate extends StObject {
  
  /**
    * Indicates whether the template can be deleted.
    */
  var canDelete: Boolean
  
  /**
    * The template category.
    */
  var category: String
  
  /**
    * A description of the template.
    */
  var description: String
  
  /**
    * The ID of the task whose icon is used when showing this template in the UI.
    */
  var iconTaskId: String
  
  var icons: StringDictionary[String]
  
  /**
    * The ID of the template.
    */
  var id: String
  
  /**
    * The name of the template.
    */
  var name: String
  
  /**
    * The actual template.
    */
  var template: BuildDefinition
}
object BuildDefinitionTemplate {
  
  inline def apply(
    canDelete: Boolean,
    category: String,
    description: String,
    iconTaskId: String,
    icons: StringDictionary[String],
    id: String,
    name: String,
    template: BuildDefinition
  ): BuildDefinitionTemplate = {
    val __obj = js.Dynamic.literal(canDelete = canDelete.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], iconTaskId = iconTaskId.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionTemplate]
  }
  
  extension [Self <: BuildDefinitionTemplate](x: Self) {
    
    inline def setCanDelete(value: Boolean): Self = StObject.set(x, "canDelete", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setIconTaskId(value: String): Self = StObject.set(x, "iconTaskId", value.asInstanceOf[js.Any])
    
    inline def setIcons(value: StringDictionary[String]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: BuildDefinition): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
