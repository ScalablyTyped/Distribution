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
    addOnChange: xrmLib.XrmNs.EventsNs.ContextSensitiveHandler => scala.Unit,
    controls: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.NumberControl],
    fireOnChange: () => scala.Unit,
    getAttributeType: () => AttributeType,
    getFormat: () => IntegerAttributeFormat,
    getIsDirty: () => scala.Boolean,
    getMax: () => scala.Double,
    getMin: () => scala.Double,
    getName: () => java.lang.String,
    getParent: () => xrmLib.XrmNs.Entity,
    getPrecision: () => scala.Double,
    getRequiredLevel: () => RequirementLevel,
    getSubmitMode: () => xrmLib.XrmNs.SubmitMode,
    getUserPrivilege: () => xrmLib.XrmNs.Privilege,
    getValue: () => scala.Double,
    removeOnChange: xrmLib.XrmNs.EventsNs.ContextSensitiveHandler => scala.Unit,
    setRequiredLevel: RequirementLevel => scala.Unit,
    setSubmitMode: xrmLib.XrmNs.SubmitMode => scala.Unit,
    setValue: scala.Double => scala.Unit
  ): NumberAttribute = {
    val __obj = js.Dynamic.literal(addOnChange = js.Any.fromFunction1(addOnChange), controls = controls, fireOnChange = js.Any.fromFunction0(fireOnChange), getAttributeType = js.Any.fromFunction0(getAttributeType), getFormat = js.Any.fromFunction0(getFormat), getIsDirty = js.Any.fromFunction0(getIsDirty), getMax = js.Any.fromFunction0(getMax), getMin = js.Any.fromFunction0(getMin), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getPrecision = js.Any.fromFunction0(getPrecision), getRequiredLevel = js.Any.fromFunction0(getRequiredLevel), getSubmitMode = js.Any.fromFunction0(getSubmitMode), getUserPrivilege = js.Any.fromFunction0(getUserPrivilege), getValue = js.Any.fromFunction0(getValue), removeOnChange = js.Any.fromFunction1(removeOnChange), setRequiredLevel = js.Any.fromFunction1(setRequiredLevel), setSubmitMode = js.Any.fromFunction1(setSubmitMode), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[NumberAttribute]
  }
}

