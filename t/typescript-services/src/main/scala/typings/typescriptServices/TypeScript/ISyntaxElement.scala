package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyntaxElement extends js.Object {
  
  def childAt(index: Double): ISyntaxElement = js.native
  
  def childCount(): Double = js.native
  
  def collectTextElements(elements: js.Array[String]): Unit = js.native
  
  def firstToken(): ISyntaxToken = js.native
  
  def fullText(): String = js.native
  
  def fullWidth(): Double = js.native
  
  def isIncrementallyUnusable(): Boolean = js.native
  
  def isList(): Boolean = js.native
  
  def isNode(): Boolean = js.native
  
  def isSeparatedList(): Boolean = js.native
  
  def isToken(): Boolean = js.native
  
  def isTypeScriptSpecific(): Boolean = js.native
  
  def kind(): SyntaxKind = js.native
  
  def lastToken(): ISyntaxToken = js.native
  
  def leadingTrivia(): ISyntaxTriviaList = js.native
  
  def leadingTriviaWidth(): Double = js.native
  
  def trailingTrivia(): ISyntaxTriviaList = js.native
  
  def trailingTriviaWidth(): Double = js.native
  
  def width(): Double = js.native
}
object ISyntaxElement {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ISyntaxElementOps[Self <: ISyntaxElement] (val x: Self) extends AnyVal {
    
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
    def setChildAt(value: Double => ISyntaxElement): Self = this.set("childAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildCount(value: () => Double): Self = this.set("childCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCollectTextElements(value: js.Array[String] => Unit): Self = this.set("collectTextElements", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirstToken(value: () => ISyntaxToken): Self = this.set("firstToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFullText(value: () => String): Self = this.set("fullText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFullWidth(value: () => Double): Self = this.set("fullWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsIncrementallyUnusable(value: () => Boolean): Self = this.set("isIncrementallyUnusable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsList(value: () => Boolean): Self = this.set("isList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNode(value: () => Boolean): Self = this.set("isNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSeparatedList(value: () => Boolean): Self = this.set("isSeparatedList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsToken(value: () => Boolean): Self = this.set("isToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsTypeScriptSpecific(value: () => Boolean): Self = this.set("isTypeScriptSpecific", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKind(value: () => SyntaxKind): Self = this.set("kind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLastToken(value: () => ISyntaxToken): Self = this.set("lastToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLeadingTrivia(value: () => ISyntaxTriviaList): Self = this.set("leadingTrivia", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLeadingTriviaWidth(value: () => Double): Self = this.set("leadingTriviaWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrailingTrivia(value: () => ISyntaxTriviaList): Self = this.set("trailingTrivia", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrailingTriviaWidth(value: () => Double): Self = this.set("trailingTriviaWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWidth(value: () => Double): Self = this.set("width", js.Any.fromFunction0(value))
  }
}
