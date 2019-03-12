package typings
package typescriptDashServicesLib.TypeScriptNs.PullHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullTypeSymbolStructureWalker extends js.Object {
  def callSignatureWalk(signatureSymbol: typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol): scala.Boolean
  def constructSignatureWalk(signatureSymbol: typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol): scala.Boolean
  def indexSignatureWalk(signatureSymbol: typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol): scala.Boolean
  def memberSymbolWalk(memberSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol): scala.Boolean
  def signatureParameterWalk(parameterSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol): scala.Boolean
  def signatureReturnTypeWalk(returnType: typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol): scala.Boolean
}

object PullTypeSymbolStructureWalker {
  @scala.inline
  def apply(
    callSignatureWalk: typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol => scala.Boolean,
    constructSignatureWalk: typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol => scala.Boolean,
    indexSignatureWalk: typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol => scala.Boolean,
    memberSymbolWalk: typescriptDashServicesLib.TypeScriptNs.PullSymbol => scala.Boolean,
    signatureParameterWalk: typescriptDashServicesLib.TypeScriptNs.PullSymbol => scala.Boolean,
    signatureReturnTypeWalk: typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol => scala.Boolean
  ): PullTypeSymbolStructureWalker = {
    val __obj = js.Dynamic.literal(callSignatureWalk = js.Any.fromFunction1(callSignatureWalk), constructSignatureWalk = js.Any.fromFunction1(constructSignatureWalk), indexSignatureWalk = js.Any.fromFunction1(indexSignatureWalk), memberSymbolWalk = js.Any.fromFunction1(memberSymbolWalk), signatureParameterWalk = js.Any.fromFunction1(signatureParameterWalk), signatureReturnTypeWalk = js.Any.fromFunction1(signatureReturnTypeWalk))
  
    __obj.asInstanceOf[PullTypeSymbolStructureWalker]
  }
}

