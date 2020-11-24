package typings.vsoNodeApi.distributedTaskCommonInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskInputDefinitionBase extends js.Object {
  
  var defaultValue: String = js.native
  
  var groupName: String = js.native
  
  var helpMarkDown: String = js.native
  
  var label: String = js.native
  
  var name: String = js.native
  
  var options: StringDictionary[String] = js.native
  
  var properties: StringDictionary[String] = js.native
  
  var required: Boolean = js.native
  
  var `type`: String = js.native
  
  var visibleRule: String = js.native
}
object TaskInputDefinitionBase {
  
  @scala.inline
  def apply(
    defaultValue: String,
    groupName: String,
    helpMarkDown: String,
    label: String,
    name: String,
    options: StringDictionary[String],
    properties: StringDictionary[String],
    required: Boolean,
    `type`: String,
    visibleRule: String
  ): TaskInputDefinitionBase = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], helpMarkDown = helpMarkDown.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], visibleRule = visibleRule.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskInputDefinitionBase]
  }
  
  @scala.inline
  implicit class TaskInputDefinitionBaseOps[Self <: TaskInputDefinitionBase] (val x: Self) extends AnyVal {
    
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
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupName(value: String): Self = this.set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpMarkDown(value: String): Self = this.set("helpMarkDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: StringDictionary[String]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleRule(value: String): Self = this.set("visibleRule", value.asInstanceOf[js.Any])
  }
}
