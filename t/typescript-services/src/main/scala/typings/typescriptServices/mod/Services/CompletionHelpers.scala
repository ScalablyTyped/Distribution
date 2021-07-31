package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.PositionedElement
import typings.typescriptServices.TypeScript.PositionedToken
import typings.typescriptServices.TypeScript.PullSymbol
import typings.typescriptServices.TypeScript.PullVisibleSymbolsInfo
import typings.typescriptServices.TypeScript.SourceUnitSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.CompletionHelpers")
@js.native
class CompletionHelpers ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.CompletionHelpers
object CompletionHelpers {
  
  @JSImport("typescript-services", "Services.CompletionHelpers")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def filterContextualMembersList(
    contextualMemberSymbols: js.Array[PullSymbol],
    existingMembers: PullVisibleSymbolsInfo,
    fileName: String,
    position: Double
  ): js.Array[PullSymbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterContextualMembersList")(contextualMemberSymbols.asInstanceOf[js.Any], existingMembers.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Array[PullSymbol]]
  
  /* static member */
  @scala.inline
  def getContainingObjectLiteralApplicableForCompletion(sourceUnit: SourceUnitSyntax, position: Double): PositionedElement = (^.asInstanceOf[js.Dynamic].applyDynamic("getContainingObjectLiteralApplicableForCompletion")(sourceUnit.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[PositionedElement]
  
  /* static member */
  @scala.inline
  def getNonIdentifierCompleteTokenOnLeft(sourceUnit: SourceUnitSyntax, position: Double): PositionedToken = (^.asInstanceOf[js.Dynamic].applyDynamic("getNonIdentifierCompleteTokenOnLeft")(sourceUnit.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[PositionedToken]
  
  /* static member */
  @scala.inline
  def getSpan(ast: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpan")(ast.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def getValidCompletionEntryDisplayName(displayName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getValidCompletionEntryDisplayName")(displayName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  @scala.inline
  def isCompletionListBlocker(sourceUnit: SourceUnitSyntax, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCompletionListBlocker")(sourceUnit.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def isIdentifierDefinitionLocation(sourceUnit: SourceUnitSyntax, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierDefinitionLocation")(sourceUnit.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def isRightOfIllegalDot(sourceUnit: SourceUnitSyntax, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRightOfIllegalDot")(sourceUnit.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def symbolDeclarationIntersectsPosition(symbol: js.Any, fileName: js.Any, position: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("symbolDeclarationIntersectsPosition")(symbol.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
