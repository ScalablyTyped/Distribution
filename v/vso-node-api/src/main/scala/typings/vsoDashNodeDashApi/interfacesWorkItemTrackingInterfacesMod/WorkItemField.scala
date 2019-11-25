package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemField extends WorkItemTrackingResource {
  /**
    * The description of the field.
    */
  var description: String
  /**
    * Indicates whether this field is an identity field.
    */
  var isIdentity: Boolean
  /**
    * Indicates whether this instance is picklist.
    */
  var isPicklist: Boolean
  /**
    * Indicates whether this instance is a suggested picklist .
    */
  var isPicklistSuggested: Boolean
  /**
    * The name of the field.
    */
  var name: String
  /**
    * Indicates whether the field is [read only].
    */
  var readOnly: Boolean
  /**
    * The reference name of the field.
    */
  var referenceName: String
  /**
    * The supported operations on this field.
    */
  var supportedOperations: js.Array[WorkItemFieldOperation]
  /**
    * The type of the field.
    */
  var `type`: FieldType
  /**
    * The usage of the field.
    */
  var usage: FieldUsage
}

object WorkItemField {
  @scala.inline
  def apply(
    _links: js.Any,
    description: String,
    isIdentity: Boolean,
    isPicklist: Boolean,
    isPicklistSuggested: Boolean,
    name: String,
    readOnly: Boolean,
    referenceName: String,
    supportedOperations: js.Array[WorkItemFieldOperation],
    `type`: FieldType,
    url: String,
    usage: FieldUsage
  ): WorkItemField = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isIdentity = isIdentity.asInstanceOf[js.Any], isPicklist = isPicklist.asInstanceOf[js.Any], isPicklistSuggested = isPicklistSuggested.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], supportedOperations = supportedOperations.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemField]
  }
}

