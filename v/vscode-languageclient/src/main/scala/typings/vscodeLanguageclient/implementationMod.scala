package typings.vscodeLanguageclient

import typings.vscode.mod.Definition
import typings.vscode.mod.DefinitionLink
import typings.vscode.mod.ImplementationProvider
import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeLanguageclient.clientMod.BaseLanguageClient
import typings.vscodeLanguageclient.clientMod.TextDocumentFeature
import typings.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationOptions
import typings.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implementationMod {
  
  @JSImport("vscode-languageclient/lib/implementation", "ImplementationFeature")
  @js.native
  class ImplementationFeature protected () extends TextDocumentFeature[
          Boolean | ImplementationOptions, 
          ImplementationRegistrationOptions, 
          ImplementationProvider
        ] {
    def this(client: BaseLanguageClient) = this()
  }
  
  trait ImplementationMiddleware extends StObject {
    
    var provideImplementation: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* token */ CancellationToken, 
          /* next */ ProvideImplementationSignature, 
          ProviderResult[Definition | js.Array[DefinitionLink]]
        ]
      ] = js.undefined
  }
  object ImplementationMiddleware {
    
    inline def apply(): ImplementationMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImplementationMiddleware]
    }
    
    extension [Self <: ImplementationMiddleware](x: Self) {
      
      inline def setProvideImplementation(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* token */ CancellationToken, 
              /* next */ ProvideImplementationSignature, 
              ProviderResult[Definition | js.Array[DefinitionLink]]
            ]
      ): Self = StObject.set(x, "provideImplementation", value.asInstanceOf[js.Any])
      
      inline def setProvideImplementationUndefined: Self = StObject.set(x, "provideImplementation", js.undefined)
    }
  }
  
  type ProvideImplementationSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Definition | js.Array[DefinitionLink]]
  ]
}
