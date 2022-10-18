package typings.vscodeLanguageclient

import typings.vscode.mod.Definition
import typings.vscode.mod.DefinitionLink
import typings.vscode.mod.Disposable
import typings.vscode.mod.ImplementationProvider
import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typings.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotimplementationMod.ImplementationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotimplementationMod.ImplementationRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonImplementationMod {
  
  @JSImport("vscode-languageclient/lib/common/implementation", "ImplementationFeature")
  @js.native
  open class ImplementationFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | ImplementationOptions, 
          ImplementationRegistrationOptions, 
          ImplementationProvider, 
          ImplementationMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[ImplementationMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: ImplementationRegistrationOptions): js.Tuple2[Disposable, ImplementationProvider] = js.native
    
    /* private */ var registerProvider: Any = js.native
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
