package typings.uifabricUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warnControlledUsageMod {
  
  @JSImport("@uifabric/utilities/lib/warn/warnControlledUsage", "resetControlledWarnings")
  @js.native
  def resetControlledWarnings(): Unit = js.native
  
  @JSImport("@uifabric/utilities/lib/warn/warnControlledUsage", "warnControlledUsage")
  @js.native
  def warnControlledUsage[P](params: IWarnControlledUsageParams[P]): Unit = js.native
  
  @js.native
  trait IWarnControlledUsageParams[P] extends StObject {
    
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
    implicit class IWarnControlledUsageParamsMutableBuilder[Self <: IWarnControlledUsageParams[_], P] (val x: Self with IWarnControlledUsageParams[P]) extends AnyVal {
      
      @scala.inline
      def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueProp(value: /* keyof P */ String): Self = StObject.set(x, "defaultValueProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldProps(value: P): Self = StObject.set(x, "oldProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldPropsUndefined: Self = StObject.set(x, "oldProps", js.undefined)
      
      @scala.inline
      def setOnChangeProp(value: /* keyof P */ String): Self = StObject.set(x, "onChangeProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyProp(value: /* keyof P */ String): Self = StObject.set(x, "readOnlyProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyPropUndefined: Self = StObject.set(x, "readOnlyProp", js.undefined)
      
      @scala.inline
      def setValueProp(value: /* keyof P */ String): Self = StObject.set(x, "valueProp", value.asInstanceOf[js.Any])
    }
  }
}
