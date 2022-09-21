package typings.vscodeLanguageclient

import typings.vscode.mod.CancellationToken
import typings.vscode.mod.Disposable
import typings.vscode.mod.LinkedEditingRangeProvider
import typings.vscode.mod.LinkedEditingRanges
import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscodeLanguageclient.featuresMod.FeatureClient
import typings.vscodeLanguageclient.featuresMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.protocolLinkedEditingRangeMod.LinkedEditingRangeOptions
import typings.vscodeLanguageserverProtocol.protocolLinkedEditingRangeMod.LinkedEditingRangeRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkedEditingRangeMod {
  
  @JSImport("vscode-languageclient/lib/common/linkedEditingRange", "LinkedEditingFeature")
  @js.native
  open class LinkedEditingFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | LinkedEditingRangeOptions, 
          LinkedEditingRangeRegistrationOptions, 
          LinkedEditingRangeProvider, 
          LinkedEditingRangeMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[LinkedEditingRangeMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: LinkedEditingRangeRegistrationOptions): js.Tuple2[Disposable, LinkedEditingRangeProvider] = js.native
    
    /* private */ var registerProvider: Any = js.native
  }
  
  trait LinkedEditingRangeMiddleware extends StObject {
    
    var provideLinkedEditingRange: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* token */ CancellationToken, 
          /* next */ ProvideLinkedEditingRangeSignature, 
          ProviderResult[LinkedEditingRanges]
        ]
      ] = js.undefined
  }
  object LinkedEditingRangeMiddleware {
    
    inline def apply(): LinkedEditingRangeMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkedEditingRangeMiddleware]
    }
    
    extension [Self <: LinkedEditingRangeMiddleware](x: Self) {
      
      inline def setProvideLinkedEditingRange(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* token */ CancellationToken, 
              /* next */ ProvideLinkedEditingRangeSignature, 
              ProviderResult[LinkedEditingRanges]
            ]
      ): Self = StObject.set(x, "provideLinkedEditingRange", value.asInstanceOf[js.Any])
      
      inline def setProvideLinkedEditingRangeUndefined: Self = StObject.set(x, "provideLinkedEditingRange", js.undefined)
    }
  }
  
  type ProvideLinkedEditingRangeSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[LinkedEditingRanges]
  ]
}
