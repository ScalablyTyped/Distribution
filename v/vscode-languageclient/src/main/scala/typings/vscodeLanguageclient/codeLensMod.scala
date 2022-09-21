package typings.vscodeLanguageclient

import typings.vscode.mod.CodeLens
import typings.vscode.mod.CodeLensProvider
import typings.vscode.mod.Disposable
import typings.vscode.mod.EventEmitter
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeLanguageclient.featuresMod.FeatureClient
import typings.vscodeLanguageclient.featuresMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.protocolMod.CodeLensOptions
import typings.vscodeLanguageserverProtocol.protocolMod.CodeLensRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeLensMod {
  
  @JSImport("vscode-languageclient/lib/common/codeLens", "CodeLensFeature")
  @js.native
  open class CodeLensFeature protected ()
    extends TextDocumentLanguageFeature[
          CodeLensOptions, 
          CodeLensRegistrationOptions, 
          CodeLensProviderShape, 
          CodeLensMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[CodeLensMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: CodeLensRegistrationOptions): js.Tuple2[Disposable, CodeLensProviderShape] = js.native
  }
  
  trait CodeLensMiddleware extends StObject {
    
    var provideCodeLenses: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* token */ CancellationToken, 
          /* next */ ProvideCodeLensesSignature, 
          ProviderResult[js.Array[CodeLens]]
        ]
      ] = js.undefined
    
    var resolveCodeLens: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* codeLens */ CodeLens, 
          /* token */ CancellationToken, 
          /* next */ ResolveCodeLensSignature, 
          ProviderResult[CodeLens]
        ]
      ] = js.undefined
  }
  object CodeLensMiddleware {
    
    inline def apply(): CodeLensMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodeLensMiddleware]
    }
    
    extension [Self <: CodeLensMiddleware](x: Self) {
      
      inline def setProvideCodeLenses(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* token */ CancellationToken, 
              /* next */ ProvideCodeLensesSignature, 
              ProviderResult[js.Array[CodeLens]]
            ]
      ): Self = StObject.set(x, "provideCodeLenses", value.asInstanceOf[js.Any])
      
      inline def setProvideCodeLensesUndefined: Self = StObject.set(x, "provideCodeLenses", js.undefined)
      
      inline def setResolveCodeLens(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* codeLens */ CodeLens, 
              /* token */ CancellationToken, 
              /* next */ ResolveCodeLensSignature, 
              ProviderResult[CodeLens]
            ]
      ): Self = StObject.set(x, "resolveCodeLens", value.asInstanceOf[js.Any])
      
      inline def setResolveCodeLensUndefined: Self = StObject.set(x, "resolveCodeLens", js.undefined)
    }
  }
  
  trait CodeLensProviderShape extends StObject {
    
    var onDidChangeCodeLensEmitter: EventEmitter[Unit]
    
    var provider: js.UndefOr[CodeLensProvider[CodeLens]] = js.undefined
  }
  object CodeLensProviderShape {
    
    inline def apply(onDidChangeCodeLensEmitter: EventEmitter[Unit]): CodeLensProviderShape = {
      val __obj = js.Dynamic.literal(onDidChangeCodeLensEmitter = onDidChangeCodeLensEmitter.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeLensProviderShape]
    }
    
    extension [Self <: CodeLensProviderShape](x: Self) {
      
      inline def setOnDidChangeCodeLensEmitter(value: EventEmitter[Unit]): Self = StObject.set(x, "onDidChangeCodeLensEmitter", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: CodeLensProvider[CodeLens]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    }
  }
  
  type ProvideCodeLensesSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[CodeLens]]
  ]
  
  type ResolveCodeLensSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* codeLens */ CodeLens, 
    /* token */ CancellationToken, 
    ProviderResult[CodeLens]
  ]
}
