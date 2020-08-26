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

@js.native
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
  implicit class CallHierarchyMiddlewareOps[Self <: CallHierarchyMiddleware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
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
    ): Self = this.set("prepareCallHierarchy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrepareCallHierarchy: Self = this.set("prepareCallHierarchy", js.undefined)
    @scala.inline
    def setProvideCallHierarchyIncomingCalls(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* item */ CallHierarchyItem, 
          /* token */ CancellationToken, 
          /* next */ CallHierarchyIncomingCallsSignature, 
          ProviderResult[js.Array[CallHierarchyIncomingCall]]
        ]
    ): Self = this.set("provideCallHierarchyIncomingCalls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvideCallHierarchyIncomingCalls: Self = this.set("provideCallHierarchyIncomingCalls", js.undefined)
    @scala.inline
    def setProvideCallHierarchyOutgingCalls(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* item */ CallHierarchyItem, 
          /* token */ CancellationToken, 
          /* next */ CallHierarchyOutgoingCallsSignature, 
          ProviderResult[js.Array[CallHierarchyOutgoingCall]]
        ]
    ): Self = this.set("provideCallHierarchyOutgingCalls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvideCallHierarchyOutgingCalls: Self = this.set("provideCallHierarchyOutgingCalls", js.undefined)
  }
  
}

