package typings.vscodeLanguageclient.callHierarchyProposedMod

import typings.vscode.mod.CallHierarchyIncomingCall
import typings.vscode.mod.CallHierarchyItem
import typings.vscode.mod.CallHierarchyOutgoingCall
import typings.vscode.mod.CancellationToken
import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallHierarchyMiddleware extends js.Object {
  var prepareCallHierarchy: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* positions */ Position, 
      /* token */ CancellationToken, 
      /* next */ PrepareCallHierachySignature, 
      ProviderResult[CallHierarchyItem]
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
  var provideCallHierarchyOutgingCalls: js.UndefOr[
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
  @scala.inline
  def apply(
    prepareCallHierarchy: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* positions */ Position, 
      /* token */ CancellationToken, 
      /* next */ PrepareCallHierachySignature, 
      ProviderResult[CallHierarchyItem]
    ] = null,
    provideCallHierarchyIncomingCalls: js.ThisFunction3[
      /* this */ Unit, 
      /* item */ CallHierarchyItem, 
      /* token */ CancellationToken, 
      /* next */ CallHierarchyIncomingCallsSignature, 
      ProviderResult[js.Array[CallHierarchyIncomingCall]]
    ] = null,
    provideCallHierarchyOutgingCalls: js.ThisFunction3[
      /* this */ Unit, 
      /* item */ CallHierarchyItem, 
      /* token */ CancellationToken, 
      /* next */ CallHierarchyOutgoingCallsSignature, 
      ProviderResult[js.Array[CallHierarchyOutgoingCall]]
    ] = null
  ): CallHierarchyMiddleware = {
    val __obj = js.Dynamic.literal()
    if (prepareCallHierarchy != null) __obj.updateDynamic("prepareCallHierarchy")(prepareCallHierarchy.asInstanceOf[js.Any])
    if (provideCallHierarchyIncomingCalls != null) __obj.updateDynamic("provideCallHierarchyIncomingCalls")(provideCallHierarchyIncomingCalls.asInstanceOf[js.Any])
    if (provideCallHierarchyOutgingCalls != null) __obj.updateDynamic("provideCallHierarchyOutgingCalls")(provideCallHierarchyOutgingCalls.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyMiddleware]
  }
}

