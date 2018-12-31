package typings
package xrmLib.XrmNs.AttributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an Entity attribute.
  */
trait Attribute extends js.Object {
  /**
    * A collection of all the controls on the form that interface with this attribute.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var controls: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.Control]
  /**
    * Adds a handler to be called when the attribute's value is changed.
    * @param handler The function reference.
    */
  def addOnChange(handler: xrmLib.XrmNs.EventsNs.ContextSensitiveHandler): scala.Unit
  /**
    * Fire all "on change" event handlers.
    */
  def fireOnChange(): scala.Unit
  /**
    * Gets attribute type.
    * @returns The attribute's type name.<BR><BR>
    * **Values returned are**:
    * * boolean
    * * datetime
    * * decimal
    * * double
    * * integer
    * * lookup
    * * memo
    * * money
    * * optionset
    * * string
    */
  def getAttributeType(): AttributeType
  /**
    * Gets the attribute format.
    * @returns The format of the attribute.<BR><BR>
    * **Values returned are**:
    * * date           (datetime)
    * * datetime       (datetime)
    * * duration       (integer)
    * * email          (string)
    * * language       (optionset)
    * * none           (integer)
    * * phone          (string)
    * * text           (string)
    * * textarea       (string)
    * * tickersymbol   (string)
    * * timezone       (optionset)
    * * url            (string)
    * @see {@link getAttributeType}
    */
  def getFormat(): AttributeFormat
  /**
    * Gets a boolean value indicating whether this Attribute has unsaved changes.
    * @returns true if there are unsaved changes, otherwise false.
    */
  def getIsDirty(): scala.Boolean
  /**
    * Gets the logical name of the attribute.
    * @returns The logical name.
    */
  def getName(): java.lang.String
  /**
    * Gets a reference to the record context of this attribute.
    * @returns The parent record context.
    */
  def getParent(): xrmLib.XrmNs.Entity
  /**
    * Gets the current level of requirement for the attribute.
    * @returns The required level, as either "none", "required", or "recommended"
    */
  def getRequiredLevel(): RequirementLevel
  /**
    * Gets current submit mode for the attribute.
    * @returns The submit mode, as either "always", "never", or "dirty"
    * @remarks The default value is "dirty"
    */
  def getSubmitMode(): xrmLib.XrmNs.SubmitMode
  /**
    * Gets the current user's privileges for the attribute.
    * @returns The user privileges.
    */
  def getUserPrivilege(): xrmLib.XrmNs.Privilege
  /**
    * Gets the value.
    * @returns The value.
    */
  def getValue(): js.Any
  /**
    * Removes the handler from the "on change" event.
    * @param handler The handler.
    */
  def removeOnChange(handler: xrmLib.XrmNs.EventsNs.ContextSensitiveHandler): scala.Unit
  /**
    * Sets the required level.
    * @param requirementLevel The requirement level, as either "none", "required", or "recommended"
    * @see {@link XrmEnum.AttributeRequirementLevel}
    */
  def setRequiredLevel(requirementLevel: RequirementLevel): scala.Unit
  /**
    * Sets the submit mode.
    * @param submitMode The submit mode, as either "always", "never", or "dirty".
    * @default submitMode "dirty"
    * @see {@link XrmEnum.AttributeRequirementLevel}
    */
  def setSubmitMode(submitMode: xrmLib.XrmNs.SubmitMode): scala.Unit
  /**
    * Sets the value.
    * @param value The value.
    */
  def setValue(value: js.Any): scala.Unit
}

