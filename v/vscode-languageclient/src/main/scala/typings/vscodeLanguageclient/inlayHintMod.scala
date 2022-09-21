package typings.vscodeLanguageclient

import typings.vscode.mod.Disposable
import typings.vscode.mod.EventEmitter
import typings.vscode.mod.InlayHint
import typings.vscode.mod.InlayHintsProvider
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.Range
import typings.vscode.mod.TextDocument
import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeLanguageclient.featuresMod.FeatureClient
import typings.vscodeLanguageclient.featuresMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.protocolInlayHintMod.InlayHintOptions
import typings.vscodeLanguageserverProtocol.protocolInlayHintMod.InlayHintRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inlayHintMod {
  
  @JSImport("vscode-languageclient/lib/common/inlayHint", "InlayHintsFeature")
  @js.native
  open class InlayHintsFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | InlayHintOptions, 
          InlayHintRegistrationOptions, 
          InlayHintsProviderShape, 
          InlayHintsMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[InlayHintsMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: InlayHintRegistrationOptions): js.Tuple2[Disposable, InlayHintsProviderShape] = js.native
    
    /* private */ var registerProvider: Any = js.native
  }
  
  trait InlayHintsMiddleware extends StObject {
    
    var provideInlayHints: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* viewPort */ Range, 
          /* token */ CancellationToken, 
          /* next */ ProvideInlayHintsSignature, 
          ProviderResult[js.Array[InlayHint]]
        ]
      ] = js.undefined
    
    var resolveInlayHint: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* item */ InlayHint, 
          /* token */ CancellationToken, 
          /* next */ ResolveInlayHintSignature, 
          ProviderResult[InlayHint]
        ]
      ] = js.undefined
  }
  object InlayHintsMiddleware {
    
    inline def apply(): InlayHintsMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlayHintsMiddleware]
    }
    
    extension [Self <: InlayHintsMiddleware](x: Self) {
      
      inline def setProvideInlayHints(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* viewPort */ Range, 
              /* token */ CancellationToken, 
              /* next */ ProvideInlayHintsSignature, 
              ProviderResult[js.Array[InlayHint]]
            ]
      ): Self = StObject.set(x, "provideInlayHints", value.asInstanceOf[js.Any])
      
      inline def setProvideInlayHintsUndefined: Self = StObject.set(x, "provideInlayHints", js.undefined)
      
      inline def setResolveInlayHint(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* item */ InlayHint, 
              /* token */ CancellationToken, 
              /* next */ ResolveInlayHintSignature, 
              ProviderResult[InlayHint]
            ]
      ): Self = StObject.set(x, "resolveInlayHint", value.asInstanceOf[js.Any])
      
      inline def setResolveInlayHintUndefined: Self = StObject.set(x, "resolveInlayHint", js.undefined)
    }
  }
  
  trait InlayHintsProviderShape extends StObject {
    
    var onDidChangeInlayHints: EventEmitter[Unit]
    
    var provider: InlayHintsProvider[InlayHint]
  }
  object InlayHintsProviderShape {
    
    inline def apply(onDidChangeInlayHints: EventEmitter[Unit], provider: InlayHintsProvider[InlayHint]): InlayHintsProviderShape = {
      val __obj = js.Dynamic.literal(onDidChangeInlayHints = onDidChangeInlayHints.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlayHintsProviderShape]
    }
    
    extension [Self <: InlayHintsProviderShape](x: Self) {
      
      inline def setOnDidChangeInlayHints(value: EventEmitter[Unit]): Self = StObject.set(x, "onDidChangeInlayHints", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: InlayHintsProvider[InlayHint]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  type ProvideInlayHintsSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* viewPort */ Range, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[InlayHint]]
  ]
  
  type ResolveInlayHintSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* item */ InlayHint, 
    /* token */ CancellationToken, 
    ProviderResult[InlayHint]
  ]
}
