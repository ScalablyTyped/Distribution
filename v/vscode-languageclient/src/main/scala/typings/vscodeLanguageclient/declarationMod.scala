package typings.vscodeLanguageclient

import typings.vscode.mod.Declaration
import typings.vscode.mod.DeclarationProvider
import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeLanguageclient.clientMod.BaseLanguageClient
import typings.vscodeLanguageclient.clientMod.TextDocumentFeature
import typings.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationOptions
import typings.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationMod {
  
  @JSImport("vscode-languageclient/lib/declaration", "DeclarationFeature")
  @js.native
  class DeclarationFeature protected () extends TextDocumentFeature[Boolean | DeclarationOptions, DeclarationRegistrationOptions, DeclarationProvider] {
    def this(client: BaseLanguageClient) = this()
  }
  
  trait DeclarationMiddleware extends StObject {
    
    var provideDeclaration: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* token */ CancellationToken, 
          /* next */ ProvideDeclarationSignature, 
          ProviderResult[Declaration]
        ]
      ] = js.undefined
  }
  object DeclarationMiddleware {
    
    inline def apply(): DeclarationMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeclarationMiddleware]
    }
    
    extension [Self <: DeclarationMiddleware](x: Self) {
      
      inline def setProvideDeclaration(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* token */ CancellationToken, 
              /* next */ ProvideDeclarationSignature, 
              ProviderResult[Declaration]
            ]
      ): Self = StObject.set(x, "provideDeclaration", value.asInstanceOf[js.Any])
      
      inline def setProvideDeclarationUndefined: Self = StObject.set(x, "provideDeclaration", js.undefined)
    }
  }
  
  type ProvideDeclarationSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Declaration]
  ]
}
