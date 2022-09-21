package typings.vscodeLanguageclient

import typings.vscode.mod.ProviderResult
import typings.vscodeLanguageclient.featuresMod.DynamicFeature
import typings.vscodeLanguageclient.featuresMod.FeatureClient
import typings.vscodeLanguageserverProtocol.mod.RegistrationType
import typings.vscodeLanguageserverProtocol.protocolMod.ExecuteCommandRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executeCommandMod {
  
  @JSImport("vscode-languageclient/lib/common/executeCommand", "ExecuteCommandFeature")
  @js.native
  open class ExecuteCommandFeature protected ()
    extends StObject
       with DynamicFeature[ExecuteCommandRegistrationOptions] {
    def this(client: FeatureClient[ExecuteCommandMiddleware, js.Object]) = this()
    
    /* private */ val _client: Any = js.native
    
    /* private */ val _commands: Any = js.native
    
    @JSName("registrationType")
    def registrationType_MExecuteCommandFeature: RegistrationType[ExecuteCommandRegistrationOptions] = js.native
  }
  
  trait ExecuteCommandMiddleware extends StObject {
    
    var executeCommand: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* command */ String, 
          /* args */ js.Array[Any], 
          /* next */ ExecuteCommandSignature, 
          ProviderResult[Any]
        ]
      ] = js.undefined
  }
  object ExecuteCommandMiddleware {
    
    inline def apply(): ExecuteCommandMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecuteCommandMiddleware]
    }
    
    extension [Self <: ExecuteCommandMiddleware](x: Self) {
      
      inline def setExecuteCommand(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* command */ String, 
              /* args */ js.Array[Any], 
              /* next */ ExecuteCommandSignature, 
              ProviderResult[Any]
            ]
      ): Self = StObject.set(x, "executeCommand", value.asInstanceOf[js.Any])
      
      inline def setExecuteCommandUndefined: Self = StObject.set(x, "executeCommand", js.undefined)
    }
  }
  
  type ExecuteCommandSignature = js.ThisFunction2[/* this */ Unit, /* command */ String, /* args */ js.Array[Any], ProviderResult[Any]]
}
