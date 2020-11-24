package typings.uifabricReactHooks.useWarningsMod

import typings.std.Pick
import typings.uifabricReactHooks.anon.Condition
import typings.uifabricReactHooks.uifabricReactHooksStrings.defaultValueProp
import typings.uifabricReactHooks.uifabricReactHooksStrings.onChangeProp
import typings.uifabricReactHooks.uifabricReactHooksStrings.readOnlyProp
import typings.uifabricReactHooks.uifabricReactHooksStrings.valueProp
import typings.uifabricUtilities.warnControlledUsageMod.IWarnControlledUsageParams
import typings.uifabricUtilities.warnWarnMod.ISettingsMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWarningOptions[P] extends js.Object {
  
  /** Warns when props are required if a condition is met */
  var conditionallyRequired: js.UndefOr[js.Array[Condition]] = js.native
  
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
  ] = js.native
  
  /**
    * Warns when deprecated props are being used. Each key is a prop name and each value is
    * either undefined or a replacement prop name.
    */
  var deprecations: js.UndefOr[ISettingsMap[P]] = js.native
  
  /**
    * Warns when two props which are mutually exclusive are both being used.
    * The key is one prop name and the value is the other.
    */
  var mutuallyExclusive: js.UndefOr[ISettingsMap[P]] = js.native
  
  /** Name of the component */
  var name: String = js.native
  
  /** Generic messages */
  var other: js.UndefOr[js.Array[String]] = js.native
  
  /** Current component props */
  var props: P = js.native
}
object IWarningOptions {
  
  @scala.inline
  def apply[P](name: String, props: P): IWarningOptions[P] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWarningOptions[P]]
  }
  
  @scala.inline
  implicit class IWarningOptionsOps[Self <: IWarningOptions[_], P] (val x: Self with IWarningOptions[P]) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: P): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionallyRequiredVarargs(value: Condition*): Self = this.set("conditionallyRequired", js.Array(value :_*))
    
    @scala.inline
    def setConditionallyRequired(value: js.Array[Condition]): Self = this.set("conditionallyRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionallyRequired: Self = this.set("conditionallyRequired", js.undefined)
    
    @scala.inline
    def setControlledUsage(
      value: Pick[
          IWarnControlledUsageParams[P], 
          valueProp | defaultValueProp | onChangeProp | readOnlyProp
        ]
    ): Self = this.set("controlledUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlledUsage: Self = this.set("controlledUsage", js.undefined)
    
    @scala.inline
    def setDeprecations(value: ISettingsMap[P]): Self = this.set("deprecations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecations: Self = this.set("deprecations", js.undefined)
    
    @scala.inline
    def setMutuallyExclusive(value: ISettingsMap[P]): Self = this.set("mutuallyExclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutuallyExclusive: Self = this.set("mutuallyExclusive", js.undefined)
    
    @scala.inline
    def setOtherVarargs(value: String*): Self = this.set("other", js.Array(value :_*))
    
    @scala.inline
    def setOther(value: js.Array[String]): Self = this.set("other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOther: Self = this.set("other", js.undefined)
  }
}
