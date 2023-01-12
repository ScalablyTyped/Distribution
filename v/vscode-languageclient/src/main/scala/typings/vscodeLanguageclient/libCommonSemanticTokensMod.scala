package typings.vscodeLanguageclient

import typings.vscode.mod.CancellationToken
import typings.vscode.mod.Disposable
import typings.vscode.mod.DocumentRangeSemanticTokensProvider
import typings.vscode.mod.DocumentSemanticTokensProvider
import typings.vscode.mod.EventEmitter
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.Range
import typings.vscode.mod.SemanticTokens
import typings.vscode.mod.SemanticTokensEdits
import typings.vscode.mod.TextDocument
import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typings.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonSemanticTokensMod {
  
  @JSImport("vscode-languageclient/lib/common/semanticTokens", "SemanticTokensFeature")
  @js.native
  open class SemanticTokensFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | SemanticTokensOptions, 
          SemanticTokensRegistrationOptions, 
          SemanticTokensProviderShape, 
          SemanticTokensMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[SemanticTokensMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: SemanticTokensRegistrationOptions): js.Tuple2[Disposable, SemanticTokensProviderShape] = js.native
  }
  
  type DocumentRangeSemanticTokensSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* range */ Range, 
    /* token */ CancellationToken, 
    ProviderResult[SemanticTokens]
  ]
  
  type DocumentSemanticsTokensEditsSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* previousResultId */ String, 
    /* token */ CancellationToken, 
    ProviderResult[SemanticTokensEdits | SemanticTokens]
  ]
  
  type DocumentSemanticsTokensSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* token */ CancellationToken, 
    ProviderResult[SemanticTokens]
  ]
  
  trait SemanticTokensMiddleware extends StObject {
    
    var provideDocumentRangeSemanticTokens: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* range */ Range, 
          /* token */ CancellationToken, 
          /* next */ DocumentRangeSemanticTokensSignature, 
          ProviderResult[SemanticTokens]
        ]
      ] = js.undefined
    
    var provideDocumentSemanticTokens: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* token */ CancellationToken, 
          /* next */ DocumentSemanticsTokensSignature, 
          ProviderResult[SemanticTokens]
        ]
      ] = js.undefined
    
    var provideDocumentSemanticTokensEdits: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* previousResultId */ String, 
          /* token */ CancellationToken, 
          /* next */ DocumentSemanticsTokensEditsSignature, 
          ProviderResult[SemanticTokensEdits | SemanticTokens]
        ]
      ] = js.undefined
  }
  object SemanticTokensMiddleware {
    
    inline def apply(): SemanticTokensMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SemanticTokensMiddleware]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SemanticTokensMiddleware] (val x: Self) extends AnyVal {
      
      inline def setProvideDocumentRangeSemanticTokens(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* range */ Range, 
              /* token */ CancellationToken, 
              /* next */ DocumentRangeSemanticTokensSignature, 
              ProviderResult[SemanticTokens]
            ]
      ): Self = StObject.set(x, "provideDocumentRangeSemanticTokens", value.asInstanceOf[js.Any])
      
      inline def setProvideDocumentRangeSemanticTokensUndefined: Self = StObject.set(x, "provideDocumentRangeSemanticTokens", js.undefined)
      
      inline def setProvideDocumentSemanticTokens(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* token */ CancellationToken, 
              /* next */ DocumentSemanticsTokensSignature, 
              ProviderResult[SemanticTokens]
            ]
      ): Self = StObject.set(x, "provideDocumentSemanticTokens", value.asInstanceOf[js.Any])
      
      inline def setProvideDocumentSemanticTokensEdits(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* previousResultId */ String, 
              /* token */ CancellationToken, 
              /* next */ DocumentSemanticsTokensEditsSignature, 
              ProviderResult[SemanticTokensEdits | SemanticTokens]
            ]
      ): Self = StObject.set(x, "provideDocumentSemanticTokensEdits", value.asInstanceOf[js.Any])
      
      inline def setProvideDocumentSemanticTokensEditsUndefined: Self = StObject.set(x, "provideDocumentSemanticTokensEdits", js.undefined)
      
      inline def setProvideDocumentSemanticTokensUndefined: Self = StObject.set(x, "provideDocumentSemanticTokens", js.undefined)
    }
  }
  
  trait SemanticTokensProviderShape extends StObject {
    
    var full: js.UndefOr[DocumentSemanticTokensProvider] = js.undefined
    
    var onDidChangeSemanticTokensEmitter: EventEmitter[Unit]
    
    var range: js.UndefOr[DocumentRangeSemanticTokensProvider] = js.undefined
  }
  object SemanticTokensProviderShape {
    
    inline def apply(onDidChangeSemanticTokensEmitter: EventEmitter[Unit]): SemanticTokensProviderShape = {
      val __obj = js.Dynamic.literal(onDidChangeSemanticTokensEmitter = onDidChangeSemanticTokensEmitter.asInstanceOf[js.Any])
      __obj.asInstanceOf[SemanticTokensProviderShape]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SemanticTokensProviderShape] (val x: Self) extends AnyVal {
      
      inline def setFull(value: DocumentSemanticTokensProvider): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      inline def setOnDidChangeSemanticTokensEmitter(value: EventEmitter[Unit]): Self = StObject.set(x, "onDidChangeSemanticTokensEmitter", value.asInstanceOf[js.Any])
      
      inline def setRange(value: DocumentRangeSemanticTokensProvider): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    }
  }
}
