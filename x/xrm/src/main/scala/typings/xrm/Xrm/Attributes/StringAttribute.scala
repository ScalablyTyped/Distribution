package typings.xrm.Xrm.Attributes

import typings.xrm.Xrm.Collection.ItemCollection
import typings.xrm.Xrm.Controls.StringControl
import typings.xrm.Xrm.Entity
import typings.xrm.Xrm.Events.ContextSensitiveHandler
import typings.xrm.Xrm.Privilege
import typings.xrm.Xrm.SubmitMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a String attribute.
  * @see {@link Attribute}
  */
trait StringAttribute extends Attribute {
  /**
    * A collection of all the controls on the form that interface with this attribute.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  @JSName("controls")
  var controls_StringAttribute: ItemCollection[StringControl]
  /**
    * Gets maximum length allowed.
    * @returns The maximum length allowed.
    * @remarks The email form's "Description" attribute does not have the this method.
    */
  def getMaxLength(): Double
  /**
    * Sets the value.
    * @param value The value.
    * @remarks A String field with the {@link Attribute.getFormat|email} format enforces email
    *          address formatting. Attributes on Quick Create Forms will not save values set
    *          with this method.
    */
  def setValue(value: String): Unit
}

object StringAttribute {
  @scala.inline
  def apply(
    addOnChange: ContextSensitiveHandler => Unit,
    controls: ItemCollection[StringControl],
    fireOnChange: () => Unit,
    getAttributeType: () => AttributeType,
    getFormat: () => StringAttributeFormat,
    getIsDirty: () => Boolean,
    getMaxLength: () => Double,
    getName: () => String,
    getParent: () => Entity,
    getRequiredLevel: () => RequirementLevel,
    getSubmitMode: () => SubmitMode,
    getUserPrivilege: () => Privilege,
    getValue: () => String,
    removeOnChange: ContextSensitiveHandler => Unit,
    setRequiredLevel: RequirementLevel => Unit,
    setSubmitMode: SubmitMode => Unit,
    setValue: String => Unit
  ): StringAttribute = {
    val __obj = js.Dynamic.literal(addOnChange = js.Any.fromFunction1(addOnChange), controls = controls, fireOnChange = js.Any.fromFunction0(fireOnChange), getAttributeType = js.Any.fromFunction0(getAttributeType), getFormat = js.Any.fromFunction0(getFormat), getIsDirty = js.Any.fromFunction0(getIsDirty), getMaxLength = js.Any.fromFunction0(getMaxLength), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getRequiredLevel = js.Any.fromFunction0(getRequiredLevel), getSubmitMode = js.Any.fromFunction0(getSubmitMode), getUserPrivilege = js.Any.fromFunction0(getUserPrivilege), getValue = js.Any.fromFunction0(getValue), removeOnChange = js.Any.fromFunction1(removeOnChange), setRequiredLevel = js.Any.fromFunction1(setRequiredLevel), setSubmitMode = js.Any.fromFunction1(setSubmitMode), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[StringAttribute]
  }
}

