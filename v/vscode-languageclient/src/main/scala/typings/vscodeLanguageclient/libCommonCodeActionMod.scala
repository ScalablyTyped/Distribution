package typings.vscodeLanguageclient

import typings.vscode.mod.CodeAction
import typings.vscode.mod.CodeActionContext
import typings.vscode.mod.CodeActionProvider
import typings.vscode.mod.Command
import typings.vscode.mod.Disposable
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.Range
import typings.vscode.mod.TextDocument
import typings.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typings.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeActionOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeActionRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonCodeActionMod {
  
  @JSImport("vscode-languageclient/lib/common/codeAction", "CodeActionFeature")
  @js.native
  open class CodeActionFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | CodeActionOptions, 
          CodeActionRegistrationOptions, 
          CodeActionProvider[CodeAction], 
          CodeActionMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[CodeActionMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: CodeActionRegistrationOptions): js.Tuple2[Disposable, CodeActionProvider[CodeAction]] = js.native
  }
  
  trait CodeActionMiddleware extends StObject {
    
    var provideCodeActions: js.UndefOr[
        js.ThisFunction5[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* range */ Range, 
          /* context */ CodeActionContext, 
          /* token */ CancellationToken, 
          /* next */ ProvideCodeActionsSignature, 
          ProviderResult[js.Array[Command | CodeAction]]
        ]
      ] = js.undefined
    
    var resolveCodeAction: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* item */ CodeAction, 
          /* token */ CancellationToken, 
          /* next */ ResolveCodeActionSignature, 
          ProviderResult[CodeAction]
        ]
      ] = js.undefined
  }
  object CodeActionMiddleware {
    
    inline def apply(): CodeActionMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodeActionMiddleware]
    }
    
    extension [Self <: CodeActionMiddleware](x: Self) {
      
      inline def setProvideCodeActions(
        value: js.ThisFunction5[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* range */ Range, 
              /* context */ CodeActionContext, 
              /* token */ CancellationToken, 
              /* next */ ProvideCodeActionsSignature, 
              ProviderResult[js.Array[Command | CodeAction]]
            ]
      ): Self = StObject.set(x, "provideCodeActions", value.asInstanceOf[js.Any])
      
      inline def setProvideCodeActionsUndefined: Self = StObject.set(x, "provideCodeActions", js.undefined)
      
      inline def setResolveCodeAction(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* item */ CodeAction, 
              /* token */ CancellationToken, 
              /* next */ ResolveCodeActionSignature, 
              ProviderResult[CodeAction]
            ]
      ): Self = StObject.set(x, "resolveCodeAction", value.asInstanceOf[js.Any])
      
      inline def setResolveCodeActionUndefined: Self = StObject.set(x, "resolveCodeAction", js.undefined)
    }
  }
  
  type ProvideCodeActionsSignature = js.ThisFunction4[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* range */ Range, 
    /* context */ CodeActionContext, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[Command | CodeAction]]
  ]
  
  type ResolveCodeActionSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* item */ CodeAction, 
    /* token */ CancellationToken, 
    ProviderResult[CodeAction]
  ]
}
