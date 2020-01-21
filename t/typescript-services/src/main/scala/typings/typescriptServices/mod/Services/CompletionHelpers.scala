package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.PositionedElement
import typings.typescriptServices.TypeScript.PositionedToken
import typings.typescriptServices.TypeScript.PullSymbol
import typings.typescriptServices.TypeScript.PullVisibleSymbolsInfo
import typings.typescriptServices.TypeScript.SourceUnitSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.CompletionHelpers")
@js.native
class CompletionHelpers ()
  extends typings.typescriptServices.TypeScript.Services.CompletionHelpers

/* static members */
@JSImport("typescript-services", "Services.CompletionHelpers")
@js.native
object CompletionHelpers extends js.Object {
  def filterContextualMembersList(
    contextualMemberSymbols: js.Array[PullSymbol],
    existingMembers: PullVisibleSymbolsInfo,
    fileName: String,
    position: Double
  ): js.Array[PullSymbol] = js.native
  def getContainingObjectLiteralApplicableForCompletion(sourceUnit: SourceUnitSyntax, position: Double): PositionedElement = js.native
  def getNonIdentifierCompleteTokenOnLeft(sourceUnit: SourceUnitSyntax, position: Double): PositionedToken = js.native
  /* private */ def getSpan(ast: js.Any): js.Any = js.native
  def getValidCompletionEntryDisplayName(displayName: String): String = js.native
  def isCompletionListBlocker(sourceUnit: SourceUnitSyntax, position: Double): Boolean = js.native
  def isIdentifierDefinitionLocation(sourceUnit: SourceUnitSyntax, position: Double): Boolean = js.native
  def isRightOfIllegalDot(sourceUnit: SourceUnitSyntax, position: Double): Boolean = js.native
  /* private */ def symbolDeclarationIntersectsPosition(symbol: js.Any, fileName: js.Any, position: js.Any): js.Any = js.native
}

