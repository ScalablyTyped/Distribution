package typings.typescriptDashServices.TypeScript.Services

import typings.typescriptDashServices.TypeScript.ICallExpression
import typings.typescriptDashServices.TypeScript.PositionedToken
import typings.typescriptDashServices.TypeScript.PullSignatureSymbol
import typings.typescriptDashServices.TypeScript.PullSymbol
import typings.typescriptDashServices.TypeScript.SourceUnitSyntax
import typings.typescriptDashServices.TypeScript.SyntaxTree
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

