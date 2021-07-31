package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildOptionInputDefinition extends StObject {
  
  /**
    * The default value.
    */
  var defaultValue: String
  
  /**
    * The name of the input group that this input belongs to.
    */
  var groupName: String
  
  var help: StringDictionary[String]
  
  /**
    * The label for the input.
    */
  var label: String
  
  /**
    * The name of the input.
    */
  var name: String
  
  var options: StringDictionary[String]
  
  /**
    * Indicates whether the input is required to have a value.
    */
  var required: Boolean
  
  /**
    * Indicates the type of the input value.
    */
  var `type`: BuildOptionInputType
  
  /**
    * The rule that is applied to determine whether the input is visible in the UI.
    */
  var visibleRule: String
}
object BuildOptionInputDefinition {
  
  @scala.inline
  def apply(
    defaultValue: String,
    groupName: String,
    help: StringDictionary[String],
    label: String,
    name: String,
    options: StringDictionary[String],
    required: Boolean,
    `type`: BuildOptionInputType,
    visibleRule: String
  ): BuildOptionInputDefinition = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], visibleRule = visibleRule.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptionInputDefinition]
  }
  
  @scala.inline
  implicit class BuildOptionInputDefinitionMutableBuilder[Self <: BuildOptionInputDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelp(value: StringDictionary[String]): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: BuildOptionInputType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleRule(value: String): Self = StObject.set(x, "visibleRule", value.asInstanceOf[js.Any])
  }
}
