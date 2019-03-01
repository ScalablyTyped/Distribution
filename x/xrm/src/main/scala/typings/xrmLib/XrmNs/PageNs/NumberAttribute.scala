package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Number attribute.
  * @see {@link Attribute}
  * @deprecated Use {@link Xrm.Attributes.NumberAttribute} instead.
  */
trait NumberAttribute
  extends xrmLib.XrmNs.AttributesNs.NumberAttribute

object NumberAttribute {
  @scala.inline
  def apply(
    addOnChange: js.Function1[xrmLib.XrmNs.EventsNs.ContextSensitiveHandler, scala.Unit],
    controls: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.NumberControl],
    fireOnChange: js.Function0[scala.Unit],
    getAttributeType: js.Function0[xrmLib.XrmNs.AttributesNs.AttributeType],
    getFormat: js.Function0[xrmLib.XrmNs.AttributesNs.IntegerAttributeFormat],
    getIsDirty: js.Function0[scala.Boolean],
    getMax: js.Function0[scala.Double],
    getMin: js.Function0[scala.Double],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[xrmLib.XrmNs.Entity],
    getPrecision: js.Function0[scala.Double],
    getRequiredLevel: js.Function0[xrmLib.XrmNs.AttributesNs.RequirementLevel],
    getSubmitMode: js.Function0[xrmLib.XrmNs.SubmitMode],
    getUserPrivilege: js.Function0[xrmLib.XrmNs.Privilege],
    getValue: js.Function0[scala.Double],
    removeOnChange: js.Function1[xrmLib.XrmNs.EventsNs.ContextSensitiveHandler, scala.Unit],
    setRequiredLevel: js.Function1[xrmLib.XrmNs.AttributesNs.RequirementLevel, scala.Unit],
    setSubmitMode: js.Function1[xrmLib.XrmNs.SubmitMode, scala.Unit],
    setValue: js.Function1[scala.Double, scala.Unit]
  ): NumberAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addOnChange")(addOnChange)
    __obj.updateDynamic("controls")(controls)
    __obj.updateDynamic("fireOnChange")(fireOnChange)
    __obj.updateDynamic("getAttributeType")(getAttributeType)
    __obj.updateDynamic("getFormat")(getFormat)
    __obj.updateDynamic("getIsDirty")(getIsDirty)
    __obj.updateDynamic("getMax")(getMax)
    __obj.updateDynamic("getMin")(getMin)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getPrecision")(getPrecision)
    __obj.updateDynamic("getRequiredLevel")(getRequiredLevel)
    __obj.updateDynamic("getSubmitMode")(getSubmitMode)
    __obj.updateDynamic("getUserPrivilege")(getUserPrivilege)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("removeOnChange")(removeOnChange)
    __obj.updateDynamic("setRequiredLevel")(setRequiredLevel)
    __obj.updateDynamic("setSubmitMode")(setSubmitMode)
    __obj.updateDynamic("setValue")(setValue)
    __obj.asInstanceOf[NumberAttribute]
  }
}

