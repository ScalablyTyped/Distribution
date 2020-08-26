package typings.xrm.Xrm.Attributes

import typings.xrm.Xrm.Collection.ItemCollection
import typings.xrm.Xrm.Controls.Control
import typings.xrm.Xrm.Entity
import typings.xrm.Xrm.Events.ContextSensitiveHandler
import typings.xrm.Xrm.Privilege
import typings.xrm.Xrm.SubmitMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Common interface for enumeration attributes (OptionSet and Boolean).
  * @see {@link Attribute}
  */
@js.native
trait EnumAttribute extends Attribute {
  /**
    * Gets the initial value of the attribute.
    * @returns The initial value.
    * @remarks Valid for OptionSet and boolean attribute types
    */
  def getInitialValue(): Double | Boolean = js.native
}

object EnumAttribute {
  @scala.inline
  def apply(
    addOnChange: ContextSensitiveHandler => Unit,
    controls: ItemCollection[Control],
    fireOnChange: () => Unit,
    getAttributeType: () => AttributeType,
    getFormat: () => AttributeFormat,
    getInitialValue: () => Double | Boolean,
    getIsDirty: () => Boolean,
    getName: () => String,
    getParent: () => Entity,
    getRequiredLevel: () => RequirementLevel,
    getSubmitMode: () => SubmitMode,
    getUserPrivilege: () => Privilege,
    getValue: () => js.Any,
    removeOnChange: ContextSensitiveHandler => Unit,
    setRequiredLevel: RequirementLevel => Unit,
    setSubmitMode: SubmitMode => Unit,
    setValue: js.Any => Unit
  ): EnumAttribute = {
    val __obj = js.Dynamic.literal(addOnChange = js.Any.fromFunction1(addOnChange), controls = controls.asInstanceOf[js.Any], fireOnChange = js.Any.fromFunction0(fireOnChange), getAttributeType = js.Any.fromFunction0(getAttributeType), getFormat = js.Any.fromFunction0(getFormat), getInitialValue = js.Any.fromFunction0(getInitialValue), getIsDirty = js.Any.fromFunction0(getIsDirty), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getRequiredLevel = js.Any.fromFunction0(getRequiredLevel), getSubmitMode = js.Any.fromFunction0(getSubmitMode), getUserPrivilege = js.Any.fromFunction0(getUserPrivilege), getValue = js.Any.fromFunction0(getValue), removeOnChange = js.Any.fromFunction1(removeOnChange), setRequiredLevel = js.Any.fromFunction1(setRequiredLevel), setSubmitMode = js.Any.fromFunction1(setSubmitMode), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[EnumAttribute]
  }
  @scala.inline
  implicit class EnumAttributeOps[Self <: EnumAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetInitialValue(value: () => Double | Boolean): Self = this.set("getInitialValue", js.Any.fromFunction0(value))
  }
  
}

