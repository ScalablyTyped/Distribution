package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.PositionedElement
import typings.typescriptServices.TypeScript.PositionedToken
import typings.typescriptServices.TypeScript.PullSymbol
import typings.typescriptServices.TypeScript.PullVisibleSymbolsInfo
import typings.typescriptServices.TypeScript.SourceUnitSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.CompletionHelpers")
@js.native
class CompletionHelpers ()
  extends typings.typescriptServices.TypeScript.Services.CompletionHelpers
object CompletionHelpers {
  
  /* static member */
  @JSImport("typescript-services", "Services.CompletionHelpers.filterContextualMembersList")
  @js.native
  def filterContextualMembersList(
    contextualMemberSymbols: js.Array[PullSymbol],
    existingMembers: PullVisibleSymbolsInfo,
    fileName: String,
    position: Double
  ): js.Array[PullSymbol] = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.CompletionHelpers.getContainingObjectLiteralApplicableForCompletion")
  @js.native
  def getContainingObjectLiteralApplicableForCompletion(sourceUnit: SourceUnitSyntax, position: Double): PositionedElement = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.CompletionHelpers.getNonIdentifierCompleteTokenOnLeft")
  @js.native
  def getNonIdentifierCompleteTokenOnLeft(sourceUnit: SourceUnitSyntax, position: Double): PositionedToken = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.CompletionHelpers.getSpan")
  @js.native
  def getSpan(ast: js.Any): js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.CompletionHelpers.getValidCompletionEntryDisplayName")
  @js.native
  def getValidCompletionEntryDisplayName(displayName: String): String = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.CompletionHelpers.isCompletionListBlocker")
  @js.native
  def isCompletionListBlocker(sourceUnit: SourceUnitSyntax, position: Double): Boolean = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.CompletionHelpers.isIdentifierDefinitionLocation")
  @js.native
  def isIdentifierDefinitionLocation(sourceUnit: SourceUnitSyntax, position: Double): Boolean = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.CompletionHelpers.isRightOfIllegalDot")
  @js.native
  def isRightOfIllegalDot(sourceUnit: SourceUnitSyntax, position: Double): Boolean = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.CompletionHelpers.symbolDeclarationIntersectsPosition")
  @js.native
  def symbolDeclarationIntersectsPosition(symbol: js.Any, fileName: js.Any, position: js.Any): js.Any = js.native
}
