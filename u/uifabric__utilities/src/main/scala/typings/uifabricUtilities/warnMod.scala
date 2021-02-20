package typings.uifabricUtilities

import typings.uifabricUtilities.warnControlledUsageMod.IWarnControlledUsageParams
import typings.uifabricUtilities.warnWarnMod.ISettingsMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warnMod {
  
  @JSImport("@uifabric/utilities/lib/warn", "resetControlledWarnings")
  @js.native
  def resetControlledWarnings(): Unit = js.native
  
  @JSImport("@uifabric/utilities/lib/warn", "setWarningCallback")
  @js.native
  def setWarningCallback(): Unit = js.native
  @JSImport("@uifabric/utilities/lib/warn", "setWarningCallback")
  @js.native
  def setWarningCallback(warningCallback: js.Function1[/* message */ String, Unit]): Unit = js.native
  
  @JSImport("@uifabric/utilities/lib/warn", "warn")
  @js.native
  def warn(message: String): Unit = js.native
  
  @JSImport("@uifabric/utilities/lib/warn", "warnConditionallyRequiredProps")
  @js.native
  def warnConditionallyRequiredProps[P](
    componentName: String,
    props: P,
    requiredProps: js.Array[String],
    conditionalPropName: String,
    condition: Boolean
  ): Unit = js.native
  
  @JSImport("@uifabric/utilities/lib/warn", "warnControlledUsage")
  @js.native
  def warnControlledUsage[P](params: IWarnControlledUsageParams[P]): Unit = js.native
  
  @JSImport("@uifabric/utilities/lib/warn", "warnDeprecations")
  @js.native
  def warnDeprecations[P](componentName: String, props: P, deprecationMap: ISettingsMap[P]): Unit = js.native
  
  @JSImport("@uifabric/utilities/lib/warn", "warnMutuallyExclusive")
  @js.native
  def warnMutuallyExclusive[P](componentName: String, props: P, exclusiveMap: ISettingsMap[P]): Unit = js.native
}
