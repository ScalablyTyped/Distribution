package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyntaxElement extends js.Object {
  def childAt(index: scala.Double): ISyntaxElement
  def childCount(): scala.Double
  def collectTextElements(elements: js.Array[java.lang.String]): scala.Unit
  def firstToken(): ISyntaxToken
  def fullText(): java.lang.String
  def fullWidth(): scala.Double
  def isIncrementallyUnusable(): scala.Boolean
  def isList(): scala.Boolean
  def isNode(): scala.Boolean
  def isSeparatedList(): scala.Boolean
  def isToken(): scala.Boolean
  def isTypeScriptSpecific(): scala.Boolean
  def kind(): SyntaxKind
  def lastToken(): ISyntaxToken
  def leadingTrivia(): ISyntaxTriviaList
  def leadingTriviaWidth(): scala.Double
  def trailingTrivia(): ISyntaxTriviaList
  def trailingTriviaWidth(): scala.Double
  def width(): scala.Double
}

