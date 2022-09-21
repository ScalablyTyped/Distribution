package typings.uifabricReactHooks

import typings.std.Pick
import typings.uifabricReactHooks.anon.Condition
import typings.uifabricReactHooks.uifabricReactHooksStrings.defaultValueProp
import typings.uifabricReactHooks.uifabricReactHooksStrings.onChangeProp
import typings.uifabricReactHooks.uifabricReactHooksStrings.readOnlyProp
import typings.uifabricReactHooks.uifabricReactHooksStrings.valueProp
import typings.uifabricUtilities.warnControlledUsageMod.IWarnControlledUsageParams
import typings.uifabricUtilities.warnWarnMod.ISettingsMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useWarningsMod {
  
  @JSImport("@uifabric/react-hooks/lib/useWarnings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useWarnings[P](options: IWarningOptions[P]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useWarnings")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait IWarningOptions[P] extends StObject {
    
    /** Warns when props are required if a condition is met */
    var conditionallyRequired: js.UndefOr[js.Array[Condition]] = js.undefined
    
    /**
      * Check for and warn on the following error conditions with a form component:
      * - A value prop is provided (indicated it's being used as controlled) without a change handler,
      *    and the component is not read-only
      * - Both the value and defaultValue props are provided
      * - The component is attempting to switch between controlled and uncontrolled
      *
      * The messages mimic the warnings React gives for these error conditions on input elements.
      * The warning will only be displayed once per component instance.
      */
    var controlledUsage: js.UndefOr[
        Pick[
          IWarnControlledUsageParams[P], 
          valueProp | defaultValueProp | onChangeProp | readOnlyProp
        ]
      ] = js.undefined
    
    /**
      * Warns when deprecated props are being used. Each key is a prop name and each value is
      * either undefined or a replacement prop name.
      */
    var deprecations: js.UndefOr[ISettingsMap[P]] = js.undefined
    
    /**
      * Warns when two props which are mutually exclusive are both being used.
      * The key is one prop name and the value is the other.
      */
    var mutuallyExclusive: js.UndefOr[ISettingsMap[P]] = js.undefined
    
    /** Name of the component */
    var name: String
    
    /** Generic messages */
    var other: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Current component props */
    var props: P
  }
  object IWarningOptions {
    
    inline def apply[P](name: String, props: P): IWarningOptions[P] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWarningOptions[P]]
    }
    
    extension [Self <: IWarningOptions[?], P](x: Self & IWarningOptions[P]) {
      
      inline def setConditionallyRequired(value: js.Array[Condition]): Self = StObject.set(x, "conditionallyRequired", value.asInstanceOf[js.Any])
      
      inline def setConditionallyRequiredUndefined: Self = StObject.set(x, "conditionallyRequired", js.undefined)
      
      inline def setConditionallyRequiredVarargs(value: Condition*): Self = StObject.set(x, "conditionallyRequired", js.Array(value*))
      
      inline def setControlledUsage(
        value: Pick[
              IWarnControlledUsageParams[P], 
              valueProp | defaultValueProp | onChangeProp | readOnlyProp
            ]
      ): Self = StObject.set(x, "controlledUsage", value.asInstanceOf[js.Any])
      
      inline def setControlledUsageUndefined: Self = StObject.set(x, "controlledUsage", js.undefined)
      
      inline def setDeprecations(value: ISettingsMap[P]): Self = StObject.set(x, "deprecations", value.asInstanceOf[js.Any])
      
      inline def setDeprecationsUndefined: Self = StObject.set(x, "deprecations", js.undefined)
      
      inline def setMutuallyExclusive(value: ISettingsMap[P]): Self = StObject.set(x, "mutuallyExclusive", value.asInstanceOf[js.Any])
      
      inline def setMutuallyExclusiveUndefined: Self = StObject.set(x, "mutuallyExclusive", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOther(value: js.Array[String]): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      inline def setOtherVarargs(value: String*): Self = StObject.set(x, "other", js.Array(value*))
      
      inline def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
