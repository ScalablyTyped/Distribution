package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullSignatureSymbol")
@js.native
class PullSignatureSymbol protected ()
  extends typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol {
  def this(kind: typescriptDashServicesLib.TypeScriptNs.PullElementKind) = this()
  def this(kind: typescriptDashServicesLib.TypeScriptNs.PullElementKind, _isDefinition: scala.Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "PullSignatureSymbol")
@js.native
object PullSignatureSymbol extends js.Object {
  def getSignatureTypeMemberName(
    candidateSignature: typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol,
    signatures: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol],
    scopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol
  ): typescriptDashServicesLib.TypeScriptNs.MemberNameArray = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol],
    prefix: java.lang.String,
    shortform: scala.Boolean,
    brackets: scala.Boolean
  ): js.Array[typescriptDashServicesLib.TypeScriptNs.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol],
    prefix: java.lang.String,
    shortform: scala.Boolean,
    brackets: scala.Boolean,
    scopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol
  ): js.Array[typescriptDashServicesLib.TypeScriptNs.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol],
    prefix: java.lang.String,
    shortform: scala.Boolean,
    brackets: scala.Boolean,
    scopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
    getPrettyTypeName: scala.Boolean
  ): js.Array[typescriptDashServicesLib.TypeScriptNs.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol],
    prefix: java.lang.String,
    shortform: scala.Boolean,
    brackets: scala.Boolean,
    scopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
    getPrettyTypeName: scala.Boolean,
    candidateSignature: typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol
  ): js.Array[typescriptDashServicesLib.TypeScriptNs.MemberName] = js.native
}

