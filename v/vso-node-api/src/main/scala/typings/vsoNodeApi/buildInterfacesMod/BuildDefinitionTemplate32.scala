package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildDefinitionTemplate32 extends StObject {
  
  var canDelete: Boolean = js.native
  
  var category: String = js.native
  
  var description: String = js.native
  
  var iconTaskId: String = js.native
  
  var icons: StringDictionary[String] = js.native
  
  var id: String = js.native
  
  var name: String = js.native
  
  var template: BuildDefinition32 = js.native
}
object BuildDefinitionTemplate32 {
  
  @scala.inline
  def apply(
    canDelete: Boolean,
    category: String,
    description: String,
    iconTaskId: String,
    icons: StringDictionary[String],
    id: String,
    name: String,
    template: BuildDefinition32
  ): BuildDefinitionTemplate32 = {
    val __obj = js.Dynamic.literal(canDelete = canDelete.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], iconTaskId = iconTaskId.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionTemplate32]
  }
  
  @scala.inline
  implicit class BuildDefinitionTemplate32MutableBuilder[Self <: BuildDefinitionTemplate32] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanDelete(value: Boolean): Self = StObject.set(x, "canDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconTaskId(value: String): Self = StObject.set(x, "iconTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcons(value: StringDictionary[String]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: BuildDefinition32): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
