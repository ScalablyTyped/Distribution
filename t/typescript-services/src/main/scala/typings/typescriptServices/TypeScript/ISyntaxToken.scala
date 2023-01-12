package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyntaxToken
  extends StObject
     with IPrimaryExpressionSyntax {
  
  def hasLeadingComment(): Boolean
  
  def hasLeadingNewLine(): Boolean
  
  def hasLeadingSkippedText(): Boolean
  
  def hasLeadingTrivia(): Boolean
  
  def hasSkippedToken(): Boolean
  
  def hasTrailingComment(): Boolean
  
  def hasTrailingNewLine(): Boolean
  
  def hasTrailingSkippedText(): Boolean
  
  def hasTrailingTrivia(): Boolean
  
  def text(): String
  
  var tokenKind: SyntaxKind
  
  def value(): Any
  
  def valueText(): String
}
object ISyntaxToken {
  
  inline def apply(
    accept: ISyntaxVisitor => Any,
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
    value: () => Any,
    valueText: () => String,
    width: () => Double,
    withLeadingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken,
    withTrailingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken
  ): ISyntaxToken = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), hasLeadingComment = js.Any.fromFunction0(hasLeadingComment), hasLeadingNewLine = js.Any.fromFunction0(hasLeadingNewLine), hasLeadingSkippedText = js.Any.fromFunction0(hasLeadingSkippedText), hasLeadingTrivia = js.Any.fromFunction0(hasLeadingTrivia), hasSkippedToken = js.Any.fromFunction0(hasSkippedToken), hasTrailingComment = js.Any.fromFunction0(hasTrailingComment), hasTrailingNewLine = js.Any.fromFunction0(hasTrailingNewLine), hasTrailingSkippedText = js.Any.fromFunction0(hasTrailingSkippedText), hasTrailingTrivia = js.Any.fromFunction0(hasTrailingTrivia), isExpression = js.Any.fromFunction0(isExpression), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isMemberExpression = js.Any.fromFunction0(isMemberExpression), isNode = js.Any.fromFunction0(isNode), isPostfixExpression = js.Any.fromFunction0(isPostfixExpression), isPrimaryExpression = js.Any.fromFunction0(isPrimaryExpression), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), isUnaryExpression = js.Any.fromFunction0(isUnaryExpression), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), text = js.Any.fromFunction0(text), tokenKind = tokenKind.asInstanceOf[js.Any], trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), value = js.Any.fromFunction0(value), valueText = js.Any.fromFunction0(valueText), width = js.Any.fromFunction0(width), withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
    __obj.asInstanceOf[ISyntaxToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISyntaxToken] (val x: Self) extends AnyVal {
    
    inline def setHasLeadingComment(value: () => Boolean): Self = StObject.set(x, "hasLeadingComment", js.Any.fromFunction0(value))
    
    inline def setHasLeadingNewLine(value: () => Boolean): Self = StObject.set(x, "hasLeadingNewLine", js.Any.fromFunction0(value))
    
    inline def setHasLeadingSkippedText(value: () => Boolean): Self = StObject.set(x, "hasLeadingSkippedText", js.Any.fromFunction0(value))
    
    inline def setHasLeadingTrivia(value: () => Boolean): Self = StObject.set(x, "hasLeadingTrivia", js.Any.fromFunction0(value))
    
    inline def setHasSkippedToken(value: () => Boolean): Self = StObject.set(x, "hasSkippedToken", js.Any.fromFunction0(value))
    
    inline def setHasTrailingComment(value: () => Boolean): Self = StObject.set(x, "hasTrailingComment", js.Any.fromFunction0(value))
    
    inline def setHasTrailingNewLine(value: () => Boolean): Self = StObject.set(x, "hasTrailingNewLine", js.Any.fromFunction0(value))
    
    inline def setHasTrailingSkippedText(value: () => Boolean): Self = StObject.set(x, "hasTrailingSkippedText", js.Any.fromFunction0(value))
    
    inline def setHasTrailingTrivia(value: () => Boolean): Self = StObject.set(x, "hasTrailingTrivia", js.Any.fromFunction0(value))
    
    inline def setText(value: () => String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    
    inline def setTokenKind(value: SyntaxKind): Self = StObject.set(x, "tokenKind", value.asInstanceOf[js.Any])
    
    inline def setValue(value: () => Any): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
    
    inline def setValueText(value: () => String): Self = StObject.set(x, "valueText", js.Any.fromFunction0(value))
  }
}
