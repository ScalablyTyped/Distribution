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
@js.native
trait Attribute extends js.Object {
  /**
    * A collection of all the controls on the form that interface with this attribute.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var controls: ItemCollection[Control] = js.native
  /**
    * Adds a handler to be called when the attribute's value is changed.
    * @param handler The function reference.
    */
  def addOnChange(handler: ContextSensitiveHandler): Unit = js.native
  /**
    * Fire all "on change" event handlers.
    */
  def fireOnChange(): Unit = js.native
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
  def getAttributeType(): AttributeType = js.native
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
  def getFormat(): AttributeFormat = js.native
  /**
    * Gets a boolean value indicating whether this Attribute has unsaved changes.
    * @returns true if there are unsaved changes, otherwise false.
    */
  def getIsDirty(): Boolean = js.native
  /**
    * Gets the logical name of the attribute.
    * @returns The logical name.
    */
  def getName(): String = js.native
  /**
    * Gets a reference to the record context of this attribute.
    * @returns The parent record context.
    */
  def getParent(): Entity = js.native
  /**
    * Gets the current level of requirement for the attribute.
    * @returns The required level, as either "none", "required", or "recommended"
    */
  def getRequiredLevel(): RequirementLevel = js.native
  /**
    * Gets current submit mode for the attribute.
    * @returns The submit mode, as either "always", "never", or "dirty"
    * @remarks The default value is "dirty"
    */
  def getSubmitMode(): SubmitMode = js.native
  /**
    * Gets the current user's privileges for the attribute.
    * @returns The user privileges.
    */
  def getUserPrivilege(): Privilege = js.native
  /**
    * Gets the value.
    * @returns The value.
    */
  def getValue(): js.Any = js.native
  /**
    * Removes the handler from the "on change" event.
    * @param handler The handler.
    */
  def removeOnChange(handler: ContextSensitiveHandler): Unit = js.native
  /**
    * Sets the required level.
    * @param requirementLevel The requirement level, as either "none", "required", or "recommended"
    * @see {@link XrmEnum.AttributeRequirementLevel}
    */
  def setRequiredLevel(requirementLevel: RequirementLevel): Unit = js.native
  /**
    * Sets the submit mode.
    * @param submitMode The submit mode, as either "always", "never", or "dirty".
    * @default submitMode "dirty"
    * @see {@link XrmEnum.AttributeRequirementLevel}
    */
  def setSubmitMode(submitMode: SubmitMode): Unit = js.native
  /**
    * Sets the value.
    * @param value The value.
    */
  def setValue(value: js.Any): Unit = js.native
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
  @scala.inline
  implicit class AttributeOps[Self <: Attribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddOnChange(value: ContextSensitiveHandler => Unit): Self = this.set("addOnChange", js.Any.fromFunction1(value))
    @scala.inline
    def setControls(value: ItemCollection[Control]): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def setFireOnChange(value: () => Unit): Self = this.set("fireOnChange", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAttributeType(value: () => AttributeType): Self = this.set("getAttributeType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFormat(value: () => AttributeFormat): Self = this.set("getFormat", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIsDirty(value: () => Boolean): Self = this.set("getIsDirty", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParent(value: () => Entity): Self = this.set("getParent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRequiredLevel(value: () => RequirementLevel): Self = this.set("getRequiredLevel", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSubmitMode(value: () => SubmitMode): Self = this.set("getSubmitMode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUserPrivilege(value: () => Privilege): Self = this.set("getUserPrivilege", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValue(value: () => js.Any): Self = this.set("getValue", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveOnChange(value: ContextSensitiveHandler => Unit): Self = this.set("removeOnChange", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRequiredLevel(value: RequirementLevel => Unit): Self = this.set("setRequiredLevel", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSubmitMode(value: SubmitMode => Unit): Self = this.set("setSubmitMode", js.Any.fromFunction1(value))
    @scala.inline
    def setSetValue(value: js.Any => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
  }
  
}

