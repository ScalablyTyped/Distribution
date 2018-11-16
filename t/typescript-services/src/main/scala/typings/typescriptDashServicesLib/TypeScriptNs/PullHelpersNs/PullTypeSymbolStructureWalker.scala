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

