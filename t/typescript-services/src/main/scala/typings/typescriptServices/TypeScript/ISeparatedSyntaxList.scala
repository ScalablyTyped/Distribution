package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISeparatedSyntaxList extends ISyntaxElement {
  
  def insertChildrenInto(array: js.Array[ISyntaxElement], index: Double): Unit = js.native
  
  def nonSeparatorAt(index: Double): ISyntaxNodeOrToken = js.native
  
  def nonSeparatorCount(): Double = js.native
  
  def separatorAt(index: Double): ISyntaxToken = js.native
  
  def separatorCount(): Double = js.native
  
  def toArray(): js.Array[ISyntaxNodeOrToken] = js.native
  
  def toNonSeparatorArray(): js.Array[ISyntaxNodeOrToken] = js.native
}
object ISeparatedSyntaxList {
  
  @scala.inline
  def apply(
    childAt: Double => ISyntaxElement,
    childCount: () => Double,
    collectTextElements: js.Array[String] => Unit,
    firstToken: () => ISyntaxToken,
    fullText: () => String,
    fullWidth: () => Double,
    insertChildrenInto: (js.Array[ISyntaxElement], Double) => Unit,
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
    nonSeparatorAt: Double => ISyntaxNodeOrToken,
    nonSeparatorCount: () => Double,
    separatorAt: Double => ISyntaxToken,
    separatorCount: () => Double,
    toArray: () => js.Array[ISyntaxNodeOrToken],
    toNonSeparatorArray: () => js.Array[ISyntaxNodeOrToken],
    trailingTrivia: () => ISyntaxTriviaList,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): ISeparatedSyntaxList = {
    val __obj = js.Dynamic.literal(childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), insertChildrenInto = js.Any.fromFunction2(insertChildrenInto), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isNode = js.Any.fromFunction0(isNode), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), nonSeparatorAt = js.Any.fromFunction1(nonSeparatorAt), nonSeparatorCount = js.Any.fromFunction0(nonSeparatorCount), separatorAt = js.Any.fromFunction1(separatorAt), separatorCount = js.Any.fromFunction0(separatorCount), toArray = js.Any.fromFunction0(toArray), toNonSeparatorArray = js.Any.fromFunction0(toNonSeparatorArray), trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ISeparatedSyntaxList]
  }
  
  @scala.inline
  implicit class ISeparatedSyntaxListOps[Self <: ISeparatedSyntaxList] (val x: Self) extends AnyVal {
    
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
    def setInsertChildrenInto(value: (js.Array[ISyntaxElement], Double) => Unit): Self = this.set("insertChildrenInto", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNonSeparatorAt(value: Double => ISyntaxNodeOrToken): Self = this.set("nonSeparatorAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNonSeparatorCount(value: () => Double): Self = this.set("nonSeparatorCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSeparatorAt(value: Double => ISyntaxToken): Self = this.set("separatorAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeparatorCount(value: () => Double): Self = this.set("separatorCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToArray(value: () => js.Array[ISyntaxNodeOrToken]): Self = this.set("toArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToNonSeparatorArray(value: () => js.Array[ISyntaxNodeOrToken]): Self = this.set("toNonSeparatorArray", js.Any.fromFunction0(value))
  }
}
