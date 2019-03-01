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

object WorkItemType {
  @scala.inline
  def apply(
    _links: js.Any,
    color: java.lang.String,
    description: java.lang.String,
    fieldInstances: js.Array[WorkItemTypeFieldInstance],
    fields: js.Array[WorkItemTypeFieldInstance],
    icon: WorkItemIcon,
    isDisabled: scala.Boolean,
    name: java.lang.String,
    referenceName: java.lang.String,
    transitions: org.scalablytyped.runtime.StringDictionary[js.Array[WorkItemStateTransition]],
    url: java.lang.String,
    xmlForm: java.lang.String
  ): WorkItemType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("fieldInstances")(fieldInstances)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("icon")(icon)
    __obj.updateDynamic("isDisabled")(isDisabled)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("referenceName")(referenceName)
    __obj.updateDynamic("transitions")(transitions)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("xmlForm")(xmlForm)
    __obj.asInstanceOf[WorkItemType]
  }
}

