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

