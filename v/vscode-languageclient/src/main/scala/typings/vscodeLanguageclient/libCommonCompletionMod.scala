package typings.vscodeLanguageclient

import typings.vscode.mod.CancellationToken
import typings.vscode.mod.CompletionContext
import typings.vscode.mod.CompletionItem
import typings.vscode.mod.CompletionItemProvider
import typings.vscode.mod.CompletionList
import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typings.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.CompletionOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.CompletionRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonCompletionMod {
  
  @JSImport("vscode-languageclient/lib/common/completion", "CompletionItemFeature")
  @js.native
  open class CompletionItemFeature protected ()
    extends TextDocumentLanguageFeature[
          CompletionOptions, 
          CompletionRegistrationOptions, 
          CompletionItemProvider[CompletionItem], 
          CompletionMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[CompletionMiddleware, js.Object]) = this()
    
    /* private */ var labelDetailsSupport: Any = js.native
  }
  
  trait CompletionMiddleware extends StObject {
    
    var provideCompletionItem: js.UndefOr[
        js.ThisFunction5[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* context */ CompletionContext, 
          /* token */ CancellationToken, 
          /* next */ ProvideCompletionItemsSignature, 
          ProviderResult[js.Array[CompletionItem] | CompletionList[CompletionItem]]
        ]
      ] = js.undefined
    
    var resolveCompletionItem: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* item */ CompletionItem, 
          /* token */ CancellationToken, 
          /* next */ ResolveCompletionItemSignature, 
          ProviderResult[CompletionItem]
        ]
      ] = js.undefined
  }
  object CompletionMiddleware {
    
    inline def apply(): CompletionMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompletionMiddleware]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompletionMiddleware] (val x: Self) extends AnyVal {
      
      inline def setProvideCompletionItem(
        value: js.ThisFunction5[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* context */ CompletionContext, 
              /* token */ CancellationToken, 
              /* next */ ProvideCompletionItemsSignature, 
              ProviderResult[js.Array[CompletionItem] | CompletionList[CompletionItem]]
            ]
      ): Self = StObject.set(x, "provideCompletionItem", value.asInstanceOf[js.Any])
      
      inline def setProvideCompletionItemUndefined: Self = StObject.set(x, "provideCompletionItem", js.undefined)
      
      inline def setResolveCompletionItem(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* item */ CompletionItem, 
              /* token */ CancellationToken, 
              /* next */ ResolveCompletionItemSignature, 
              ProviderResult[CompletionItem]
            ]
      ): Self = StObject.set(x, "resolveCompletionItem", value.asInstanceOf[js.Any])
      
      inline def setResolveCompletionItemUndefined: Self = StObject.set(x, "resolveCompletionItem", js.undefined)
    }
  }
  
  type ProvideCompletionItemsSignature = js.ThisFunction4[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* context */ CompletionContext, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[CompletionItem] | CompletionList[CompletionItem]]
  ]
  
  type ResolveCompletionItemSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* item */ CompletionItem, 
    /* token */ CancellationToken, 
    ProviderResult[CompletionItem]
  ]
}
