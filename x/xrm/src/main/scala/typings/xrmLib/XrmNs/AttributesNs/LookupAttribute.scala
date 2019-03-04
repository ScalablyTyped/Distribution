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
    addOnChange: js.Function1[xrmLib.XrmNs.EventsNs.ContextSensitiveHandler, scala.Unit],
    controls: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.LookupControl],
    fireOnChange: js.Function0[scala.Unit],
    getAttributeType: js.Function0[AttributeType],
    getFormat: js.Function0[AttributeFormat],
    getIsDirty: js.Function0[scala.Boolean],
    getIsPartyList: js.Function0[scala.Boolean],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[xrmLib.XrmNs.Entity],
    getRequiredLevel: js.Function0[RequirementLevel],
    getSubmitMode: js.Function0[xrmLib.XrmNs.SubmitMode],
    getUserPrivilege: js.Function0[xrmLib.XrmNs.Privilege],
    getValue: js.Function0[js.Array[xrmLib.XrmNs.LookupValue]],
    removeOnChange: js.Function1[xrmLib.XrmNs.EventsNs.ContextSensitiveHandler, scala.Unit],
    setRequiredLevel: js.Function1[RequirementLevel, scala.Unit],
    setSubmitMode: js.Function1[xrmLib.XrmNs.SubmitMode, scala.Unit],
    setValue: js.Function1[js.Array[xrmLib.XrmNs.LookupValue], scala.Unit]
  ): LookupAttribute = {
    val __obj = js.Dynamic.literal(addOnChange = addOnChange, controls = controls, fireOnChange = fireOnChange, getAttributeType = getAttributeType, getFormat = getFormat, getIsDirty = getIsDirty, getIsPartyList = getIsPartyList, getName = getName, getParent = getParent, getRequiredLevel = getRequiredLevel, getSubmitMode = getSubmitMode, getUserPrivilege = getUserPrivilege, getValue = getValue, removeOnChange = removeOnChange, setRequiredLevel = setRequiredLevel, setSubmitMode = setSubmitMode, setValue = setValue)
  
    __obj.asInstanceOf[LookupAttribute]
  }
}

