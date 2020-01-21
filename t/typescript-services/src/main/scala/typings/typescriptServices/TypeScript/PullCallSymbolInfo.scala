package typings.typescriptServices.TypeScript

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
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], candidateSignature = candidateSignature.asInstanceOf[js.Any], enclosingScopeSymbol = enclosingScopeSymbol.asInstanceOf[js.Any], isConstructorCall = isConstructorCall.asInstanceOf[js.Any], resolvedSignatures = resolvedSignatures.asInstanceOf[js.Any], targetSymbol = targetSymbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullCallSymbolInfo]
  }
}

