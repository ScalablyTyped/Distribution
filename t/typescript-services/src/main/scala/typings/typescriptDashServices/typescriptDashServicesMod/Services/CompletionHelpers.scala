package typings.typescriptDashServices.typescriptDashServicesMod.Services

import typings.typescriptDashServices.TypeScript.PullVisibleSymbolsInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.CompletionHelpers")
@js.native
class CompletionHelpers ()
  extends typings.typescriptDashServices.TypeScript.Services.CompletionHelpers

/* static members */
@JSImport("typescript-services", "Services.CompletionHelpers")
@js.native
object CompletionHelpers extends js.Object {
  def filterContextualMembersList(
    contextualMemberSymbols: js.Array[typings.typescriptDashServices.TypeScript.PullSymbol],
    existingMembers: PullVisibleSymbolsInfo,
    fileName: String,
    position: Double
  ): js.Array[typings.typescriptDashServices.TypeScript.PullSymbol] = js.native
  def getContainingObjectLiteralApplicableForCompletion(sourceUnit: typings.typescriptDashServices.TypeScript.SourceUnitSyntax, position: Double): typings.typescriptDashServices.TypeScript.PositionedElement = js.native
  def getNonIdentifierCompleteTokenOnLeft(sourceUnit: typings.typescriptDashServices.TypeScript.SourceUnitSyntax, position: Double): typings.typescriptDashServices.TypeScript.PositionedToken = js.native
  /* private */ def getSpan(ast: js.Any): js.Any = js.native
  def getValidCompletionEntryDisplayName(displayName: String): String = js.native
  def isCompletionListBlocker(sourceUnit: typings.typescriptDashServices.TypeScript.SourceUnitSyntax, position: Double): Boolean = js.native
  def isIdentifierDefinitionLocation(sourceUnit: typings.typescriptDashServices.TypeScript.SourceUnitSyntax, position: Double): Boolean = js.native
  def isRightOfIllegalDot(sourceUnit: typings.typescriptDashServices.TypeScript.SourceUnitSyntax, position: Double): Boolean = js.native
  /* private */ def symbolDeclarationIntersectsPosition(symbol: js.Any, fileName: js.Any, position: js.Any): js.Any = js.native
}

