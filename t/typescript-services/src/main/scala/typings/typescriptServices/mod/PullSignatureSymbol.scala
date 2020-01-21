package typings.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullSignatureSymbol")
@js.native
class PullSignatureSymbol protected ()
  extends typings.typescriptServices.TypeScript.PullSignatureSymbol {
  def this(kind: typings.typescriptServices.TypeScript.PullElementKind) = this()
  def this(kind: typings.typescriptServices.TypeScript.PullElementKind, _isDefinition: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "PullSignatureSymbol")
@js.native
object PullSignatureSymbol extends js.Object {
  def getSignatureTypeMemberName(
    candidateSignature: typings.typescriptServices.TypeScript.PullSignatureSymbol,
    signatures: js.Array[typings.typescriptServices.TypeScript.PullSignatureSymbol],
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol
  ): typings.typescriptServices.TypeScript.MemberNameArray = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean
  ): js.Array[typings.typescriptServices.TypeScript.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol
  ): js.Array[typings.typescriptServices.TypeScript.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    getPrettyTypeName: Boolean
  ): js.Array[typings.typescriptServices.TypeScript.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    getPrettyTypeName: Boolean,
    candidateSignature: typings.typescriptServices.TypeScript.PullSignatureSymbol
  ): js.Array[typings.typescriptServices.TypeScript.MemberName] = js.native
}

