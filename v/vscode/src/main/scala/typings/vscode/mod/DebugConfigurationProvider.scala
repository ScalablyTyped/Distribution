package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugConfigurationProvider extends js.Object {
  /**
    * Provides [debug configuration](#DebugConfiguration) to the debug service. If more than one debug configuration provider is
    * registered for the same type, debug configurations are concatenated in arbitrary order.
    *
    * @param folder The workspace folder for which the configurations are used or `undefined` for a folderless setup.
    * @param token A cancellation token.
    * @return An array of [debug configurations](#DebugConfiguration).
    */
  var provideDebugConfigurations: js.UndefOr[
    js.Function2[
      /* folder */ js.UndefOr[WorkspaceFolder], 
      /* token */ js.UndefOr[CancellationToken], 
      ProviderResult[js.Array[DebugConfiguration]]
    ]
  ] = js.native
  /**
    * Resolves a [debug configuration](#DebugConfiguration) by filling in missing values or by adding/changing/removing attributes.
    * If more than one debug configuration provider is registered for the same type, the resolveDebugConfiguration calls are chained
    * in arbitrary order and the initial debug configuration is piped through the chain.
    * Returning the value 'undefined' prevents the debug session from starting.
    * Returning the value 'null' prevents the debug session from starting and opens the underlying debug configuration instead.
    *
    * @param folder The workspace folder from which the configuration originates from or `undefined` for a folderless setup.
    * @param debugConfiguration The [debug configuration](#DebugConfiguration) to resolve.
    * @param token A cancellation token.
    * @return The resolved debug configuration or undefined or null.
    */
  var resolveDebugConfiguration: js.UndefOr[
    js.Function3[
      /* folder */ js.UndefOr[WorkspaceFolder], 
      /* debugConfiguration */ DebugConfiguration, 
      /* token */ js.UndefOr[CancellationToken], 
      ProviderResult[DebugConfiguration]
    ]
  ] = js.native
  /**
    * This hook is directly called after 'resolveDebugConfiguration' but with all variables substituted.
    * It can be used to resolve or verify a [debug configuration](#DebugConfiguration) by filling in missing values or by adding/changing/removing attributes.
    * If more than one debug configuration provider is registered for the same type, the 'resolveDebugConfigurationWithSubstitutedVariables' calls are chained
    * in arbitrary order and the initial debug configuration is piped through the chain.
    * Returning the value 'undefined' prevents the debug session from starting.
    * Returning the value 'null' prevents the debug session from starting and opens the underlying debug configuration instead.
    *
    * @param folder The workspace folder from which the configuration originates from or `undefined` for a folderless setup.
    * @param debugConfiguration The [debug configuration](#DebugConfiguration) to resolve.
    * @param token A cancellation token.
    * @return The resolved debug configuration or undefined or null.
    */
  var resolveDebugConfigurationWithSubstitutedVariables: js.UndefOr[
    js.Function3[
      /* folder */ js.UndefOr[WorkspaceFolder], 
      /* debugConfiguration */ DebugConfiguration, 
      /* token */ js.UndefOr[CancellationToken], 
      ProviderResult[DebugConfiguration]
    ]
  ] = js.native
}

object DebugConfigurationProvider {
  @scala.inline
  def apply(): DebugConfigurationProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugConfigurationProvider]
  }
  @scala.inline
  implicit class DebugConfigurationProviderOps[Self <: DebugConfigurationProvider] (val x: Self) extends AnyVal {
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
    def setProvideDebugConfigurations(
      value: (/* folder */ js.UndefOr[WorkspaceFolder], /* token */ js.UndefOr[CancellationToken]) => ProviderResult[js.Array[DebugConfiguration]]
    ): Self = this.set("provideDebugConfigurations", js.Any.fromFunction2(value))
    @scala.inline
    def deleteProvideDebugConfigurations: Self = this.set("provideDebugConfigurations", js.undefined)
    @scala.inline
    def setResolveDebugConfiguration(
      value: (/* folder */ js.UndefOr[WorkspaceFolder], /* debugConfiguration */ DebugConfiguration, /* token */ js.UndefOr[CancellationToken]) => ProviderResult[DebugConfiguration]
    ): Self = this.set("resolveDebugConfiguration", js.Any.fromFunction3(value))
    @scala.inline
    def deleteResolveDebugConfiguration: Self = this.set("resolveDebugConfiguration", js.undefined)
    @scala.inline
    def setResolveDebugConfigurationWithSubstitutedVariables(
      value: (/* folder */ js.UndefOr[WorkspaceFolder], /* debugConfiguration */ DebugConfiguration, /* token */ js.UndefOr[CancellationToken]) => ProviderResult[DebugConfiguration]
    ): Self = this.set("resolveDebugConfigurationWithSubstitutedVariables", js.Any.fromFunction3(value))
    @scala.inline
    def deleteResolveDebugConfigurationWithSubstitutedVariables: Self = this.set("resolveDebugConfigurationWithSubstitutedVariables", js.undefined)
  }
  
}

