package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullCallSymbolInfo extends js.Object {
  var ast: AST
  var candidateSignature: PullSignatureSymbol
  var enclosingScopeSymbol: PullSymbol
  var isConstructorCall: Boolean
  var resolvedSignatures: js.Array[PullSignatureSymbol]
  var targetSymbol: PullSymbol
}

object PullCallSymbolInfo {
  @scala.inline
  def apply(
    ast: AST,
    candidateSignature: PullSignatureSymbol,
    enclosingScopeSymbol: PullSymbol,
    isConstructorCall: Boolean,
    resolvedSignatures: js.Array[PullSignatureSymbol],
    targetSymbol: PullSymbol
  ): PullCallSymbolInfo = {
    val __obj = js.Dynamic.literal(ast = ast, candidateSignature = candidateSignature, enclosingScopeSymbol = enclosingScopeSymbol, isConstructorCall = isConstructorCall, resolvedSignatures = resolvedSignatures, targetSymbol = targetSymbol)
  
    __obj.asInstanceOf[PullCallSymbolInfo]
  }
}

