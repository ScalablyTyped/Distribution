package typings.vscodeLanguageclient

import typings.vscode.mod.CancellationToken
import typings.vscode.mod.Definition
import typings.vscode.mod.DefinitionLink
import typings.vscode.mod.DefinitionProvider
import typings.vscode.mod.Disposable
import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typings.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DefinitionOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DefinitionRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonDefinitionMod {
  
  @JSImport("vscode-languageclient/lib/common/definition", "DefinitionFeature")
  @js.native
  open class DefinitionFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | DefinitionOptions, 
          DefinitionRegistrationOptions, 
          DefinitionProvider, 
          DefinitionMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[DefinitionMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: DefinitionRegistrationOptions): js.Tuple2[Disposable, DefinitionProvider] = js.native
    
    /* private */ var registerProvider: Any = js.native
  }
  
  trait DefinitionMiddleware extends StObject {
    
    var provideDefinition: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* token */ CancellationToken, 
          /* next */ ProvideDefinitionSignature, 
          ProviderResult[Definition | js.Array[DefinitionLink]]
        ]
      ] = js.undefined
  }
  object DefinitionMiddleware {
    
    inline def apply(): DefinitionMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefinitionMiddleware]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefinitionMiddleware] (val x: Self) extends AnyVal {
      
      inline def setProvideDefinition(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* token */ CancellationToken, 
              /* next */ ProvideDefinitionSignature, 
              ProviderResult[Definition | js.Array[DefinitionLink]]
            ]
      ): Self = StObject.set(x, "provideDefinition", value.asInstanceOf[js.Any])
      
      inline def setProvideDefinitionUndefined: Self = StObject.set(x, "provideDefinition", js.undefined)
    }
  }
  
  type ProvideDefinitionSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Definition | js.Array[DefinitionLink]]
  ]
}
