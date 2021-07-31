package typings.uifabricUtilities

import typings.uifabricUtilities.warnControlledUsageMod.IWarnControlledUsageParams
import typings.uifabricUtilities.warnWarnMod.ISettingsMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warnMod {
  
  @JSImport("@uifabric/utilities/lib/warn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def resetControlledWarnings(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetControlledWarnings")().asInstanceOf[Unit]
  
  @scala.inline
  def setWarningCallback(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWarningCallback")().asInstanceOf[Unit]
  @scala.inline
  def setWarningCallback(warningCallback: js.Function1[/* message */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWarningCallback")(warningCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def warnConditionallyRequiredProps[P](
    componentName: String,
    props: P,
    requiredProps: js.Array[String],
    conditionalPropName: String,
    condition: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warnConditionallyRequiredProps")(componentName.asInstanceOf[js.Any], props.asInstanceOf[js.Any], requiredProps.asInstanceOf[js.Any], conditionalPropName.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def warnControlledUsage[P](params: IWarnControlledUsageParams[P]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnControlledUsage")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def warnDeprecations[P](componentName: String, props: P, deprecationMap: ISettingsMap[P]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warnDeprecations")(componentName.asInstanceOf[js.Any], props.asInstanceOf[js.Any], deprecationMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def warnMutuallyExclusive[P](componentName: String, props: P, exclusiveMap: ISettingsMap[P]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warnMutuallyExclusive")(componentName.asInstanceOf[js.Any], props.asInstanceOf[js.Any], exclusiveMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
