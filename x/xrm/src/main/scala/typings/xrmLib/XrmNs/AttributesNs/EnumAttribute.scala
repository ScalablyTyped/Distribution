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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addOnChange")(addOnChange)
    __obj.updateDynamic("controls")(controls)
    __obj.updateDynamic("fireOnChange")(fireOnChange)
    __obj.updateDynamic("getAttributeType")(getAttributeType)
    __obj.updateDynamic("getFormat")(getFormat)
    __obj.updateDynamic("getInitialValue")(getInitialValue)
    __obj.updateDynamic("getIsDirty")(getIsDirty)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getRequiredLevel")(getRequiredLevel)
    __obj.updateDynamic("getSubmitMode")(getSubmitMode)
    __obj.updateDynamic("getUserPrivilege")(getUserPrivilege)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("removeOnChange")(removeOnChange)
    __obj.updateDynamic("setRequiredLevel")(setRequiredLevel)
    __obj.updateDynamic("setSubmitMode")(setSubmitMode)
    __obj.updateDynamic("setValue")(setValue)
    __obj.asInstanceOf[EnumAttribute]
  }
}

