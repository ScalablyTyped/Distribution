package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyntaxToken extends IPrimaryExpressionSyntax {
  
  def hasLeadingComment(): Boolean = js.native
  
  def hasLeadingNewLine(): Boolean = js.native
  
  def hasLeadingSkippedText(): Boolean = js.native
  
  def hasLeadingTrivia(): Boolean = js.native
  
  def hasSkippedToken(): Boolean = js.native
  
  def hasTrailingComment(): Boolean = js.native
  
  def hasTrailingNewLine(): Boolean = js.native
  
  def hasTrailingSkippedText(): Boolean = js.native
  
  def hasTrailingTrivia(): Boolean = js.native
  
  def text(): String = js.native
  
  var tokenKind: SyntaxKind = js.native
  
  def value(): js.Any = js.native
  
  def valueText(): String = js.native
}
object ISyntaxToken {
  
  @scala.inline
  def apply(
    accept: ISyntaxVisitor => js.Any,
    childAt: Double => ISyntaxElement,
    childCount: () => Double,
    collectTextElements: js.Array[String] => Unit,
    firstToken: () => ISyntaxToken,
    fullText: () => String,
    fullWidth: () => Double,
    hasLeadingComment: () => Boolean,
    hasLeadingNewLine: () => Boolean,
    hasLeadingSkippedText: () => Boolean,
    hasLeadingTrivia: () => Boolean,
    hasSkippedToken: () => Boolean,
    hasTrailingComment: () => Boolean,
    hasTrailingNewLine: () => Boolean,
    hasTrailingSkippedText: () => Boolean,
    hasTrailingTrivia: () => Boolean,
    isExpression: () => Boolean,
    isIncrementallyUnusable: () => Boolean,
    isList: () => Boolean,
    isMemberExpression: () => Boolean,
    isNode: () => Boolean,
    isPostfixExpression: () => Boolean,
    isPrimaryExpression: () => Boolean,
    isSeparatedList: () => Boolean,
    isToken: () => Boolean,
    isTypeScriptSpecific: () => Boolean,
    isUnaryExpression: () => Boolean,
    kind: () => SyntaxKind,
    lastToken: () => ISyntaxToken,
    leadingTrivia: () => ISyntaxTriviaList,
    leadingTriviaWidth: () => Double,
    text: () => String,
    tokenKind: SyntaxKind,
    trailingTrivia: () => ISyntaxTriviaList,
    trailingTriviaWidth: () => Double,
    value: () => js.Any,
    valueText: () => String,
    width: () => Double,
    withLeadingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken,
    withTrailingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken
  ): ISyntaxToken = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), hasLeadingComment = js.Any.fromFunction0(hasLeadingComment), hasLeadingNewLine = js.Any.fromFunction0(hasLeadingNewLine), hasLeadingSkippedText = js.Any.fromFunction0(hasLeadingSkippedText), hasLeadingTrivia = js.Any.fromFunction0(hasLeadingTrivia), hasSkippedToken = js.Any.fromFunction0(hasSkippedToken), hasTrailingComment = js.Any.fromFunction0(hasTrailingComment), hasTrailingNewLine = js.Any.fromFunction0(hasTrailingNewLine), hasTrailingSkippedText = js.Any.fromFunction0(hasTrailingSkippedText), hasTrailingTrivia = js.Any.fromFunction0(hasTrailingTrivia), isExpression = js.Any.fromFunction0(isExpression), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isMemberExpression = js.Any.fromFunction0(isMemberExpression), isNode = js.Any.fromFunction0(isNode), isPostfixExpression = js.Any.fromFunction0(isPostfixExpression), isPrimaryExpression = js.Any.fromFunction0(isPrimaryExpression), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), isUnaryExpression = js.Any.fromFunction0(isUnaryExpression), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), text = js.Any.fromFunction0(text), tokenKind = tokenKind.asInstanceOf[js.Any], trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), value = js.Any.fromFunction0(value), valueText = js.Any.fromFunction0(valueText), width = js.Any.fromFunction0(width), withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
    __obj.asInstanceOf[ISyntaxToken]
  }
  
  @scala.inline
  implicit class ISyntaxTokenOps[Self <: ISyntaxToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHasLeadingComment(value: () => Boolean): Self = this.set("hasLeadingComment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasLeadingNewLine(value: () => Boolean): Self = this.set("hasLeadingNewLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasLeadingSkippedText(value: () => Boolean): Self = this.set("hasLeadingSkippedText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasLeadingTrivia(value: () => Boolean): Self = this.set("hasLeadingTrivia", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasSkippedToken(value: () => Boolean): Self = this.set("hasSkippedToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasTrailingComment(value: () => Boolean): Self = this.set("hasTrailingComment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasTrailingNewLine(value: () => Boolean): Self = this.set("hasTrailingNewLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasTrailingSkippedText(value: () => Boolean): Self = this.set("hasTrailingSkippedText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasTrailingTrivia(value: () => Boolean): Self = this.set("hasTrailingTrivia", js.Any.fromFunction0(value))
    
    @scala.inline
    def setText(value: () => String): Self = this.set("text", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTokenKind(value: SyntaxKind): Self = this.set("tokenKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: () => js.Any): Self = this.set("value", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValueText(value: () => String): Self = this.set("valueText", js.Any.fromFunction0(value))
  }
}
