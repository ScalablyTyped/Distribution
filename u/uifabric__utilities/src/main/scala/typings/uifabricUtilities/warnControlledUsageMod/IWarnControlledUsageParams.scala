package typings.uifabricUtilities.warnControlledUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWarnControlledUsageParams[P] extends js.Object {
  /** ID of the component instance. Used to prevent showing warnings repeatedly. */
  var componentId: String
  /** Name of the component class. */
  var componentName: String
  /** Name of the prop for the uncontrolled initial value. */
  var defaultValueProp: /* keyof P */ String
  /** Previous props to evaluate (undefined if called in the constructor). */
  var oldProps: js.UndefOr[P] = js.undefined
  /** Name of the change handler prop. */
  var onChangeProp: /* keyof P */ String
  /** Current props to evaluate. */
  var props: P
  /** Name of the read-only prop. */
  var readOnlyProp: js.UndefOr[/* keyof P */ String] = js.undefined
  /** Name of the prop for the controlled value. */
  var valueProp: /* keyof P */ String
}

object IWarnControlledUsageParams {
  @scala.inline
  def apply[P](
    componentId: String,
    componentName: String,
    defaultValueProp: /* keyof P */ String,
    onChangeProp: /* keyof P */ String,
    props: P,
    valueProp: /* keyof P */ String,
    oldProps: P = null,
    readOnlyProp: /* keyof P */ String = null
  ): IWarnControlledUsageParams[P] = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], defaultValueProp = defaultValueProp.asInstanceOf[js.Any], onChangeProp = onChangeProp.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueProp = valueProp.asInstanceOf[js.Any])
    if (oldProps != null) __obj.updateDynamic("oldProps")(oldProps.asInstanceOf[js.Any])
    if (readOnlyProp != null) __obj.updateDynamic("readOnlyProp")(readOnlyProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWarnControlledUsageParams[P]]
  }
}

