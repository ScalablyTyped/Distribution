package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullSignatureSymbol")
@js.native
class PullSignatureSymbol protected ()
  extends typings.typescriptDashServices.TypeScript.PullSignatureSymbol {
  def this(kind: typings.typescriptDashServices.TypeScript.PullElementKind) = this()
  def this(kind: typings.typescriptDashServices.TypeScript.PullElementKind, _isDefinition: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "PullSignatureSymbol")
@js.native
object PullSignatureSymbol extends js.Object {
  def getSignatureTypeMemberName(
    candidateSignature: typings.typescriptDashServices.TypeScript.PullSignatureSymbol,
    signatures: js.Array[typings.typescriptDashServices.TypeScript.PullSignatureSymbol],
    scopeSymbol: typings.typescriptDashServices.TypeScript.PullSymbol
  ): typings.typescriptDashServices.TypeScript.MemberNameArray = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptDashServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean
  ): js.Array[typings.typescriptDashServices.TypeScript.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptDashServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typings.typescriptDashServices.TypeScript.PullSymbol
  ): js.Array[typings.typescriptDashServices.TypeScript.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptDashServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typings.typescriptDashServices.TypeScript.PullSymbol,
    getPrettyTypeName: Boolean
  ): js.Array[typings.typescriptDashServices.TypeScript.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptDashServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typings.typescriptDashServices.TypeScript.PullSymbol,
    getPrettyTypeName: Boolean,
    candidateSignature: typings.typescriptDashServices.TypeScript.PullSignatureSymbol
  ): js.Array[typings.typescriptDashServices.TypeScript.MemberName] = js.native
}

