package typings
package xrmLib.XrmNs.AttributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Date attribute.
  *
  * @see {@link Attribute}
  */
trait DateAttribute extends Attribute {
  /**
    * A collection of all the controls on the form that interface with this attribute.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  @JSName("controls")
  var controls_DateAttribute: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.DateControl]
  /**
    * Sets the value.
    * @param value The value.
    * @remarks Attributes on Quick Create Forms will not save values set with this method.
    */
  def setValue(value: stdLib.Date): scala.Unit
}

object DateAttribute {
  @scala.inline
  def apply(
    addOnChange: js.Function1[xrmLib.XrmNs.EventsNs.ContextSensitiveHandler, scala.Unit],
    controls: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.DateControl],
    fireOnChange: js.Function0[scala.Unit],
    getAttributeType: js.Function0[AttributeType],
    getFormat: js.Function0[DateAttributeFormat],
    getIsDirty: js.Function0[scala.Boolean],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[xrmLib.XrmNs.Entity],
    getRequiredLevel: js.Function0[RequirementLevel],
    getSubmitMode: js.Function0[xrmLib.XrmNs.SubmitMode],
    getUserPrivilege: js.Function0[xrmLib.XrmNs.Privilege],
    getValue: js.Function0[stdLib.Date],
    removeOnChange: js.Function1[xrmLib.XrmNs.EventsNs.ContextSensitiveHandler, scala.Unit],
    setRequiredLevel: js.Function1[RequirementLevel, scala.Unit],
    setSubmitMode: js.Function1[xrmLib.XrmNs.SubmitMode, scala.Unit],
    setValue: js.Function1[stdLib.Date, scala.Unit]
  ): DateAttribute = {
    val __obj = js.Dynamic.literal(addOnChange = addOnChange, controls = controls, fireOnChange = fireOnChange, getAttributeType = getAttributeType, getFormat = getFormat, getIsDirty = getIsDirty, getName = getName, getParent = getParent, getRequiredLevel = getRequiredLevel, getSubmitMode = getSubmitMode, getUserPrivilege = getUserPrivilege, getValue = getValue, removeOnChange = removeOnChange, setRequiredLevel = setRequiredLevel, setSubmitMode = setSubmitMode, setValue = setValue)
  
    __obj.asInstanceOf[DateAttribute]
  }
}

