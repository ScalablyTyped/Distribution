package typings
package vsoDashNodeDashApiLib.interfacesDistributedTaskCommonInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskInputDefinitionBase extends js.Object {
  var defaultValue: java.lang.String
  var groupName: java.lang.String
  var helpMarkDown: java.lang.String
  var label: java.lang.String
  var name: java.lang.String
  var options: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var properties: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var required: scala.Boolean
  var `type`: java.lang.String
  var visibleRule: java.lang.String
}

object TaskInputDefinitionBase {
  @scala.inline
  def apply(
    defaultValue: java.lang.String,
    groupName: java.lang.String,
    helpMarkDown: java.lang.String,
    label: java.lang.String,
    name: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    required: scala.Boolean,
    `type`: java.lang.String,
    visibleRule: java.lang.String
  ): TaskInputDefinitionBase = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.updateDynamic("groupName")(groupName)
    __obj.updateDynamic("helpMarkDown")(helpMarkDown)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("required")(required)
    __obj.updateDynamic("visibleRule")(visibleRule)
    __obj.asInstanceOf[TaskInputDefinitionBase]
  }
}

