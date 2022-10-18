package typings.vscodeLanguageclient

import typings.vscode.mod.CallHierarchyIncomingCall
import typings.vscode.mod.CallHierarchyItem
import typings.vscode.mod.CallHierarchyOutgoingCall
import typings.vscode.mod.CancellationToken
import typings.vscode.mod.Disposable
import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typings.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotcallHierarchyMod.CallHierarchyOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotcallHierarchyMod.CallHierarchyRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonCallHierarchyMod {
  
  @JSImport("vscode-languageclient/lib/common/callHierarchy", "CallHierarchyFeature")
  @js.native
  open class CallHierarchyFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | CallHierarchyOptions, 
          CallHierarchyRegistrationOptions, 
          CallHierarchyProvider, 
          CallHierarchyMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[CallHierarchyMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: CallHierarchyRegistrationOptions): js.Tuple2[Disposable, CallHierarchyProvider] = js.native
  }
  
  type CallHierarchyIncomingCallsSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* item */ CallHierarchyItem, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[CallHierarchyIncomingCall]]
  ]
  
  trait CallHierarchyMiddleware extends StObject {
    
    var prepareCallHierarchy: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* positions */ Position, 
          /* token */ CancellationToken, 
          /* next */ PrepareCallHierarchySignature, 
          ProviderResult[CallHierarchyItem | js.Array[CallHierarchyItem]]
        ]
      ] = js.undefined
    
    var provideCallHierarchyIncomingCalls: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* item */ CallHierarchyItem, 
          /* token */ CancellationToken, 
          /* next */ CallHierarchyIncomingCallsSignature, 
          ProviderResult[js.Array[CallHierarchyIncomingCall]]
        ]
      ] = js.undefined
    
    var provideCallHierarchyOutgoingCalls: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* item */ CallHierarchyItem, 
          /* token */ CancellationToken, 
          /* next */ CallHierarchyOutgoingCallsSignature, 
          ProviderResult[js.Array[CallHierarchyOutgoingCall]]
        ]
      ] = js.undefined
  }
  object CallHierarchyMiddleware {
    
    inline def apply(): CallHierarchyMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallHierarchyMiddleware]
    }
    
    extension [Self <: CallHierarchyMiddleware](x: Self) {
      
      inline def setPrepareCallHierarchy(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* positions */ Position, 
              /* token */ CancellationToken, 
              /* next */ PrepareCallHierarchySignature, 
              ProviderResult[CallHierarchyItem | js.Array[CallHierarchyItem]]
            ]
      ): Self = StObject.set(x, "prepareCallHierarchy", value.asInstanceOf[js.Any])
      
      inline def setPrepareCallHierarchyUndefined: Self = StObject.set(x, "prepareCallHierarchy", js.undefined)
      
      inline def setProvideCallHierarchyIncomingCalls(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* item */ CallHierarchyItem, 
              /* token */ CancellationToken, 
              /* next */ CallHierarchyIncomingCallsSignature, 
              ProviderResult[js.Array[CallHierarchyIncomingCall]]
            ]
      ): Self = StObject.set(x, "provideCallHierarchyIncomingCalls", value.asInstanceOf[js.Any])
      
      inline def setProvideCallHierarchyIncomingCallsUndefined: Self = StObject.set(x, "provideCallHierarchyIncomingCalls", js.undefined)
      
      inline def setProvideCallHierarchyOutgoingCalls(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* item */ CallHierarchyItem, 
              /* token */ CancellationToken, 
              /* next */ CallHierarchyOutgoingCallsSignature, 
              ProviderResult[js.Array[CallHierarchyOutgoingCall]]
            ]
      ): Self = StObject.set(x, "provideCallHierarchyOutgoingCalls", value.asInstanceOf[js.Any])
      
      inline def setProvideCallHierarchyOutgoingCallsUndefined: Self = StObject.set(x, "provideCallHierarchyOutgoingCalls", js.undefined)
    }
  }
  
  type CallHierarchyOutgoingCallsSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* item */ CallHierarchyItem, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[CallHierarchyOutgoingCall]]
  ]
  
  trait CallHierarchyProvider
    extends StObject
       with typings.vscode.mod.CallHierarchyProvider {
    
    /* private */ var client: Any
    
    /* private */ var middleware: Any
  }
  object CallHierarchyProvider {
    
    inline def apply(
      client: Any,
      middleware: Any,
      prepareCallHierarchy: (TextDocument, Position, CancellationToken) => ProviderResult[CallHierarchyItem | js.Array[CallHierarchyItem]],
      provideCallHierarchyIncomingCalls: (CallHierarchyItem, CancellationToken) => ProviderResult[js.Array[CallHierarchyIncomingCall]],
      provideCallHierarchyOutgoingCalls: (CallHierarchyItem, CancellationToken) => ProviderResult[js.Array[CallHierarchyOutgoingCall]]
    ): CallHierarchyProvider = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], prepareCallHierarchy = js.Any.fromFunction3(prepareCallHierarchy), provideCallHierarchyIncomingCalls = js.Any.fromFunction2(provideCallHierarchyIncomingCalls), provideCallHierarchyOutgoingCalls = js.Any.fromFunction2(provideCallHierarchyOutgoingCalls))
      __obj.asInstanceOf[CallHierarchyProvider]
    }
    
    extension [Self <: CallHierarchyProvider](x: Self) {
      
      inline def setClient(value: Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setMiddleware(value: Any): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    }
  }
  
  type PrepareCallHierarchySignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[CallHierarchyItem | js.Array[CallHierarchyItem]]
  ]
}
