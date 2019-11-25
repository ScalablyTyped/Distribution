package typings.vsoDashNodeDashApi.interfacesDistributedTaskCommonInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskInputDefinitionBase extends js.Object {
  var defaultValue: String
  var groupName: String
  var helpMarkDown: String
  var label: String
  var name: String
  var options: StringDictionary[String]
  var properties: StringDictionary[String]
  var required: Boolean
  var `type`: String
  var visibleRule: String
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
}

