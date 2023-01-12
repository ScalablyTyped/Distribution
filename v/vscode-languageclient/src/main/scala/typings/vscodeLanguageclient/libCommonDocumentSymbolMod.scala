package typings.vscodeLanguageclient

import typings.vscode.mod.CancellationToken
import typings.vscode.mod.Disposable
import typings.vscode.mod.DocumentSymbol
import typings.vscode.mod.DocumentSymbolProvider
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.SymbolInformation
import typings.vscode.mod.TextDocument
import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typings.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSymbolOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSymbolRegistrationOptions
import typings.vscodeLanguageserverTypes.mod.SymbolKind
import typings.vscodeLanguageserverTypes.mod.SymbolTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonDocumentSymbolMod {
  
  @JSImport("vscode-languageclient/lib/common/documentSymbol", "DocumentSymbolFeature")
  @js.native
  open class DocumentSymbolFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | DocumentSymbolOptions, 
          DocumentSymbolRegistrationOptions, 
          DocumentSymbolProvider, 
          DocumentSymbolMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[DocumentSymbolMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: DocumentSymbolRegistrationOptions): js.Tuple2[Disposable, DocumentSymbolProvider] = js.native
  }
  
  @JSImport("vscode-languageclient/lib/common/documentSymbol", "SupportedSymbolKinds")
  @js.native
  val SupportedSymbolKinds: js.Array[SymbolKind] = js.native
  
  @JSImport("vscode-languageclient/lib/common/documentSymbol", "SupportedSymbolTags")
  @js.native
  val SupportedSymbolTags: js.Array[SymbolTag] = js.native
  
  trait DocumentSymbolMiddleware extends StObject {
    
    var provideDocumentSymbols: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* token */ CancellationToken, 
          /* next */ ProvideDocumentSymbolsSignature, 
          ProviderResult[js.Array[DocumentSymbol | SymbolInformation]]
        ]
      ] = js.undefined
  }
  object DocumentSymbolMiddleware {
    
    inline def apply(): DocumentSymbolMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentSymbolMiddleware]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentSymbolMiddleware] (val x: Self) extends AnyVal {
      
      inline def setProvideDocumentSymbols(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* token */ CancellationToken, 
              /* next */ ProvideDocumentSymbolsSignature, 
              ProviderResult[js.Array[DocumentSymbol | SymbolInformation]]
            ]
      ): Self = StObject.set(x, "provideDocumentSymbols", value.asInstanceOf[js.Any])
      
      inline def setProvideDocumentSymbolsUndefined: Self = StObject.set(x, "provideDocumentSymbols", js.undefined)
    }
  }
  
  type ProvideDocumentSymbolsSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[DocumentSymbol | SymbolInformation]]
  ]
}
