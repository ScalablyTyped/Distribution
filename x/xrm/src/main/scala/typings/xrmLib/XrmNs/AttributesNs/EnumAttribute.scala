package typings
package xrmLib.XrmNs.AttributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Common interface for enumeration attributes (OptionSet and Boolean).
  * @see {@link Attribute}
  */
trait EnumAttribute extends Attribute {
  /**
    * Gets the initial value of the attribute.
    * @returns The initial value.
    * @remarks Valid for OptionSet and boolean attribute types
    */
  def getInitialValue(): scala.Double | scala.Boolean
}

object EnumAttribute {
  @scala.inline
  def apply(
    addOnChange: js.Function1[xrmLib.XrmNs.EventsNs.ContextSensitiveHandler, scala.Unit],
    controls: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.Control],
    fireOnChange: js.Function0[scala.Unit],
    getAttributeType: js.Function0[AttributeType],
    getFormat: js.Function0[AttributeFormat],
    getInitialValue: js.Function0[scala.Double | scala.Boolean],
    getIsDirty: js.Function0[scala.Boolean],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[xrmLib.XrmNs.Entity],
    getRequiredLevel: js.Function0[RequirementLevel],
    getSubmitMode: js.Function0[xrmLib.XrmNs.SubmitMode],
    getUserPrivilege: js.Function0[xrmLib.XrmNs.Privilege],
    getValue: js.Function0[js.Any],
    removeOnChange: js.Function1[xrmLib.XrmNs.EventsNs.ContextSensitiveHandler, scala.Unit],
    setRequiredLevel: js.Function1[RequirementLevel, scala.Unit],
    setSubmitMode: js.Function1[xrmLib.XrmNs.SubmitMode, scala.Unit],
    setValue: js.Function1[js.Any, scala.Unit]
  ): EnumAttribute = {
    val __obj = js.Dynamic.literal(addOnChange = addOnChange, controls = controls, fireOnChange = fireOnChange, getAttributeType = getAttributeType, getFormat = getFormat, getInitialValue = getInitialValue, getIsDirty = getIsDirty, getName = getName, getParent = getParent, getRequiredLevel = getRequiredLevel, getSubmitMode = getSubmitMode, getUserPrivilege = getUserPrivilege, getValue = getValue, removeOnChange = removeOnChange, setRequiredLevel = setRequiredLevel, setSubmitMode = setSubmitMode, setValue = setValue)
  
    __obj.asInstanceOf[EnumAttribute]
  }
}

