package typings.vscodeLanguageclient

import typings.vscode.mod.CancellationToken
import typings.vscode.mod.Disposable
import typings.vscode.mod.DocumentLink
import typings.vscode.mod.DocumentLinkProvider
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typings.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentLinkOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentLinkRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonDocumentLinkMod {
  
  @JSImport("vscode-languageclient/lib/common/documentLink", "DocumentLinkFeature")
  @js.native
  open class DocumentLinkFeature protected ()
    extends TextDocumentLanguageFeature[
          DocumentLinkOptions, 
          DocumentLinkRegistrationOptions, 
          DocumentLinkProvider[DocumentLink], 
          DocumentLinkMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[DocumentLinkMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: DocumentLinkRegistrationOptions): js.Tuple2[Disposable, DocumentLinkProvider[DocumentLink]] = js.native
  }
  
  trait DocumentLinkMiddleware extends StObject {
    
    var provideDocumentLinks: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* token */ CancellationToken, 
          /* next */ ProvideDocumentLinksSignature, 
          ProviderResult[js.Array[DocumentLink]]
        ]
      ] = js.undefined
    
    var resolveDocumentLink: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* link */ DocumentLink, 
          /* token */ CancellationToken, 
          /* next */ ResolveDocumentLinkSignature, 
          ProviderResult[DocumentLink]
        ]
      ] = js.undefined
  }
  object DocumentLinkMiddleware {
    
    inline def apply(): DocumentLinkMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentLinkMiddleware]
    }
    
    extension [Self <: DocumentLinkMiddleware](x: Self) {
      
      inline def setProvideDocumentLinks(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* token */ CancellationToken, 
              /* next */ ProvideDocumentLinksSignature, 
              ProviderResult[js.Array[DocumentLink]]
            ]
      ): Self = StObject.set(x, "provideDocumentLinks", value.asInstanceOf[js.Any])
      
      inline def setProvideDocumentLinksUndefined: Self = StObject.set(x, "provideDocumentLinks", js.undefined)
      
      inline def setResolveDocumentLink(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* link */ DocumentLink, 
              /* token */ CancellationToken, 
              /* next */ ResolveDocumentLinkSignature, 
              ProviderResult[DocumentLink]
            ]
      ): Self = StObject.set(x, "resolveDocumentLink", value.asInstanceOf[js.Any])
      
      inline def setResolveDocumentLinkUndefined: Self = StObject.set(x, "resolveDocumentLink", js.undefined)
    }
  }
  
  type ProvideDocumentLinksSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[DocumentLink]]
  ]
  
  type ResolveDocumentLinkSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* link */ DocumentLink, 
    /* token */ CancellationToken, 
    ProviderResult[DocumentLink]
  ]
}
