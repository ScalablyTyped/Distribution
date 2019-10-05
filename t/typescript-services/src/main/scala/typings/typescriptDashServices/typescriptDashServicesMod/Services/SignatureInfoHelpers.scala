package typings.typescriptDashServices.typescriptDashServicesMod.Services

import typings.typescriptDashServices.TypeScript.ICallExpression
import typings.typescriptDashServices.TypeScript.Services.IPartiallyWrittenTypeArgumentListInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.SignatureInfoHelpers")
@js.native
class SignatureInfoHelpers ()
  extends typings.typescriptDashServices.TypeScript.Services.SignatureInfoHelpers

/* static members */
@JSImport("typescript-services", "Services.SignatureInfoHelpers")
@js.native
object SignatureInfoHelpers extends js.Object {
  def getActualSignatureInfoFromCallExpression(
    ast: ICallExpression,
    caretPosition: Double,
    typeParameterInformation: IPartiallyWrittenTypeArgumentListInformation
  ): typings.typescriptDashServices.TypeScript.Services.ActualSignatureInfo = js.native
  def getActualSignatureInfoFromPartiallyWritenGenericExpression(caretPosition: Double, typeParameterInformation: IPartiallyWrittenTypeArgumentListInformation): typings.typescriptDashServices.TypeScript.Services.ActualSignatureInfo = js.native
  def getSignatureInfoFromGenericSymbol(
    symbol: typings.typescriptDashServices.TypeScript.PullSymbol,
    enclosingScopeSymbol: typings.typescriptDashServices.TypeScript.PullSymbol,
    compilerState: typings.typescriptDashServices.TypeScript.Services.LanguageServiceCompiler
  ): js.Array[typings.typescriptDashServices.TypeScript.Services.FormalSignatureItemInfo] = js.native
  def getSignatureInfoFromSignatureSymbol(
    symbol: typings.typescriptDashServices.TypeScript.PullSymbol,
    signatures: js.Array[typings.typescriptDashServices.TypeScript.PullSignatureSymbol],
    enclosingScopeSymbol: typings.typescriptDashServices.TypeScript.PullSymbol,
    compilerState: typings.typescriptDashServices.TypeScript.Services.LanguageServiceCompiler
  ): js.Array[typings.typescriptDashServices.TypeScript.Services.FormalSignatureItemInfo] = js.native
  def isInPartiallyWrittenTypeArgumentList(syntaxTree: typings.typescriptDashServices.TypeScript.SyntaxTree, position: Double): IPartiallyWrittenTypeArgumentListInformation = js.native
  def isSignatureHelpBlocker(sourceUnit: typings.typescriptDashServices.TypeScript.SourceUnitSyntax, position: Double): Boolean = js.native
  def isTargetOfObjectCreationExpression(positionedToken: typings.typescriptDashServices.TypeScript.PositionedToken): Boolean = js.native
  /* private */ def moveBackUpTillMatchingTokenKind(token: js.Any, tokenKind: js.Any, matchingTokenKind: js.Any): js.Any = js.native
}

