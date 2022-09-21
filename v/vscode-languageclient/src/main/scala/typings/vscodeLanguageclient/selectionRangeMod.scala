package typings.vscodeLanguageclient

import typings.vscode.mod.Disposable
import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.SelectionRange
import typings.vscode.mod.SelectionRangeProvider
import typings.vscode.mod.TextDocument
import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeLanguageclient.featuresMod.FeatureClient
import typings.vscodeLanguageclient.featuresMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeOptions
import typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionRangeMod {
  
  @JSImport("vscode-languageclient/lib/common/selectionRange", "SelectionRangeFeature")
  @js.native
  open class SelectionRangeFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | SelectionRangeOptions, 
          SelectionRangeRegistrationOptions, 
          SelectionRangeProvider, 
          SelectionRangeProviderMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[SelectionRangeProviderMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: SelectionRangeRegistrationOptions): js.Tuple2[Disposable, SelectionRangeProvider] = js.native
    
    /* private */ var registerProvider: Any = js.native
  }
  
  type ProvideSelectionRangeSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* positions */ js.Array[Position], 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[SelectionRange]]
  ]
  
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
      ] = js.undefined
  }
  object SelectionRangeProviderMiddleware {
    
    inline def apply(): SelectionRangeProviderMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionRangeProviderMiddleware]
    }
    
    extension [Self <: SelectionRangeProviderMiddleware](x: Self) {
      
      inline def setProvideSelectionRanges(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* positions */ js.Array[Position], 
              /* token */ CancellationToken, 
              /* next */ ProvideSelectionRangeSignature, 
              ProviderResult[js.Array[SelectionRange]]
            ]
      ): Self = StObject.set(x, "provideSelectionRanges", value.asInstanceOf[js.Any])
      
      inline def setProvideSelectionRangesUndefined: Self = StObject.set(x, "provideSelectionRanges", js.undefined)
    }
  }
}
