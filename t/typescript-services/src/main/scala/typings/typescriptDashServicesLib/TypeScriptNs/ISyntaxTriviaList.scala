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
    collectTextElements: js.Function1[js.Array[java.lang.String], scala.Unit],
    concat: js.Function1[ISyntaxTriviaList, ISyntaxTriviaList],
    count: js.Function0[scala.Double],
    fullText: js.Function0[java.lang.String],
    fullWidth: js.Function0[scala.Double],
    hasComment: js.Function0[scala.Boolean],
    hasNewLine: js.Function0[scala.Boolean],
    hasSkippedToken: js.Function0[scala.Boolean],
    last: js.Function0[ISyntaxTrivia],
    syntaxTriviaAt: js.Function1[scala.Double, ISyntaxTrivia],
    toArray: js.Function0[js.Array[ISyntaxTrivia]]
  ): ISyntaxTriviaList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collectTextElements")(collectTextElements)
    __obj.updateDynamic("concat")(concat)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("fullText")(fullText)
    __obj.updateDynamic("fullWidth")(fullWidth)
    __obj.updateDynamic("hasComment")(hasComment)
    __obj.updateDynamic("hasNewLine")(hasNewLine)
    __obj.updateDynamic("hasSkippedToken")(hasSkippedToken)
    __obj.updateDynamic("last")(last)
    __obj.updateDynamic("syntaxTriviaAt")(syntaxTriviaAt)
    __obj.updateDynamic("toArray")(toArray)
    __obj.asInstanceOf[ISyntaxTriviaList]
  }
}

