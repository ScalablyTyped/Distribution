package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOptionInputDefinition extends js.Object {
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
}

