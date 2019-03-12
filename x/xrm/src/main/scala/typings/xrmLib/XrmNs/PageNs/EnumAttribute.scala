package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Common interface for enumeration attributes (OptionSet and Boolean).
  * @see {@link Attribute}
  * @deprecated Use {@link Xrm.Attributes.EnumAttribute} instead.
  */
trait EnumAttribute
  extends xrmLib.XrmNs.AttributesNs.EnumAttribute

object EnumAttribute {
  @scala.inline
  def apply(
    addOnChange: xrmLib.XrmNs.EventsNs.ContextSensitiveHandler => scala.Unit,
    controls: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.Control],
    fireOnChange: () => scala.Unit,
    getAttributeType: () => xrmLib.XrmNs.AttributesNs.AttributeType,
    getFormat: () => xrmLib.XrmNs.AttributesNs.AttributeFormat,
    getInitialValue: () => scala.Double | scala.Boolean,
    getIsDirty: () => scala.Boolean,
    getName: () => java.lang.String,
    getParent: () => xrmLib.XrmNs.Entity,
    getRequiredLevel: () => xrmLib.XrmNs.AttributesNs.RequirementLevel,
    getSubmitMode: () => xrmLib.XrmNs.SubmitMode,
    getUserPrivilege: () => xrmLib.XrmNs.Privilege,
    getValue: () => js.Any,
    removeOnChange: xrmLib.XrmNs.EventsNs.ContextSensitiveHandler => scala.Unit,
    setRequiredLevel: xrmLib.XrmNs.AttributesNs.RequirementLevel => scala.Unit,
    setSubmitMode: xrmLib.XrmNs.SubmitMode => scala.Unit,
    setValue: js.Any => scala.Unit
  ): EnumAttribute = {
    val __obj = js.Dynamic.literal(addOnChange = js.Any.fromFunction1(addOnChange), controls = controls, fireOnChange = js.Any.fromFunction0(fireOnChange), getAttributeType = js.Any.fromFunction0(getAttributeType), getFormat = js.Any.fromFunction0(getFormat), getInitialValue = js.Any.fromFunction0(getInitialValue), getIsDirty = js.Any.fromFunction0(getIsDirty), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getRequiredLevel = js.Any.fromFunction0(getRequiredLevel), getSubmitMode = js.Any.fromFunction0(getSubmitMode), getUserPrivilege = js.Any.fromFunction0(getUserPrivilege), getValue = js.Any.fromFunction0(getValue), removeOnChange = js.Any.fromFunction1(removeOnChange), setRequiredLevel = js.Any.fromFunction1(setRequiredLevel), setSubmitMode = js.Any.fromFunction1(setSubmitMode), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[EnumAttribute]
  }
}

