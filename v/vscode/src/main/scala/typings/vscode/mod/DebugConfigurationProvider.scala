package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugConfigurationProvider extends StObject {
  
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
  implicit class DebugConfigurationProviderMutableBuilder[Self <: DebugConfigurationProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideDebugConfigurations(
      value: (/* folder */ js.UndefOr[WorkspaceFolder], /* token */ js.UndefOr[CancellationToken]) => ProviderResult[js.Array[DebugConfiguration]]
    ): Self = StObject.set(x, "provideDebugConfigurations", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProvideDebugConfigurationsUndefined: Self = StObject.set(x, "provideDebugConfigurations", js.undefined)
    
    @scala.inline
    def setResolveDebugConfiguration(
      value: (/* folder */ js.UndefOr[WorkspaceFolder], /* debugConfiguration */ DebugConfiguration, /* token */ js.UndefOr[CancellationToken]) => ProviderResult[DebugConfiguration]
    ): Self = StObject.set(x, "resolveDebugConfiguration", js.Any.fromFunction3(value))
    
    @scala.inline
    def setResolveDebugConfigurationUndefined: Self = StObject.set(x, "resolveDebugConfiguration", js.undefined)
    
    @scala.inline
    def setResolveDebugConfigurationWithSubstitutedVariables(
      value: (/* folder */ js.UndefOr[WorkspaceFolder], /* debugConfiguration */ DebugConfiguration, /* token */ js.UndefOr[CancellationToken]) => ProviderResult[DebugConfiguration]
    ): Self = StObject.set(x, "resolveDebugConfigurationWithSubstitutedVariables", js.Any.fromFunction3(value))
    
    @scala.inline
    def setResolveDebugConfigurationWithSubstitutedVariablesUndefined: Self = StObject.set(x, "resolveDebugConfigurationWithSubstitutedVariables", js.undefined)
  }
}
