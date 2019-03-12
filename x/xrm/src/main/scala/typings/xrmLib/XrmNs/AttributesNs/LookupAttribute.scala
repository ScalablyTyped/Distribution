package typings
package xrmLib.XrmNs.AttributesNs

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
  var controls_LookupAttribute: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.LookupControl]
  /**
    * Gets a boolean value indicating whether the Lookup is a multi-value PartyList.
    * @returns true the attribute is a PartyList, otherwise false.
    */
  def getIsPartyList(): scala.Boolean
  /**
    * Sets the value.
    * @param value The value.
    * @remarks Attributes on Quick Create Forms will not save values set with this method.
    */
  def setValue(value: js.Array[xrmLib.XrmNs.LookupValue]): scala.Unit
}

object LookupAttribute {
  @scala.inline
  def apply(
    addOnChange: xrmLib.XrmNs.EventsNs.ContextSensitiveHandler => scala.Unit,
    controls: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.LookupControl],
    fireOnChange: () => scala.Unit,
    getAttributeType: () => AttributeType,
    getFormat: () => AttributeFormat,
    getIsDirty: () => scala.Boolean,
    getIsPartyList: () => scala.Boolean,
    getName: () => java.lang.String,
    getParent: () => xrmLib.XrmNs.Entity,
    getRequiredLevel: () => RequirementLevel,
    getSubmitMode: () => xrmLib.XrmNs.SubmitMode,
    getUserPrivilege: () => xrmLib.XrmNs.Privilege,
    getValue: () => js.Array[xrmLib.XrmNs.LookupValue],
    removeOnChange: xrmLib.XrmNs.EventsNs.ContextSensitiveHandler => scala.Unit,
    setRequiredLevel: RequirementLevel => scala.Unit,
    setSubmitMode: xrmLib.XrmNs.SubmitMode => scala.Unit,
    setValue: js.Array[xrmLib.XrmNs.LookupValue] => scala.Unit
  ): LookupAttribute = {
    val __obj = js.Dynamic.literal(addOnChange = js.Any.fromFunction1(addOnChange), controls = controls, fireOnChange = js.Any.fromFunction0(fireOnChange), getAttributeType = js.Any.fromFunction0(getAttributeType), getFormat = js.Any.fromFunction0(getFormat), getIsDirty = js.Any.fromFunction0(getIsDirty), getIsPartyList = js.Any.fromFunction0(getIsPartyList), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getRequiredLevel = js.Any.fromFunction0(getRequiredLevel), getSubmitMode = js.Any.fromFunction0(getSubmitMode), getUserPrivilege = js.Any.fromFunction0(getUserPrivilege), getValue = js.Any.fromFunction0(getValue), removeOnChange = js.Any.fromFunction1(removeOnChange), setRequiredLevel = js.Any.fromFunction1(setRequiredLevel), setSubmitMode = js.Any.fromFunction1(setSubmitMode), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[LookupAttribute]
  }
}

