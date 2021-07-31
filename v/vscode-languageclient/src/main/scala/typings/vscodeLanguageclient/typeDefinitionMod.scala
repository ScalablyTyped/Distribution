package typings.vscodeLanguageclient

import typings.vscode.mod.Definition
import typings.vscode.mod.DefinitionLink
import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscode.mod.TypeDefinitionProvider
import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeLanguageclient.clientMod.BaseLanguageClient
import typings.vscodeLanguageclient.clientMod.TextDocumentFeature
import typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionOptions
import typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeDefinitionMod {
  
  @JSImport("vscode-languageclient/lib/typeDefinition", "TypeDefinitionFeature")
  @js.native
  class TypeDefinitionFeature protected () extends TextDocumentFeature[
          Boolean | TypeDefinitionOptions, 
          TypeDefinitionRegistrationOptions, 
          TypeDefinitionProvider
        ] {
    def this(client: BaseLanguageClient) = this()
  }
  
  type ProvideTypeDefinitionSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Definition | js.Array[DefinitionLink]]
  ]
  
  trait TypeDefinitionMiddleware extends StObject {
    
    var provideTypeDefinition: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* token */ CancellationToken, 
          /* next */ ProvideTypeDefinitionSignature, 
          ProviderResult[Definition | js.Array[DefinitionLink]]
        ]
      ] = js.undefined
  }
  object TypeDefinitionMiddleware {
    
    @scala.inline
    def apply(): TypeDefinitionMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeDefinitionMiddleware]
    }
    
    @scala.inline
    implicit class TypeDefinitionMiddlewareMutableBuilder[Self <: TypeDefinitionMiddleware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvideTypeDefinition(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* token */ CancellationToken, 
              /* next */ ProvideTypeDefinitionSignature, 
              ProviderResult[Definition | js.Array[DefinitionLink]]
            ]
      ): Self = StObject.set(x, "provideTypeDefinition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvideTypeDefinitionUndefined: Self = StObject.set(x, "provideTypeDefinition", js.undefined)
    }
  }
}
