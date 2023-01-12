package typings.vscodeLanguageclient

import typings.vscode.mod.CancellationToken
import typings.vscode.mod.Disposable
import typings.vscode.mod.DocumentHighlight
import typings.vscode.mod.DocumentHighlightProvider
import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typings.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentHighlightOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentHighlightRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonDocumentHighlightMod {
  
  @JSImport("vscode-languageclient/lib/common/documentHighlight", "DocumentHighlightFeature")
  @js.native
  open class DocumentHighlightFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | DocumentHighlightOptions, 
          DocumentHighlightRegistrationOptions, 
          DocumentHighlightProvider, 
          DocumentHighlightMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[DocumentHighlightMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: TextDocumentRegistrationOptions): js.Tuple2[Disposable, DocumentHighlightProvider] = js.native
  }
  
  trait DocumentHighlightMiddleware extends StObject {
    
    var provideDocumentHighlights: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* token */ CancellationToken, 
          /* next */ ProvideDocumentHighlightsSignature, 
          ProviderResult[js.Array[DocumentHighlight]]
        ]
      ] = js.undefined
  }
  object DocumentHighlightMiddleware {
    
    inline def apply(): DocumentHighlightMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentHighlightMiddleware]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentHighlightMiddleware] (val x: Self) extends AnyVal {
      
      inline def setProvideDocumentHighlights(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* token */ CancellationToken, 
              /* next */ ProvideDocumentHighlightsSignature, 
              ProviderResult[js.Array[DocumentHighlight]]
            ]
      ): Self = StObject.set(x, "provideDocumentHighlights", value.asInstanceOf[js.Any])
      
      inline def setProvideDocumentHighlightsUndefined: Self = StObject.set(x, "provideDocumentHighlights", js.undefined)
    }
  }
  
  type ProvideDocumentHighlightsSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[DocumentHighlight]]
  ]
}
