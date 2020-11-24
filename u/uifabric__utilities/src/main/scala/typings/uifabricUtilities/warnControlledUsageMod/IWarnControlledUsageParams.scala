package typings.uifabricUtilities.warnControlledUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWarnControlledUsageParams[P] extends js.Object {
  
  /** ID of the component instance. Used to prevent showing warnings repeatedly. */
  var componentId: String = js.native
  
  /** Name of the component class. */
  var componentName: String = js.native
  
  /** Name of the prop for the uncontrolled initial value. */
  var defaultValueProp: /* keyof P */ String = js.native
  
  /** Previous props to evaluate (undefined if called in the constructor). */
  var oldProps: js.UndefOr[P] = js.native
  
  /** Name of the change handler prop. */
  var onChangeProp: /* keyof P */ String = js.native
  
  /** Current props to evaluate. */
  var props: P = js.native
  
  /** Name of the read-only prop. */
  var readOnlyProp: js.UndefOr[/* keyof P */ String] = js.native
  
  /** Name of the prop for the controlled value. */
  var valueProp: /* keyof P */ String = js.native
}
object IWarnControlledUsageParams {
  
  @scala.inline
  def apply[P](
    componentId: String,
    componentName: String,
    defaultValueProp: /* keyof P */ String,
    onChangeProp: /* keyof P */ String,
    props: P,
    valueProp: /* keyof P */ String
  ): IWarnControlledUsageParams[P] = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], defaultValueProp = defaultValueProp.asInstanceOf[js.Any], onChangeProp = onChangeProp.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueProp = valueProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWarnControlledUsageParams[P]]
  }
  
  @scala.inline
  implicit class IWarnControlledUsageParamsOps[Self <: IWarnControlledUsageParams[_], P] (val x: Self with IWarnControlledUsageParams[P]) extends AnyVal {
    
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
    def setComponentId(value: String): Self = this.set("componentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentName(value: String): Self = this.set("componentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueProp(value: /* keyof P */ String): Self = this.set("defaultValueProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeProp(value: /* keyof P */ String): Self = this.set("onChangeProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: P): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueProp(value: /* keyof P */ String): Self = this.set("valueProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldProps(value: P): Self = this.set("oldProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldProps: Self = this.set("oldProps", js.undefined)
    
    @scala.inline
    def setReadOnlyProp(value: /* keyof P */ String): Self = this.set("readOnlyProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnlyProp: Self = this.set("readOnlyProp", js.undefined)
  }
}
