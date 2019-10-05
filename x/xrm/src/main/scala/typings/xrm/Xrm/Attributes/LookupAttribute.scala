package typings.xrm.Xrm.Attributes

import typings.xrm.Xrm.Collection.ItemCollection
import typings.xrm.Xrm.Controls.LookupControl
import typings.xrm.Xrm.Entity
import typings.xrm.Xrm.Events.ContextSensitiveHandler
import typings.xrm.Xrm.LookupValue
import typings.xrm.Xrm.Privilege
import typings.xrm.Xrm.SubmitMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface a Lookup attribute.
  *
  * @see {@link Attribute}
  */
trait LookupAttribute extends Attribute {
  /**
    * A collection of all the controls on the form that interface with this attribute.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  @JSName("controls")
  var controls_LookupAttribute: ItemCollection[LookupControl]
  /**
    * Gets a boolean value indicating whether the Lookup is a multi-value PartyList.
    * @returns true the attribute is a PartyList, otherwise false.
    */
  def getIsPartyList(): Boolean
  /**
    * Sets the value.
    * @param value The value.
    * @remarks Attributes on Quick Create Forms will not save values set with this method.
    */
  def setValue(value: js.Array[LookupValue]): Unit
}

object LookupAttribute {
  @scala.inline
  def apply(
    addOnChange: ContextSensitiveHandler => Unit,
    controls: ItemCollection[LookupControl],
    fireOnChange: () => Unit,
    getAttributeType: () => AttributeType,
    getFormat: () => AttributeFormat,
    getIsDirty: () => Boolean,
    getIsPartyList: () => Boolean,
    getName: () => String,
    getParent: () => Entity,
    getRequiredLevel: () => RequirementLevel,
    getSubmitMode: () => SubmitMode,
    getUserPrivilege: () => Privilege,
    getValue: () => js.Array[LookupValue],
    removeOnChange: ContextSensitiveHandler => Unit,
    setRequiredLevel: RequirementLevel => Unit,
    setSubmitMode: SubmitMode => Unit,
    setValue: js.Array[LookupValue] => Unit
  ): LookupAttribute = {
    val __obj = js.Dynamic.literal(addOnChange = js.Any.fromFunction1(addOnChange), controls = controls, fireOnChange = js.Any.fromFunction0(fireOnChange), getAttributeType = js.Any.fromFunction0(getAttributeType), getFormat = js.Any.fromFunction0(getFormat), getIsDirty = js.Any.fromFunction0(getIsDirty), getIsPartyList = js.Any.fromFunction0(getIsPartyList), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getRequiredLevel = js.Any.fromFunction0(getRequiredLevel), getSubmitMode = js.Any.fromFunction0(getSubmitMode), getUserPrivilege = js.Any.fromFunction0(getUserPrivilege), getValue = js.Any.fromFunction0(getValue), removeOnChange = js.Any.fromFunction1(removeOnChange), setRequiredLevel = js.Any.fromFunction1(setRequiredLevel), setSubmitMode = js.Any.fromFunction1(setSubmitMode), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[LookupAttribute]
  }
}

