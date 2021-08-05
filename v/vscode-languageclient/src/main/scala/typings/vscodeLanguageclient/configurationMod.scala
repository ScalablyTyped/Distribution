package typings.vscodeLanguageclient

import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeJsonrpc.mod.HandlerResult
import typings.vscodeLanguageclient.clientMod.BaseLanguageClient
import typings.vscodeLanguageclient.clientMod.StaticFeature
import typings.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationParams
import typings.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationRequest.HandlerSignature
import typings.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationRequest.MiddlewareSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationMod {
  
  @JSImport("vscode-languageclient/lib/configuration", "ConfigurationFeature")
  @js.native
  class ConfigurationFeature protected ()
    extends StObject
       with StaticFeature {
    def this(_client: BaseLanguageClient) = this()
    
    /* private */ var _client: js.Any = js.native
    
    /* private */ var getConfiguration: js.Any = js.native
    
    def initialize(): Unit = js.native
  }
  
  trait ConfigurationWorkspaceMiddleware extends StObject {
    
    var configuration: js.UndefOr[MiddlewareSignature] = js.undefined
  }
  object ConfigurationWorkspaceMiddleware {
    
    inline def apply(): ConfigurationWorkspaceMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationWorkspaceMiddleware]
    }
    
    extension [Self <: ConfigurationWorkspaceMiddleware](x: Self) {
      
      inline def setConfiguration(
        value: (/* params */ ConfigurationParams, /* token */ CancellationToken, /* next */ HandlerSignature) => HandlerResult[js.Array[js.Any], Unit]
      ): Self = StObject.set(x, "configuration", js.Any.fromFunction3(value))
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    }
  }
}
