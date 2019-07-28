package typings.typescriptDashServices.TypeScriptNs.ServicesNs

import typings.typescriptDashServices.TypeScriptNs.ICallExpression
import typings.typescriptDashServices.TypeScriptNs.PositionedToken
import typings.typescriptDashServices.TypeScriptNs.PullSignatureSymbol
import typings.typescriptDashServices.TypeScriptNs.PullSymbol
import typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax
import typings.typescriptDashServices.TypeScriptNs.SyntaxTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.SignatureInfoHelpers")
@js.native
class SignatureInfoHelpers () extends js.Object

/* static members */
@JSGlobal("TypeScript.Services.SignatureInfoHelpers")
@js.native
object SignatureInfoHelpers extends js.Object {
  def getActualSignatureInfoFromCallExpression(
    ast: ICallExpression,
    caretPosition: Double,
    typeParameterInformation: IPartiallyWrittenTypeArgumentListInformation
  ): ActualSignatureInfo = js.native
  def getActualSignatureInfoFromPartiallyWritenGenericExpression(caretPosition: Double, typeParameterInformation: IPartiallyWrittenTypeArgumentListInformation): ActualSignatureInfo = js.native
  def getSignatureInfoFromGenericSymbol(symbol: PullSymbol, enclosingScopeSymbol: PullSymbol, compilerState: LanguageServiceCompiler): js.Array[FormalSignatureItemInfo] = js.native
  def getSignatureInfoFromSignatureSymbol(
    symbol: PullSymbol,
    signatures: js.Array[PullSignatureSymbol],
    enclosingScopeSymbol: PullSymbol,
    compilerState: LanguageServiceCompiler
  ): js.Array[FormalSignatureItemInfo] = js.native
  def isInPartiallyWrittenTypeArgumentList(syntaxTree: SyntaxTree, position: Double): IPartiallyWrittenTypeArgumentListInformation = js.native
  def isSignatureHelpBlocker(sourceUnit: SourceUnitSyntax, position: Double): Boolean = js.native
  def isTargetOfObjectCreationExpression(positionedToken: PositionedToken): Boolean = js.native
  /* private */ def moveBackUpTillMatchingTokenKind(token: js.Any, tokenKind: js.Any, matchingTokenKind: js.Any): js.Any = js.native
}

