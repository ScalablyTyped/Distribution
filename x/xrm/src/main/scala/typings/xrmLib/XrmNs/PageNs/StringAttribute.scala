package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a String attribute.
  * @see {@link Attribute}
  * @deprecated Use {@link Xrm.Attributes.StringAttribute} instead.
  */
trait StringAttribute
  extends xrmLib.XrmNs.AttributesNs.StringAttribute

object StringAttribute {
  @scala.inline
  def apply(
    addOnChange: js.Function1[xrmLib.XrmNs.EventsNs.ContextSensitiveHandler, scala.Unit],
    controls: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.StringControl],
    fireOnChange: js.Function0[scala.Unit],
    getAttributeType: js.Function0[xrmLib.XrmNs.AttributesNs.AttributeType],
    getFormat: js.Function0[xrmLib.XrmNs.AttributesNs.StringAttributeFormat],
    getIsDirty: js.Function0[scala.Boolean],
    getMaxLength: js.Function0[scala.Double],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[xrmLib.XrmNs.Entity],
    getRequiredLevel: js.Function0[xrmLib.XrmNs.AttributesNs.RequirementLevel],
    getSubmitMode: js.Function0[xrmLib.XrmNs.SubmitMode],
    getUserPrivilege: js.Function0[xrmLib.XrmNs.Privilege],
    getValue: js.Function0[java.lang.String],
    removeOnChange: js.Function1[xrmLib.XrmNs.EventsNs.ContextSensitiveHandler, scala.Unit],
    setRequiredLevel: js.Function1[xrmLib.XrmNs.AttributesNs.RequirementLevel, scala.Unit],
    setSubmitMode: js.Function1[xrmLib.XrmNs.SubmitMode, scala.Unit],
    setValue: js.Function1[java.lang.String, scala.Unit]
  ): StringAttribute = {
    val __obj = js.Dynamic.literal(addOnChange = addOnChange, controls = controls, fireOnChange = fireOnChange, getAttributeType = getAttributeType, getFormat = getFormat, getIsDirty = getIsDirty, getMaxLength = getMaxLength, getName = getName, getParent = getParent, getRequiredLevel = getRequiredLevel, getSubmitMode = getSubmitMode, getUserPrivilege = getUserPrivilege, getValue = getValue, removeOnChange = removeOnChange, setRequiredLevel = setRequiredLevel, setSubmitMode = setSubmitMode, setValue = setValue)
  
    __obj.asInstanceOf[StringAttribute]
  }
}

