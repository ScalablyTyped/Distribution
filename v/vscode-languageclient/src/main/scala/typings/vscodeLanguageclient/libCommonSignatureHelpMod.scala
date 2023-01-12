package typings.vscodeLanguageclient

import typings.vscode.mod.CancellationToken
import typings.vscode.mod.Disposable
import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.SignatureHelp
import typings.vscode.mod.SignatureHelpContext
import typings.vscode.mod.SignatureHelpProvider
import typings.vscode.mod.TextDocument
import typings.vscodeLanguageclient.libCommonFeaturesMod.DocumentSelectorOptions
import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typings.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.SignatureHelpOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.SignatureHelpRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonSignatureHelpMod {
  
  @JSImport("vscode-languageclient/lib/common/signatureHelp", "SignatureHelpFeature")
  @js.native
  open class SignatureHelpFeature protected ()
    extends TextDocumentLanguageFeature[
          SignatureHelpOptions, 
          SignatureHelpRegistrationOptions, 
          SignatureHelpProvider, 
          SignatureHelpMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[SignatureHelpMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: SignatureHelpRegistrationOptions & DocumentSelectorOptions): js.Tuple2[Disposable, SignatureHelpProvider] = js.native
    
    /* private */ var registerProvider: Any = js.native
  }
  
  type ProvideSignatureHelpSignature = js.ThisFunction4[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* context */ SignatureHelpContext, 
    /* token */ CancellationToken, 
    ProviderResult[SignatureHelp]
  ]
  
  trait SignatureHelpMiddleware extends StObject {
    
    var provideSignatureHelp: js.UndefOr[
        js.ThisFunction5[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* context */ SignatureHelpContext, 
          /* token */ CancellationToken, 
          /* next */ ProvideSignatureHelpSignature, 
          ProviderResult[SignatureHelp]
        ]
      ] = js.undefined
  }
  object SignatureHelpMiddleware {
    
    inline def apply(): SignatureHelpMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignatureHelpMiddleware]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignatureHelpMiddleware] (val x: Self) extends AnyVal {
      
      inline def setProvideSignatureHelp(
        value: js.ThisFunction5[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* context */ SignatureHelpContext, 
              /* token */ CancellationToken, 
              /* next */ ProvideSignatureHelpSignature, 
              ProviderResult[SignatureHelp]
            ]
      ): Self = StObject.set(x, "provideSignatureHelp", value.asInstanceOf[js.Any])
      
      inline def setProvideSignatureHelpUndefined: Self = StObject.set(x, "provideSignatureHelp", js.undefined)
    }
  }
}
