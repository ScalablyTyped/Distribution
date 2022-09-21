package typings.vscodeLanguageclient

import typings.vscode.mod.Disposable
import typings.vscode.mod.FoldingContext
import typings.vscode.mod.FoldingRange
import typings.vscode.mod.FoldingRangeProvider
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeLanguageclient.featuresMod.FeatureClient
import typings.vscodeLanguageclient.featuresMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeOptions
import typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foldingRangeMod {
  
  @JSImport("vscode-languageclient/lib/common/foldingRange", "FoldingRangeFeature")
  @js.native
  open class FoldingRangeFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | FoldingRangeOptions, 
          FoldingRangeRegistrationOptions, 
          FoldingRangeProvider, 
          FoldingRangeProviderMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[FoldingRangeProviderMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: FoldingRangeRegistrationOptions): js.Tuple2[Disposable, FoldingRangeProvider] = js.native
  }
  
  trait FoldingRangeProviderMiddleware extends StObject {
    
    var provideFoldingRanges: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* context */ FoldingContext, 
          /* token */ CancellationToken, 
          /* next */ ProvideFoldingRangeSignature, 
          ProviderResult[js.Array[FoldingRange]]
        ]
      ] = js.undefined
  }
  object FoldingRangeProviderMiddleware {
    
    inline def apply(): FoldingRangeProviderMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FoldingRangeProviderMiddleware]
    }
    
    extension [Self <: FoldingRangeProviderMiddleware](x: Self) {
      
      inline def setProvideFoldingRanges(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* context */ FoldingContext, 
              /* token */ CancellationToken, 
              /* next */ ProvideFoldingRangeSignature, 
              ProviderResult[js.Array[FoldingRange]]
            ]
      ): Self = StObject.set(x, "provideFoldingRanges", value.asInstanceOf[js.Any])
      
      inline def setProvideFoldingRangesUndefined: Self = StObject.set(x, "provideFoldingRanges", js.undefined)
    }
  }
  
  type ProvideFoldingRangeSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* context */ FoldingContext, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[FoldingRange]]
  ]
}
