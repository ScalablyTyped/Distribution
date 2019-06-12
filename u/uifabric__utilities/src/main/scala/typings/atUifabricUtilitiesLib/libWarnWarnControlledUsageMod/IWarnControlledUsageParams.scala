package typings
package atUifabricUtilitiesLib.libWarnWarnControlledUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWarnControlledUsageParams[P] extends js.Object {
  /** ID of the component instance. Used to prevent showing warnings repeatedly. */
  var componentId: java.lang.String
  /** Name of the component class. */
  var componentName: java.lang.String
  /** Name of the prop for the uncontrolled initial value. */
  var defaultValueProp: java.lang.String
  /** Previous props to evaluate (undefined if called in the constructor). */
  var oldProps: js.UndefOr[P] = js.undefined
  /** Name of the change handler prop. */
  var onChangeProp: java.lang.String
  /** Current props to evaluate. */
  var props: P
  /** Name of the read-only prop. */
  var readOnlyProp: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the prop for the controlled value. */
  var valueProp: java.lang.String
}

object IWarnControlledUsageParams {
  @scala.inline
  def apply[P](
    componentId: java.lang.String,
    componentName: java.lang.String,
    defaultValueProp: java.lang.String,
    onChangeProp: java.lang.String,
    props: P,
    valueProp: java.lang.String,
    oldProps: P = null,
    readOnlyProp: java.lang.String = null
  ): IWarnControlledUsageParams[P] = {
    val __obj = js.Dynamic.literal(componentId = componentId, componentName = componentName, defaultValueProp = defaultValueProp, onChangeProp = onChangeProp, props = props.asInstanceOf[js.Any], valueProp = valueProp)
    if (oldProps != null) __obj.updateDynamic("oldProps")(oldProps.asInstanceOf[js.Any])
    if (readOnlyProp != null) __obj.updateDynamic("readOnlyProp")(readOnlyProp)
    __obj.asInstanceOf[IWarnControlledUsageParams[P]]
  }
}

