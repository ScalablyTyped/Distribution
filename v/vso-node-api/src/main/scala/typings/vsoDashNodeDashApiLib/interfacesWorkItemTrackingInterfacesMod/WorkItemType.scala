package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemType extends WorkItemTrackingResource {
  /**
    * The color.
    */
  var color: java.lang.String
  /**
    * The description of the work item type.
    */
  var description: java.lang.String
  /**
    * The fields that exist on the work item type.
    */
  var fieldInstances: js.Array[WorkItemTypeFieldInstance]
  /**
    * The fields that exist on the work item type.
    */
  var fields: js.Array[WorkItemTypeFieldInstance]
  /**
    * The icon of the work item type.
    */
  var icon: WorkItemIcon
  /**
    * True if work item type is disabled
    */
  var isDisabled: scala.Boolean
  /**
    * Gets the name of the work item type.
    */
  var name: java.lang.String
  /**
    * The reference name of the work item type.
    */
  var referenceName: java.lang.String
  /**
    * Gets the various state transition mappings in the work item type.
    */
  var transitions: org.scalablytyped.runtime.StringDictionary[js.Array[WorkItemStateTransition]]
  /**
    * The XML form.
    */
  var xmlForm: java.lang.String
}

