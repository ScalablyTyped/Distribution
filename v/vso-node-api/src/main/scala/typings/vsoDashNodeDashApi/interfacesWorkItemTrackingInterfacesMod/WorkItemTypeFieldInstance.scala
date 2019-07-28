package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeFieldInstance extends WorkItemFieldReference {
  /**
    * The list of field allowed values.
    */
  var allowedValues: js.Array[String]
  /**
    * Indicates whether field value is always required.
    */
  var alwaysRequired: Boolean
  /**
    * The list of dependent fields.
    */
  var dependentFields: js.Array[WorkItemFieldReference]
  /**
    * Gets the help text for the field.
    */
  var helpText: String
}

object WorkItemTypeFieldInstance {
  @scala.inline
  def apply(
    allowedValues: js.Array[String],
    alwaysRequired: Boolean,
    dependentFields: js.Array[WorkItemFieldReference],
    helpText: String,
    name: String,
    referenceName: String,
    url: String
  ): WorkItemTypeFieldInstance = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues, alwaysRequired = alwaysRequired, dependentFields = dependentFields, helpText = helpText, name = name, referenceName = referenceName, url = url)
  
    __obj.asInstanceOf[WorkItemTypeFieldInstance]
  }
}

