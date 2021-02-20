package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyntaxTriviaList extends StObject {
  
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
  implicit class ISyntaxTriviaListMutableBuilder[Self <: ISyntaxTriviaList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectTextElements(value: js.Array[String] => Unit): Self = StObject.set(x, "collectTextElements", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConcat(value: ISyntaxTriviaList => ISyntaxTriviaList): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFullText(value: () => String): Self = StObject.set(x, "fullText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFullWidth(value: () => Double): Self = StObject.set(x, "fullWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasComment(value: () => Boolean): Self = StObject.set(x, "hasComment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasNewLine(value: () => Boolean): Self = StObject.set(x, "hasNewLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasSkippedToken(value: () => Boolean): Self = StObject.set(x, "hasSkippedToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLast(value: () => ISyntaxTrivia): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSyntaxTriviaAt(value: Double => ISyntaxTrivia): Self = StObject.set(x, "syntaxTriviaAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToArray(value: () => js.Array[ISyntaxTrivia]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
  }
}
