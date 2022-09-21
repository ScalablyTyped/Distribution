package typings.vscodeLanguageclient

import typings.vscode.mod.CancellationToken
import typings.vscode.mod.Disposable
import typings.vscode.mod.Hover
import typings.vscode.mod.HoverProvider
import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscodeLanguageclient.featuresMod.FeatureClient
import typings.vscodeLanguageclient.featuresMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.protocolMod.HoverOptions
import typings.vscodeLanguageserverProtocol.protocolMod.HoverRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hoverMod {
  
  @JSImport("vscode-languageclient/lib/common/hover", "HoverFeature")
  @js.native
  open class HoverFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | HoverOptions, 
          HoverRegistrationOptions, 
          HoverProvider, 
          HoverMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[HoverMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: HoverRegistrationOptions): js.Tuple2[Disposable, HoverProvider] = js.native
    
    /* private */ var registerProvider: Any = js.native
  }
  
  trait HoverMiddleware extends StObject {
    
    var provideHover: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* token */ CancellationToken, 
          /* next */ ProvideHoverSignature, 
          ProviderResult[Hover]
        ]
      ] = js.undefined
  }
  object HoverMiddleware {
    
    inline def apply(): HoverMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoverMiddleware]
    }
    
    extension [Self <: HoverMiddleware](x: Self) {
      
      inline def setProvideHover(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* token */ CancellationToken, 
              /* next */ ProvideHoverSignature, 
              ProviderResult[Hover]
            ]
      ): Self = StObject.set(x, "provideHover", value.asInstanceOf[js.Any])
      
      inline def setProvideHoverUndefined: Self = StObject.set(x, "provideHover", js.undefined)
    }
  }
  
  type ProvideHoverSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Hover]
  ]
}
