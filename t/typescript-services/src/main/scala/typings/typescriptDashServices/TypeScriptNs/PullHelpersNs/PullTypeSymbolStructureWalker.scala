package typings.typescriptDashServices.TypeScriptNs.PullHelpersNs

import typings.typescriptDashServices.TypeScriptNs.PullSignatureSymbol
import typings.typescriptDashServices.TypeScriptNs.PullSymbol
import typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullTypeSymbolStructureWalker extends js.Object {
  def callSignatureWalk(signatureSymbol: PullSignatureSymbol): Boolean
  def constructSignatureWalk(signatureSymbol: PullSignatureSymbol): Boolean
  def indexSignatureWalk(signatureSymbol: PullSignatureSymbol): Boolean
  def memberSymbolWalk(memberSymbol: PullSymbol): Boolean
  def signatureParameterWalk(parameterSymbol: PullSymbol): Boolean
  def signatureReturnTypeWalk(returnType: PullTypeSymbol): Boolean
}

object PullTypeSymbolStructureWalker {
  @scala.inline
  def apply(
    callSignatureWalk: PullSignatureSymbol => Boolean,
    constructSignatureWalk: PullSignatureSymbol => Boolean,
    indexSignatureWalk: PullSignatureSymbol => Boolean,
    memberSymbolWalk: PullSymbol => Boolean,
    signatureParameterWalk: PullSymbol => Boolean,
    signatureReturnTypeWalk: PullTypeSymbol => Boolean
  ): PullTypeSymbolStructureWalker = {
    val __obj = js.Dynamic.literal(callSignatureWalk = js.Any.fromFunction1(callSignatureWalk), constructSignatureWalk = js.Any.fromFunction1(constructSignatureWalk), indexSignatureWalk = js.Any.fromFunction1(indexSignatureWalk), memberSymbolWalk = js.Any.fromFunction1(memberSymbolWalk), signatureParameterWalk = js.Any.fromFunction1(signatureParameterWalk), signatureReturnTypeWalk = js.Any.fromFunction1(signatureReturnTypeWalk))
  
    __obj.asInstanceOf[PullTypeSymbolStructureWalker]
  }
}

