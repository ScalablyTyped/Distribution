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
    callSignatureWalk: js.Function1[typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol, scala.Boolean],
    constructSignatureWalk: js.Function1[typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol, scala.Boolean],
    indexSignatureWalk: js.Function1[typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol, scala.Boolean],
    memberSymbolWalk: js.Function1[typescriptDashServicesLib.TypeScriptNs.PullSymbol, scala.Boolean],
    signatureParameterWalk: js.Function1[typescriptDashServicesLib.TypeScriptNs.PullSymbol, scala.Boolean],
    signatureReturnTypeWalk: js.Function1[typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol, scala.Boolean]
  ): PullTypeSymbolStructureWalker = {
    val __obj = js.Dynamic.literal(callSignatureWalk = callSignatureWalk, constructSignatureWalk = constructSignatureWalk, indexSignatureWalk = indexSignatureWalk, memberSymbolWalk = memberSymbolWalk, signatureParameterWalk = signatureParameterWalk, signatureReturnTypeWalk = signatureReturnTypeWalk)
  
    __obj.asInstanceOf[PullTypeSymbolStructureWalker]
  }
}

