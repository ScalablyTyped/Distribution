package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildOptionInputDefinition extends js.Object {
  /**
    * The default value.
    */
  var defaultValue: String = js.native
  /**
    * The name of the input group that this input belongs to.
    */
  var groupName: String = js.native
  var help: StringDictionary[String] = js.native
  /**
    * The label for the input.
    */
  var label: String = js.native
  /**
    * The name of the input.
    */
  var name: String = js.native
  var options: StringDictionary[String] = js.native
  /**
    * Indicates whether the input is required to have a value.
    */
  var required: Boolean = js.native
  /**
    * Indicates the type of the input value.
    */
  var `type`: BuildOptionInputType = js.native
  /**
    * The rule that is applied to determine whether the input is visible in the UI.
    */
  var visibleRule: String = js.native
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
  implicit class BuildOptionInputDefinitionOps[Self <: BuildOptionInputDefinition] (val x: Self) extends AnyVal {
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
    def setHelp(value: StringDictionary[String]): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: StringDictionary[String]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: BuildOptionInputType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibleRule(value: String): Self = this.set("visibleRule", value.asInstanceOf[js.Any])
  }
  
}

