package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISwitchClauseSyntax extends ISyntaxNodeOrToken {
  var statements: ISyntaxList
  def isSwitchClause(): scala.Boolean
}

object ISwitchClauseSyntax {
  @scala.inline
  def apply(
    accept: js.Function1[ISyntaxVisitor, js.Any],
    childAt: js.Function1[scala.Double, ISyntaxElement],
    childCount: js.Function0[scala.Double],
    collectTextElements: js.Function1[js.Array[java.lang.String], scala.Unit],
    firstToken: js.Function0[ISyntaxToken],
    fullText: js.Function0[java.lang.String],
    fullWidth: js.Function0[scala.Double],
    isIncrementallyUnusable: js.Function0[scala.Boolean],
    isList: js.Function0[scala.Boolean],
    isNode: js.Function0[scala.Boolean],
    isSeparatedList: js.Function0[scala.Boolean],
    isSwitchClause: js.Function0[scala.Boolean],
    isToken: js.Function0[scala.Boolean],
    isTypeScriptSpecific: js.Function0[scala.Boolean],
    kind: js.Function0[SyntaxKind],
    lastToken: js.Function0[ISyntaxToken],
    leadingTrivia: js.Function0[ISyntaxTriviaList],
    leadingTriviaWidth: js.Function0[scala.Double],
    statements: ISyntaxList,
    trailingTrivia: js.Function0[ISyntaxTriviaList],
    trailingTriviaWidth: js.Function0[scala.Double],
    width: js.Function0[scala.Double],
    withLeadingTrivia: js.Function1[ISyntaxTriviaList, ISyntaxNodeOrToken],
    withTrailingTrivia: js.Function1[ISyntaxTriviaList, ISyntaxNodeOrToken]
  ): ISwitchClauseSyntax = {
    val __obj = js.Dynamic.literal(accept = accept, childAt = childAt, childCount = childCount, collectTextElements = collectTextElements, firstToken = firstToken, fullText = fullText, fullWidth = fullWidth, isIncrementallyUnusable = isIncrementallyUnusable, isList = isList, isNode = isNode, isSeparatedList = isSeparatedList, isSwitchClause = isSwitchClause, isToken = isToken, isTypeScriptSpecific = isTypeScriptSpecific, kind = kind, lastToken = lastToken, leadingTrivia = leadingTrivia, leadingTriviaWidth = leadingTriviaWidth, statements = statements, trailingTrivia = trailingTrivia, trailingTriviaWidth = trailingTriviaWidth, width = width, withLeadingTrivia = withLeadingTrivia, withTrailingTrivia = withTrailingTrivia)
  
    __obj.asInstanceOf[ISwitchClauseSyntax]
  }
}

