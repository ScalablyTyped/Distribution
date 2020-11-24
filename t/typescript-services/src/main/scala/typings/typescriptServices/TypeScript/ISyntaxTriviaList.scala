package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyntaxTriviaList extends js.Object {
  
  def collectTextElements(elements: js.Array[String]): Unit = js.native
  
  def concat(trivia: ISyntaxTriviaList): ISyntaxTriviaList = js.native
  
  def count(): Double = js.native
  
  def fullText(): String = js.native
  
  def fullWidth(): Double = js.native
  
  def hasComment(): Boolean = js.native
  
  def hasNewLine(): Boolean = js.native
  
  def hasSkippedToken(): Boolean = js.native
  
  def last(): ISyntaxTrivia = js.native
  
  def syntaxTriviaAt(index: Double): ISyntaxTrivia = js.native
  
  def toArray(): js.Array[ISyntaxTrivia] = js.native
}
object ISyntaxTriviaList {
  
  @scala.inline
  def apply(
    collectTextElements: js.Array[String] => Unit,
    concat: ISyntaxTriviaList => ISyntaxTriviaList,
    count: () => Double,
    fullText: () => String,
    fullWidth: () => Double,
    hasComment: () => Boolean,
    hasNewLine: () => Boolean,
    hasSkippedToken: () => Boolean,
    last: () => ISyntaxTrivia,
    syntaxTriviaAt: Double => ISyntaxTrivia,
    toArray: () => js.Array[ISyntaxTrivia]
  ): ISyntaxTriviaList = {
    val __obj = js.Dynamic.literal(collectTextElements = js.Any.fromFunction1(collectTextElements), concat = js.Any.fromFunction1(concat), count = js.Any.fromFunction0(count), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), hasComment = js.Any.fromFunction0(hasComment), hasNewLine = js.Any.fromFunction0(hasNewLine), hasSkippedToken = js.Any.fromFunction0(hasSkippedToken), last = js.Any.fromFunction0(last), syntaxTriviaAt = js.Any.fromFunction1(syntaxTriviaAt), toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[ISyntaxTriviaList]
  }
  
  @scala.inline
  implicit class ISyntaxTriviaListOps[Self <: ISyntaxTriviaList] (val x: Self) extends AnyVal {
    
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
    def setCollectTextElements(value: js.Array[String] => Unit): Self = this.set("collectTextElements", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConcat(value: ISyntaxTriviaList => ISyntaxTriviaList): Self = this.set("concat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: () => Double): Self = this.set("count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFullText(value: () => String): Self = this.set("fullText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFullWidth(value: () => Double): Self = this.set("fullWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasComment(value: () => Boolean): Self = this.set("hasComment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasNewLine(value: () => Boolean): Self = this.set("hasNewLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasSkippedToken(value: () => Boolean): Self = this.set("hasSkippedToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLast(value: () => ISyntaxTrivia): Self = this.set("last", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSyntaxTriviaAt(value: Double => ISyntaxTrivia): Self = this.set("syntaxTriviaAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToArray(value: () => js.Array[ISyntaxTrivia]): Self = this.set("toArray", js.Any.fromFunction0(value))
  }
}
