package typings.vscodeLanguageclient

import typings.vscode.mod.Disposable
import typings.vscode.mod.FoldingContext
import typings.vscode.mod.FoldingRange
import typings.vscode.mod.FoldingRangeProvider
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typings.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfoldingRangeMod.FoldingRangeOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfoldingRangeMod.FoldingRangeRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonFoldingRangeMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FoldingRangeProviderMiddleware] (val x: Self) extends AnyVal {
      
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
