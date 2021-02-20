package typings.vscodeLanguageclient

import typings.vscode.mod.CallHierarchyIncomingCall
import typings.vscode.mod.CallHierarchyItem
import typings.vscode.mod.CallHierarchyOutgoingCall
import typings.vscode.mod.CancellationToken
import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscodeLanguageclient.clientMod.BaseLanguageClient
import typings.vscodeLanguageclient.clientMod.TextDocumentFeature
import typings.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyOptions
import typings.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callHierarchyProposedMod {
  
  @JSImport("vscode-languageclient/lib/callHierarchy.proposed", "CallHierarchyFeature")
  @js.native
  class CallHierarchyFeature protected () extends TextDocumentFeature[
          Boolean | CallHierarchyOptions, 
          CallHierarchyRegistrationOptions, 
          CallHierarchyProvider
        ] {
    def this(client: BaseLanguageClient) = this()
  }
  
  type CallHierarchyIncomingCallsSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* item */ CallHierarchyItem, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[CallHierarchyIncomingCall]]
  ]
  
  @js.native
  trait CallHierarchyMiddleware extends StObject {
    
    var prepareCallHierarchy: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* positions */ Position, 
          /* token */ CancellationToken, 
          /* next */ PrepareCallHierachySignature, 
          ProviderResult[CallHierarchyItem]
        ]
      ] = js.native
    
    var provideCallHierarchyIncomingCalls: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* item */ CallHierarchyItem, 
          /* token */ CancellationToken, 
          /* next */ CallHierarchyIncomingCallsSignature, 
          ProviderResult[js.Array[CallHierarchyIncomingCall]]
        ]
      ] = js.native
    
    var provideCallHierarchyOutgingCalls: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* item */ CallHierarchyItem, 
          /* token */ CancellationToken, 
          /* next */ CallHierarchyOutgoingCallsSignature, 
          ProviderResult[js.Array[CallHierarchyOutgoingCall]]
        ]
      ] = js.native
  }
  object CallHierarchyMiddleware {
    
    @scala.inline
    def apply(): CallHierarchyMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallHierarchyMiddleware]
    }
    
    @scala.inline
    implicit class CallHierarchyMiddlewareMutableBuilder[Self <: CallHierarchyMiddleware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrepareCallHierarchy(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* positions */ Position, 
              /* token */ CancellationToken, 
              /* next */ PrepareCallHierachySignature, 
              ProviderResult[CallHierarchyItem]
            ]
      ): Self = StObject.set(x, "prepareCallHierarchy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrepareCallHierarchyUndefined: Self = StObject.set(x, "prepareCallHierarchy", js.undefined)
      
      @scala.inline
      def setProvideCallHierarchyIncomingCalls(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* item */ CallHierarchyItem, 
              /* token */ CancellationToken, 
              /* next */ CallHierarchyIncomingCallsSignature, 
              ProviderResult[js.Array[CallHierarchyIncomingCall]]
            ]
      ): Self = StObject.set(x, "provideCallHierarchyIncomingCalls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvideCallHierarchyIncomingCallsUndefined: Self = StObject.set(x, "provideCallHierarchyIncomingCalls", js.undefined)
      
      @scala.inline
      def setProvideCallHierarchyOutgingCalls(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* item */ CallHierarchyItem, 
              /* token */ CancellationToken, 
              /* next */ CallHierarchyOutgoingCallsSignature, 
              ProviderResult[js.Array[CallHierarchyOutgoingCall]]
            ]
      ): Self = StObject.set(x, "provideCallHierarchyOutgingCalls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvideCallHierarchyOutgingCallsUndefined: Self = StObject.set(x, "provideCallHierarchyOutgingCalls", js.undefined)
    }
  }
  
  type CallHierarchyOutgoingCallsSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* item */ CallHierarchyItem, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[CallHierarchyOutgoingCall]]
  ]
  
  @js.native
  trait CallHierarchyProvider
    extends typings.vscode.mod.CallHierarchyProvider {
    
    var client: js.Any = js.native
    
    var middleware: js.Any = js.native
  }
  object CallHierarchyProvider {
    
    @scala.inline
    def apply(
      client: js.Any,
      middleware: js.Any,
      prepareCallHierarchy: (TextDocument, Position, CancellationToken) => ProviderResult[CallHierarchyItem | js.Array[CallHierarchyItem]],
      provideCallHierarchyIncomingCalls: (CallHierarchyItem, CancellationToken) => ProviderResult[js.Array[CallHierarchyIncomingCall]],
      provideCallHierarchyOutgoingCalls: (CallHierarchyItem, CancellationToken) => ProviderResult[js.Array[CallHierarchyOutgoingCall]]
    ): CallHierarchyProvider = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], prepareCallHierarchy = js.Any.fromFunction3(prepareCallHierarchy), provideCallHierarchyIncomingCalls = js.Any.fromFunction2(provideCallHierarchyIncomingCalls), provideCallHierarchyOutgoingCalls = js.Any.fromFunction2(provideCallHierarchyOutgoingCalls))
      __obj.asInstanceOf[CallHierarchyProvider]
    }
    
    @scala.inline
    implicit class CallHierarchyProviderMutableBuilder[Self <: CallHierarchyProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: js.Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddleware(value: js.Any): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    }
  }
  
  type PrepareCallHierachySignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[CallHierarchyItem]
  ]
}
