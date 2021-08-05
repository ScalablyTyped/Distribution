package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyntaxElement extends StObject {
  
  def childAt(index: Double): ISyntaxElement
  
  def childCount(): Double
  
  def collectTextElements(elements: js.Array[String]): Unit
  
  def firstToken(): ISyntaxToken
  
  def fullText(): String
  
  def fullWidth(): Double
  
  def isIncrementallyUnusable(): Boolean
  
  def isList(): Boolean
  
  def isNode(): Boolean
  
  def isSeparatedList(): Boolean
  
  def isToken(): Boolean
  
  def isTypeScriptSpecific(): Boolean
  
  def kind(): SyntaxKind
  
  def lastToken(): ISyntaxToken
  
  def leadingTrivia(): ISyntaxTriviaList
  
  def leadingTriviaWidth(): Double
  
  def trailingTrivia(): ISyntaxTriviaList
  
  def trailingTriviaWidth(): Double
  
  def width(): Double
}
object ISyntaxElement {
  
  inline def apply(
    childAt: Double => ISyntaxElement,
    childCount: () => Double,
    collectTextElements: js.Array[String] => Unit,
    firstToken: () => ISyntaxToken,
    fullText: () => String,
    fullWidth: () => Double,
    isIncrementallyUnusable: () => Boolean,
    isList: () => Boolean,
    isNode: () => Boolean,
    isSeparatedList: () => Boolean,
    isToken: () => Boolean,
    isTypeScriptSpecific: () => Boolean,
    kind: () => SyntaxKind,
    lastToken: () => ISyntaxToken,
    leadingTrivia: () => ISyntaxTriviaList,
    leadingTriviaWidth: () => Double,
    trailingTrivia: () => ISyntaxTriviaList,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): ISyntaxElement = {
    val __obj = js.Dynamic.literal(childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isNode = js.Any.fromFunction0(isNode), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ISyntaxElement]
  }
  
  extension [Self <: ISyntaxElement](x: Self) {
    
    inline def setChildAt(value: Double => ISyntaxElement): Self = StObject.set(x, "childAt", js.Any.fromFunction1(value))
    
    inline def setChildCount(value: () => Double): Self = StObject.set(x, "childCount", js.Any.fromFunction0(value))
    
    inline def setCollectTextElements(value: js.Array[String] => Unit): Self = StObject.set(x, "collectTextElements", js.Any.fromFunction1(value))
    
    inline def setFirstToken(value: () => ISyntaxToken): Self = StObject.set(x, "firstToken", js.Any.fromFunction0(value))
    
    inline def setFullText(value: () => String): Self = StObject.set(x, "fullText", js.Any.fromFunction0(value))
    
    inline def setFullWidth(value: () => Double): Self = StObject.set(x, "fullWidth", js.Any.fromFunction0(value))
    
    inline def setIsIncrementallyUnusable(value: () => Boolean): Self = StObject.set(x, "isIncrementallyUnusable", js.Any.fromFunction0(value))
    
    inline def setIsList(value: () => Boolean): Self = StObject.set(x, "isList", js.Any.fromFunction0(value))
    
    inline def setIsNode(value: () => Boolean): Self = StObject.set(x, "isNode", js.Any.fromFunction0(value))
    
    inline def setIsSeparatedList(value: () => Boolean): Self = StObject.set(x, "isSeparatedList", js.Any.fromFunction0(value))
    
    inline def setIsToken(value: () => Boolean): Self = StObject.set(x, "isToken", js.Any.fromFunction0(value))
    
    inline def setIsTypeScriptSpecific(value: () => Boolean): Self = StObject.set(x, "isTypeScriptSpecific", js.Any.fromFunction0(value))
    
    inline def setKind(value: () => SyntaxKind): Self = StObject.set(x, "kind", js.Any.fromFunction0(value))
    
    inline def setLastToken(value: () => ISyntaxToken): Self = StObject.set(x, "lastToken", js.Any.fromFunction0(value))
    
    inline def setLeadingTrivia(value: () => ISyntaxTriviaList): Self = StObject.set(x, "leadingTrivia", js.Any.fromFunction0(value))
    
    inline def setLeadingTriviaWidth(value: () => Double): Self = StObject.set(x, "leadingTriviaWidth", js.Any.fromFunction0(value))
    
    inline def setTrailingTrivia(value: () => ISyntaxTriviaList): Self = StObject.set(x, "trailingTrivia", js.Any.fromFunction0(value))
    
    inline def setTrailingTriviaWidth(value: () => Double): Self = StObject.set(x, "trailingTriviaWidth", js.Any.fromFunction0(value))
    
    inline def setWidth(value: () => Double): Self = StObject.set(x, "width", js.Any.fromFunction0(value))
  }
}
