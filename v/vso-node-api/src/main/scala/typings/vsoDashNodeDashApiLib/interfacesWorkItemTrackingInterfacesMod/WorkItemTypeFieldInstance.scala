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

