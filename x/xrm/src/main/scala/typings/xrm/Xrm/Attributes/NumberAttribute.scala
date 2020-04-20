package typings.xrm.Xrm.Attributes

import typings.xrm.Xrm.Collection.ItemCollection
import typings.xrm.Xrm.Controls.NumberControl
import typings.xrm.Xrm.Entity
import typings.xrm.Xrm.Events.ContextSensitiveHandler
import typings.xrm.Xrm.Privilege
import typings.xrm.Xrm.SubmitMode
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
  var controls_NumberAttribute: ItemCollection[NumberControl]
  /**
    * Gets the maximum value allowed.
    * @returns The maximum value allowed.
    */
  def getMax(): Double
  /**
    * Gets the minimum value allowed.
    * @returns The minimum value allowed.
    */
  def getMin(): Double
  /**
    * Gets the attribute's configured precision.
    * @returns The total number of allowed decimal places.
    */
  def getPrecision(): Double
  /**
    * Sets the value.
    * @param value The value.
    * @remarks Attributes on Quick Create Forms will not save values set with this method.
    */
  def setValue(value: Double): Unit
}

object NumberAttribute {
  @scala.inline
  def apply(
    addOnChange: ContextSensitiveHandler => Unit,
    controls: ItemCollection[NumberControl],
    fireOnChange: () => Unit,
    getAttributeType: () => AttributeType,
    getFormat: () => AttributeFormat,
    getIsDirty: () => Boolean,
    getMax: () => Double,
    getMin: () => Double,
    getName: () => String,
    getParent: () => Entity,
    getPrecision: () => Double,
    getRequiredLevel: () => RequirementLevel,
    getSubmitMode: () => SubmitMode,
    getUserPrivilege: () => Privilege,
    getValue: () => js.Any,
    removeOnChange: ContextSensitiveHandler => Unit,
    setRequiredLevel: RequirementLevel => Unit,
    setSubmitMode: SubmitMode => Unit,
    setValue: Double => Unit
  ): NumberAttribute = {
    val __obj = js.Dynamic.literal(addOnChange = js.Any.fromFunction1(addOnChange), controls = controls.asInstanceOf[js.Any], fireOnChange = js.Any.fromFunction0(fireOnChange), getAttributeType = js.Any.fromFunction0(getAttributeType), getFormat = js.Any.fromFunction0(getFormat), getIsDirty = js.Any.fromFunction0(getIsDirty), getMax = js.Any.fromFunction0(getMax), getMin = js.Any.fromFunction0(getMin), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getPrecision = js.Any.fromFunction0(getPrecision), getRequiredLevel = js.Any.fromFunction0(getRequiredLevel), getSubmitMode = js.Any.fromFunction0(getSubmitMode), getUserPrivilege = js.Any.fromFunction0(getUserPrivilege), getValue = js.Any.fromFunction0(getValue), removeOnChange = js.Any.fromFunction1(removeOnChange), setRequiredLevel = js.Any.fromFunction1(setRequiredLevel), setSubmitMode = js.Any.fromFunction1(setSubmitMode), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[NumberAttribute]
  }
}

