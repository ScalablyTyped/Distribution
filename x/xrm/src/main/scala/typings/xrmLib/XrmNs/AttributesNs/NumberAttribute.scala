package typings
package xrmLib.XrmNs.AttributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Number attribute.
  * @see {@link Attribute}
  */
trait NumberAttribute extends Attribute {
  /**
    * A collection of all the controls on the form that interface with this attribute.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  @JSName("controls")
  var controls_NumberAttribute: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.NumberControl]
  /**
    * Gets the maximum value allowed.
    * @returns The maximum value allowed.
    */
  def getMax(): scala.Double
  /**
    * Gets the minimum value allowed.
    * @returns The minimum value allowed.
    */
  def getMin(): scala.Double
  /**
    * Gets the attribute's configured precision.
    * @returns The total number of allowed decimal places.
    */
  def getPrecision(): scala.Double
  /**
    * Sets the value.
    * @param value The value.
    * @remarks Attributes on Quick Create Forms will not save values set with this method.
    */
  def setValue(value: scala.Double): scala.Unit
}

object NumberAttribute {
  @scala.inline
  def apply(
    addOnChange: js.Function1[xrmLib.XrmNs.EventsNs.ContextSensitiveHandler, scala.Unit],
    controls: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.NumberControl],
    fireOnChange: js.Function0[scala.Unit],
    getAttributeType: js.Function0[AttributeType],
    getFormat: js.Function0[IntegerAttributeFormat],
    getIsDirty: js.Function0[scala.Boolean],
    getMax: js.Function0[scala.Double],
    getMin: js.Function0[scala.Double],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[xrmLib.XrmNs.Entity],
    getPrecision: js.Function0[scala.Double],
    getRequiredLevel: js.Function0[RequirementLevel],
    getSubmitMode: js.Function0[xrmLib.XrmNs.SubmitMode],
    getUserPrivilege: js.Function0[xrmLib.XrmNs.Privilege],
    getValue: js.Function0[scala.Double],
    removeOnChange: js.Function1[xrmLib.XrmNs.EventsNs.ContextSensitiveHandler, scala.Unit],
    setRequiredLevel: js.Function1[RequirementLevel, scala.Unit],
    setSubmitMode: js.Function1[xrmLib.XrmNs.SubmitMode, scala.Unit],
    setValue: js.Function1[scala.Double, scala.Unit]
  ): NumberAttribute = {
    val __obj = js.Dynamic.literal(addOnChange = addOnChange, controls = controls, fireOnChange = fireOnChange, getAttributeType = getAttributeType, getFormat = getFormat, getIsDirty = getIsDirty, getMax = getMax, getMin = getMin, getName = getName, getParent = getParent, getPrecision = getPrecision, getRequiredLevel = getRequiredLevel, getSubmitMode = getSubmitMode, getUserPrivilege = getUserPrivilege, getValue = getValue, removeOnChange = removeOnChange, setRequiredLevel = setRequiredLevel, setSubmitMode = setSubmitMode, setValue = setValue)
  
    __obj.asInstanceOf[NumberAttribute]
  }
}

