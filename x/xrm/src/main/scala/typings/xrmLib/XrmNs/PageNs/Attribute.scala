package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an Entity attribute.
  * @deprecated Use {@link Xrm.Attributes.Attribute} instead.
  */
trait Attribute
  extends xrmLib.XrmNs.AttributesNs.Attribute

object Attribute {
  @scala.inline
  def apply(
    addOnChange: js.Function1[xrmLib.XrmNs.EventsNs.ContextSensitiveHandler, scala.Unit],
    controls: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.Control],
    fireOnChange: js.Function0[scala.Unit],
    getAttributeType: js.Function0[xrmLib.XrmNs.AttributesNs.AttributeType],
    getFormat: js.Function0[xrmLib.XrmNs.AttributesNs.AttributeFormat],
    getIsDirty: js.Function0[scala.Boolean],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[xrmLib.XrmNs.Entity],
    getRequiredLevel: js.Function0[xrmLib.XrmNs.AttributesNs.RequirementLevel],
    getSubmitMode: js.Function0[xrmLib.XrmNs.SubmitMode],
    getUserPrivilege: js.Function0[xrmLib.XrmNs.Privilege],
    getValue: js.Function0[js.Any],
    removeOnChange: js.Function1[xrmLib.XrmNs.EventsNs.ContextSensitiveHandler, scala.Unit],
    setRequiredLevel: js.Function1[xrmLib.XrmNs.AttributesNs.RequirementLevel, scala.Unit],
    setSubmitMode: js.Function1[xrmLib.XrmNs.SubmitMode, scala.Unit],
    setValue: js.Function1[js.Any, scala.Unit]
  ): Attribute = {
    val __obj = js.Dynamic.literal(addOnChange = addOnChange, controls = controls, fireOnChange = fireOnChange, getAttributeType = getAttributeType, getFormat = getFormat, getIsDirty = getIsDirty, getName = getName, getParent = getParent, getRequiredLevel = getRequiredLevel, getSubmitMode = getSubmitMode, getUserPrivilege = getUserPrivilege, getValue = getValue, removeOnChange = removeOnChange, setRequiredLevel = setRequiredLevel, setSubmitMode = setSubmitMode, setValue = setValue)
  
    __obj.asInstanceOf[Attribute]
  }
}

