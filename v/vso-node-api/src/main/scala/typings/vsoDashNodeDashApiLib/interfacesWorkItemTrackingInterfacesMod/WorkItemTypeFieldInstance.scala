package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeFieldInstance extends WorkItemFieldReference {
  /**
    * The list of field allowed values.
    */
  var allowedValues: js.Array[java.lang.String]
  /**
    * Indicates whether field value is always required.
    */
  var alwaysRequired: scala.Boolean
  /**
    * The list of dependent fields.
    */
  var dependentFields: js.Array[WorkItemFieldReference]
  /**
    * Gets the help text for the field.
    */
  var helpText: java.lang.String
}

object WorkItemTypeFieldInstance {
  @scala.inline
  def apply(
    allowedValues: js.Array[java.lang.String],
    alwaysRequired: scala.Boolean,
    dependentFields: js.Array[WorkItemFieldReference],
    helpText: java.lang.String,
    name: java.lang.String,
    referenceName: java.lang.String,
    url: java.lang.String
  ): WorkItemTypeFieldInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowedValues")(allowedValues)
    __obj.updateDynamic("alwaysRequired")(alwaysRequired)
    __obj.updateDynamic("dependentFields")(dependentFields)
    __obj.updateDynamic("helpText")(helpText)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("referenceName")(referenceName)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WorkItemTypeFieldInstance]
  }
}

