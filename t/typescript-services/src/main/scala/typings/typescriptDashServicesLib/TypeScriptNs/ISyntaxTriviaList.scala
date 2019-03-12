package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyntaxTriviaList extends js.Object {
  def collectTextElements(elements: js.Array[java.lang.String]): scala.Unit
  def concat(trivia: ISyntaxTriviaList): ISyntaxTriviaList
  def count(): scala.Double
  def fullText(): java.lang.String
  def fullWidth(): scala.Double
  def hasComment(): scala.Boolean
  def hasNewLine(): scala.Boolean
  def hasSkippedToken(): scala.Boolean
  def last(): ISyntaxTrivia
  def syntaxTriviaAt(index: scala.Double): ISyntaxTrivia
  def toArray(): js.Array[ISyntaxTrivia]
}

object ISyntaxTriviaList {
  @scala.inline
  def apply(
    collectTextElements: js.Array[java.lang.String] => scala.Unit,
    concat: ISyntaxTriviaList => ISyntaxTriviaList,
    count: () => scala.Double,
    fullText: () => java.lang.String,
    fullWidth: () => scala.Double,
    hasComment: () => scala.Boolean,
    hasNewLine: () => scala.Boolean,
    hasSkippedToken: () => scala.Boolean,
    last: () => ISyntaxTrivia,
    syntaxTriviaAt: scala.Double => ISyntaxTrivia,
    toArray: () => js.Array[ISyntaxTrivia]
  ): ISyntaxTriviaList = {
    val __obj = js.Dynamic.literal(collectTextElements = js.Any.fromFunction1(collectTextElements), concat = js.Any.fromFunction1(concat), count = js.Any.fromFunction0(count), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), hasComment = js.Any.fromFunction0(hasComment), hasNewLine = js.Any.fromFunction0(hasNewLine), hasSkippedToken = js.Any.fromFunction0(hasSkippedToken), last = js.Any.fromFunction0(last), syntaxTriviaAt = js.Any.fromFunction1(syntaxTriviaAt), toArray = js.Any.fromFunction0(toArray))
  
    __obj.asInstanceOf[ISyntaxTriviaList]
  }
}

