package typings.vscodeLanguageclient

import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.SelectionRange
import typings.vscode.mod.SelectionRangeProvider
import typings.vscode.mod.TextDocument
import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeLanguageclient.clientMod.BaseLanguageClient
import typings.vscodeLanguageclient.clientMod.TextDocumentFeature
import typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeOptions
import typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionRangeMod {
  
  @JSImport("vscode-languageclient/lib/selectionRange", "SelectionRangeFeature")
  @js.native
  class SelectionRangeFeature protected () extends TextDocumentFeature[
          Boolean | SelectionRangeOptions, 
          SelectionRangeRegistrationOptions, 
          SelectionRangeProvider
        ] {
    def this(client: BaseLanguageClient) = this()
  }
  
  type ProvideSelectionRangeSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* positions */ js.Array[Position], 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[SelectionRange]]
  ]
  
  @js.native
  trait SelectionRangeProviderMiddleware extends StObject {
    
    var provideSelectionRanges: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* positions */ js.Array[Position], 
          /* token */ CancellationToken, 
          /* next */ ProvideSelectionRangeSignature, 
          ProviderResult[js.Array[SelectionRange]]
        ]
      ] = js.native
  }
  object SelectionRangeProviderMiddleware {
    
    @scala.inline
    def apply(): SelectionRangeProviderMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionRangeProviderMiddleware]
    }
    
    @scala.inline
    implicit class SelectionRangeProviderMiddlewareMutableBuilder[Self <: SelectionRangeProviderMiddleware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvideSelectionRanges(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* positions */ js.Array[Position], 
              /* token */ CancellationToken, 
              /* next */ ProvideSelectionRangeSignature, 
              ProviderResult[js.Array[SelectionRange]]
            ]
      ): Self = StObject.set(x, "provideSelectionRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvideSelectionRangesUndefined: Self = StObject.set(x, "provideSelectionRanges", js.undefined)
    }
  }
}
