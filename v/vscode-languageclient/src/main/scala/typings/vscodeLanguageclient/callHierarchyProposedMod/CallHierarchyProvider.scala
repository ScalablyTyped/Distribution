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

trait CallHierarchyProvider
  extends typings.vscode.mod.CallHierarchyProvider {
  var client: js.Any
  var middleware: js.Any
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
}

