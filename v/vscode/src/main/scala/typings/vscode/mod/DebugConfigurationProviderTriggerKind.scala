package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DebugConfigurationProviderTriggerKind extends StObject
@JSImport("vscode", "DebugConfigurationProviderTriggerKind")
@js.native
object DebugConfigurationProviderTriggerKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DebugConfigurationProviderTriggerKind with Double] = js.native
  
  /**
    * `DebugConfigurationProvider.provideDebugConfigurations` is called to provide dynamically generated debug configurations when the user asks for them through the UI (e.g. via the "Select and Start Debugging" command).
    */
  @js.native
  sealed trait Dynamic extends DebugConfigurationProviderTriggerKind
  /* 2 */ val Dynamic: typings.vscode.mod.DebugConfigurationProviderTriggerKind.Dynamic with Double = js.native
  
  /**
    *    `DebugConfigurationProvider.provideDebugConfigurations` is called to provide the initial debug configurations for a newly created launch.json.
    */
  @js.native
  sealed trait Initial extends DebugConfigurationProviderTriggerKind
  /* 1 */ val Initial: typings.vscode.mod.DebugConfigurationProviderTriggerKind.Initial with Double = js.native
}
