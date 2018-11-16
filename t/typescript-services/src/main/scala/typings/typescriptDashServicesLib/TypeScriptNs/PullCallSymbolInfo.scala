package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PullCallSymbolInfo extends js.Object {
  var ast: AST
  var candidateSignature: PullSignatureSymbol
  var enclosingScopeSymbol: PullSymbol
  var isConstructorCall: scala.Boolean
  var resolvedSignatures: js.Array[PullSignatureSymbol]
  var targetSymbol: PullSymbol
}

