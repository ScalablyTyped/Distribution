package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.ICallExpression
import typings.typescriptServices.TypeScript.PositionedToken
import typings.typescriptServices.TypeScript.PullSignatureSymbol
import typings.typescriptServices.TypeScript.PullSymbol
import typings.typescriptServices.TypeScript.Services.IPartiallyWrittenTypeArgumentListInformation
import typings.typescriptServices.TypeScript.SourceUnitSyntax
import typings.typescriptServices.TypeScript.SyntaxTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.SignatureInfoHelpers")
@js.native
class SignatureInfoHelpers ()
  extends typings.typescriptServices.TypeScript.Services.SignatureInfoHelpers
object SignatureInfoHelpers {
  
  /* static member */
  @JSImport("typescript-services", "Services.SignatureInfoHelpers.getActualSignatureInfoFromCallExpression")
  @js.native
  def getActualSignatureInfoFromCallExpression(
    ast: ICallExpression,
    caretPosition: Double,
    typeParameterInformation: IPartiallyWrittenTypeArgumentListInformation
  ): typings.typescriptServices.TypeScript.Services.ActualSignatureInfo = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.SignatureInfoHelpers.getActualSignatureInfoFromPartiallyWritenGenericExpression")
  @js.native
  def getActualSignatureInfoFromPartiallyWritenGenericExpression(caretPosition: Double, typeParameterInformation: IPartiallyWrittenTypeArgumentListInformation): typings.typescriptServices.TypeScript.Services.ActualSignatureInfo = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.SignatureInfoHelpers.getSignatureInfoFromGenericSymbol")
  @js.native
  def getSignatureInfoFromGenericSymbol(
    symbol: PullSymbol,
    enclosingScopeSymbol: PullSymbol,
    compilerState: typings.typescriptServices.TypeScript.Services.LanguageServiceCompiler
  ): js.Array[typings.typescriptServices.TypeScript.Services.FormalSignatureItemInfo] = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.SignatureInfoHelpers.getSignatureInfoFromSignatureSymbol")
  @js.native
  def getSignatureInfoFromSignatureSymbol(
    symbol: PullSymbol,
    signatures: js.Array[PullSignatureSymbol],
    enclosingScopeSymbol: PullSymbol,
    compilerState: typings.typescriptServices.TypeScript.Services.LanguageServiceCompiler
  ): js.Array[typings.typescriptServices.TypeScript.Services.FormalSignatureItemInfo] = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.SignatureInfoHelpers.isInPartiallyWrittenTypeArgumentList")
  @js.native
  def isInPartiallyWrittenTypeArgumentList(syntaxTree: SyntaxTree, position: Double): IPartiallyWrittenTypeArgumentListInformation = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.SignatureInfoHelpers.isSignatureHelpBlocker")
  @js.native
  def isSignatureHelpBlocker(sourceUnit: SourceUnitSyntax, position: Double): Boolean = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.SignatureInfoHelpers.isTargetOfObjectCreationExpression")
  @js.native
  def isTargetOfObjectCreationExpression(positionedToken: PositionedToken): Boolean = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.SignatureInfoHelpers.moveBackUpTillMatchingTokenKind")
  @js.native
  def moveBackUpTillMatchingTokenKind(token: js.Any, tokenKind: js.Any, matchingTokenKind: js.Any): js.Any = js.native
}
