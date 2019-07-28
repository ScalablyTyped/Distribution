package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemType extends WorkItemTrackingResource {
  /**
    * The color.
    */
  var color: String
  /**
    * The description of the work item type.
    */
  var description: String
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
  var isDisabled: Boolean
  /**
    * Gets the name of the work item type.
    */
  var name: String
  /**
    * The reference name of the work item type.
    */
  var referenceName: String
  /**
    * Gets the various state transition mappings in the work item type.
    */
  var transitions: StringDictionary[js.Array[WorkItemStateTransition]]
  /**
    * The XML form.
    */
  var xmlForm: String
}

object WorkItemType {
  @scala.inline
  def apply(
    _links: js.Any,
    color: String,
    description: String,
    fieldInstances: js.Array[WorkItemTypeFieldInstance],
    fields: js.Array[WorkItemTypeFieldInstance],
    icon: WorkItemIcon,
    isDisabled: Boolean,
    name: String,
    referenceName: String,
    transitions: StringDictionary[js.Array[WorkItemStateTransition]],
    url: String,
    xmlForm: String
  ): WorkItemType = {
    val __obj = js.Dynamic.literal(_links = _links, color = color, description = description, fieldInstances = fieldInstances, fields = fields, icon = icon, isDisabled = isDisabled, name = name, referenceName = referenceName, transitions = transitions, url = url, xmlForm = xmlForm)
  
    __obj.asInstanceOf[WorkItemType]
  }
}

