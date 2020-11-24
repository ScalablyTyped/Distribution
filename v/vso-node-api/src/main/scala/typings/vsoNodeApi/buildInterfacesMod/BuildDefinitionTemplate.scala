package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildDefinitionTemplate extends js.Object {
  
  /**
    * Indicates whether the template can be deleted.
    */
  var canDelete: Boolean = js.native
  
  /**
    * The template category.
    */
  var category: String = js.native
  
  /**
    * A description of the template.
    */
  var description: String = js.native
  
  /**
    * The ID of the task whose icon is used when showing this template in the UI.
    */
  var iconTaskId: String = js.native
  
  var icons: StringDictionary[String] = js.native
  
  /**
    * The ID of the template.
    */
  var id: String = js.native
  
  /**
    * The name of the template.
    */
  var name: String = js.native
  
  /**
    * The actual template.
    */
  var template: BuildDefinition = js.native
}
object BuildDefinitionTemplate {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class BuildDefinitionTemplateOps[Self <: BuildDefinitionTemplate] (val x: Self) extends AnyVal {
    
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
    def setCanDelete(value: Boolean): Self = this.set("canDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconTaskId(value: String): Self = this.set("iconTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcons(value: StringDictionary[String]): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: BuildDefinition): Self = this.set("template", value.asInstanceOf[js.Any])
  }
}
