package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyntaxTriviaList extends js.Object {
  def collectTextElements(elements: js.Array[String]): Unit
  def concat(trivia: ISyntaxTriviaList): ISyntaxTriviaList
  def count(): Double
  def fullText(): String
  def fullWidth(): Double
  def hasComment(): Boolean
  def hasNewLine(): Boolean
  def hasSkippedToken(): Boolean
  def last(): ISyntaxTrivia
  def syntaxTriviaAt(index: Double): ISyntaxTrivia
  def toArray(): js.Array[ISyntaxTrivia]
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
}

