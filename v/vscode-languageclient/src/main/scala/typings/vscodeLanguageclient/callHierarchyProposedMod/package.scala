package typings.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object callHierarchyProposedMod {
  type CallHierarchyIncomingCallsSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* item */ typings.vscode.mod.CallHierarchyItem, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.CallHierarchyIncomingCall]]
  ]
  type CallHierarchyOutgoingCallsSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* item */ typings.vscode.mod.CallHierarchyItem, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.CallHierarchyOutgoingCall]]
  ]
  type PrepareCallHierachySignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.CallHierarchyItem]
  ]
}
