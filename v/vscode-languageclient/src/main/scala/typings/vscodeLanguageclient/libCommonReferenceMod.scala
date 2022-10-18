package typings.vscodeLanguageclient

import typings.vscode.mod.CancellationToken
import typings.vscode.mod.Disposable
import typings.vscode.mod.Location
import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.ReferenceProvider
import typings.vscode.mod.TextDocument
import typings.vscodeLanguageclient.anon.IncludeDeclaration
import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typings.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ReferenceOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ReferenceRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonReferenceMod {
  
  @JSImport("vscode-languageclient/lib/common/reference", "ReferencesFeature")
  @js.native
  open class ReferencesFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | ReferenceOptions, 
          ReferenceRegistrationOptions, 
          ReferenceProvider, 
          ReferencesMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[ReferencesMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: TextDocumentRegistrationOptions): js.Tuple2[Disposable, ReferenceProvider] = js.native
    
    /* private */ var registerProvider: Any = js.native
  }
  
  type ProvideReferencesSignature = js.ThisFunction4[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* options */ IncludeDeclaration, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[Location]]
  ]
  
  trait ReferencesMiddleware extends StObject {
    
    var provideReferences: js.UndefOr[
        js.ThisFunction5[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* options */ IncludeDeclaration, 
          /* token */ CancellationToken, 
          /* next */ ProvideReferencesSignature, 
          ProviderResult[js.Array[Location]]
        ]
      ] = js.undefined
  }
  object ReferencesMiddleware {
    
    inline def apply(): ReferencesMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReferencesMiddleware]
    }
    
    extension [Self <: ReferencesMiddleware](x: Self) {
      
      inline def setProvideReferences(
        value: js.ThisFunction5[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* options */ IncludeDeclaration, 
              /* token */ CancellationToken, 
              /* next */ ProvideReferencesSignature, 
              ProviderResult[js.Array[Location]]
            ]
      ): Self = StObject.set(x, "provideReferences", value.asInstanceOf[js.Any])
      
      inline def setProvideReferencesUndefined: Self = StObject.set(x, "provideReferences", js.undefined)
    }
  }
}
