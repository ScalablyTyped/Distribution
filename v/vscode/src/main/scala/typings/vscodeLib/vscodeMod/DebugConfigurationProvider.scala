package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugConfigurationProvider extends js.Object {
  /**
  		 * Provides initial [debug configuration](#DebugConfiguration). If more than one debug configuration provider is
  		 * registered for the same type, debug configurations are concatenated in arbitrary order.
  		 *
  		 * @param folder The workspace folder for which the configurations are used or undefined for a folderless setup.
  		 * @param token A cancellation token.
  		 * @return An array of [debug configurations](#DebugConfiguration).
  		 */
  var provideDebugConfigurations: js.UndefOr[
    js.Function2[
      /* folder */ js.UndefOr[WorkspaceFolder], 
      /* token */ js.UndefOr[CancellationToken], 
      ProviderResult[js.Array[DebugConfiguration]]
    ]
  ] = js.undefined
  /**
  		 * Resolves a [debug configuration](#DebugConfiguration) by filling in missing values or by adding/changing/removing attributes.
  		 * If more than one debug configuration provider is registered for the same type, the resolveDebugConfiguration calls are chained
  		 * in arbitrary order and the initial debug configuration is piped through the chain.
  		 * Returning the value 'undefined' prevents the debug session from starting.
  		 *
  		 * @param folder The workspace folder from which the configuration originates from or undefined for a folderless setup.
  		 * @param debugConfiguration The [debug configuration](#DebugConfiguration) to resolve.
  		 * @param token A cancellation token.
  		 * @return The resolved debug configuration or undefined.
  		 */
  var resolveDebugConfiguration: js.UndefOr[
    js.Function3[
      /* folder */ js.UndefOr[WorkspaceFolder], 
      /* debugConfiguration */ DebugConfiguration, 
      /* token */ js.UndefOr[CancellationToken], 
      ProviderResult[DebugConfiguration]
    ]
  ] = js.undefined
}

object DebugConfigurationProvider {
  @scala.inline
  def apply(
    provideDebugConfigurations: (/* folder */ js.UndefOr[WorkspaceFolder], /* token */ js.UndefOr[CancellationToken]) => ProviderResult[js.Array[DebugConfiguration]] = null,
    resolveDebugConfiguration: (/* folder */ js.UndefOr[WorkspaceFolder], /* debugConfiguration */ DebugConfiguration, /* token */ js.UndefOr[CancellationToken]) => ProviderResult[DebugConfiguration] = null
  ): DebugConfigurationProvider = {
    val __obj = js.Dynamic.literal()
    if (provideDebugConfigurations != null) __obj.updateDynamic("provideDebugConfigurations")(js.Any.fromFunction2(provideDebugConfigurations))
    if (resolveDebugConfiguration != null) __obj.updateDynamic("resolveDebugConfiguration")(js.Any.fromFunction3(resolveDebugConfiguration))
    __obj.asInstanceOf[DebugConfigurationProvider]
  }
}

