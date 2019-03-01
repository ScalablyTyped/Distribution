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

object PullCallSymbolInfo {
  @scala.inline
  def apply(
    ast: AST,
    candidateSignature: PullSignatureSymbol,
    enclosingScopeSymbol: PullSymbol,
    isConstructorCall: scala.Boolean,
    resolvedSignatures: js.Array[PullSignatureSymbol],
    targetSymbol: PullSymbol
  ): PullCallSymbolInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ast")(ast)
    __obj.updateDynamic("candidateSignature")(candidateSignature)
    __obj.updateDynamic("enclosingScopeSymbol")(enclosingScopeSymbol)
    __obj.updateDynamic("isConstructorCall")(isConstructorCall)
    __obj.updateDynamic("resolvedSignatures")(resolvedSignatures)
    __obj.updateDynamic("targetSymbol")(targetSymbol)
    __obj.asInstanceOf[PullCallSymbolInfo]
  }
}

