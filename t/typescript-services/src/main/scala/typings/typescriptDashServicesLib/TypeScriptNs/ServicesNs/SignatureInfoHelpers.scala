package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.SignatureInfoHelpers")
@js.native
class SignatureInfoHelpers () extends js.Object

@JSGlobal("TypeScript.Services.SignatureInfoHelpers")
@js.native
object SignatureInfoHelpers extends js.Object {
  def getActualSignatureInfoFromCallExpression(
    ast: typescriptDashServicesLib.TypeScriptNs.ICallExpression,
    caretPosition: scala.Double,
    typeParameterInformation: typescriptDashServicesLib.TypeScriptNs.ServicesNs.IPartiallyWrittenTypeArgumentListInformation
  ): typescriptDashServicesLib.TypeScriptNs.ServicesNs.ActualSignatureInfo = js.native
  def getActualSignatureInfoFromPartiallyWritenGenericExpression(
    caretPosition: scala.Double,
    typeParameterInformation: typescriptDashServicesLib.TypeScriptNs.ServicesNs.IPartiallyWrittenTypeArgumentListInformation
  ): typescriptDashServicesLib.TypeScriptNs.ServicesNs.ActualSignatureInfo = js.native
  def getSignatureInfoFromGenericSymbol(
    symbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
    enclosingScopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
    compilerState: typescriptDashServicesLib.TypeScriptNs.ServicesNs.LanguageServiceCompiler
  ): js.Array[typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormalSignatureItemInfo] = js.native
  def getSignatureInfoFromSignatureSymbol(
    symbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
    signatures: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol],
    enclosingScopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
    compilerState: typescriptDashServicesLib.TypeScriptNs.ServicesNs.LanguageServiceCompiler
  ): js.Array[typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormalSignatureItemInfo] = js.native
  def isInPartiallyWrittenTypeArgumentList(syntaxTree: typescriptDashServicesLib.TypeScriptNs.SyntaxTree, position: scala.Double): typescriptDashServicesLib.TypeScriptNs.ServicesNs.IPartiallyWrittenTypeArgumentListInformation = js.native
  def isSignatureHelpBlocker(sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, position: scala.Double): scala.Boolean = js.native
  def isTargetOfObjectCreationExpression(positionedToken: typescriptDashServicesLib.TypeScriptNs.PositionedToken): scala.Boolean = js.native
  /* private */ def moveBackUpTillMatchingTokenKind(token: js.Any, tokenKind: js.Any, matchingTokenKind: js.Any): js.Any = js.native
}

