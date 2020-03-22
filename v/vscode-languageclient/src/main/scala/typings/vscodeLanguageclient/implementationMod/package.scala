package typings.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object implementationMod {
  type ProvideImplementationSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* token */ typings.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.Definition | js.Array[typings.vscode.mod.DefinitionLink]]
  ]
}
