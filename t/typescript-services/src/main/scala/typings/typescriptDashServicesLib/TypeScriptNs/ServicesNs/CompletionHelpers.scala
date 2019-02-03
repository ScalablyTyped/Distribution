package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.CompletionHelpers")
@js.native
class CompletionHelpers () extends js.Object

/* static members */
@JSGlobal("TypeScript.Services.CompletionHelpers")
@js.native
object CompletionHelpers extends js.Object {
  def filterContextualMembersList(
    contextualMemberSymbols: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSymbol],
    existingMembers: typescriptDashServicesLib.TypeScriptNs.PullVisibleSymbolsInfo,
    fileName: java.lang.String,
    position: scala.Double
  ): js.Array[typescriptDashServicesLib.TypeScriptNs.PullSymbol] = js.native
  def getContainingObjectLiteralApplicableForCompletion(sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, position: scala.Double): typescriptDashServicesLib.TypeScriptNs.PositionedElement = js.native
  def getNonIdentifierCompleteTokenOnLeft(sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, position: scala.Double): typescriptDashServicesLib.TypeScriptNs.PositionedToken = js.native
  /* private */ def getSpan(ast: js.Any): js.Any = js.native
  def getValidCompletionEntryDisplayName(displayName: java.lang.String): java.lang.String = js.native
  def isCompletionListBlocker(sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, position: scala.Double): scala.Boolean = js.native
  def isIdentifierDefinitionLocation(sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, position: scala.Double): scala.Boolean = js.native
  def isRightOfIllegalDot(sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, position: scala.Double): scala.Boolean = js.native
  /* private */ def symbolDeclarationIntersectsPosition(symbol: js.Any, fileName: js.Any, position: js.Any): js.Any = js.native
}

