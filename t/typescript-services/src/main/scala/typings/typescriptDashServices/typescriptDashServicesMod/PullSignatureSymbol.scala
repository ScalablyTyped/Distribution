package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullSignatureSymbol")
@js.native
class PullSignatureSymbol protected ()
  extends typings.typescriptDashServices.TypeScriptNs.PullSignatureSymbol {
  def this(kind: typings.typescriptDashServices.TypeScriptNs.PullElementKind) = this()
  def this(kind: typings.typescriptDashServices.TypeScriptNs.PullElementKind, _isDefinition: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "PullSignatureSymbol")
@js.native
object PullSignatureSymbol extends js.Object {
  def getSignatureTypeMemberName(
    candidateSignature: typings.typescriptDashServices.TypeScriptNs.PullSignatureSymbol,
    signatures: js.Array[typings.typescriptDashServices.TypeScriptNs.PullSignatureSymbol],
    scopeSymbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol
  ): typings.typescriptDashServices.TypeScriptNs.MemberNameArray = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptDashServices.TypeScriptNs.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean
  ): js.Array[typings.typescriptDashServices.TypeScriptNs.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptDashServices.TypeScriptNs.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol
  ): js.Array[typings.typescriptDashServices.TypeScriptNs.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptDashServices.TypeScriptNs.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol,
    getPrettyTypeName: Boolean
  ): js.Array[typings.typescriptDashServices.TypeScriptNs.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptDashServices.TypeScriptNs.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol,
    getPrettyTypeName: Boolean,
    candidateSignature: typings.typescriptDashServices.TypeScriptNs.PullSignatureSymbol
  ): js.Array[typings.typescriptDashServices.TypeScriptNs.MemberName] = js.native
}

