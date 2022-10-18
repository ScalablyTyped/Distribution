package typings.vscodeLanguageclient

import typings.vscode.mod.CancellationToken
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.SymbolInformation
import typings.vscode.mod.WorkspaceSymbolProvider
import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typings.vscodeLanguageclient.libCommonFeaturesMod.WorkspaceFeature
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkspaceSymbolRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonWorkspaceSymbolMod {
  
  @JSImport("vscode-languageclient/lib/common/workspaceSymbol", "WorkspaceSymbolFeature")
  @js.native
  open class WorkspaceSymbolFeature protected () extends WorkspaceFeature[
          WorkspaceSymbolRegistrationOptions, 
          WorkspaceSymbolProvider[SymbolInformation], 
          WorkspaceSymbolMiddleware
        ] {
    def this(client: FeatureClient[WorkspaceSymbolMiddleware, js.Object]) = this()
  }
  
  type ProvideWorkspaceSymbolsSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* query */ String, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[SymbolInformation]]
  ]
  
  type ResolveWorkspaceSymbolSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* item */ SymbolInformation, 
    /* token */ CancellationToken, 
    ProviderResult[SymbolInformation]
  ]
  
  trait WorkspaceSymbolMiddleware extends StObject {
    
    var provideWorkspaceSymbols: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* query */ String, 
          /* token */ CancellationToken, 
          /* next */ ProvideWorkspaceSymbolsSignature, 
          ProviderResult[js.Array[SymbolInformation]]
        ]
      ] = js.undefined
    
    var resolveWorkspaceSymbol: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* item */ SymbolInformation, 
          /* token */ CancellationToken, 
          /* next */ ResolveWorkspaceSymbolSignature, 
          ProviderResult[SymbolInformation]
        ]
      ] = js.undefined
  }
  object WorkspaceSymbolMiddleware {
    
    inline def apply(): WorkspaceSymbolMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceSymbolMiddleware]
    }
    
    extension [Self <: WorkspaceSymbolMiddleware](x: Self) {
      
      inline def setProvideWorkspaceSymbols(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* query */ String, 
              /* token */ CancellationToken, 
              /* next */ ProvideWorkspaceSymbolsSignature, 
              ProviderResult[js.Array[SymbolInformation]]
            ]
      ): Self = StObject.set(x, "provideWorkspaceSymbols", value.asInstanceOf[js.Any])
      
      inline def setProvideWorkspaceSymbolsUndefined: Self = StObject.set(x, "provideWorkspaceSymbols", js.undefined)
      
      inline def setResolveWorkspaceSymbol(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* item */ SymbolInformation, 
              /* token */ CancellationToken, 
              /* next */ ResolveWorkspaceSymbolSignature, 
              ProviderResult[SymbolInformation]
            ]
      ): Self = StObject.set(x, "resolveWorkspaceSymbol", value.asInstanceOf[js.Any])
      
      inline def setResolveWorkspaceSymbolUndefined: Self = StObject.set(x, "resolveWorkspaceSymbol", js.undefined)
    }
  }
}
