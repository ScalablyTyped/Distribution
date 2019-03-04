package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOptionInputDefinition extends js.Object {
  /**
    * The default value.
    */
  var defaultValue: java.lang.String
  /**
    * The name of the input group that this input belongs to.
    */
  var groupName: java.lang.String
  var help: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * The label for the input.
    */
  var label: java.lang.String
  /**
    * The name of the input.
    */
  var name: java.lang.String
  var options: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * Indicates whether the input is required to have a value.
    */
  var required: scala.Boolean
  /**
    * Indicates the type of the input value.
    */
  var `type`: BuildOptionInputType
  /**
    * The rule that is applied to determine whether the input is visible in the UI.
    */
  var visibleRule: java.lang.String
}

object BuildOptionInputDefinition {
  @scala.inline
  def apply(
    defaultValue: java.lang.String,
    groupName: java.lang.String,
    help: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    label: java.lang.String,
    name: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    required: scala.Boolean,
    `type`: BuildOptionInputType,
    visibleRule: java.lang.String
  ): BuildOptionInputDefinition = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, groupName = groupName, help = help, label = label, name = name, options = options, required = required, visibleRule = visibleRule)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BuildOptionInputDefinition]
  }
}

