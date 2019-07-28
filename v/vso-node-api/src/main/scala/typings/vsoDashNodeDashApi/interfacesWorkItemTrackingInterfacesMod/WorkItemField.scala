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
    val __obj = js.Dynamic.literal(_links = _links, description = description, isIdentity = isIdentity, isPicklist = isPicklist, isPicklistSuggested = isPicklistSuggested, name = name, readOnly = readOnly, referenceName = referenceName, supportedOperations = supportedOperations, url = url, usage = usage)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorkItemField]
  }
}

