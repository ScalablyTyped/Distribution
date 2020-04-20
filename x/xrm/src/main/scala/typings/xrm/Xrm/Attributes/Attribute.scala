package typings.xrm.Xrm.Attributes

import typings.xrm.Xrm.Collection.ItemCollection
import typings.xrm.Xrm.Controls.Control
import typings.xrm.Xrm.Entity
import typings.xrm.Xrm.Events.ContextSensitiveHandler
import typings.xrm.Xrm.Privilege
import typings.xrm.Xrm.SubmitMode
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
  var controls: ItemCollection[Control]
  /**
    * Adds a handler to be called when the attribute's value is changed.
    * @param handler The function reference.
    */
  def addOnChange(handler: ContextSensitiveHandler): Unit
  /**
    * Fire all "on change" event handlers.
    */
  def fireOnChange(): Unit
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
  def getIsDirty(): Boolean
  /**
    * Gets the logical name of the attribute.
    * @returns The logical name.
    */
  def getName(): String
  /**
    * Gets a reference to the record context of this attribute.
    * @returns The parent record context.
    */
  def getParent(): Entity
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
  def getSubmitMode(): SubmitMode
  /**
    * Gets the current user's privileges for the attribute.
    * @returns The user privileges.
    */
  def getUserPrivilege(): Privilege
  /**
    * Gets the value.
    * @returns The value.
    */
  def getValue(): js.Any
  /**
    * Removes the handler from the "on change" event.
    * @param handler The handler.
    */
  def removeOnChange(handler: ContextSensitiveHandler): Unit
  /**
    * Sets the required level.
    * @param requirementLevel The requirement level, as either "none", "required", or "recommended"
    * @see {@link XrmEnum.AttributeRequirementLevel}
    */
  def setRequiredLevel(requirementLevel: RequirementLevel): Unit
  /**
    * Sets the submit mode.
    * @param submitMode The submit mode, as either "always", "never", or "dirty".
    * @default submitMode "dirty"
    * @see {@link XrmEnum.AttributeRequirementLevel}
    */
  def setSubmitMode(submitMode: SubmitMode): Unit
  /**
    * Sets the value.
    * @param value The value.
    */
  def setValue(value: js.Any): Unit
}

object Attribute {
  @scala.inline
  def apply(
    addOnChange: ContextSensitiveHandler => Unit,
    controls: ItemCollection[Control],
    fireOnChange: () => Unit,
    getAttributeType: () => AttributeType,
    getFormat: () => AttributeFormat,
    getIsDirty: () => Boolean,
    getName: () => String,
    getParent: () => Entity,
    getRequiredLevel: () => RequirementLevel,
    getSubmitMode: () => SubmitMode,
    getUserPrivilege: () => Privilege,
    getValue: () => js.Any,
    removeOnChange: ContextSensitiveHandler => Unit,
    setRequiredLevel: RequirementLevel => Unit,
    setSubmitMode: SubmitMode => Unit,
    setValue: js.Any => Unit
  ): Attribute = {
    val __obj = js.Dynamic.literal(addOnChange = js.Any.fromFunction1(addOnChange), controls = controls.asInstanceOf[js.Any], fireOnChange = js.Any.fromFunction0(fireOnChange), getAttributeType = js.Any.fromFunction0(getAttributeType), getFormat = js.Any.fromFunction0(getFormat), getIsDirty = js.Any.fromFunction0(getIsDirty), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getRequiredLevel = js.Any.fromFunction0(getRequiredLevel), getSubmitMode = js.Any.fromFunction0(getSubmitMode), getUserPrivilege = js.Any.fromFunction0(getUserPrivilege), getValue = js.Any.fromFunction0(getValue), removeOnChange = js.Any.fromFunction1(removeOnChange), setRequiredLevel = js.Any.fromFunction1(setRequiredLevel), setSubmitMode = js.Any.fromFunction1(setSubmitMode), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[Attribute]
  }
}

