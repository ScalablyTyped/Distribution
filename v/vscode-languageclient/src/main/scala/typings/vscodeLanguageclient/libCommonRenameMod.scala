package typings.vscodeLanguageclient

import typings.vscode.mod.Disposable
import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.Range
import typings.vscode.mod.RenameProvider
import typings.vscode.mod.TextDocument
import typings.vscode.mod.WorkspaceEdit
import typings.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typings.vscodeLanguageclient.anon.Placeholder
import typings.vscodeLanguageclient.libCommonFeaturesMod.DocumentSelectorOptions
import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typings.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.RenameOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.RenameRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonRenameMod {
  
  @JSImport("vscode-languageclient/lib/common/rename", "RenameFeature")
  @js.native
  open class RenameFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | RenameOptions, 
          RenameRegistrationOptions, 
          RenameProvider, 
          RenameMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[RenameMiddleware, js.Object]) = this()
    
    /* private */ var isDefaultBehavior: Any = js.native
    
    /* protected */ def registerLanguageProvider(options: RenameRegistrationOptions & DocumentSelectorOptions): js.Tuple2[Disposable, RenameProvider] = js.native
    
    /* private */ var registerProvider: Any = js.native
  }
  
  type PrepareRenameSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Range | Placeholder]
  ]
  
  type ProvideRenameEditsSignature = js.ThisFunction4[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* newName */ String, 
    /* token */ CancellationToken, 
    ProviderResult[WorkspaceEdit]
  ]
  
  trait RenameMiddleware extends StObject {
    
    var prepareRename: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* token */ CancellationToken, 
          /* next */ PrepareRenameSignature, 
          ProviderResult[Range | Placeholder]
        ]
      ] = js.undefined
    
    var provideRenameEdits: js.UndefOr[
        js.ThisFunction5[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* newName */ String, 
          /* token */ CancellationToken, 
          /* next */ ProvideRenameEditsSignature, 
          ProviderResult[WorkspaceEdit]
        ]
      ] = js.undefined
  }
  object RenameMiddleware {
    
    inline def apply(): RenameMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenameMiddleware]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenameMiddleware] (val x: Self) extends AnyVal {
      
      inline def setPrepareRename(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* token */ CancellationToken, 
              /* next */ PrepareRenameSignature, 
              ProviderResult[Range | Placeholder]
            ]
      ): Self = StObject.set(x, "prepareRename", value.asInstanceOf[js.Any])
      
      inline def setPrepareRenameUndefined: Self = StObject.set(x, "prepareRename", js.undefined)
      
      inline def setProvideRenameEdits(
        value: js.ThisFunction5[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* newName */ String, 
              /* token */ CancellationToken, 
              /* next */ ProvideRenameEditsSignature, 
              ProviderResult[WorkspaceEdit]
            ]
      ): Self = StObject.set(x, "provideRenameEdits", value.asInstanceOf[js.Any])
      
      inline def setProvideRenameEditsUndefined: Self = StObject.set(x, "provideRenameEdits", js.undefined)
    }
  }
}
