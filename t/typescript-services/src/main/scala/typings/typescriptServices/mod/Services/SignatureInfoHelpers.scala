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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.SignatureInfoHelpers")
@js.native
class SignatureInfoHelpers ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.SignatureInfoHelpers
object SignatureInfoHelpers {
  
  @JSImport("typescript-services", "Services.SignatureInfoHelpers")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getActualSignatureInfoFromCallExpression(
    ast: ICallExpression,
    caretPosition: Double,
    typeParameterInformation: IPartiallyWrittenTypeArgumentListInformation
  ): typings.typescriptServices.TypeScript.Services.ActualSignatureInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getActualSignatureInfoFromCallExpression")(ast.asInstanceOf[js.Any], caretPosition.asInstanceOf[js.Any], typeParameterInformation.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Services.ActualSignatureInfo]
  
  /* static member */
  inline def getActualSignatureInfoFromPartiallyWritenGenericExpression(caretPosition: Double, typeParameterInformation: IPartiallyWrittenTypeArgumentListInformation): typings.typescriptServices.TypeScript.Services.ActualSignatureInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getActualSignatureInfoFromPartiallyWritenGenericExpression")(caretPosition.asInstanceOf[js.Any], typeParameterInformation.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Services.ActualSignatureInfo]
  
  /* static member */
  inline def getSignatureInfoFromGenericSymbol(
    symbol: PullSymbol,
    enclosingScopeSymbol: PullSymbol,
    compilerState: typings.typescriptServices.TypeScript.Services.LanguageServiceCompiler
  ): js.Array[typings.typescriptServices.TypeScript.Services.FormalSignatureItemInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignatureInfoFromGenericSymbol")(symbol.asInstanceOf[js.Any], enclosingScopeSymbol.asInstanceOf[js.Any], compilerState.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.typescriptServices.TypeScript.Services.FormalSignatureItemInfo]]
  
  /* static member */
  inline def getSignatureInfoFromSignatureSymbol(
    symbol: PullSymbol,
    signatures: js.Array[PullSignatureSymbol],
    enclosingScopeSymbol: PullSymbol,
    compilerState: typings.typescriptServices.TypeScript.Services.LanguageServiceCompiler
  ): js.Array[typings.typescriptServices.TypeScript.Services.FormalSignatureItemInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignatureInfoFromSignatureSymbol")(symbol.asInstanceOf[js.Any], signatures.asInstanceOf[js.Any], enclosingScopeSymbol.asInstanceOf[js.Any], compilerState.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.typescriptServices.TypeScript.Services.FormalSignatureItemInfo]]
  
  /* static member */
  inline def isInPartiallyWrittenTypeArgumentList(syntaxTree: SyntaxTree, position: Double): IPartiallyWrittenTypeArgumentListInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("isInPartiallyWrittenTypeArgumentList")(syntaxTree.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[IPartiallyWrittenTypeArgumentListInformation]
  
  /* static member */
  inline def isSignatureHelpBlocker(sourceUnit: SourceUnitSyntax, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSignatureHelpBlocker")(sourceUnit.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def isTargetOfObjectCreationExpression(positionedToken: PositionedToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTargetOfObjectCreationExpression")(positionedToken.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def moveBackUpTillMatchingTokenKind(token: js.Any, tokenKind: js.Any, matchingTokenKind: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("moveBackUpTillMatchingTokenKind")(token.asInstanceOf[js.Any], tokenKind.asInstanceOf[js.Any], matchingTokenKind.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
