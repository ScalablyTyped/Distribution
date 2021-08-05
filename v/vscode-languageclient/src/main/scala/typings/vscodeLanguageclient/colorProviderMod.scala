package typings.vscodeLanguageclient

import typings.vscode.mod.Color
import typings.vscode.mod.ColorInformation
import typings.vscode.mod.ColorPresentation
import typings.vscode.mod.DocumentColorProvider
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeLanguageclient.anon.Document
import typings.vscodeLanguageclient.clientMod.BaseLanguageClient
import typings.vscodeLanguageclient.clientMod.TextDocumentFeature
import typings.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorOptions
import typings.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorProviderMod {
  
  @JSImport("vscode-languageclient/lib/colorProvider", "ColorProviderFeature")
  @js.native
  class ColorProviderFeature protected () extends TextDocumentFeature[
          Boolean | DocumentColorOptions, 
          DocumentColorRegistrationOptions, 
          DocumentColorProvider
        ] {
    def this(client: BaseLanguageClient) = this()
    
    /* private */ var asColor: js.Any = js.native
    
    /* private */ var asColorInformations: js.Any = js.native
    
    /* private */ var asColorPresentations: js.Any = js.native
  }
  
  trait ColorProviderMiddleware extends StObject {
    
    var provideColorPresentations: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* color */ Color, 
          /* context */ Document, 
          /* token */ CancellationToken, 
          /* next */ ProvideColorPresentationSignature, 
          ProviderResult[js.Array[ColorPresentation]]
        ]
      ] = js.undefined
    
    var provideDocumentColors: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* token */ CancellationToken, 
          /* next */ ProvideDocumentColorsSignature, 
          ProviderResult[js.Array[ColorInformation]]
        ]
      ] = js.undefined
  }
  object ColorProviderMiddleware {
    
    inline def apply(): ColorProviderMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorProviderMiddleware]
    }
    
    extension [Self <: ColorProviderMiddleware](x: Self) {
      
      inline def setProvideColorPresentations(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* color */ Color, 
              /* context */ Document, 
              /* token */ CancellationToken, 
              /* next */ ProvideColorPresentationSignature, 
              ProviderResult[js.Array[ColorPresentation]]
            ]
      ): Self = StObject.set(x, "provideColorPresentations", value.asInstanceOf[js.Any])
      
      inline def setProvideColorPresentationsUndefined: Self = StObject.set(x, "provideColorPresentations", js.undefined)
      
      inline def setProvideDocumentColors(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* token */ CancellationToken, 
              /* next */ ProvideDocumentColorsSignature, 
              ProviderResult[js.Array[ColorInformation]]
            ]
      ): Self = StObject.set(x, "provideDocumentColors", value.asInstanceOf[js.Any])
      
      inline def setProvideDocumentColorsUndefined: Self = StObject.set(x, "provideDocumentColors", js.undefined)
    }
  }
  
  type ProvideColorPresentationSignature = js.Function3[
    /* color */ Color, 
    /* context */ Document, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[ColorPresentation]]
  ]
  
  type ProvideDocumentColorsSignature = js.Function2[
    /* document */ TextDocument, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[ColorInformation]]
  ]
}
