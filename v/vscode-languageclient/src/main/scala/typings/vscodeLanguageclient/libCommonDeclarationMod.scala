package typings.vscodeLanguageclient

import typings.vscode.mod.Declaration
import typings.vscode.mod.DeclarationProvider
import typings.vscode.mod.Disposable
import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typings.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdeclarationMod.DeclarationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdeclarationMod.DeclarationRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonDeclarationMod {
  
  @JSImport("vscode-languageclient/lib/common/declaration", "DeclarationFeature")
  @js.native
  open class DeclarationFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | DeclarationOptions, 
          DeclarationRegistrationOptions, 
          DeclarationProvider, 
          DeclarationMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[DeclarationMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: DeclarationRegistrationOptions): js.Tuple2[Disposable, DeclarationProvider] = js.native
    
    /* private */ var registerProvider: Any = js.native
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
